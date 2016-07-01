package z_p12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenscompar {
  @Test
  public void f() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.get("http://google.com");
	  
	  File srcFile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		driver.get("http://msn.com");
		File srcFile2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		if(FileUtils.contentEquals(srcFile1,srcFile2))
		{
			System.out.println("Screenshots are same");
		}
		else
		{
			System.out.println("Screenshots are different");
		}

  }
}
