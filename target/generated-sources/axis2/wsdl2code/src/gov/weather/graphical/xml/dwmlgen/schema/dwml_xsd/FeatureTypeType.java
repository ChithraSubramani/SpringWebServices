/*
 * XML Type:  featureTypeType
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd
 * Java type: gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd;


/**
 * An XML featureTypeType(@http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd).
 *
 * This is an atomic type that is a restriction of gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType.
 */
public interface FeatureTypeType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeatureTypeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC9ECCC5B79F208FCE39A27A903A6844C").resolveHandle("featuretypetype3e29type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum FORECAST_GML_2_POINT = Enum.forString("Forecast_Gml2Point");
    static final Enum FORECAST_GML_2_ALL_WX = Enum.forString("Forecast_Gml2AllWx");
    static final Enum FORECAST_GMLSF_POINT = Enum.forString("Forecast_GmlsfPoint");
    static final Enum FORECAST_GML_OBS = Enum.forString("Forecast_GmlObs");
    static final Enum NDFD_MULTI_POINT_COVERAGE = Enum.forString("NdfdMultiPointCoverage");
    static final Enum NDFD_KML_POINT = Enum.forString("Ndfd_KmlPoint");
    
    static final int INT_FORECAST_GML_2_POINT = Enum.INT_FORECAST_GML_2_POINT;
    static final int INT_FORECAST_GML_2_ALL_WX = Enum.INT_FORECAST_GML_2_ALL_WX;
    static final int INT_FORECAST_GMLSF_POINT = Enum.INT_FORECAST_GMLSF_POINT;
    static final int INT_FORECAST_GML_OBS = Enum.INT_FORECAST_GML_OBS;
    static final int INT_NDFD_MULTI_POINT_COVERAGE = Enum.INT_NDFD_MULTI_POINT_COVERAGE;
    static final int INT_NDFD_KML_POINT = Enum.INT_NDFD_KML_POINT;
    
    /**
     * Enumeration value class for gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_FORECAST_GML_2_POINT
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_FORECAST_GML_2_POINT = 1;
        static final int INT_FORECAST_GML_2_ALL_WX = 2;
        static final int INT_FORECAST_GMLSF_POINT = 3;
        static final int INT_FORECAST_GML_OBS = 4;
        static final int INT_NDFD_MULTI_POINT_COVERAGE = 5;
        static final int INT_NDFD_KML_POINT = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Forecast_Gml2Point", INT_FORECAST_GML_2_POINT),
                new Enum("Forecast_Gml2AllWx", INT_FORECAST_GML_2_ALL_WX),
                new Enum("Forecast_GmlsfPoint", INT_FORECAST_GMLSF_POINT),
                new Enum("Forecast_GmlObs", INT_FORECAST_GML_OBS),
                new Enum("NdfdMultiPointCoverage", INT_NDFD_MULTI_POINT_COVERAGE),
                new Enum("Ndfd_KmlPoint", INT_NDFD_KML_POINT),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType newValue(java.lang.Object obj) {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) type.newValue( obj ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType newInstance() {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.FeatureTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
