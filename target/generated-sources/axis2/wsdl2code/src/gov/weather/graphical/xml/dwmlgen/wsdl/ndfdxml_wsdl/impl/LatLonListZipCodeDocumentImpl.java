/*
 * An XML document type.
 * Localname: LatLonListZipCode
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one LatLonListZipCode(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class LatLonListZipCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument
{
    
    public LatLonListZipCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATLONLISTZIPCODE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "LatLonListZipCode");
    
    
    /**
     * Gets the "LatLonListZipCode" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument.LatLonListZipCode getLatLonListZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument.LatLonListZipCode target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument.LatLonListZipCode)get_store().find_element_user(LATLONLISTZIPCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LatLonListZipCode" element
     */
    public void setLatLonListZipCode(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument.LatLonListZipCode latLonListZipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument.LatLonListZipCode target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument.LatLonListZipCode)get_store().find_element_user(LATLONLISTZIPCODE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument.LatLonListZipCode)get_store().add_element_user(LATLONLISTZIPCODE$0);
            }
            target.set(latLonListZipCode);
        }
    }
    
    /**
     * Appends and returns a new empty "LatLonListZipCode" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument.LatLonListZipCode addNewLatLonListZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument.LatLonListZipCode target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument.LatLonListZipCode)get_store().add_element_user(LATLONLISTZIPCODE$0);
            return target;
        }
    }
    /**
     * An XML LatLonListZipCode(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class LatLonListZipCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeDocument.LatLonListZipCode
    {
        
        public LatLonListZipCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ZIPCODELIST$0 = 
            new javax.xml.namespace.QName("", "zipCodeList");
        
        
        /**
         * Gets the "zipCodeList" element
         */
        public java.lang.String getZipCodeList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODELIST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "zipCodeList" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ZipCodeListType xgetZipCodeList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ZipCodeListType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ZipCodeListType)get_store().find_element_user(ZIPCODELIST$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "zipCodeList" element
         */
        public void setZipCodeList(java.lang.String zipCodeList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODELIST$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPCODELIST$0);
                }
                target.setStringValue(zipCodeList);
            }
        }
        
        /**
         * Sets (as xml) the "zipCodeList" element
         */
        public void xsetZipCodeList(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ZipCodeListType zipCodeList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ZipCodeListType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ZipCodeListType)get_store().find_element_user(ZIPCODELIST$0, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ZipCodeListType)get_store().add_element_user(ZIPCODELIST$0);
                }
                target.set(zipCodeList);
            }
        }
    }
}
