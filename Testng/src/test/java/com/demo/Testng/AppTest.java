package com.demo.Testng;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.Set;

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
      driver.quit();    }
  
  @Test
  public void handler() {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\$@i\\Desktop\\chrome driver win32\\chromedriver1_win32\\chromedriver.exe");
  WebDriver driver=new ChromeDriver(); 
  
  driver.manage().window().maximize();
  driver.get("https://demoqa.com/browser-windows");

  // Open new child window within the main window
  driver.findElement(By.id("windowButton")).click();

  //Get handles of the windows
  String mainWindowHandle = driver.getWindowHandle();
  Set<String> allWindowHandles = driver.getWindowHandles();
  Iterator<String> iterator = allWindowHandles.iterator();

  // Here we will check if child window has other child windows and will fetch the heading of the child window
  while (iterator.hasNext()) {
      String ChildWindow = iterator.next();
          if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
          driver.switchTo().window(ChildWindow);
          WebElement text = driver.findElement(By.id("sampleHeading"));
          System.out.println("Heading of child window is " + text.getText());
      }
     } 
  
  }}

