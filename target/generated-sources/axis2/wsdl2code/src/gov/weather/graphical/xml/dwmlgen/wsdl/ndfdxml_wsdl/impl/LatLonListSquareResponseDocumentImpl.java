/*
 * An XML document type.
 * Localname: LatLonListSquareResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one LatLonListSquareResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class LatLonListSquareResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument
{
    
    public LatLonListSquareResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATLONLISTSQUARERESPONSE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "LatLonListSquareResponse");
    
    
    /**
     * Gets the "LatLonListSquareResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument.LatLonListSquareResponse getLatLonListSquareResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument.LatLonListSquareResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument.LatLonListSquareResponse)get_store().find_element_user(LATLONLISTSQUARERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LatLonListSquareResponse" element
     */
    public void setLatLonListSquareResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument.LatLonListSquareResponse latLonListSquareResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument.LatLonListSquareResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument.LatLonListSquareResponse)get_store().find_element_user(LATLONLISTSQUARERESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument.LatLonListSquareResponse)get_store().add_element_user(LATLONLISTSQUARERESPONSE$0);
            }
            target.set(latLonListSquareResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "LatLonListSquareResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument.LatLonListSquareResponse addNewLatLonListSquareResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument.LatLonListSquareResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument.LatLonListSquareResponse)get_store().add_element_user(LATLONLISTSQUARERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML LatLonListSquareResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class LatLonListSquareResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument.LatLonListSquareResponse
    {
        
        public LatLonListSquareResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTLATLONOUT$0 = 
            new javax.xml.namespace.QName("", "listLatLonOut");
        
        
        /**
         * Gets the "listLatLonOut" element
         */
        public java.lang.String getListLatLonOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTLATLONOUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "listLatLonOut" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType xgetListLatLonOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().find_element_user(LISTLATLONOUT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "listLatLonOut" element
         */
        public void setListLatLonOut(java.lang.String listLatLonOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTLATLONOUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTLATLONOUT$0);
                }
                target.setStringValue(listLatLonOut);
            }
        }
        
        /**
         * Sets (as xml) the "listLatLonOut" element
         */
        public void xsetListLatLonOut(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType listLatLonOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().find_element_user(LISTLATLONOUT$0, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().add_element_user(LISTLATLONOUT$0);
                }
                target.set(listLatLonOut);
            }
        }
    }
}
