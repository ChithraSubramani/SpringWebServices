/*
 * An XML document type.
 * Localname: LatLonListCityNamesResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one LatLonListCityNamesResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class LatLonListCityNamesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument
{
    
    public LatLonListCityNamesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATLONLISTCITYNAMESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "LatLonListCityNamesResponse");
    
    
    /**
     * Gets the "LatLonListCityNamesResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse getLatLonListCityNamesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse)get_store().find_element_user(LATLONLISTCITYNAMESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LatLonListCityNamesResponse" element
     */
    public void setLatLonListCityNamesResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse latLonListCityNamesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse)get_store().find_element_user(LATLONLISTCITYNAMESRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse)get_store().add_element_user(LATLONLISTCITYNAMESRESPONSE$0);
            }
            target.set(latLonListCityNamesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "LatLonListCityNamesResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse addNewLatLonListCityNamesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse)get_store().add_element_user(LATLONLISTCITYNAMESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML LatLonListCityNamesResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class LatLonListCityNamesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse
    {
        
        public LatLonListCityNamesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTCITYNAMESOUT$0 = 
            new javax.xml.namespace.QName("", "listCityNamesOut");
        
        
        /**
         * Gets the "listCityNamesOut" element
         */
        public java.lang.String getListCityNamesOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTCITYNAMESOUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "listCityNamesOut" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListCityNamesType xgetListCityNamesOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListCityNamesType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListCityNamesType)get_store().find_element_user(LISTCITYNAMESOUT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "listCityNamesOut" element
         */
        public void setListCityNamesOut(java.lang.String listCityNamesOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTCITYNAMESOUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTCITYNAMESOUT$0);
                }
                target.setStringValue(listCityNamesOut);
            }
        }
        
        /**
         * Sets (as xml) the "listCityNamesOut" element
         */
        public void xsetListCityNamesOut(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListCityNamesType listCityNamesOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListCityNamesType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListCityNamesType)get_store().find_element_user(LISTCITYNAMESOUT$0, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListCityNamesType)get_store().add_element_user(LISTCITYNAMESOUT$0);
                }
                target.set(listCityNamesOut);
            }
        }
    }
}
