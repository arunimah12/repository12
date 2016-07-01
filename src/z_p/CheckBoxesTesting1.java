package z_p;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxesTesting1 {
	
	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
	
		List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			check.get(i).click();
			System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
		}
		
	
		
	}

}
