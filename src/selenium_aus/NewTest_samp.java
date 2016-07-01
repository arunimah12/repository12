package selenium_aus;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest_samp {
 
  @Test
  public void f() {
	  System.out.println("second");
  }
  
  @Test
  public void z(){
	  System.out.println("third");
  }
  
  @Test
  public void d(){
	  System.out.println("ten");
  }
  @BeforeTest
  public void beforeMethod() {
	  
	  System.out.println("first");
  }

 
  @AfterTest
  public void afterMethod() {
	  System.out.println("last");
  }

}
