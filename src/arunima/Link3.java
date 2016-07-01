package arunima;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link3 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://bing.com");
		
		List<WebElement> links=d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
			links.get(i).click();
			System.out.println(d.getCurrentUrl());
			d.navigate().back();
			links=d.findElements(By.tagName("a"));
			}
		}

	}

}
