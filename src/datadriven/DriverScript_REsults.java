package datadriven;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverScript_REsults {

	public WebDriver driver;
	public String str;
@Test
public void f() throws Exception{
FileInputStream fi=new FileInputStream("D:\\HMS.xls");
Workbook w=Workbook.getWorkbook(fi);
Sheet s=w.getSheet("Sheet1");

for (int i = 1; i < s.getRows(); i++) {
	try{
if(s.getCell(2, i).getContents().equalsIgnoreCase("dropdown"))
{
new Select(driver.findElement(By.name(s.getCell(0, i).getContents()))).selectByVisibleText(s.getCell(3, i).getContents());		
}
else if(s.getCell(2, i).getContents().equalsIgnoreCase("textbox"))
{
driver.findElement(By.name(s.getCell(0, i).getContents())).sendKeys(s.getCell(3, i).getContents());	 
}
else if(s.getCell(2, i).getContents().equalsIgnoreCase("button")
		||s.getCell(2, i).getContents().equalsIgnoreCase("radiobutton")
		||s.getCell(2, i).getContents().equalsIgnoreCase("checkbox"))
{
driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
Thread.sleep(1000);
}
else if(s.getCell(2, i).getContents().equalsIgnoreCase("alert"))
{
if(s.getCell(3, i).getContents().equalsIgnoreCase("ok"))
{
driver.switchTo().alert().accept();
}else{
driver.switchTo().alert().dismiss();
}
}
else if(s.getCell(2, i).getContents().equalsIgnoreCase("link"))
{
driver.findElement(By.linkText(s.getCell(0, i).getContents())).click();
}
else if(s.getCell(2, i).getContents().equalsIgnoreCase("url"))
{
driver.get(s.getCell(0, i).getContents());
}
str="Pass";
}catch(Exception e){str="Fail";}
}
}

  @BeforeTest
  public void beforeTest() {
System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }


}

