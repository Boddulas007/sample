package com.demo.Testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.Set;

public class AppTest {
	

	 @Test
	  public void Logintest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\$@i\\Desktop\\chrome driver win32\\chromedriver1_win32\\chromedriver.exe");
		  
		  // Instantiate a ChromeDriver class.     
		  WebDriver driver=new ChromeDriver();  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Maximize the browser  
	      driver.manage().window().maximize();  
	      
	      Thread.sleep(6000);
	      driver.findElement(By.name("username")).sendKeys("Admin");
	      driver.findElement(By.name("password")).sendKeys("admin123");
	      driver.quit();    }
  
  
 }

