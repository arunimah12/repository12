package z_p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest12 {
	
	public WebDriver driver;
  @Test
  public void f() {
	  
	 driver=new FirefoxDriver();
			
	 driver.get("http://www.pvrcinemas.com/");
			WebDriverWait mywait=new WebDriverWait(driver, 60);
			mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a")));
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a"))).click();
			
		
		
  }

}

