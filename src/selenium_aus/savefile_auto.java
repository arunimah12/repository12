package selenium_aus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class savefile_auto {
	
	@Test
	public void ff() throws IOException, AWTException
	{
		FirefoxDriver driver=new FirefoxDriver();
		  driver.get("http://docs.seleniumhq.org/");
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("html/body/div/div[1]/ul/li[4]/a")).click();
		  //click on 2.53.0 link
		  driver.findElement(By.xpath("html/body/div/div[2]/div[2]/p[3]/a")).click();;
		 //AutoIT file 
		  //Runtime.getRuntime().exec("C:\\Users\\ramprasad\\Desktop\\Auto IT Scripts\\save_aus.exe");
		  
		  Robot rb=new Robot();
		  
		  rb.keyPress(KeyEvent.VK_TAB);
		  rb.keyRelease(KeyEvent.VK_TAB);
		
		  rb.delay(3000);
		  
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
}