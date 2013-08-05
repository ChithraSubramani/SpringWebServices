/*
 * An XML document type.
 * Localname: LatLonListSquare
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one LatLonListSquare(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class LatLonListSquareDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument
{
    
    public LatLonListSquareDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATLONLISTSQUARE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "LatLonListSquare");
    
    
    /**
     * Gets the "LatLonListSquare" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument.LatLonListSquare getLatLonListSquare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument.LatLonListSquare target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument.LatLonListSquare)get_store().find_element_user(LATLONLISTSQUARE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LatLonListSquare" element
     */
    public void setLatLonListSquare(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument.LatLonListSquare latLonListSquare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument.LatLonListSquare target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument.LatLonListSquare)get_store().find_element_user(LATLONLISTSQUARE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument.LatLonListSquare)get_store().add_element_user(LATLONLISTSQUARE$0);
            }
            target.set(latLonListSquare);
        }
    }
    
    /**
     * Appends and returns a new empty "LatLonListSquare" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument.LatLonListSquare addNewLatLonListSquare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument.LatLonListSquare target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument.LatLonListSquare)get_store().add_element_user(LATLONLISTSQUARE$0);
            return target;
        }
    }
    /**
     * An XML LatLonListSquare(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class LatLonListSquareImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareDocument.LatLonListSquare
    {
        
        public LatLonListSquareImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CENTERPOINTLAT$0 = 
            new javax.xml.namespace.QName("", "centerPointLat");
        private static final javax.xml.namespace.QName CENTERPOINTLON$2 = 
            new javax.xml.namespace.QName("", "centerPointLon");
        private static final javax.xml.namespace.QName DISTANCELAT$4 = 
            new javax.xml.namespace.QName("", "distanceLat");
        private static final javax.xml.namespace.QName DISTANCELON$6 = 
            new javax.xml.namespace.QName("", "distanceLon");
        private static final javax.xml.namespace.QName RESOLUTION$8 = 
            new javax.xml.namespace.QName("", "resolution");
        
        
        /**
         * Gets the "centerPointLat" element
         */
        public java.math.BigDecimal getCenterPointLat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CENTERPOINTLAT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "centerPointLat" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetCenterPointLat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CENTERPOINTLAT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "centerPointLat" element
         */
        public void setCenterPointLat(java.math.BigDecimal centerPointLat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CENTERPOINTLAT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CENTERPOINTLAT$0);
                }
                target.setBigDecimalValue(centerPointLat);
            }
        }
        
        /**
         * Sets (as xml) the "centerPointLat" element
         */
        public void xsetCenterPointLat(org.apache.xmlbeans.XmlDecimal centerPointLat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CENTERPOINTLAT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(CENTERPOINTLAT$0);
                }
                target.set(centerPointLat);
            }
        }
        
        /**
         * Gets the "centerPointLon" element
         */
        public java.math.BigDecimal getCenterPointLon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CENTERPOINTLON$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "centerPointLon" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetCenterPointLon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CENTERPOINTLON$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "centerPointLon" element
         */
        public void setCenterPointLon(java.math.BigDecimal centerPointLon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CENTERPOINTLON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CENTERPOINTLON$2);
                }
                target.setBigDecimalValue(centerPointLon);
            }
        }
        
        /**
         * Sets (as xml) the "centerPointLon" element
         */
        public void xsetCenterPointLon(org.apache.xmlbeans.XmlDecimal centerPointLon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CENTERPOINTLON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(CENTERPOINTLON$2);
                }
                target.set(centerPointLon);
            }
        }
        
        /**
         * Gets the "distanceLat" element
         */
        public java.math.BigDecimal getDistanceLat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCELAT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "distanceLat" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetDistanceLat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DISTANCELAT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "distanceLat" element
         */
        public void setDistanceLat(java.math.BigDecimal distanceLat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCELAT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCELAT$4);
                }
                target.setBigDecimalValue(distanceLat);
            }
        }
        
        /**
         * Sets (as xml) the "distanceLat" element
         */
        public void xsetDistanceLat(org.apache.xmlbeans.XmlDecimal distanceLat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DISTANCELAT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(DISTANCELAT$4);
                }
                target.set(distanceLat);
            }
        }
        
        /**
         * Gets the "distanceLon" element
         */
        public java.math.BigDecimal getDistanceLon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCELON$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "distanceLon" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetDistanceLon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DISTANCELON$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "distanceLon" element
         */
        public void setDistanceLon(java.math.BigDecimal distanceLon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCELON$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCELON$6);
                }
                target.setBigDecimalValue(distanceLon);
            }
        }
        
        /**
         * Sets (as xml) the "distanceLon" element
         */
        public void xsetDistanceLon(org.apache.xmlbeans.XmlDecimal distanceLon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DISTANCELON$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(DISTANCELON$6);
                }
                target.set(distanceLon);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTION$8, 0);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(RESOLUTION$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOLUTION$8);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(RESOLUTION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(RESOLUTION$8);
                }
                target.set(resolution);
            }
        }
    }
}
