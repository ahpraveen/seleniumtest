package com.google.page;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropValue {
	
	public void getPropValue()
	{
		Properties prop = new Properties();
		String fileName = "C:\\Users\\SP\\workspace\\SeleniumTestAutomation\\config\\login.properties";
		InputStream ifs = getClass().getClassLoader().getResourceAsStream(fileName);
		try {
			prop.load(ifs);
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
