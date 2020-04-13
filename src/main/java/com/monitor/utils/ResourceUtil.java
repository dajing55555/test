package com.monitor.utils;

import java.util.ResourceBundle;

public class ResourceUtil {

	public static ResourceBundle getResource(String bundleFileName){
		
	    try{
	    	
	      ResourceBundle rs = ResourceBundle.getBundle(bundleFileName);
	      return rs;
	      
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    return null;
	  }
	
}
