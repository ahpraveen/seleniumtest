package com.google.page;

import org.testng.annotations.Test;

import common.lib.ReadExcel;

import org.testng.annotations.DataProvider;

public class DataDrivenTest {
  public int j =0;
  
  @Test(dataProvider = "dp")
  public void f(String username, String pwd) {
	  System.out.println("Iteration:" +j);
	  System.out.println(username);
	  System.out.println(pwd);
	  j++;
  }

  @DataProvider
  public Object[][] dp() {
	  ReadExcel re = new ReadExcel("C:\\Users\\SP\\workspace\\SeleniumTestAutomation\\TestData\\Data.xlsx");
	  int rowCnt = re.getRowCnt(0);
	  System.out.println(rowCnt);
	  Object[][] data = new Object[rowCnt][2];
	  
	  for(int i =0; i<rowCnt; i++)
	  {
		  System.out.println(i);
		  data[i][0] = re.getData(0, i, 0);
		  data[i][1] = re.getData(0, i, 1);
	  }
	  
	  return data;
   
  }
}
