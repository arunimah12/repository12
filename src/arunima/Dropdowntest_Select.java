package arunima;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdowntest_Select {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		d.findElement(By.linkText("REGISTER")).click();
		
		WebElement drop= d.findElement(By.name("country"));
		List<WebElement> items=drop.findElements(By.tagName("option"));
		
		System.out.println(items.size());
		
		for(int i=0;i<items.size();i++)
		{
			items.get(i).click();
			if(items.get(i).isSelected())
				System.out.println(items.get(i).getText()+"item is active");
			else
				System.out.println(items.get(i).getText()+"item is inactive");
		}

	}

}
