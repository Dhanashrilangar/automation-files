package TestNG_xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3 {
  @Test(groups = {"primary"})
  public void d() 
  {
	  Reporter.log("cla d is running ", true);
  }
  @Test
  public void e() 
  {
	  Reporter.log("cla e is running ", true);
  }
  @Test
  public void f() 
  {
	  Reporter.log("cla f is running ", true);
  }
}
