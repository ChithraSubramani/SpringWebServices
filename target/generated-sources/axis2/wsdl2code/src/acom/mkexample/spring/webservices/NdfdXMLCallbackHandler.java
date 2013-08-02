
/**
 * NdfdXMLCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */

    package acom.mkexample.spring.webservices;

    /**
     *  NdfdXMLCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class NdfdXMLCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public NdfdXMLCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public NdfdXMLCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for LatLonListLine method
            * override this method for handling normal response from LatLonListLine operation
            */
           public void receiveResultLatLonListLine(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListLineResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from LatLonListLine operation
           */
            public void receiveErrorLatLonListLine(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for NDFDgen method
            * override this method for handling normal response from NDFDgen operation
            */
           public void receiveResultNDFDgen(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from NDFDgen operation
           */
            public void receiveErrorNDFDgen(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for LatLonListSubgrid method
            * override this method for handling normal response from LatLonListSubgrid operation
            */
           public void receiveResultLatLonListSubgrid(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSubgridResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from LatLonListSubgrid operation
           */
            public void receiveErrorLatLonListSubgrid(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for NDFDgenLatLonList method
            * override this method for handling normal response from NDFDgenLatLonList operation
            */
           public void receiveResultNDFDgenLatLonList(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenLatLonListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from NDFDgenLatLonList operation
           */
            public void receiveErrorNDFDgenLatLonList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for NDFDgenByDayLatLonList method
            * override this method for handling normal response from NDFDgenByDayLatLonList operation
            */
           public void receiveResultNDFDgenByDayLatLonList(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayLatLonListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from NDFDgenByDayLatLonList operation
           */
            public void receiveErrorNDFDgenByDayLatLonList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for LatLonListSquare method
            * override this method for handling normal response from LatLonListSquare operation
            */
           public void receiveResultLatLonListSquare(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListSquareResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from LatLonListSquare operation
           */
            public void receiveErrorLatLonListSquare(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GmlLatLonList method
            * override this method for handling normal response from GmlLatLonList operation
            */
           public void receiveResultGmlLatLonList(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlLatLonListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GmlLatLonList operation
           */
            public void receiveErrorGmlLatLonList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for NDFDgenByDay method
            * override this method for handling normal response from NDFDgenByDay operation
            */
           public void receiveResultNDFDgenByDay(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.NDFDgenByDayResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from NDFDgenByDay operation
           */
            public void receiveErrorNDFDgenByDay(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GmlTimeSeries method
            * override this method for handling normal response from GmlTimeSeries operation
            */
           public void receiveResultGmlTimeSeries(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.GmlTimeSeriesResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GmlTimeSeries operation
           */
            public void receiveErrorGmlTimeSeries(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for LatLonListZipCode method
            * override this method for handling normal response from LatLonListZipCode operation
            */
           public void receiveResultLatLonListZipCode(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListZipCodeResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from LatLonListZipCode operation
           */
            public void receiveErrorLatLonListZipCode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for LatLonListCityNames method
            * override this method for handling normal response from LatLonListCityNames operation
            */
           public void receiveResultLatLonListCityNames(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.LatLonListCityNamesResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from LatLonListCityNames operation
           */
            public void receiveErrorLatLonListCityNames(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for CornerPoints method
            * override this method for handling normal response from CornerPoints operation
            */
           public void receiveResultCornerPoints(
                    gov.weather.graphical.xml.dwmlgen.wsdl.ndfdxml_wsdl.CornerPointsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from CornerPoints operation
           */
            public void receiveErrorCornerPoints(java.lang.Exception e) {
            }
                


    }
    