/*
 * An XML document type.
 * Localname: LatLonListCityNames
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one LatLonListCityNames(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class LatLonListCityNamesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument
{
    
    public LatLonListCityNamesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATLONLISTCITYNAMES$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "LatLonListCityNames");
    
    
    /**
     * Gets the "LatLonListCityNames" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument.LatLonListCityNames getLatLonListCityNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument.LatLonListCityNames target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument.LatLonListCityNames)get_store().find_element_user(LATLONLISTCITYNAMES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LatLonListCityNames" element
     */
    public void setLatLonListCityNames(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument.LatLonListCityNames latLonListCityNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument.LatLonListCityNames target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument.LatLonListCityNames)get_store().find_element_user(LATLONLISTCITYNAMES$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument.LatLonListCityNames)get_store().add_element_user(LATLONLISTCITYNAMES$0);
            }
            target.set(latLonListCityNames);
        }
    }
    
    /**
     * Appends and returns a new empty "LatLonListCityNames" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument.LatLonListCityNames addNewLatLonListCityNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument.LatLonListCityNames target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument.LatLonListCityNames)get_store().add_element_user(LATLONLISTCITYNAMES$0);
            return target;
        }
    }
    /**
     * An XML LatLonListCityNames(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class LatLonListCityNamesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesDocument.LatLonListCityNames
    {
        
        public LatLonListCityNamesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DISPLAYLEVEL$0 = 
            new javax.xml.namespace.QName("", "displayLevel");
        
        
        /**
         * Gets the "displayLevel" element
         */
        public java.math.BigInteger getDisplayLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYLEVEL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "displayLevel" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.DisplayLevelType xgetDisplayLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.DisplayLevelType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.DisplayLevelType)get_store().find_element_user(DISPLAYLEVEL$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "displayLevel" element
         */
        public void setDisplayLevel(java.math.BigInteger displayLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYLEVEL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYLEVEL$0);
                }
                target.setBigIntegerValue(displayLevel);
            }
        }
        
        /**
         * Sets (as xml) the "displayLevel" element
         */
        public void xsetDisplayLevel(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.DisplayLevelType displayLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.DisplayLevelType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.DisplayLevelType)get_store().find_element_user(DISPLAYLEVEL$0, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.DisplayLevelType)get_store().add_element_user(DISPLAYLEVEL$0);
                }
                target.set(displayLevel);
            }
        }
    }
}
