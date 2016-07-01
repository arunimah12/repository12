package arunima_testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest_sample {
  
  @Test(priority=0)
  public void f() {
	  System.out.println("second");
  }
  
  @Test(priority=1)
  public void z()
  {
	  System.out.println("third");
  }
  
  @Test(priority=2)
  public void a()
  {
	  System.out.println("first");
  }
  
  @BeforeTest
  public void beforeMethod() {
	  System.out.println("Start");
  }

  @AfterTest
  public void afterMethod() {
	  System.out.println("last");
  }

}
