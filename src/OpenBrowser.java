
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser 
{
	 public WebDriver driver ;
  @Test
  public void f() throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver", "D://Manikandan//Manikandan//Gators Automation//Selenium Jar files//chromedriver.exe");
      driver = new ChromeDriver();
driver.get("http://10.175.218.151:8989/letterwriter/");
Thread.sleep(3000);
driver.findElement(By.name("email")).sendKeys("pradeep.kp@isgn.com");
driver.findElement(By.id("password")).sendKeys("test123");
driver.findElement(By.xpath("//button[@type='submit']") ).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='Administrator']")).click();
driver.findElement(By.xpath("(//a[contains(@class,'btn btn-default')])[2]")).click();

  }
}
