package z_p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/oogle.com");
		
		Actions a=new Actions(driver);
		
		WebElement ele=driver.findElement(By.linkText("Gmail"));
		
		a.contextClick(ele).sendKeys("T").build().perform();

	}

}
