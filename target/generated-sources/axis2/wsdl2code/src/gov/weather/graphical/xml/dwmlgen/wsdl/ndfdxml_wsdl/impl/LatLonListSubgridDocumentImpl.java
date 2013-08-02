/*
 * An XML document type.
 * Localname: LatLonListSubgrid
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one LatLonListSubgrid(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class LatLonListSubgridDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument
{
    
    public LatLonListSubgridDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATLONLISTSUBGRID$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "LatLonListSubgrid");
    
    
    /**
     * Gets the "LatLonListSubgrid" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument.LatLonListSubgrid getLatLonListSubgrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument.LatLonListSubgrid target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument.LatLonListSubgrid)get_store().find_element_user(LATLONLISTSUBGRID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LatLonListSubgrid" element
     */
    public void setLatLonListSubgrid(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument.LatLonListSubgrid latLonListSubgrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument.LatLonListSubgrid target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument.LatLonListSubgrid)get_store().find_element_user(LATLONLISTSUBGRID$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument.LatLonListSubgrid)get_store().add_element_user(LATLONLISTSUBGRID$0);
            }
            target.set(latLonListSubgrid);
        }
    }
    
    /**
     * Appends and returns a new empty "LatLonListSubgrid" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument.LatLonListSubgrid addNewLatLonListSubgrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument.LatLonListSubgrid target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument.LatLonListSubgrid)get_store().add_element_user(LATLONLISTSUBGRID$0);
            return target;
        }
    }
    /**
     * An XML LatLonListSubgrid(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class LatLonListSubgridImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridDocument.LatLonListSubgrid
    {
        
        public LatLonListSubgridImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UPPERRIGHTLATITUDE$0 = 
            new javax.xml.namespace.QName("", "upperRightLatitude");
        private static final javax.xml.namespace.QName LOWERLEFTLATITUDE$2 = 
            new javax.xml.namespace.QName("", "lowerLeftLatitude");
        private static final javax.xml.namespace.QName LOWERLEFTLONGITUDE$4 = 
            new javax.xml.namespace.QName("", "lowerLeftLongitude");
        private static final javax.xml.namespace.QName RESOLUTION$6 = 
            new javax.xml.namespace.QName("", "resolution");
        private static final javax.xml.namespace.QName UPPERRIGHTLONGITUDE$8 = 
            new javax.xml.namespace.QName("", "upperRightLongitude");
        
        
        /**
         * Gets the "upperRightLatitude" element
         */
        public java.math.BigDecimal getUpperRightLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERRIGHTLATITUDE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "upperRightLatitude" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetUpperRightLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UPPERRIGHTLATITUDE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "upperRightLatitude" element
         */
        public void setUpperRightLatitude(java.math.BigDecimal upperRightLatitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERRIGHTLATITUDE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERRIGHTLATITUDE$0);
                }
                target.setBigDecimalValue(upperRightLatitude);
            }
        }
        
        /**
         * Sets (as xml) the "upperRightLatitude" element
         */
        public void xsetUpperRightLatitude(org.apache.xmlbeans.XmlDecimal upperRightLatitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UPPERRIGHTLATITUDE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(UPPERRIGHTLATITUDE$0);
                }
                target.set(upperRightLatitude);
            }
        }
        
        /**
         * Gets the "lowerLeftLatitude" element
         */
        public java.math.BigDecimal getLowerLeftLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERLEFTLATITUDE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "lowerLeftLatitude" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetLowerLeftLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LOWERLEFTLATITUDE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "lowerLeftLatitude" element
         */
        public void setLowerLeftLatitude(java.math.BigDecimal lowerLeftLatitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERLEFTLATITUDE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERLEFTLATITUDE$2);
                }
                target.setBigDecimalValue(lowerLeftLatitude);
            }
        }
        
        /**
         * Sets (as xml) the "lowerLeftLatitude" element
         */
        public void xsetLowerLeftLatitude(org.apache.xmlbeans.XmlDecimal lowerLeftLatitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LOWERLEFTLATITUDE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LOWERLEFTLATITUDE$2);
                }
                target.set(lowerLeftLatitude);
            }
        }
        
        /**
         * Gets the "lowerLeftLongitude" element
         */
        public java.math.BigDecimal getLowerLeftLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERLEFTLONGITUDE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "lowerLeftLongitude" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetLowerLeftLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LOWERLEFTLONGITUDE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "lowerLeftLongitude" element
         */
        public void setLowerLeftLongitude(java.math.BigDecimal lowerLeftLongitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERLEFTLONGITUDE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERLEFTLONGITUDE$4);
                }
                target.setBigDecimalValue(lowerLeftLongitude);
            }
        }
        
        /**
         * Sets (as xml) the "lowerLeftLongitude" element
         */
        public void xsetLowerLeftLongitude(org.apache.xmlbeans.XmlDecimal lowerLeftLongitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LOWERLEFTLONGITUDE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LOWERLEFTLONGITUDE$4);
                }
                target.set(lowerLeftLongitude);
            }
        }
        
        /**
         * Gets the "resolution" element
         */
        public java.math.BigDecimal getResolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "resolution" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetResolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(RESOLUTION$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "resolution" element
         */
        public void setResolution(java.math.BigDecimal resolution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOLUTION$6);
                }
                target.setBigDecimalValue(resolution);
            }
        }
        
        /**
         * Sets (as xml) the "resolution" element
         */
        public void xsetResolution(org.apache.xmlbeans.XmlDecimal resolution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(RESOLUTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(RESOLUTION$6);
                }
                target.set(resolution);
            }
        }
        
        /**
         * Gets the "upperRightLongitude" element
         */
        public java.math.BigDecimal getUpperRightLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERRIGHTLONGITUDE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "upperRightLongitude" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetUpperRightLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UPPERRIGHTLONGITUDE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "upperRightLongitude" element
         */
        public void setUpperRightLongitude(java.math.BigDecimal upperRightLongitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERRIGHTLONGITUDE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERRIGHTLONGITUDE$8);
                }
                target.setBigDecimalValue(upperRightLongitude);
            }
        }
        
        /**
         * Sets (as xml) the "upperRightLongitude" element
         */
        public void xsetUpperRightLongitude(org.apache.xmlbeans.XmlDecimal upperRightLongitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UPPERRIGHTLONGITUDE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(UPPERRIGHTLONGITUDE$8);
                }
                target.set(upperRightLongitude);
            }
        }
    }
}
