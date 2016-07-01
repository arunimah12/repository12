package arunima_testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Webtable1 {
	WebDriver d;
	
  @Test
  public void f() throws Exception {
	  
	  FirefoxDriver d=new FirefoxDriver();
	  d.get("http://www.timeanddate.com/worldclock/");
	  d.manage().window().maximize();
	  Thread.sleep(5000);
	  // identify the webtable
	  WebElement table=d.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
	  // identify the rows from WT
	  List<WebElement> row=table.findElements(By.tagName("tr"));
	  System.out.println(row.size());
	  //loop for rows
	  for(int i=0;i<row.size();i++)
	  { 
		  //identify columns
		  List<WebElement> col=table.findElements(By.tagName("td"));
		  for(int j=0;j<col.size();j++)
		  {
			  System.out.println(col.get(j).getText());
		  }
		  
		  System.out.println();
	  }
  }

}
