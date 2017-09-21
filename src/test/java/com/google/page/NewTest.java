package com.google.page;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class NewTest {

  private int tempIteration = 1;
  
  @BeforeMethod
  public void setUp()
  {
	  System.out.println("Iteration no:" + tempIteration);
	  System.out.println("Before class");
  }
	
  @Test(enabled = true, dataProvider = "dp")
  public void f(Integer n, String employeeName) {
	  System.out.println(employeeName);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "Praveen" },
      new Object[] { 2, "Aswin" },
      new Object[] { 2, "Priya" },
    };
  }
  
  @AfterMethod
  public void tearDown()
  {
	  System.out.println("After class");
	  tempIteration++;
  }
  
}
