package com.google.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest {

	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","C:\\software\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.ca");
	}
	
	@Test
	public void searchTest() 
	{

		driver.findElement(By.className("gsfi")).sendKeys("facebook");
		driver.findElement(By.id("sbds")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
	 }
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
