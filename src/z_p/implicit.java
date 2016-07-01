package z_p;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicit {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		
		

	}

}
