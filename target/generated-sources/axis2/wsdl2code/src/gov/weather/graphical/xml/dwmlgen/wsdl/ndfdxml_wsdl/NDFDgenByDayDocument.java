/*
 * An XML document type.
 * Localname: NDFDgenByDay
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl;


/**
 * A document containing one NDFDgenByDay(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public interface NDFDgenByDayDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NDFDgenByDayDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA87D6C15DEB732A4F74CA9A906A94D12").resolveHandle("ndfdgenbyday96a7doctype");
    
    /**
     * Gets the "NDFDgenByDay" element
     */
    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay getNDFDgenByDay();
    
    /**
     * Sets the "NDFDgenByDay" element
     */
    void setNDFDgenByDay(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay ndfDgenByDay);
    
    /**
     * Appends and returns a new empty "NDFDgenByDay" element
     */
    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay addNewNDFDgenByDay();
    
    /**
     * An XML NDFDgenByDay(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public interface NDFDgenByDay extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NDFDgenByDay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA87D6C15DEB732A4F74CA9A906A94D12").resolveHandle("ndfdgenbydaye04celemtype");
        
        /**
         * Gets the "latitude" element
         */
        java.math.BigDecimal getLatitude();
        
        /**
         * Gets (as xml) the "latitude" element
         */
        org.apache.xmlbeans.XmlDecimal xgetLatitude();
        
        /**
         * Sets the "latitude" element
         */
        void setLatitude(java.math.BigDecimal latitude);
        
        /**
         * Sets (as xml) the "latitude" element
         */
        void xsetLatitude(org.apache.xmlbeans.XmlDecimal latitude);
        
        /**
         * Gets the "longitude" element
         */
        java.math.BigDecimal getLongitude();
        
        /**
         * Gets (as xml) the "longitude" element
         */
        org.apache.xmlbeans.XmlDecimal xgetLongitude();
        
        /**
         * Sets the "longitude" element
         */
        void setLongitude(java.math.BigDecimal longitude);
        
        /**
         * Sets (as xml) the "longitude" element
         */
        void xsetLongitude(org.apache.xmlbeans.XmlDecimal longitude);
        
        /**
         * Gets the "startDate" element
         */
        java.util.Calendar getStartDate();
        
        /**
         * Gets (as xml) the "startDate" element
         */
        org.apache.xmlbeans.XmlDate xgetStartDate();
        
        /**
         * Sets the "startDate" element
         */
        void setStartDate(java.util.Calendar startDate);
        
        /**
         * Sets (as xml) the "startDate" element
         */
        void xsetStartDate(org.apache.xmlbeans.XmlDate startDate);
        
        /**
         * Gets the "numDays" element
         */
        java.math.BigInteger getNumDays();
        
        /**
         * Gets (as xml) the "numDays" element
         */
        org.apache.xmlbeans.XmlInteger xgetNumDays();
        
        /**
         * Sets the "numDays" element
         */
        void setNumDays(java.math.BigInteger numDays);
        
        /**
         * Sets (as xml) the "numDays" element
         */
        void xsetNumDays(org.apache.xmlbeans.XmlInteger numDays);
        
        /**
         * Gets the "Unit" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType.Enum getUnit();
        
        /**
         * Gets (as xml) the "Unit" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType xgetUnit();
        
        /**
         * Sets the "Unit" element
         */
        void setUnit(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType.Enum unit);
        
        /**
         * Sets (as xml) the "Unit" element
         */
        void xsetUnit(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.UnitType unit);
        
        /**
         * Gets the "format" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType.Enum getFormat();
        
        /**
         * Gets (as xml) the "format" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType xgetFormat();
        
        /**
         * Sets the "format" element
         */
        void setFormat(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType.Enum format);
        
        /**
         * Sets (as xml) the "format" element
         */
        void xsetFormat(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FormatType format);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay newInstance() {
              return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument.NDFDgenByDay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument newInstance() {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
