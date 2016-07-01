package arunima;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select12 {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.spicejet.com/");
		d.manage().window().maximize();
		
		// one way
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
       // click leaving from
		Thread.sleep(3000);
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		//clik on hyderabad
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		//bengulur
		Thread.sleep(3000);
		d.findElement(By.linkText("Bengaluru (BLR)")).click();
		//date
		Thread.sleep(3000);
		d.findElement(By.linkText("27")).click();
		Thread.sleep(3000);
		//select value from drop down
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("9 Adults");
		
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("4 Children");
		
		d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(3000);
		String str;
	     
	     
	     str=d.switchTo().alert().getText();
	     System.out.println(str);
	     
	     
	     Thread.sleep(4000);
	     d.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
	}

}
