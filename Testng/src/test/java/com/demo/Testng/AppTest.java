package com.demo.Testng;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
  @Test
  public void Logintest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\$@i\\Desktop\\chrome driver win32\\chromedriver1_win32\\chromedriver.exe");
	  
	  // Instantiate a ChromeDriver class.     
	  WebDriver driver=new ChromeDriver();  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//Maximize the browser  
      driver.manage().window().maximize();  
      driver.findElement(By.name("username")).sendKeys("Admin");
      driver.findElement(By.name("password")).sendKeys("admin123");
     
	  
	  
  }
  }

