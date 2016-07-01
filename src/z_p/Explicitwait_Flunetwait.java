package z_p;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Explicitwait_Flunetwait {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://yahoo.com/");
		driver.get("http://www.24hourfitness.com/not-yet-member.html");
	}
	
	@Test
	public void waitTest()
	{
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[1]/a")));
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[2]/a"))).click();
	}

}

