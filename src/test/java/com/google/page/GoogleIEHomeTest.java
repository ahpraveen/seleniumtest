package com.google.page;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class GoogleIEHomeTest {
		
	  public WebDriver driver;
		
	  @Test
	  public void f() {
		 
		  Assert.assertEquals("Google", driver.getTitle());
	  }
	  
	  
	  @BeforeClass
	  public void beforeClass() {
		
		  System.setProperty("webdriver.ie.driver","C:\\software\\Selenium\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
		  driver.get("http://www.google.ca");
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

}
