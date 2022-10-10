package stepdefinitions;



import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

	@Given("User is on registration page")
	public void user_is_on_registration_page() { 
		System.out.println("User navigates on registration page");
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		List<List<String>> userList=dataTable.asLists(String.class);
		System.out.println(userList.get(0));
		for(List<String> e : userList) {
			System.out.println(e);
		}
	}
	
	@When("User enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
	    List<Map<String, String>> userList=dataTable.asMaps(String.class, String.class);
	    
	    System.out.println(userList);
	    System.out.println(userList.get(0).get("firstName"));
	    for(Map<String, String> e : userList) {
	    	System.out.println(e.get("firstName"));
	    	System.out.println(e.get("lastName"));
	    	System.out.println(e.get("emailId"));
	    	System.out.println(e.get("phone"));
	    	System.out.println(e.get("location"));
	    }
	}


	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
	}

}
