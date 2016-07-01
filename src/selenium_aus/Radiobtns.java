package selenium_aus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
        driver.get("http://echoecho.com/htmlforms10.htm");
        //xpath of total radio btns block
        WebElement src=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
        
        List<WebElement> drop=src.findElements(By.name("group1"));
        System.out.println(drop.size());
        for(int i=0;i<drop.size();i++)
        {
        	System.out.println(drop.get(i).getAttribute("value")+"---------"+drop.get(i).getAttribute("checked"));
        }
	}

}

