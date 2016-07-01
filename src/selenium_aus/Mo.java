package selenium_aus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.emirates.com/in/English/");
        
		
		Thread.sleep(3000);
        Actions aa=new Actions(driver);
		
        WebElement src=driver.findElement(By.xpath("html/body/form/header/div[3]/nav/div/ul/li[1]/a/span[1]"));
		
        aa.moveToElement(src).build().perform();
	}

}
