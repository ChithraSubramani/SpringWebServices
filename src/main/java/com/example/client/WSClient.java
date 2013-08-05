package com.example.client;

import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPFaultException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class WSClient {

    public static void main (String[] args) {
        WSClient wsc = new WSClient();
       
        // get forecast by Zip Code
        wsc.getWeatherForecast("48108"); // Philadelphia
        
        // get another forecast
        wsc.getWeatherForecast("33157"); // Miami
    }  

    public void getWeatherForecast(String zipCode) {
        
        try {
            // Convert the ZIP code to a geocoded value (which is needed
            // as input for the weather data)

//            String nsSchema = "http://www.weather.gov/forecasts"
//                + "/xml/DWMLgen/schema/DWML.xsd";
            String nsSchema = "http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd";
            
            String soapSchema = "http://schemas.xmlsoap.org/soap/envelope/";
            
            String xsiSchema 
                = "http://www.w3.org/2001/XMLSchema-instance";

            String encodingStyle 
                = "http://schemas.xmlsoap.org/soap/encoding/";
            
            String zipRequest = "<S:Envelope " 
                + " xmlns:S=\"" + soapSchema + "\" "
                + " xmlns:xsi=\"" + xsiSchema + "\" "
                + " xmlns:schNS=\"" + nsSchema + "\"> "                
                + "<S:Body>"
                +"   <LatLonListZipCode S:encodingStyle=\"" 
                +           encodingStyle + "\">" 
                +           "<schNS:zipCodeList xsi:type=\"schNS:zipCodeListType\">" 
                +               zipCode 
                +           "</schNS:zipCodeList>"
                +    "</LatLonListZipCode>"
                +"</S:Body>"
                +"</S:Envelope>";

//            String wsdl = "http://www.weather.gov/forecasts/xml/"
//                  + "SOAP_server/ndfdXMLserver.php?wsdl";
            String wsdl = "http://graphical.weather.gov/xml/SOAP_server/ndfdXMLserver.php?wsdl";
//            String targetNS = "http://www.weather.gov/forecasts/xml/"
//                  + "DWMLgen/wsdl/ndfdXML.wsdl";
            String targetNS = "http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl";
            URL url = new URL(wsdl);
            QName serviceName = new QName(targetNS, "ndfdXML");
            QName portName = new QName(targetNS, "ndfdXMLPort");
            Service service = Service.create(url, serviceName);

            /*
             * JAX-WS Dispatch provides three usage options: -- JAXBContext
             * (unsure if works though for rpc/enc WSDL) -- JAXP Source objects
             * (used here) -- SAAJ SOAPMessages (used in 2nd request below)
             */
            Dispatch<Source> dispatch = service.createDispatch(portName,
                Source.class, Service.Mode.MESSAGE);
            Source zipResponse = dispatch.invoke(
                new StreamSource(new StringReader(zipRequest)));
                // if using a file for input instead:
                // new StreamSource(new File("myrequest.xml")));
            
            // use SAAJ to open message -- check if error or valid data
            MessageFactory msgFactory = MessageFactory.newInstance();
            SOAPMessage geocodeMsg = msgFactory.createMessage();            
            SOAPPart env = geocodeMsg.getSOAPPart();
            env.setContent(zipResponse);
            // writeTo method outputs SOAPMessage, helpful for debugging
            // geocodeMsg.writeTo(System.out);
            
            if (geocodeMsg.getSOAPBody().hasFault()) {
                // Copy official error response into our LNF Fault
                SOAPFault fault = geocodeMsg.getSOAPBody().getFault();
                System.out.println("Could not obtain forecast for zipcode " 
                   + zipCode + ": " 
                   + fault.getFaultString() + "; " + fault.getDetail().getValue());
            } 
            
            // From here: valid geocode is present-- so get weather report next
            
            /*
             * LatLonListZipCodeResponse is not very helpful; needed information
             * (latLonList) element is html-escaped instead of a real tag, which
             * is suitable for HTML responses but not so helpful when you need
             * to extract the value. So will need to parse string response to
             * get geocode values <SOAP-ENV:Envelope> <SOAP-ENV:Body>
             * <ns1:LatLonListZipCodeResponse> <listLatLonOut
             * xsi:type="xsd:string"> <?xml version='1.0' ?> <dwml
             * version='1.0' > <latLonList> 35.1056,-90.007
             * </latLonList> </dwml> </listLatLonOut>
             * </ns1:LatLonListZipCodeResponse> </SOAP-ENV:Body>
             * </SOAP-ENV:Envelope>
             */
            String geocodeBuffer = geocodeMsg.getSOAPBody().
                getElementsByTagName("listLatLonOut")
                .item(0).getFirstChild().getNodeValue();
            
            // .getNodeValue() unescapes HTML string
            String geocodeVals = geocodeBuffer.substring(
                geocodeBuffer.indexOf("<latLonList>") + 12,
                geocodeBuffer.indexOf("</latLonList>"));
            System.out.println("Geocode Vals for zip code " + zipCode 
                + " are: " + geocodeVals);
        
            /*
             * NDFDgenLatLonList operation: gets weather data for a given
             * latitude, longitude pair
             * 
             * Format of the Message: <S:Envelope
             * xmlns:S="http://schemas.xmlsoap.org/soap/envelope/"
             * xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance"
             * xmlns:schNS="{schemaNS above}"> <S:Body> <NDFDgenLatLonList
             * S:encodingStyle="{encoding style above}"> <schNS:listLatLon
             * xsi:type="schNS:listLatLonType"> 38.99,-77.02 </schNS:listLatLon>
             * <schNS:product xsi:type="schNS:productType"> glance
             * </schNS:product> </NDFDgenLatLonList> </S:Body> </S:Envelope>
             */
            SOAPFactory soapFactory = SOAPFactory.newInstance();
            SOAPMessage getWeatherMsg = msgFactory.createMessage();
            SOAPHeader header = getWeatherMsg.getSOAPHeader();
            header.detachNode();  // no header needed
            SOAPBody body = getWeatherMsg.getSOAPBody();
            Name functionCall = soapFactory.createName(
                "NDFDgenLatLonList", "schNS", 
                nsSchema);
            SOAPBodyElement fcElement = body.addBodyElement(functionCall);
            Name attname = soapFactory.createName("encodingStyle", "S", 
                soapSchema);
            fcElement.addAttribute(attname, soapSchema);
            SOAPElement geocodeElement = fcElement.addChildElement("listLatLon");
            geocodeElement.addTextNode(geocodeVals);
            SOAPElement product = fcElement.addChildElement("product");
            product.addTextNode("glance");
            
            // make web service call using this SOAPMessage
            Dispatch<SOAPMessage> smDispatch = null;
            smDispatch = service.createDispatch(portName, 
                SOAPMessage.class, Service.Mode.MESSAGE);
            SOAPMessage weatherMsg = smDispatch.invoke(getWeatherMsg);
            // weatherMsg.writeTo(System.out); // debugging only
            
            // Metro needs normalize() command because it breaks
            // up child dwml element into numerous text nodes.
            weatherMsg.getSOAPBody().getElementsByTagName("dwmlOut")
                .item(0).normalize();
//Chtihra
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(weatherMsg.getSOAPBody().getElementsByTagName("dwmlOut")
                    .item(0).getFirstChild().getNodeValue())));
        	doc.getDocumentElement().normalize();
        	
			NodeList cacheTypeList = doc.getElementsByTagName("data");	
			for (int temp = 0; temp < cacheTypeList.getLength(); temp++) {		 
				Node cacheTypeNode = cacheTypeList.item(temp);
				if (cacheTypeNode.getNodeType() == Node.ELEMENT_NODE) {
					Element cacheTypeNodeElement = (Element) cacheTypeNode;
					NodeList cacheList = cacheTypeNodeElement.getElementsByTagName("parameters");
					for (int tmp2 = 0; tmp2 < cacheList.getLength(); tmp2++) {	
						Node cacheNode = cacheList.item(tmp2);
						System.out.println(cacheNode.getNodeType());
						if (cacheNode.getNodeType() == Node.ELEMENT_NODE) {
							Element element = (Element) cacheNode;
							System.out.println(element.getElementsByTagName("temperature").item(0).getTextContent());
		
						}
					}
				}
			}
            
            // First child of dwmlOut is the dwml element that we need.
            // It is the root node of the weather data that we will
            // be using to generate the report.
            String weatherResponse = weatherMsg.getSOAPBody().
                getElementsByTagName("dwmlOut")
                .item(0).getFirstChild().getNodeValue();
           // System.out.println("WR: " + weatherResponse);
        } catch (SOAPFaultException e) {
           System.out.println("SOAPFaultException: " + e.getFault().getFaultString());
        } catch (Exception e) {
           System.out.println("Exception: " + e.getMessage());
        }
    }
}