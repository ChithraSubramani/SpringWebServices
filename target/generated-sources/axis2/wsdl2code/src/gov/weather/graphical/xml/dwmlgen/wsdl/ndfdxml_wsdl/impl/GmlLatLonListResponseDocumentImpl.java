/*
 * An XML document type.
 * Localname: GmlLatLonListResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one GmlLatLonListResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class GmlLatLonListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument
{
    
    public GmlLatLonListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GMLLATLONLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "GmlLatLonListResponse");
    
    
    /**
     * Gets the "GmlLatLonListResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument.GmlLatLonListResponse getGmlLatLonListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument.GmlLatLonListResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument.GmlLatLonListResponse)get_store().find_element_user(GMLLATLONLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GmlLatLonListResponse" element
     */
    public void setGmlLatLonListResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument.GmlLatLonListResponse gmlLatLonListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument.GmlLatLonListResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument.GmlLatLonListResponse)get_store().find_element_user(GMLLATLONLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument.GmlLatLonListResponse)get_store().add_element_user(GMLLATLONLISTRESPONSE$0);
            }
            target.set(gmlLatLonListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GmlLatLonListResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument.GmlLatLonListResponse addNewGmlLatLonListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument.GmlLatLonListResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument.GmlLatLonListResponse)get_store().add_element_user(GMLLATLONLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GmlLatLonListResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class GmlLatLonListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument.GmlLatLonListResponse
    {
        
        public GmlLatLonListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DWGMLOUT$0 = 
            new javax.xml.namespace.QName("", "dwGmlOut");
        
        
        /**
         * Gets the "dwGmlOut" element
         */
        public java.lang.String getDwGmlOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DWGMLOUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dwGmlOut" element
         */
        public org.apache.xmlbeans.XmlString xgetDwGmlOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DWGMLOUT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dwGmlOut" element
         */
        public void setDwGmlOut(java.lang.String dwGmlOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DWGMLOUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DWGMLOUT$0);
                }
                target.setStringValue(dwGmlOut);
            }
        }
        
        /**
         * Sets (as xml) the "dwGmlOut" element
         */
        public void xsetDwGmlOut(org.apache.xmlbeans.XmlString dwGmlOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DWGMLOUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DWGMLOUT$0);
                }
                target.set(dwGmlOut);
            }
        }
    }
}
