/*
 * An XML document type.
 * Localname: GmlTimeSeriesResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one GmlTimeSeriesResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class GmlTimeSeriesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument
{
    
    public GmlTimeSeriesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GMLTIMESERIESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "GmlTimeSeriesResponse");
    
    
    /**
     * Gets the "GmlTimeSeriesResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument.GmlTimeSeriesResponse getGmlTimeSeriesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument.GmlTimeSeriesResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument.GmlTimeSeriesResponse)get_store().find_element_user(GMLTIMESERIESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GmlTimeSeriesResponse" element
     */
    public void setGmlTimeSeriesResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument.GmlTimeSeriesResponse gmlTimeSeriesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument.GmlTimeSeriesResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument.GmlTimeSeriesResponse)get_store().find_element_user(GMLTIMESERIESRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument.GmlTimeSeriesResponse)get_store().add_element_user(GMLTIMESERIESRESPONSE$0);
            }
            target.set(gmlTimeSeriesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GmlTimeSeriesResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument.GmlTimeSeriesResponse addNewGmlTimeSeriesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument.GmlTimeSeriesResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument.GmlTimeSeriesResponse)get_store().add_element_user(GMLTIMESERIESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GmlTimeSeriesResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class GmlTimeSeriesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument.GmlTimeSeriesResponse
    {
        
        public GmlTimeSeriesResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
