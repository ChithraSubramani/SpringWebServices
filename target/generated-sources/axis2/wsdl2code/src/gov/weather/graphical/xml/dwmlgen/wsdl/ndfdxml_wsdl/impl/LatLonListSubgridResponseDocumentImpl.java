/*
 * An XML document type.
 * Localname: LatLonListSubgridResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one LatLonListSubgridResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class LatLonListSubgridResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument
{
    
    public LatLonListSubgridResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATLONLISTSUBGRIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "LatLonListSubgridResponse");
    
    
    /**
     * Gets the "LatLonListSubgridResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument.LatLonListSubgridResponse getLatLonListSubgridResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument.LatLonListSubgridResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument.LatLonListSubgridResponse)get_store().find_element_user(LATLONLISTSUBGRIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LatLonListSubgridResponse" element
     */
    public void setLatLonListSubgridResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument.LatLonListSubgridResponse latLonListSubgridResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument.LatLonListSubgridResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument.LatLonListSubgridResponse)get_store().find_element_user(LATLONLISTSUBGRIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument.LatLonListSubgridResponse)get_store().add_element_user(LATLONLISTSUBGRIDRESPONSE$0);
            }
            target.set(latLonListSubgridResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "LatLonListSubgridResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument.LatLonListSubgridResponse addNewLatLonListSubgridResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument.LatLonListSubgridResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument.LatLonListSubgridResponse)get_store().add_element_user(LATLONLISTSUBGRIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML LatLonListSubgridResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class LatLonListSubgridResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument.LatLonListSubgridResponse
    {
        
        public LatLonListSubgridResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
