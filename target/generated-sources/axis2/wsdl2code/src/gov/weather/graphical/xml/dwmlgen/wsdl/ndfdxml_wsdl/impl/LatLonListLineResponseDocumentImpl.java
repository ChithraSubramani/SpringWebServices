/*
 * An XML document type.
 * Localname: LatLonListLineResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one LatLonListLineResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class LatLonListLineResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument
{
    
    public LatLonListLineResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATLONLISTLINERESPONSE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "LatLonListLineResponse");
    
    
    /**
     * Gets the "LatLonListLineResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument.LatLonListLineResponse getLatLonListLineResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument.LatLonListLineResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument.LatLonListLineResponse)get_store().find_element_user(LATLONLISTLINERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LatLonListLineResponse" element
     */
    public void setLatLonListLineResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument.LatLonListLineResponse latLonListLineResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument.LatLonListLineResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument.LatLonListLineResponse)get_store().find_element_user(LATLONLISTLINERESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument.LatLonListLineResponse)get_store().add_element_user(LATLONLISTLINERESPONSE$0);
            }
            target.set(latLonListLineResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "LatLonListLineResponse" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument.LatLonListLineResponse addNewLatLonListLineResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument.LatLonListLineResponse target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument.LatLonListLineResponse)get_store().add_element_user(LATLONLISTLINERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML LatLonListLineResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class LatLonListLineResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument.LatLonListLineResponse
    {
        
        public LatLonListLineResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
