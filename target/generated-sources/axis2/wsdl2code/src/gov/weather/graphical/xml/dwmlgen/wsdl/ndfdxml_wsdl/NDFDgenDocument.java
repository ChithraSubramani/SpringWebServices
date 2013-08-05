/*
 * An XML document type.
 * Localname: NDFDgen
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl;


/**
 * A document containing one NDFDgen(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public interface NDFDgenDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NDFDgenDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA87D6C15DEB732A4F74CA9A906A94D12").resolveHandle("ndfdgen1906doctype");
    
    /**
     * Gets the "NDFDgen" element
     */
    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen getNDFDgen();
    
    /**
     * Sets the "NDFDgen" element
     */
    void setNDFDgen(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen ndfDgen);
    
    /**
     * Appends and returns a new empty "NDFDgen" element
     */
    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen addNewNDFDgen();
    
    /**
     * An XML NDFDgen(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public interface NDFDgen extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NDFDgen.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA87D6C15DEB732A4F74CA9A906A94D12").resolveHandle("ndfdgen6bbeelemtype");
        
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
         * Gets the "product" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType.Enum getProduct();
        
        /**
         * Gets (as xml) the "product" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType xgetProduct();
        
        /**
         * Sets the "product" element
         */
        void setProduct(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType.Enum product);
        
        /**
         * Sets (as xml) the "product" element
         */
        void xsetProduct(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ProductType product);
        
        /**
         * Gets the "startTime" element
         */
        java.util.Calendar getStartTime();
        
        /**
         * Gets (as xml) the "startTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetStartTime();
        
        /**
         * Sets the "startTime" element
         */
        void setStartTime(java.util.Calendar startTime);
        
        /**
         * Sets (as xml) the "startTime" element
         */
        void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime);
        
        /**
         * Gets the "endTime" element
         */
        java.util.Calendar getEndTime();
        
        /**
         * Gets (as xml) the "endTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetEndTime();
        
        /**
         * Sets the "endTime" element
         */
        void setEndTime(java.util.Calendar endTime);
        
        /**
         * Sets (as xml) the "endTime" element
         */
        void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime);
        
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
         * Gets the "weatherParameters" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType getWeatherParameters();
        
        /**
         * Sets the "weatherParameters" element
         */
        void setWeatherParameters(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType weatherParameters);
        
        /**
         * Appends and returns a new empty "weatherParameters" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType addNewWeatherParameters();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen newInstance() {
              return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument.NDFDgen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument newInstance() {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
