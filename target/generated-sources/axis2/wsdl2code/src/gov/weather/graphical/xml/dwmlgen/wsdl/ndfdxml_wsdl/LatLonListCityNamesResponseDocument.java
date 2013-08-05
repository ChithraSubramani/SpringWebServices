/*
 * An XML document type.
 * Localname: LatLonListCityNamesResponse
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl
 * Java type: gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl;


/**
 * A document containing one LatLonListCityNamesResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl) element.
 *
 * This is a complex type.
 */
public interface LatLonListCityNamesResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LatLonListCityNamesResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA87D6C15DEB732A4F74CA9A906A94D12").resolveHandle("latlonlistcitynamesresponse804edoctype");
    
    /**
     * Gets the "LatLonListCityNamesResponse" element
     */
    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse getLatLonListCityNamesResponse();
    
    /**
     * Sets the "LatLonListCityNamesResponse" element
     */
    void setLatLonListCityNamesResponse(gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse latLonListCityNamesResponse);
    
    /**
     * Appends and returns a new empty "LatLonListCityNamesResponse" element
     */
    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse addNewLatLonListCityNamesResponse();
    
    /**
     * An XML LatLonListCityNamesResponse(@http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl).
     *
     * This is a complex type.
     */
    public interface LatLonListCityNamesResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LatLonListCityNamesResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA87D6C15DEB732A4F74CA9A906A94D12").resolveHandle("latlonlistcitynamesresponse7aceelemtype");
        
        /**
         * Gets the "listCityNamesOut" element
         */
        java.lang.String getListCityNamesOut();
        
        /**
         * Gets (as xml) the "listCityNamesOut" element
         */
        gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListCityNamesType xgetListCityNamesOut();
        
        /**
         * Sets the "listCityNamesOut" element
         */
        void setListCityNamesOut(java.lang.String listCityNamesOut);
        
        /**
         * Sets (as xml) the "listCityNamesOut" element
         */
        void xsetListCityNamesOut(gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.ListCityNamesType listCityNamesOut);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse newInstance() {
              return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument.LatLonListCityNamesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument newInstance() {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
