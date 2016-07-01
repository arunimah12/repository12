package selenium_aus;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Auto_upload {
  @Test
  public void f() throws IOException, Exception {
	  
	  //System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		
	  FirefoxDriver driver=new FirefoxDriver();
	  driver.get("http://opensource.demo.orangehrm.com");
		
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[2]/a/b")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Admin");
		driver.findElement(By.id("lastName")).sendKeys("aadmin");
		
		driver.findElement(By.id("photofile")).click();
		
		Thread.sleep(3000);
		//file upload
		
		Runtime.getRuntime().exec("C:\\Users\\ramprasad\\Desktop\\Auto IT Scripts\\Auto_Upload_arunima.exe");
		
		//Runtime.getRuntime().exec("C:\\Users\\ramprasad\\Desktop\\Auto IT Scripts\\upload_auto.exe");
		
  }
}
