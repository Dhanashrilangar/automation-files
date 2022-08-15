package HardAssert_Study;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrue_false {
  @Test
  public void TC3 () 
  {
	  //boolean output= Title.isDisplayed();
  boolean Result=false;
	  boolean name=true;
	  assertTrue(Result, "Result is false");
	  Reporter.log("TC3 is running", true);
	  
	  assertFalse(Result, "name is true ");
	  Reporter.log("TC3 is fail", true);
	  
  }
//  @Test
//  public void TC4() 
//  
//  {	
//	  //boolean output= Title.isDisplayed();
//	  boolean Result=true;
//	  
//	  assertFalse(Result,"Result is true");
//	  Reporter.log("TC4 is running", true);
//  }

	  
	  
  }

