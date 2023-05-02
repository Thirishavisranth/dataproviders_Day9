package com.dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Task1 {
	
  @Test(dataProvider = "dp")
  public void add(Integer n1, Integer n2) {
	  System.out.println(n1+n2);
  }
  @Test(dataProvider = "dp")
  
  public void sub(Integer n1, Integer n2) {
	  System.out.println(n1-n2);
  }
  @Test(dataProvider = "dp")
  public void mul(Integer n1, Integer n2) {
	  System.out.println(n1*n2);
  }
  @Test(dataProvider = "dp")
  public void div(Integer n1, Integer n2) {
	  System.out.println(n1/n2);
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 0, -22 },
      new Object[] { -25, 35 },
    };
  }
}
