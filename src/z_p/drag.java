package z_p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		Actions aaa=new Actions(driver);
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement tar=driver.findElement(By.id("droppable"));
		
		aaa.dragAndDrop(src, tar).perform();

	}

}
