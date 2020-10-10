

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class GitHubDemo  {
	public  WebDriver  driver;


	

  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");		
				driver =new ChromeDriver();
			
	
				driver.get("https:\\www.google.com");
				
				WebElement search	=driver.findElement(By.xpath ("//input[@title='Search']"));
				search.click();
				search.sendKeys("Om sakthi");

  }
  

}
