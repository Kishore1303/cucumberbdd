package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {
	@Given("User wants to select carType {string} from uber application")
	public void user_wants_to_select_car_type_from_uber_app(String carType) {
	    System.out.println();
	}

	@When("User select the car {string} and  from {string} and drop location {string}")
	public void user_select_the_car_and_from_and_drop_location(String carType, String pickUp, String drop) {
	   System.out.println("carType "+carType+" Pickup "+pickUp+" Drop "+drop);
	}
	
	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	}

	@Then("User pays Fare {int}")
	public void user_pays_fare(Integer fare) {
		System.out.println("Fare "+fare);
	}
	
	@Then("User checks trip details")
	public void user_checks_trip_details() {
	}
}
