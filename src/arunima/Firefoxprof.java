package arunima;

//import org.apache.poi.hssf.usermodel.examples.FrillsAndFills;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

//Scripts for print text of the all links
public class Firefoxprof {

	public static void main(String[] args) {
		
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Arunima");
		
		FirefoxDriver d=new FirefoxDriver(fp);
		d.get("http://hdfcbank.com");
		
		List<WebElement> links=  d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for(int i=0;i<links.size();i++)
		{
			String str=links.get(i).getText();
			System.out.println(str);
		}

	}

}
