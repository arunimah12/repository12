package arunima_2;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BackgroundTesting {

	public static void main(String[] args) {
		
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		
		

	}

}
