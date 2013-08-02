/*
 * An XML document type.
 * Localname: GmlLatLonList
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one GmlLatLonList(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class GmlLatLonListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument
{
    
    public GmlLatLonListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GMLLATLONLIST$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "GmlLatLonList");
    
    
    /**
     * Gets the "GmlLatLonList" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList getGmlLatLonList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList)get_store().find_element_user(GMLLATLONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GmlLatLonList" element
     */
    public void setGmlLatLonList(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList gmlLatLonList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList)get_store().find_element_user(GMLLATLONLIST$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList)get_store().add_element_user(GMLLATLONLIST$0);
            }
            target.set(gmlLatLonList);
        }
    }
    
    /**
     * Appends and returns a new empty "GmlLatLonList" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList addNewGmlLatLonList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList)get_store().add_element_user(GMLLATLONLIST$0);
            return target;
        }
    }
    /**
     * An XML GmlLatLonList(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class GmlLatLonListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList
    {
        
        public GmlLatLonListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTEDTIME$0 = 
            new javax.xml.namespace.QName("", "requestedTime");
        private static final javax.xml.namespace.QName WEATHERPARAMETERS$2 = 
            new javax.xml.namespace.QName("", "weatherParameters");
        private static final javax.xml.namespace.QName FEATURETYPE$4 = 
            new javax.xml.namespace.QName("", "featureType");
        private static final javax.xml.namespace.QName UNIT$6 = 
            new javax.xml.namespace.QName("", "Unit");
        private static final javax.xml.namespace.QName LISTLATLON$8 = 
            new javax.xml.namespace.QName("", "listLatLon");
        
        
        /**
         * Gets the "requestedTime" element
         */
        public java.util.Calendar getRequestedTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTEDTIME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "requestedTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetRequestedTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUESTEDTIME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "requestedTime" element
         */
        public void setRequestedTime(java.util.Calendar requestedTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTEDTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTEDTIME$0);
                }
                target.setCalendarValue(requestedTime);
            }
        }
        
        /**
         * Sets (as xml) the "requestedTime" element
         */
        public void xsetRequestedTime(org.apache.xmlbeans.XmlDateTime requestedTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUESTEDTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(REQUESTEDTIME$0);
                }
                target.set(requestedTime);
            }
        }
        
        /**
         * Gets the "weatherParameters" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType getWeatherParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().find_element_user(WEATHERPARAMETERS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "weatherParameters" element
         */
        public void setWeatherParameters(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType weatherParameters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().find_element_user(WEATHERPARAMETERS$2, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().add_element_user(WEATHERPARAMETERS$2);
                }
                target.set(weatherParameters);
            }
        }
        
        /**
         * Appends and returns a new empty "weatherParameters" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType addNewWeatherParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().add_element_user(WEATHERPARAMETERS$2);
                return target;
            }
        }
        
        /**
         * Gets the "featureType" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType.Enum getFeatureType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURETYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "featureType" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType xgetFeatureType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType)get_store().find_element_user(FEATURETYPE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "featureType" element
         */
        public void setFeatureType(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType.Enum featureType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURETYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEATURETYPE$4);
                }
                target.setEnumValue(featureType);
            }
        }
        
        /**
         * Sets (as xml) the "featureType" element
         */
        public void xsetFeatureType(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType featureType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType)get_store().find_element_user(FEATURETYPE$4, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType)get_store().add_element_user(FEATURETYPE$4);
                }
                target.set(featureType);
            }
        }
        
        /**
         * Gets the "Unit" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType.Enum getUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Unit" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType xgetUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().find_element_user(UNIT$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Unit" element
         */
        public void setUnit(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType.Enum unit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIT$6);
                }
                target.setEnumValue(unit);
            }
        }
        
        /**
         * Sets (as xml) the "Unit" element
         */
        public void xsetUnit(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType unit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().find_element_user(UNIT$6, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().add_element_user(UNIT$6);
                }
                target.set(unit);
            }
        }
        
        /**
         * Gets the "listLatLon" element
         */
        public java.lang.String getListLatLon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTLATLON$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "listLatLon" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType xgetListLatLon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().find_element_user(LISTLATLON$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "listLatLon" element
         */
        public void setListLatLon(java.lang.String listLatLon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTLATLON$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTLATLON$8);
                }
                target.setStringValue(listLatLon);
            }
        }
        
        /**
         * Sets (as xml) the "listLatLon" element
         */
        public void xsetListLatLon(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType listLatLon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().find_element_user(LISTLATLON$8, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().add_element_user(LISTLATLON$8);
                }
                target.set(listLatLon);
            }
        }
    }
}
