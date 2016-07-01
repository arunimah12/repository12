package excel;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;



public class excel_login {
	
	public WebDriver driver;
	  @Test
	  public void login() throws Exception{
		  
		  
		  FirefoxDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://selenium4testing.com/hms/");
	
		 
		  
		  FileInputStream fi=new FileInputStream("D:\\SeleniumAutomation_29Aug_630PM\\Testdata\\Login.xls");
		 
		  Workbook w=Workbook.getWorkbook(fi);
		  
		  Sheet s=w.getSheet(0);
	
	  Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys(s.getCell(0, 1).getContents());
	driver.findElement(By.name("password")).sendKeys(s.getCell(1, 1).getContents());
	driver.findElement(By.name("submit")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();  
	  }
	  
	
}
