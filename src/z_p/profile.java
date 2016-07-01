package z_p;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class profile {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
		
		FirefoxProfile fp=pr.getProfile("FTuser");
		
		FirefoxDriver d=new FirefoxDriver(fp);
		
		d.get("http://google.com");
		

	}

}
