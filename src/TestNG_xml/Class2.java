package TestNG_xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 {
  @Test(groups = {"primary"})
  public void x() 
  {
	  Reporter.log("cls x is running ", true);
  }
  @Test
  public void y() 
  {
	  Reporter.log("cls y is running ", true);
  }
  @Test
  public void z() 
  {
	  Reporter.log("cls z is running ", true);
  }
}
