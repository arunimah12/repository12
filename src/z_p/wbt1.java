package z_p;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class wbt1 {
	FirefoxDriver driver;
	
		

	@Test
	public void webtableTest()
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe" );
		//ChromeDriver driver=new ChromeDriver();	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
		//identify webtable
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
		//identify the rows
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		             
		String part2="]/td[3]";
		
		for(int i=1;i<=36;i++)
		{
			String x=driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(x);
		}
		
		
		
		
	}

}
