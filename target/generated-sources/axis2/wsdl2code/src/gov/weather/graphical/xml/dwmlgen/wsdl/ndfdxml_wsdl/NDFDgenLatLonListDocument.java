/*
 * An XML document type.
 * Localname: NDFDgenLatLonList
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl;


/**
 * A document containing one NDFDgenLatLonList(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public interface NDFDgenLatLonListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NDFDgenLatLonListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA87D6C15DEB732A4F74CA9A906A94D12").resolveHandle("ndfdgenlatlonlist9e7cdoctype");
    
    /**
     * Gets the "NDFDgenLatLonList" element
     */
    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList getNDFDgenLatLonList();
    
    /**
     * Sets the "NDFDgenLatLonList" element
     */
    void setNDFDgenLatLonList(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList ndfDgenLatLonList);
    
    /**
     * Appends and returns a new empty "NDFDgenLatLonList" element
     */
    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList addNewNDFDgenLatLonList();
    
    /**
     * An XML NDFDgenLatLonList(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public interface NDFDgenLatLonList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NDFDgenLatLonList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA87D6C15DEB732A4F74CA9A906A94D12").resolveHandle("ndfdgenlatlonlist4eeaelemtype");
        
        /**
         * Gets the "listLatLon" element
         */
        java.lang.String getListLatLon();
        
        /**
         * Gets (as xml) the "listLatLon" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType xgetListLatLon();
        
        /**
         * Sets the "listLatLon" element
         */
        void setListLatLon(java.lang.String listLatLon);
        
        /**
         * Sets (as xml) the "listLatLon" element
         */
        void xsetListLatLon(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListLatLonType listLatLon);
        
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
            public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList newInstance() {
              return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument.NDFDgenLatLonList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument newInstance() {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
