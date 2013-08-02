/*
 * An XML document type.
 * Localname: NDFDgenByDayLatLonListResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one NDFDgenByDayLatLonListResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class NDFDgenByDayLatLonListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument
{
    
    public NDFDgenByDayLatLonListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NDFDGENBYDAYLATLONLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "NDFDgenByDayLatLonListResponse");
    
    
    /**
     * Gets the "NDFDgenByDayLatLonListResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument.NDFDgenByDayLatLonListResponse getNDFDgenByDayLatLonListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument.NDFDgenByDayLatLonListResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument.NDFDgenByDayLatLonListResponse)get_store().find_element_user(NDFDGENBYDAYLATLONLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NDFDgenByDayLatLonListResponse" element
     */
    public void setNDFDgenByDayLatLonListResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument.NDFDgenByDayLatLonListResponse ndfDgenByDayLatLonListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument.NDFDgenByDayLatLonListResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument.NDFDgenByDayLatLonListResponse)get_store().find_element_user(NDFDGENBYDAYLATLONLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument.NDFDgenByDayLatLonListResponse)get_store().add_element_user(NDFDGENBYDAYLATLONLISTRESPONSE$0);
            }
            target.set(ndfDgenByDayLatLonListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "NDFDgenByDayLatLonListResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument.NDFDgenByDayLatLonListResponse addNewNDFDgenByDayLatLonListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument.NDFDgenByDayLatLonListResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument.NDFDgenByDayLatLonListResponse)get_store().add_element_user(NDFDGENBYDAYLATLONLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML NDFDgenByDayLatLonListResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class NDFDgenByDayLatLonListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument.NDFDgenByDayLatLonListResponse
    {
        
        public NDFDgenByDayLatLonListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DWMLBYDAYOUT$0 = 
            new javax.xml.namespace.QName("", "dwmlByDayOut");
        
        
        /**
         * Gets the "dwmlByDayOut" element
         */
        public java.lang.String getDwmlByDayOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DWMLBYDAYOUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dwmlByDayOut" element
         */
        public org.apache.xmlbeans.XmlString xgetDwmlByDayOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DWMLBYDAYOUT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dwmlByDayOut" element
         */
        public void setDwmlByDayOut(java.lang.String dwmlByDayOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DWMLBYDAYOUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DWMLBYDAYOUT$0);
                }
                target.setStringValue(dwmlByDayOut);
            }
        }
        
        /**
         * Sets (as xml) the "dwmlByDayOut" element
         */
        public void xsetDwmlByDayOut(org.apache.xmlbeans.XmlString dwmlByDayOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DWMLBYDAYOUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DWMLBYDAYOUT$0);
                }
                target.set(dwmlByDayOut);
            }
        }
    }
}
