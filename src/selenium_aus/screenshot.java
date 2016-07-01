package selenium_aus;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;

public class screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
        driver.get("http://newtours.demoaut.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("the size of links::::"+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty()) {
			  String linknkame=links.get(i).getText();
				
				links.get(i).click();
				
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File("D:\\ch\\"+linknkame+".png"));
				
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
			}
	}
		

	}

}
