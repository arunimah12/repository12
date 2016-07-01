package excel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriv

public class excel22 {

	@Test
	public void excel() throws JXLException, IOException ,Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe") ;
		
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://gmail.com");
		  
		  FileInputStream fi=new FileInputStream("D:\\SeleniumAutomation_29Aug_630PM\\Testdata\\Login.xls");
			
		  Workbook w=Workbook.getWorkbook(fi);
	Sheet s=w.getSheet(0);
	
	  Thread.sleep(3000);
	driver.findElement(By.id("Email")).sendKeys(s.getCell(0,1).getContents());
	
	driver.findElement(By.id("next")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("Passwd")).sendKeys(
			                           s.getCell(1, 1).getContents());
	driver.findElement(By.id("signIn")).click();

	}

}
