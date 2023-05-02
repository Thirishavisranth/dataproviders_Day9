package com.dataprovider;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;



//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Task2 {
	WebDriver driver;
  @Test(groups="SmokeTest")
  public void validate() {
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allows-origins=*");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver(co);
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
	  
	  String actualUrl = driver.getCurrentUrl();
	  String expectedUrl = "https://www.godaddy.com/en-in";
	  Assert.assertEquals(actualUrl, expectedUrl);
	 
	  
  }
  @Test(groups="RegressionTestCase")
  public void  search() throws InterruptedException
  {
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allows-origins=*");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver(co);
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
//	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//??? why stopped ....don't wait for exact 10 seconds..if next element loaded it breaks  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/header/div/section/div/div[1]/nav/div[2]/div[1]/ul/li[1]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Domain Name Search")).click();;
  }
  @Test(groups="RegressionTestcase")
  public void case3() throws InterruptedException
  {
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allows-origins=*");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver(co);
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/header/div/section/div/div[1]/nav/div[2]/div[1]/ul/li[1]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Domain Name Search")).click();
	  
	  Thread.sleep(3000);
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  Assert.assertEquals(title, "GoDaddy Domain Search - Buy and Register Available Domain Names");
	  
		Thread.sleep(5000);
		boolean isSearchBoxPresent = driver.findElement(By.name("searchText")).isDisplayed();
		Assert.assertEquals(isSearchBoxPresent, true);  
  }

  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  //group panrapo thani thaniya pannu.....
  }

  @AfterMethod
  public void afterMethod() {
//	  driver.close();
  }

}