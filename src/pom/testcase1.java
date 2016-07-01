package pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom2.welcom;

public class testcase1 {
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		
		welcom wm=PageFactory.initElements(driver,welcom.class);
		wm.findAFlight("ram","pass@123");
		driver.navigate().back();
		wm.vacations();
		
	}



}
