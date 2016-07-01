package z_p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Alert {
  @Test
  public void f() throws Exception {
	  
	 System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe" );
	ChromeDriver driver=new ChromeDriver();	
	 
	 driver.manage().window().maximize();
		driver.get("http://book.spicejet.com/");
	  
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1")).click();
		Thread.sleep(4000);
		//hyd
		driver.findElement(By.xpath("html/body/div[2]/form/div[2]/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/select/option[19]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1")).click();
		//bengu
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[2]/form/div[2]/div[3]/div[2]/div[2]/div/div[2]/div/div[2]/select/option[8]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[2]/form/div[2]/div[3]/div[2]/div[2]/div/div[3]/button")).click();
		Thread.sleep(3000);
		//date
		driver.findElement(By.xpath("html/body/div[6]/table/tbody/tr[4]/td[4]/a")).click();
		new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"))).selectByVisibleText("9 Adults");
		new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD"))).selectByVisibleText("4 Children");
		//new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1 Infant");
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
		Thread.sleep(1000);
		
		
		String str;
	
		str=driver.switchTo().alert().getText();
		System.out.println(str);
		
		driver.switchTo().alert().accept(); //To click ok
	//	driver.switchTo().alert().dismiss(); // To click on Cancel
		
  }
}
