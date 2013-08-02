/*
 * An XML document type.
 * Localname: LatLonListZipCodeResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one LatLonListZipCodeResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class LatLonListZipCodeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument
{
    
    public LatLonListZipCodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATLONLISTZIPCODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "LatLonListZipCodeResponse");
    
    
    /**
     * Gets the "LatLonListZipCodeResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument.LatLonListZipCodeResponse getLatLonListZipCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument.LatLonListZipCodeResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument.LatLonListZipCodeResponse)get_store().find_element_user(LATLONLISTZIPCODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LatLonListZipCodeResponse" element
     */
    public void setLatLonListZipCodeResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument.LatLonListZipCodeResponse latLonListZipCodeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument.LatLonListZipCodeResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument.LatLonListZipCodeResponse)get_store().find_element_user(LATLONLISTZIPCODERESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument.LatLonListZipCodeResponse)get_store().add_element_user(LATLONLISTZIPCODERESPONSE$0);
            }
            target.set(latLonListZipCodeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "LatLonListZipCodeResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument.LatLonListZipCodeResponse addNewLatLonListZipCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument.LatLonListZipCodeResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument.LatLonListZipCodeResponse)get_store().add_element_user(LATLONLISTZIPCODERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML LatLonListZipCodeResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class LatLonListZipCodeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument.LatLonListZipCodeResponse
    {
        
        public LatLonListZipCodeResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
