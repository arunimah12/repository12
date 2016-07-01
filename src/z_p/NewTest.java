package z_p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;

public class NewTest {
	public WebDriver d;
  @Test
  public void f() throws Exception{
	  d=new FirefoxDriver();
	  d.get("http://yahoo.com");
	  Thread.sleep(12000);
	 // d.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_1457892')]))").click();
	  
	  d.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_1457892')]")).click();
	  //.//*[@id='yui_3_12_0_1_1457892147938_1086']
	  //.//*[@id='yui_3_12_0_1_1457892773722_1061']
	  
	  //html/body/div[3]/div[6]/div[2]/div[1]/div[1]/div[2]/div/div/div/ol/li[1]/a
	  //html/body/div[3]/div[6]/div[2]/div[1]/div[1]/div[2]/div/div/div/ol/li[1]/a
	  //.//*[@id='yui_3_12_0_1_1457943144953_1273']
	  //.//*[@id='yui_3_12_0_1_1457943251867_1054']
  }
  

}
