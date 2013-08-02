/*
 * An XML document type.
 * Localname: CornerPoints
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.impl;
/**
 * A document containing one CornerPoints(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public class CornerPointsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument
{
    
    public CornerPointsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORNERPOINTS$0 = 
        new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "CornerPoints");
    
    
    /**
     * Gets the "CornerPoints" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument.CornerPoints getCornerPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument.CornerPoints target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument.CornerPoints)get_store().find_element_user(CORNERPOINTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CornerPoints" element
     */
    public void setCornerPoints(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument.CornerPoints cornerPoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument.CornerPoints target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument.CornerPoints)get_store().find_element_user(CORNERPOINTS$0, 0);
            if (target == null)
            {
                target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument.CornerPoints)get_store().add_element_user(CORNERPOINTS$0);
            }
            target.set(cornerPoints);
        }
    }
    
    /**
     * Appends and returns a new empty "CornerPoints" element
     */
    public gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument.CornerPoints addNewCornerPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument.CornerPoints target = null;
            target = (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument.CornerPoints)get_store().add_element_user(CORNERPOINTS$0);
            return target;
        }
    }
    /**
     * An XML CornerPoints(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public static class CornerPointsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsDocument.CornerPoints
    {
        
        public CornerPointsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECTOR$0 = 
            new javax.xml.namespace.QName("", "sector");
        
        
        /**
         * Gets the "sector" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.SectorType.Enum getSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECTOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.SectorType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "sector" element
         */
        public gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.SectorType xgetSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.SectorType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.SectorType)get_store().find_element_user(SECTOR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sector" element
         */
        public void setSector(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.SectorType.Enum sector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECTOR$0);
                }
                target.setEnumValue(sector);
            }
        }
        
        /**
         * Sets (as xml) the "sector" element
         */
        public void xsetSector(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.SectorType sector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.SectorType target = null;
                target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.SectorType)get_store().find_element_user(SECTOR$0, 0);
                if (target == null)
                {
                    target = (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.SectorType)get_store().add_element_user(SECTOR$0);
                }
                target.set(sector);
            }
        }
    }
}
