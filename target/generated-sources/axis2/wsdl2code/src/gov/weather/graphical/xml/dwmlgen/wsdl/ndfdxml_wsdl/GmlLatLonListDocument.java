/*
 * An XML document type.
 * Localname: GmlLatLonList
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl;


/**
 * A document containing one GmlLatLonList(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public interface GmlLatLonListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GmlLatLonListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC9ECCC5B79F208FCE39A27A903A6844C").resolveHandle("gmllatlonlist96f2doctype");
    
    /**
     * Gets the "GmlLatLonList" element
     */
    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList getGmlLatLonList();
    
    /**
     * Sets the "GmlLatLonList" element
     */
    void setGmlLatLonList(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList gmlLatLonList);
    
    /**
     * Appends and returns a new empty "GmlLatLonList" element
     */
    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList addNewGmlLatLonList();
    
    /**
     * An XML GmlLatLonList(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public interface GmlLatLonList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GmlLatLonList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC9ECCC5B79F208FCE39A27A903A6844C").resolveHandle("gmllatlonlista256elemtype");
        
        /**
         * Gets the "requestedTime" element
         */
        java.util.Calendar getRequestedTime();
        
        /**
         * Gets (as xml) the "requestedTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetRequestedTime();
        
        /**
         * Sets the "requestedTime" element
         */
        void setRequestedTime(java.util.Calendar requestedTime);
        
        /**
         * Sets (as xml) the "requestedTime" element
         */
        void xsetRequestedTime(org.apache.xmlbeans.XmlDateTime requestedTime);
        
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
         * Gets the "featureType" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType.Enum getFeatureType();
        
        /**
         * Gets (as xml) the "featureType" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType xgetFeatureType();
        
        /**
         * Sets the "featureType" element
         */
        void setFeatureType(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType.Enum featureType);
        
        /**
         * Sets (as xml) the "featureType" element
         */
        void xsetFeatureType(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType featureType);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList newInstance() {
              return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument.GmlLatLonList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument newInstance() {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
