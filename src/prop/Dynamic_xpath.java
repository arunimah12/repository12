package prop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_xpath {

	public static void main(String[] args) throws Exception {
		
		//FirefoxDriver ff=new FirefoxDriver();
		//ff.manage().window().maximize();
		//ff.get("https://jqueryui.com/droppable/");
        System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://yahoo.com/");
	
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='UHSearchBox']")).sendKeys("selenium");
		Thread.sleep(4000);
		List<WebElement> link= driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_1466225')]/a"));
		Thread.sleep(4000);
		System.out.println(link.size());
		Thread.sleep(4000);
		link.get(0).click();
		
		
	}

}
