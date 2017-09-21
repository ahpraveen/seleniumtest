package com.google.page;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class GoogleChromeSearchTest {
	
  public WebDriver driver;
	
  @Test
  public void f() {
	 
	  	driver.findElement(By.className("gsfi")).sendKeys("facebook");
		driver.findElement(By.id("sbds")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
  }
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\software\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.google.ca");
	
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
