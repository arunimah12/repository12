package selenium_aus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		
		WebElement src=driver.findElement(By.id("draggable"));
		
		WebElement tar=driver.findElement(By.id("droppable"));
		
		
		Actions aaa=new Actions(driver);
		
		aaa.dragAndDrop(src, tar).build().perform();

	}

}
