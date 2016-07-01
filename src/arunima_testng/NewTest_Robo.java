package arunima_testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest_Robo {
  @Test
  public void f() throws AWTException, IOException, Exception {
	  
	  FirefoxDriver d=new FirefoxDriver();
	  d.get("http://docs.seleniumhq.org/download/");
	  
	  d.findElement(By.linkText("2.53.0")).click();
	  
	  /*Robot rb=new Robot();
	  rb.keyPress(KeyEvent.VK_TAB);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  2
	  rb.delay(2000);
	  
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	  */
	Thread.sleep(3000);
	  
	  Runtime.getRuntime().exec("C:\\Users\\ramprasad\\Desktop\\Auto IT Scripts\\arunima_save.exe");
	  
  }
}
