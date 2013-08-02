/*
 * An XML document type.
 * Localname: GmlTimeSeries
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one GmlTimeSeries(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class GmlTimeSeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument
{
    
    public GmlTimeSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GMLTIMESERIES$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "GmlTimeSeries");
    
    
    /**
     * Gets the "GmlTimeSeries" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument.GmlTimeSeries getGmlTimeSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument.GmlTimeSeries target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument.GmlTimeSeries)get_store().find_element_user(GMLTIMESERIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GmlTimeSeries" element
     */
    public void setGmlTimeSeries(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument.GmlTimeSeries gmlTimeSeries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument.GmlTimeSeries target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument.GmlTimeSeries)get_store().find_element_user(GMLTIMESERIES$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument.GmlTimeSeries)get_store().add_element_user(GMLTIMESERIES$0);
            }
            target.set(gmlTimeSeries);
        }
    }
    
    /**
     * Appends and returns a new empty "GmlTimeSeries" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument.GmlTimeSeries addNewGmlTimeSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument.GmlTimeSeries target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument.GmlTimeSeries)get_store().add_element_user(GMLTIMESERIES$0);
            return target;
        }
    }
    /**
     * An XML GmlTimeSeries(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class GmlTimeSeriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesDocument.GmlTimeSeries
    {
        
        public GmlTimeSeriesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTYNAME$0 = 
            new javax.xml.namespace.QName("", "propertyName");
        private static final javax.xml.namespace.QName STARTTIME$2 = 
            new javax.xml.namespace.QName("", "startTime");
        private static final javax.xml.namespace.QName COMPTYPE$4 = 
            new javax.xml.namespace.QName("", "compType");
        private static final javax.xml.namespace.QName FEATURETYPE$6 = 
            new javax.xml.namespace.QName("", "featureType");
        private static final javax.xml.namespace.QName ENDTIME$8 = 
            new javax.xml.namespace.QName("", "endTime");
        private static final javax.xml.namespace.QName UNIT$10 = 
            new javax.xml.namespace.QName("", "Unit");
        private static final javax.xml.namespace.QName LISTLATLON$12 = 
            new javax.xml.namespace.QName("", "listLatLon");
        
        
        /**
         * Gets the "propertyName" element
         */
        public java.lang.String getPropertyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "propertyName" element
         */
        public org.apache.xmlbeans.XmlString xgetPropertyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "propertyName" element
         */
        public void setPropertyName(java.lang.String propertyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYNAME$0);
                }
                target.setStringValue(propertyName);
            }
        }
        
        /**
         * Sets (as xml) the "propertyName" element
         */
        public void xsetPropertyName(org.apache.xmlbeans.XmlString propertyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYNAME$0);
                }
                target.set(propertyName);
            }
        }
        
        /**
         * Gets the "startTime" element
         */
        public java.util.Calendar getStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "startTime" element
         */
        public void setStartTime(java.util.Calendar startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$2);
                }
                target.setCalendarValue(startTime);
            }
        }
        
        /**
         * Sets (as xml) the "startTime" element
         */
        public void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTTIME$2);
                }
                target.set(startTime);
            }
        }
        
        /**
         * Gets the "compType" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType.Enum getCompType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "compType" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType xgetCompType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType)get_store().find_element_user(COMPTYPE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "compType" element
         */
        public void setCompType(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType.Enum compType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPTYPE$4);
                }
                target.setEnumValue(compType);
            }
        }
        
        /**
         * Sets (as xml) the "compType" element
         */
        public void xsetCompType(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType compType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType)get_store().find_element_user(COMPTYPE$4, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType)get_store().add_element_user(COMPTYPE$4);
                }
                target.set(compType);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURETYPE$6, 0);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType)get_store().find_element_user(FEATURETYPE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURETYPE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEATURETYPE$6);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType)get_store().find_element_user(FEATURETYPE$6, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType)get_store().add_element_user(FEATURETYPE$6);
                }
                target.set(featureType);
            }
        }
        
        /**
         * Gets the "endTime" element
         */
        public java.util.Calendar getEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endTime" element
         */
        public void setEndTime(java.util.Calendar endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIME$8);
                }
                target.setCalendarValue(endTime);
            }
        }
        
        /**
         * Sets (as xml) the "endTime" element
         */
        public void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDTIME$8);
                }
                target.set(endTime);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIT$10, 0);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().find_element_user(UNIT$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIT$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIT$10);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().find_element_user(UNIT$10, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().add_element_user(UNIT$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTLATLON$12, 0);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().find_element_user(LISTLATLON$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTLATLON$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTLATLON$12);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().find_element_user(LISTLATLON$12, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().add_element_user(LISTLATLON$12);
                }
                target.set(listLatLon);
            }
        }
    }
}
