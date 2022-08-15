package HardAssert_Study;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class fail_assert {
  @Test
  public void f()
  {
	 
		 Reporter.log("Assert fail check", true);
	  // Assert.fail();
		 Reporter.log("TC7 is running", true);
		 
	  

  }
}
