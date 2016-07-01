package z_p;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTesttt {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();	
		 
		 driver.manage().window().maximize();
			driver.get("http://google.com/");
			
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
  }
}
