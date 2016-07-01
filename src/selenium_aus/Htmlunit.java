package selenium_aus;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

//import com.gargoylesoftware.htmlunit.BrowserVersion;
//import com.gargoylesoftware.htmlunit.Version;

public class Htmlunit {

	public static void main(String[] args) {
		
		HtmlUnitDriver driver=new HtmlUnitDriver();
		//(OR)
		//HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
	

	}

}
