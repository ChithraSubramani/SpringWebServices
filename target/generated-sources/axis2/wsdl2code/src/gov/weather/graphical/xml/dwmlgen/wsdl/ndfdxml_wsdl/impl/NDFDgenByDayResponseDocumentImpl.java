/*
 * An XML document type.
 * Localname: NDFDgenByDayResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one NDFDgenByDayResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class NDFDgenByDayResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument
{
    
    public NDFDgenByDayResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NDFDGENBYDAYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "NDFDgenByDayResponse");
    
    
    /**
     * Gets the "NDFDgenByDayResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument.NDFDgenByDayResponse getNDFDgenByDayResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument.NDFDgenByDayResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument.NDFDgenByDayResponse)get_store().find_element_user(NDFDGENBYDAYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NDFDgenByDayResponse" element
     */
    public void setNDFDgenByDayResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument.NDFDgenByDayResponse ndfDgenByDayResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument.NDFDgenByDayResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument.NDFDgenByDayResponse)get_store().find_element_user(NDFDGENBYDAYRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument.NDFDgenByDayResponse)get_store().add_element_user(NDFDGENBYDAYRESPONSE$0);
            }
            target.set(ndfDgenByDayResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "NDFDgenByDayResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument.NDFDgenByDayResponse addNewNDFDgenByDayResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument.NDFDgenByDayResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument.NDFDgenByDayResponse)get_store().add_element_user(NDFDGENBYDAYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML NDFDgenByDayResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class NDFDgenByDayResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument.NDFDgenByDayResponse
    {
        
        public NDFDgenByDayResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
