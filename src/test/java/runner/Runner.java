package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import driver.Browser;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(value = Cucumber.class)
@CucumberOptions(features = "resources/features", glue = "stepdef", plugin = { "pretty",
		"html:target/cucumber-reports" }, monochrome = true)
public class Runner {

	
	  @BeforeClass 
	  public static void setUp(){ 
		  Browser.setUpDriver();
	  
	  }
	 
	  @AfterClass
	   public static void tearDown(){
	       Browser.tearDown();
	    }
}
