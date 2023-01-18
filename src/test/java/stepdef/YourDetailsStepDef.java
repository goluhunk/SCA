package stepdef;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import driver.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AuthLoginPage;

public class YourDetailsStepDef {
	
			
	@Given("I am logged in with nino")
	public void i_am_logged_in_with_nino() {
		 System.out.println("Inside Given");
		 AuthLoginPage alp =new AuthLoginPage();
		 alp.Login();
	}

	@When("I visit change of circumstances")
	public void i_visit_change_of_circumstances() {
	   System.out.println("I visit change of circumstances");
	}

	@Then("I should see caption")
	public void i_should_see_caption() {
		System.out.println("I see the caption"); 
	}

	@Then("I should see title")
	public void i_should_see_title() {
		System.out.println("I see the title"); 
	}

	@Then("I should see name")
	public void i_should_see_name() {
		System.out.println("I see the name"); ;
	}

	@Then("I should see preferred name")
	public void i_should_see_preferred_name() {
		System.out.println("I see the preferred name"); 
	}

	@Then("I should see marital status")
	public void i_should_see_marital_status() {
		System.out.println("I see the marital status"); 
	}

	@Then("I should see national insurance number")
	public void i_should_see_national_insurance_number() {
		System.out.println("I see the ni number"); 
	}

	@Then("I should see home address")
	public void i_should_see_home_address() {
		System.out.println("I see the home address"); 
	}

	@Then("I should see postal assress")
	public void i_should_see_postal_assress() {
		System.out.println("I see the postal address"); 
	}

	@Then("I should see email")
	public void i_should_see_email() {
		System.out.println("I see the email"); 
	}

	@Then("I should see phone number")
	public void i_should_see_phone_number() {
		System.out.println("I see the phone"); 
	}
	
}
