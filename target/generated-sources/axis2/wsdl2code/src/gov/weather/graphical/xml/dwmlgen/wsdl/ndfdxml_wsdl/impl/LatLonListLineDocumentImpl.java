/*
 * An XML document type.
 * Localname: LatLonListLine
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one LatLonListLine(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class LatLonListLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument
{
    
    public LatLonListLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATLONLISTLINE$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "LatLonListLine");
    
    
    /**
     * Gets the "LatLonListLine" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument.LatLonListLine getLatLonListLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument.LatLonListLine target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument.LatLonListLine)get_store().find_element_user(LATLONLISTLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LatLonListLine" element
     */
    public void setLatLonListLine(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument.LatLonListLine latLonListLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument.LatLonListLine target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument.LatLonListLine)get_store().find_element_user(LATLONLISTLINE$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument.LatLonListLine)get_store().add_element_user(LATLONLISTLINE$0);
            }
            target.set(latLonListLine);
        }
    }
    
    /**
     * Appends and returns a new empty "LatLonListLine" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument.LatLonListLine addNewLatLonListLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument.LatLonListLine target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument.LatLonListLine)get_store().add_element_user(LATLONLISTLINE$0);
            return target;
        }
    }
    /**
     * An XML LatLonListLine(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class LatLonListLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineDocument.LatLonListLine
    {
        
        public LatLonListLineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENDPOINT1LAT$0 = 
            new javax.xml.namespace.QName("", "endPoint1Lat");
        private static final javax.xml.namespace.QName ENDPOINT1LON$2 = 
            new javax.xml.namespace.QName("", "endPoint1Lon");
        private static final javax.xml.namespace.QName ENDPOINT2LAT$4 = 
            new javax.xml.namespace.QName("", "endPoint2Lat");
        private static final javax.xml.namespace.QName ENDPOINT2LON$6 = 
            new javax.xml.namespace.QName("", "endPoint2Lon");
        
        
        /**
         * Gets the "endPoint1Lat" element
         */
        public java.math.BigDecimal getEndPoint1Lat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT1LAT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "endPoint1Lat" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetEndPoint1Lat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDPOINT1LAT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endPoint1Lat" element
         */
        public void setEndPoint1Lat(java.math.BigDecimal endPoint1Lat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT1LAT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT1LAT$0);
                }
                target.setBigDecimalValue(endPoint1Lat);
            }
        }
        
        /**
         * Sets (as xml) the "endPoint1Lat" element
         */
        public void xsetEndPoint1Lat(org.apache.xmlbeans.XmlDecimal endPoint1Lat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDPOINT1LAT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(ENDPOINT1LAT$0);
                }
                target.set(endPoint1Lat);
            }
        }
        
        /**
         * Gets the "endPoint1Lon" element
         */
        public java.math.BigDecimal getEndPoint1Lon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT1LON$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "endPoint1Lon" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetEndPoint1Lon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDPOINT1LON$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endPoint1Lon" element
         */
        public void setEndPoint1Lon(java.math.BigDecimal endPoint1Lon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT1LON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT1LON$2);
                }
                target.setBigDecimalValue(endPoint1Lon);
            }
        }
        
        /**
         * Sets (as xml) the "endPoint1Lon" element
         */
        public void xsetEndPoint1Lon(org.apache.xmlbeans.XmlDecimal endPoint1Lon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDPOINT1LON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(ENDPOINT1LON$2);
                }
                target.set(endPoint1Lon);
            }
        }
        
        /**
         * Gets the "endPoint2Lat" element
         */
        public java.math.BigDecimal getEndPoint2Lat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT2LAT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "endPoint2Lat" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetEndPoint2Lat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDPOINT2LAT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endPoint2Lat" element
         */
        public void setEndPoint2Lat(java.math.BigDecimal endPoint2Lat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT2LAT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT2LAT$4);
                }
                target.setBigDecimalValue(endPoint2Lat);
            }
        }
        
        /**
         * Sets (as xml) the "endPoint2Lat" element
         */
        public void xsetEndPoint2Lat(org.apache.xmlbeans.XmlDecimal endPoint2Lat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDPOINT2LAT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(ENDPOINT2LAT$4);
                }
                target.set(endPoint2Lat);
            }
        }
        
        /**
         * Gets the "endPoint2Lon" element
         */
        public java.math.BigDecimal getEndPoint2Lon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT2LON$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "endPoint2Lon" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetEndPoint2Lon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDPOINT2LON$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endPoint2Lon" element
         */
        public void setEndPoint2Lon(java.math.BigDecimal endPoint2Lon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT2LON$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT2LON$6);
                }
                target.setBigDecimalValue(endPoint2Lon);
            }
        }
        
        /**
         * Sets (as xml) the "endPoint2Lon" element
         */
        public void xsetEndPoint2Lon(org.apache.xmlbeans.XmlDecimal endPoint2Lon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDPOINT2LON$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(ENDPOINT2LON$6);
                }
                target.set(endPoint2Lon);
            }
        }
    }
}
