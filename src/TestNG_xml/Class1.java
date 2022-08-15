package TestNG_xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 {
  @Test(timeOut = 100)
  public void a() throws InterruptedException 
  {
	  //Thread.sleep(60);
	  Reporter.log("cla a is running ", true);
  }
  @Test
  public void b() 
  {
	  Reporter.log("cla b is running ", true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("cla c is running ", true);
  }
}
