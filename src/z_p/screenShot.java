package z_p;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		//FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\xyxxx.png"));
		
		
	}

}
