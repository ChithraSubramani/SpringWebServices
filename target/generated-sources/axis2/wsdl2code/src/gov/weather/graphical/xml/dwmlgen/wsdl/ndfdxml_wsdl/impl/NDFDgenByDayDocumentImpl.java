/*
 * An XML document type.
 * Localname: NDFDgenByDay
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one NDFDgenByDay(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class NDFDgenByDayDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument
{
    
    public NDFDgenByDayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NDFDGENBYDAY$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "NDFDgenByDay");
    
    
    /**
     * Gets the "NDFDgenByDay" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay getNDFDgenByDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay)get_store().find_element_user(NDFDGENBYDAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NDFDgenByDay" element
     */
    public void setNDFDgenByDay(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay ndfDgenByDay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay)get_store().find_element_user(NDFDGENBYDAY$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay)get_store().add_element_user(NDFDGENBYDAY$0);
            }
            target.set(ndfDgenByDay);
        }
    }
    
    /**
     * Appends and returns a new empty "NDFDgenByDay" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay addNewNDFDgenByDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay)get_store().add_element_user(NDFDGENBYDAY$0);
            return target;
        }
    }
    /**
     * An XML NDFDgenByDay(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class NDFDgenByDayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay
    {
        
        public NDFDgenByDayImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LATITUDE$0 = 
            new javax.xml.namespace.QName("", "latitude");
        private static final javax.xml.namespace.QName LONGITUDE$2 = 
            new javax.xml.namespace.QName("", "longitude");
        private static final javax.xml.namespace.QName STARTDATE$4 = 
            new javax.xml.namespace.QName("", "startDate");
        private static final javax.xml.namespace.QName NUMDAYS$6 = 
            new javax.xml.namespace.QName("", "numDays");
        private static final javax.xml.namespace.QName UNIT$8 = 
            new javax.xml.namespace.QName("", "Unit");
        private static final javax.xml.namespace.QName FORMAT$10 = 
            new javax.xml.namespace.QName("", "format");
        
        
        /**
         * Gets the "latitude" element
         */
        public java.math.BigDecimal getLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$0);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LATITUDE$0);
                }
                target.set(latitude);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$2, 0);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$2);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LONGITUDE$2);
                }
                target.set(longitude);
            }
        }
        
        /**
         * Gets the "startDate" element
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "startDate" element
         */
        public void setStartDate(java.util.Calendar startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$4);
                }
                target.setCalendarValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" element
         */
        public void xsetStartDate(org.apache.xmlbeans.XmlDate startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$4);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "numDays" element
         */
        public java.math.BigInteger getNumDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMDAYS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "numDays" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNumDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMDAYS$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numDays" element
         */
        public void setNumDays(java.math.BigInteger numDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMDAYS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMDAYS$6);
                }
                target.setBigIntegerValue(numDays);
            }
        }
        
        /**
         * Sets (as xml) the "numDays" element
         */
        public void xsetNumDays(org.apache.xmlbeans.XmlInteger numDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMDAYS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMDAYS$6);
                }
                target.set(numDays);
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
         * Gets the "format" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType.Enum getFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$10, 0);
                if (target == null)
                {
                    return null;
                }
                return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "format" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType xgetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType)get_store().find_element_user(FORMAT$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "format" element
         */
        public void setFormat(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType.Enum format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$10);
                }
                target.setEnumValue(format);
            }
        }
        
        /**
         * Sets (as xml) the "format" element
         */
        public void xsetFormat(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType)get_store().find_element_user(FORMAT$10, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType)get_store().add_element_user(FORMAT$10);
                }
                target.set(format);
            }
        }
    }
}
