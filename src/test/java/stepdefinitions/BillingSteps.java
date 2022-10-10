package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class BillingSteps {
	
	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	@Given("User is on billing page")
	public void user_is_on_billing_page() {
	    
	}

	@When("user enters billing amount {string}")
	public void user_enters_billing_amount(String billAmount) {
		//converting String to double using Wrapper class
	    this.billingAmount=Double.parseDouble(billAmount);
	}

	@When("user enters tax amount {string}")
	public void user_enters_tax_amount(String taxAmount) {
	   this.taxAmount=Double.parseDouble(taxAmount);
	}
	
	
	@When("user clicks on calculate button")
	public void user_clicks_on_calculate_button() {
		this.taxAmount=taxAmount;
	}

	@Then("it gives final amount {string}")
	public void it_gives_final_amount(String expectedFinalAmount) {
		//converting String to double using Wrapper class
	    this.finalAmount=this.billingAmount + this.taxAmount;
	    
	    System.out.println("expected final amount "+ Double.parseDouble(expectedFinalAmount) );
	    System.out.println("actual final amount "+ this.finalAmount);
	    Assert.assertTrue(this.finalAmount==Double.parseDouble(expectedFinalAmount));
	}

	
}
