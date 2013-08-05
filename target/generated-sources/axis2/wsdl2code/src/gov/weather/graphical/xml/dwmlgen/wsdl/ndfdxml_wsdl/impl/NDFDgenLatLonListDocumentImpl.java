/*
 * An XML document type.
 * Localname: NDFDgenLatLonList
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one NDFDgenLatLonList(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class NDFDgenLatLonListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument
{
    
    public NDFDgenLatLonListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NDFDGENLATLONLIST$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "NDFDgenLatLonList");
    
    
    /**
     * Gets the "NDFDgenLatLonList" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList getNDFDgenLatLonList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList)get_store().find_element_user(NDFDGENLATLONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NDFDgenLatLonList" element
     */
    public void setNDFDgenLatLonList(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList ndfDgenLatLonList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList)get_store().find_element_user(NDFDGENLATLONLIST$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList)get_store().add_element_user(NDFDGENLATLONLIST$0);
            }
            target.set(ndfDgenLatLonList);
        }
    }
    
    /**
     * Appends and returns a new empty "NDFDgenLatLonList" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList addNewNDFDgenLatLonList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList)get_store().add_element_user(NDFDGENLATLONLIST$0);
            return target;
        }
    }
    /**
     * An XML NDFDgenLatLonList(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class NDFDgenLatLonListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList
    {
        
        public NDFDgenLatLonListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTLATLON$0 = 
            new javax.xml.namespace.QName("", "listLatLon");
        private static final javax.xml.namespace.QName PRODUCT$2 = 
            new javax.xml.namespace.QName("", "product");
        private static final javax.xml.namespace.QName STARTTIME$4 = 
            new javax.xml.namespace.QName("", "startTime");
        private static final javax.xml.namespace.QName ENDTIME$6 = 
            new javax.xml.namespace.QName("", "endTime");
        private static final javax.xml.namespace.QName UNIT$8 = 
            new javax.xml.namespace.QName("", "Unit");
        private static final javax.xml.namespace.QName WEATHERPARAMETERS$10 = 
            new javax.xml.namespace.QName("", "weatherParameters");
        
        
        /**
         * Gets the "listLatLon" element
         */
        public java.lang.String getListLatLon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTLATLON$0, 0);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().find_element_user(LISTLATLON$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTLATLON$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTLATLON$0);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().find_element_user(LISTLATLON$0, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType)get_store().add_element_user(LISTLATLON$0);
                }
                target.set(listLatLon);
            }
        }
        
        /**
         * Gets the "product" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType.Enum getProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "product" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType xgetProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType)get_store().find_element_user(PRODUCT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "product" element
         */
        public void setProduct(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType.Enum product)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCT$2);
                }
                target.setEnumValue(product);
            }
        }
        
        /**
         * Sets (as xml) the "product" element
         */
        public void xsetProduct(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType product)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType)get_store().find_element_user(PRODUCT$2, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType)get_store().add_element_user(PRODUCT$2);
                }
                target.set(product);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$4, 0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$4);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTTIME$4);
                }
                target.set(startTime);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$6, 0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIME$6);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDTIME$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIT$8, 0);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().find_element_user(UNIT$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIT$8);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().find_element_user(UNIT$8, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().add_element_user(UNIT$8);
                }
                target.set(unit);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().find_element_user(WEATHERPARAMETERS$10, 0);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().find_element_user(WEATHERPARAMETERS$10, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().add_element_user(WEATHERPARAMETERS$10);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().add_element_user(WEATHERPARAMETERS$10);
                return target;
            }
        }
    }
}
