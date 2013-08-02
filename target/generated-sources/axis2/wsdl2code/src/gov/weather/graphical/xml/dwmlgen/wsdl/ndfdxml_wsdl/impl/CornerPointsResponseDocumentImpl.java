/*
 * An XML document type.
 * Localname: CornerPointsResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one CornerPointsResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class CornerPointsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument
{
    
    public CornerPointsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORNERPOINTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "CornerPointsResponse");
    
    
    /**
     * Gets the "CornerPointsResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument.CornerPointsResponse getCornerPointsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument.CornerPointsResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument.CornerPointsResponse)get_store().find_element_user(CORNERPOINTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CornerPointsResponse" element
     */
    public void setCornerPointsResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument.CornerPointsResponse cornerPointsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument.CornerPointsResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument.CornerPointsResponse)get_store().find_element_user(CORNERPOINTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument.CornerPointsResponse)get_store().add_element_user(CORNERPOINTSRESPONSE$0);
            }
            target.set(cornerPointsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CornerPointsResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument.CornerPointsResponse addNewCornerPointsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument.CornerPointsResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument.CornerPointsResponse)get_store().add_element_user(CORNERPOINTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CornerPointsResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class CornerPointsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument.CornerPointsResponse
    {
        
        public CornerPointsResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
