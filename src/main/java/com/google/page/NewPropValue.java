package com.google.page;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class NewPropValue {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		InputStream input = null;
		
		 try {
			 input = new FileInputStream("C:\\Users\\SP\\workspace\\SeleniumTestAutomation\\config\\login.properties");
			 prop.load(input);
			 System.out.println(prop.getProperty("username"));
			 System.out.println(prop.getProperty("password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
