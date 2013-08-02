/*
 * An XML document type.
 * Localname: NDFDgenByDayLatLonList
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one NDFDgenByDayLatLonList(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class NDFDgenByDayLatLonListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument
{
    
    public NDFDgenByDayLatLonListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NDFDGENBYDAYLATLONLIST$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "NDFDgenByDayLatLonList");
    
    
    /**
     * Gets the "NDFDgenByDayLatLonList" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument.NDFDgenByDayLatLonList getNDFDgenByDayLatLonList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument.NDFDgenByDayLatLonList target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument.NDFDgenByDayLatLonList)get_store().find_element_user(NDFDGENBYDAYLATLONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NDFDgenByDayLatLonList" element
     */
    public void setNDFDgenByDayLatLonList(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument.NDFDgenByDayLatLonList ndfDgenByDayLatLonList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument.NDFDgenByDayLatLonList target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument.NDFDgenByDayLatLonList)get_store().find_element_user(NDFDGENBYDAYLATLONLIST$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument.NDFDgenByDayLatLonList)get_store().add_element_user(NDFDGENBYDAYLATLONLIST$0);
            }
            target.set(ndfDgenByDayLatLonList);
        }
    }
    
    /**
     * Appends and returns a new empty "NDFDgenByDayLatLonList" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument.NDFDgenByDayLatLonList addNewNDFDgenByDayLatLonList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument.NDFDgenByDayLatLonList target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument.NDFDgenByDayLatLonList)get_store().add_element_user(NDFDGENBYDAYLATLONLIST$0);
            return target;
        }
    }
    /**
     * An XML NDFDgenByDayLatLonList(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class NDFDgenByDayLatLonListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListDocument.NDFDgenByDayLatLonList
    {
        
        public NDFDgenByDayLatLonListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STARTDATE$0 = 
            new javax.xml.namespace.QName("", "startDate");
        private static final javax.xml.namespace.QName NUMDAYS$2 = 
            new javax.xml.namespace.QName("", "numDays");
        private static final javax.xml.namespace.QName FORMAT$4 = 
            new javax.xml.namespace.QName("", "format");
        private static final javax.xml.namespace.QName UNIT$6 = 
            new javax.xml.namespace.QName("", "Unit");
        private static final javax.xml.namespace.QName LISTLATLON$8 = 
            new javax.xml.namespace.QName("", "listLatLon");
        
        
        /**
         * Gets the "startDate" element
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$0);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMDAYS$2, 0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMDAYS$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMDAYS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMDAYS$2);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMDAYS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMDAYS$2);
                }
                target.set(numDays);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$4, 0);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType)get_store().find_element_user(FORMAT$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$4);
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
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType)get_store().find_element_user(FORMAT$4, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType)get_store().add_element_user(FORMAT$4);
                }
                target.set(format);
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
