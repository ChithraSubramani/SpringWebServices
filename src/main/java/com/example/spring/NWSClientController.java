package com.example.spring;

import javax.jws.WebService;

import org.apache.axis2.nationalweatherservices.NdfdXMLStub;
import org.apache.axis2.nationalweatherservices.NdfdXMLStub.NDFDgenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;


public class NWSClientController {
	 public static void main(java.lang.String args[]){
	        try{
	            NdfdXMLStub stub =
	                new NdfdXMLStub();

	            getNdFdGenResp(stub);
	           

	        } catch(Exception e){
	            e.printStackTrace();
	            System.err.println("\n\n\n");
	        }
	    }

	  

	    /* two way call/receive */
	    public static void getNdFdGenResp(NdfdXMLStub stub){
	        try{
	        	NDFDgenResponse reqDoc = new NDFDgenResponse();
	        	System.out.println(reqDoc.getDwmlOut());
	           

	        } catch(Exception e){
	            e.printStackTrace();
	            System.err.println("\n\n\n");
	        }
	    }

}
