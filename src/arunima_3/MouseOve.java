package arunima_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOve {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.emirates.com/in/English/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement src=driver.findElement(By.linkText("Destinations"));
		WebElement src12=driver.findElement(By.linkText("Book"));
		
		Actions act=new Actions(driver);
		Thread.sleep(4000);
		act.moveToElement(src).moveToElement(src12).build().perform();

	}

}
