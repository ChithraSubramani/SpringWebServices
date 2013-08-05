/*
 * XML Type:  compTypeType
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd
 * Java type: gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd;


/**
 * An XML compTypeType(@http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd).
 *
 * This is an atomic type that is a restriction of gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType.
 */
public interface CompTypeType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompTypeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA87D6C15DEB732A4F74CA9A906A94D12").resolveHandle("comptypetypee2fetype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum IS_EQUAL = Enum.forString("IsEqual");
    static final Enum BETWEEN = Enum.forString("Between");
    static final Enum GREATER_THAN = Enum.forString("GreaterThan");
    static final Enum GREATER_THAN_EQUAL_TO = Enum.forString("GreaterThanEqualTo");
    static final Enum LESS_THAN = Enum.forString("LessThan");
    static final Enum LESS_THAN_EQUAL_TO = Enum.forString("LessThanEqualTo");
    
    static final int INT_IS_EQUAL = Enum.INT_IS_EQUAL;
    static final int INT_BETWEEN = Enum.INT_BETWEEN;
    static final int INT_GREATER_THAN = Enum.INT_GREATER_THAN;
    static final int INT_GREATER_THAN_EQUAL_TO = Enum.INT_GREATER_THAN_EQUAL_TO;
    static final int INT_LESS_THAN = Enum.INT_LESS_THAN;
    static final int INT_LESS_THAN_EQUAL_TO = Enum.INT_LESS_THAN_EQUAL_TO;
    
    /**
     * Enumeration value class for gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_IS_EQUAL
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
        
        static final int INT_IS_EQUAL = 1;
        static final int INT_BETWEEN = 2;
        static final int INT_GREATER_THAN = 3;
        static final int INT_GREATER_THAN_EQUAL_TO = 4;
        static final int INT_LESS_THAN = 5;
        static final int INT_LESS_THAN_EQUAL_TO = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("IsEqual", INT_IS_EQUAL),
                new Enum("Between", INT_BETWEEN),
                new Enum("GreaterThan", INT_GREATER_THAN),
                new Enum("GreaterThanEqualTo", INT_GREATER_THAN_EQUAL_TO),
                new Enum("LessThan", INT_LESS_THAN),
                new Enum("LessThanEqualTo", INT_LESS_THAN_EQUAL_TO),
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
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType newValue(java.lang.Object obj) {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) type.newValue( obj ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType newInstance() {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.CompTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
