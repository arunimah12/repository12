package z_p;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicWebtable {
	FirefoxDriver driver;
	
	@Test
	public void loginTest()
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe" );
		//ChromeDriver driver=new ChromeDriver();	
		
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	
	
		Sleeper.sleepTightInSeconds(4);
		Actions action=new Actions(driver);
		Sleeper.sleepTightInSeconds(4);
		WebElement pim=driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
		action.moveToElement(pim).build().perform();
	
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.linkText("Employee List")).click();
		Sleeper.sleepTightInSeconds(4);
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/form/div[4]/table"));
		//WebElement table=driver.findElement(By.id("resultTable"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				System.out.print(cols.get(j).getText()+"   ");
			}
			System.out.println();
		}
		
		
		
		
	}
	

}
