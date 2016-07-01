package arunima_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
	    WebElement src=	driver.findElement(By.linkText("Gmail"));
	    
	    Actions aa=new Actions(driver);
	    
	    aa.contextClick(src).sendKeys("W").build().perform();

	}

}
