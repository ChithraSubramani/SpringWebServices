/*
 * An XML document type.
 * Localname: NDFDgen
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one NDFDgen(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class NDFDgenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument
{
    
    public NDFDgenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NDFDGEN$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "NDFDgen");
    
    
    /**
     * Gets the "NDFDgen" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen getNDFDgen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen)get_store().find_element_user(NDFDGEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NDFDgen" element
     */
    public void setNDFDgen(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen ndfDgen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen)get_store().find_element_user(NDFDGEN$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen)get_store().add_element_user(NDFDGEN$0);
            }
            target.set(ndfDgen);
        }
    }
    
    /**
     * Appends and returns a new empty "NDFDgen" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen addNewNDFDgen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen)get_store().add_element_user(NDFDGEN$0);
            return target;
        }
    }
    /**
     * An XML NDFDgen(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class NDFDgenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen
    {
        
        public NDFDgenImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STARTTIME$0 = 
            new javax.xml.namespace.QName("", "startTime");
        private static final javax.xml.namespace.QName PRODUCT$2 = 
            new javax.xml.namespace.QName("", "product");
        private static final javax.xml.namespace.QName WEATHERPARAMETERS$4 = 
            new javax.xml.namespace.QName("", "weatherParameters");
        private static final javax.xml.namespace.QName LONGITUDE$6 = 
            new javax.xml.namespace.QName("", "longitude");
        private static final javax.xml.namespace.QName LATITUDE$8 = 
            new javax.xml.namespace.QName("", "latitude");
        private static final javax.xml.namespace.QName ENDTIME$10 = 
            new javax.xml.namespace.QName("", "endTime");
        private static final javax.xml.namespace.QName UNIT$12 = 
            new javax.xml.namespace.QName("", "Unit");
        
        
        /**
         * Gets the "startTime" element
         */
        public java.util.Calendar getStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$0, 0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTTIME$0);
                }
                target.set(startTime);
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
         * Gets the "weatherParameters" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType getWeatherParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().find_element_user(WEATHERPARAMETERS$4, 0);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().find_element_user(WEATHERPARAMETERS$4, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().add_element_user(WEATHERPARAMETERS$4);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType)get_store().add_element_user(WEATHERPARAMETERS$4);
                return target;
            }
        }
        
        /**
         * Gets the "longitude" element
         */
        public java.math.BigDecimal getLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "longitude" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "longitude" element
         */
        public void setLongitude(java.math.BigDecimal longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$6);
                }
                target.setBigDecimalValue(longitude);
            }
        }
        
        /**
         * Sets (as xml) the "longitude" element
         */
        public void xsetLongitude(org.apache.xmlbeans.XmlDecimal longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LONGITUDE$6);
                }
                target.set(longitude);
            }
        }
        
        /**
         * Gets the "latitude" element
         */
        public java.math.BigDecimal getLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "latitude" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "latitude" element
         */
        public void setLatitude(java.math.BigDecimal latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$8);
                }
                target.setBigDecimalValue(latitude);
            }
        }
        
        /**
         * Sets (as xml) the "latitude" element
         */
        public void xsetLatitude(org.apache.xmlbeans.XmlDecimal latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LATITUDE$8);
                }
                target.set(latitude);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$10, 0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIME$10);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDTIME$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIT$12, 0);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().find_element_user(UNIT$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIT$12);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().find_element_user(UNIT$12, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType)get_store().add_element_user(UNIT$12);
                }
                target.set(unit);
            }
        }
    }
}
