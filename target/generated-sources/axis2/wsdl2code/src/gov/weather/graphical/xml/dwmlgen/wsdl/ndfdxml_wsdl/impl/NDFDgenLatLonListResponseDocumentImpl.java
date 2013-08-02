/*
 * An XML document type.
 * Localname: NDFDgenLatLonListResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one NDFDgenLatLonListResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class NDFDgenLatLonListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument
{
    
    public NDFDgenLatLonListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NDFDGENLATLONLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "NDFDgenLatLonListResponse");
    
    
    /**
     * Gets the "NDFDgenLatLonListResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument.NDFDgenLatLonListResponse getNDFDgenLatLonListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument.NDFDgenLatLonListResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument.NDFDgenLatLonListResponse)get_store().find_element_user(NDFDGENLATLONLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NDFDgenLatLonListResponse" element
     */
    public void setNDFDgenLatLonListResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument.NDFDgenLatLonListResponse ndfDgenLatLonListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument.NDFDgenLatLonListResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument.NDFDgenLatLonListResponse)get_store().find_element_user(NDFDGENLATLONLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument.NDFDgenLatLonListResponse)get_store().add_element_user(NDFDGENLATLONLISTRESPONSE$0);
            }
            target.set(ndfDgenLatLonListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "NDFDgenLatLonListResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument.NDFDgenLatLonListResponse addNewNDFDgenLatLonListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument.NDFDgenLatLonListResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument.NDFDgenLatLonListResponse)get_store().add_element_user(NDFDGENLATLONLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML NDFDgenLatLonListResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class NDFDgenLatLonListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument.NDFDgenLatLonListResponse
    {
        
        public NDFDgenLatLonListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DWMLOUT$0 = 
            new javax.xml.namespace.QName("", "dwmlOut");
        
        
        /**
         * Gets the "dwmlOut" element
         */
        public java.lang.String getDwmlOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DWMLOUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dwmlOut" element
         */
        public org.apache.xmlbeans.XmlString xgetDwmlOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DWMLOUT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dwmlOut" element
         */
        public void setDwmlOut(java.lang.String dwmlOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DWMLOUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DWMLOUT$0);
                }
                target.setStringValue(dwmlOut);
            }
        }
        
        /**
         * Sets (as xml) the "dwmlOut" element
         */
        public void xsetDwmlOut(org.apache.xmlbeans.XmlString dwmlOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DWMLOUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DWMLOUT$0);
                }
                target.set(dwmlOut);
            }
        }
    }
}
