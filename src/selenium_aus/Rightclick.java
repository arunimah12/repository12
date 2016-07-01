package selenium_aus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");
		
		
		WebElement src=d.findElement(By.className("gb_P"));
		
		Actions ab=new Actions(d);
		
		//ab.contextClick(src).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		ab.contextClick(src).sendKeys("W").build().perform();

	}

}
