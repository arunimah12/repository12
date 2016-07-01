package arunima;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownLinks {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.amazon.in/");
		d.manage().window().maximize();
		
		WebElement drop= d.findElement(By.id("searchDropdownBox"));
		List<WebElement> links=drop.findElements(By.tagName("option"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			String str= links.get(i).getText();
			System.out.println(str);
		}

	}

}
