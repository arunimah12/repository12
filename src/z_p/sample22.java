package z_p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class sample22 {
	public WebDriver d;
	
	
	
	public static void main(String[] args) throws Exception {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://spicejet.com");
		d.manage().window().maximize();
		
		Thread.sleep(3000);
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
		Thread.sleep(3000);
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("24")).click();
		Thread.sleep(3000);
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("1 Adult");
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("2 Children");
		
		d.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

	}

}
