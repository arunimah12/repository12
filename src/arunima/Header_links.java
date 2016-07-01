package arunima;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

//script for identifying specified block elements
public class Header_links {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Arunima");
		FirefoxDriver d=new FirefoxDriver(fp);
		d.get("http://bing.com");
		
		//identifying the block elements
		WebElement block= d.findElement(By.id("sc_hdu"));
		List<WebElement> lk=block.findElements(By.tagName("a"));
		
		System.out.println(lk.size());
		
		for(int i=0;i<lk.size();i++)
		{
			System.out.println(lk.get(i).getText());
		}

	}

}
