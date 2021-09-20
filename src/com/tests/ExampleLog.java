package com.tests;
import org.apache.log4j.Logger;  

import java.io.*;  
import java.sql.SQLException; 
public class ExampleLog {
	static Logger logging = Logger.getLogger(ExampleLog.class);  
    
	   public static void main(String[] args)throws IOException,SQLException{  
	      logging.debug("Hello this is a debug message");  
	      logging.info("Hello this is an info message");  
	   }  
}  

