
package com.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {
	WebDriver driver;
	  @Test
	  public void checklogin() throws InterruptedException {
		  WebElement username = driver.findElement(By.name("username"));
	      username.sendKeys("Admin");
	      WebElement passwordInput = driver.findElement(By.name("password"));
	      passwordInput.sendKeys("admin123");
	      
	      WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	      loginButton.click();
	      
	      Thread.sleep(4000);
	      WebElement msg = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
	      String messageText = msg.getText();
	      Assert.assertEquals(messageText,"Dashboard");
	  }
	  @Parameters({"browser"})
	  @BeforeMethod()
	  public void beforeMethod(String browser1) throws InterruptedException {
		  if(browser1.equals("chrome")) {
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origin=*");
		  WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver(co);
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  Thread.sleep(4000);
		  }
		  else if(browser1.equals("Edge")) {
			  
			  EdgeOptions co = new EdgeOptions();
			  co.addArguments("--remote-allow-origin=*");
			  WebDriverManager.chromedriver().setup();
		      driver = new EdgeDriver(co);
			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  driver.manage().window().maximize();
			  Thread.sleep(4000);
		  }
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
}

