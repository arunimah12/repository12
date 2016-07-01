package arunima_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.amazon.in/");
		d.manage().window().maximize();
		
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\ch\\xyz.png"));
	}

}
