package arunima_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		Thread.sleep(5000);
		WebElement src= driver.findElement(By.id("draggable"));
		WebElement tar=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		act.dragAndDrop(src, tar).perform();

	}

}
