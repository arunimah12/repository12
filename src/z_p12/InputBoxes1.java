package z_p12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputBoxes1 {
	FirefoxDriver driver;
	/*@BeforeMethod
	public void setup() throws InterruptedException
	{
		//ProfilesIni pr=new ProfilesIni();
		//FirefoxProfile fp=pr.getProfile("SeleniumUser");
		
		
	}*/
	@Test
	public void inputboxesTest() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");	
		Thread.sleep(5000);
		List<WebElement> input=driver.findElements(By.xpath
				      ("//input[@type='text' or @type='email']"));
		System.out.println(input.size());
		String[] str={"one","two","three","four","five","six","hgtygt"};
		Thread.sleep(5000);
		for(int i=0;i<input.size();i++)
		{
			input.get(i).sendKeys(str[i]);
		}
	}
	
	
	

}

