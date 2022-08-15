package TestNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethod {
 
  @Test 
  public void a() 
  {
   
   Reporter.log("a method is running",true);
  }
  @Test
  public void b()  
  {
  Reporter.log("b method is running",true);
  }
  @Test(dependsOnMethods = {"d"})
  public void c() 
  {
   Reporter.log("c method is running",true);
  }
  @Test
  public void d() 
  {
   Reporter.log("d method is running",true);
  }
  @Test(dependsOnMethods = {"a"})
  public void e() 
  {
   Reporter.log("e method is running",true);
  }
  
  {
	  
  }
}
