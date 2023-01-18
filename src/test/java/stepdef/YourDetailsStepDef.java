package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AuthLoginPage;

public class YourDetailsStepDef {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("Inside Given");
	    AuthLoginPage alp=new AuthLoginPage();
	    alp.Login();
	}

	@When("some other precondition")
	public void some_other_precondition() {
		 System.out.println("Inside When");
	}
}
