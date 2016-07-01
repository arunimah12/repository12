package arunima;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenLinks {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://bing.com");
		d.manage().window().maximize();
		
		List<WebElement> total=d.findElements(By.tagName("a"));
		System.out.println("total links are========="+total.size());
		
		int count=0;
		
		for(int i=0;i<total.size();i++)
		{
			if(!total.get(i).getText().isEmpty())
			{
				count++;
			}
		}
		
		System.out.println("Visisble links are"+count);
		System.out.println("hidden links are======"+(total.size()-count));

	}

}
