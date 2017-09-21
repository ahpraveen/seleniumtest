package com.google.page;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class LoginTest {

  private int i =0;
  @Test(dataProvider = "dp")
  public void f(String username, String password) {
	  System.out.println(++i);
	  System.out.println(username);
	  System.out.println(password);
	  
  }

  @DataProvider
  public Object[][] dp() {
    Object[][] a = new Object[2][2];
    a[0][0] = "praveen";
    a[0][1] = "test";
    a[1][0] = "Vikram";
    a[1][1] = "testing";
   return a;  
  }
}
