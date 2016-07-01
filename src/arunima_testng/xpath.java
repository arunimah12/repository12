package arunima_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class xpath {
  @Test
  public void f() {
	  
	  FirefoxDriver d=new FirefoxDriver();
	  d.get("http://google.com");
	  
	  d.findElement(By.xpath("//input[@id='lst-ib' and @type='text']")).sendKeys("selenium");
  }
}
