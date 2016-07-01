package z_p;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadioButton1 {
  @Test
  public void f() {
	  
	  FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		//xpath of the complete block of 2 radio groups
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> radio=block.findElements(By.name("group1"));
		System.out.println(radio.size());
		
		for(int i=0;i<radio.size();i++)
		{
			System.out.println(radio.get(i).getAttribute("value")+"---"+radio.get(i).getAttribute("checked"));
		}
		//driver.close();
	}

	  
  }

