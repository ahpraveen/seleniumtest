package com.google.page;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CanvasTest {
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","C:\\software\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.ca");
		
		Actions actionBuilder=new Actions(driver);          
		Action drawOnCanvas=actionBuilder.
		                .contextClick(wbCanvas)
		                .moveToElement(wbCanvas,8,8)
		                .clickAndHold(wbCanvas)
		                .moveByOffset(120, 120)
		                .moveByOffset(60,70)
		                .moveByOffset(-140,-140)
		                .release(wbCanvas)
		                .build();
		drawOnCanvas.perform();
		
	}
	
	@Test
	public void firstTest() 
	{
		 
		 Assert.assertEquals(driver.getTitle(), "Google");
	 }
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
