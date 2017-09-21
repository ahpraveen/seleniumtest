package com.google.page;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class GoogleChromeHomeTest {
	
  public WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://www.google.ca");
	  Assert.assertEquals("Google", driver.getTitle());
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\software\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
