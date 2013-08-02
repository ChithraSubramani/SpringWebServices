package com.mkexample.spring.webservices;

import gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.DisplayLevelType;
import gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.WeatherParametersType;
import gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXMLBindingStub;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.Iterator;


import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;
import javax.xml.ws.BindingProvider;

import org.apache.axis.AxisFault;

	public class NWSclient {
public static void main(String[] args){
	    java.net.URL END_POINT_URL;
		try {
			END_POINT_URL = new URL( "http://graphical.weather.gov/xml/SOAP_server/ndfdXMLserver.php");
			NdfdXMLBindingStub ndfdXMLBindingStub = new NdfdXMLBindingStub(END_POINT_URL,new org.apache.axis.client.Service());

			WeatherParametersType wpt = new WeatherParametersType();
			System.out.println(wpt.isCumw34());
			
			DisplayLevelType dlt = new DisplayLevelType(new BigInteger("1234"));
			System.out.println(dlt);
			
			GmlTimeSeriesRequest gts = new GmlTimeSeriesRequest();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    }
	}
	
