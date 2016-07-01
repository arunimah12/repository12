package z_p;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class alerts {
	
	public WebDriver driver;
	public void openURL(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com/");
		//driver.findElement(By.linkText("Desktop Site")).click();
	
	}
	public void verifySearch() throws Exception{
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Hyderabad (HYD)")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Bengaluru (BLR)")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("20")).click();
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("9 Adults");
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("1 Child");
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1 Infant");
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
Thread.sleep(1000);
	}
	public void verifyAlerts(){
		String str;
		str=driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept(); //To click ok
	//	driver.switchTo().alert().dismiss(); // To click on Cancel
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		alerts s=new alerts();
		s.openURL();
		s.verifySearch();
		s.verifyAlerts();
	}


}
