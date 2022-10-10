package stepdefinitions;

import amazonImplementation.Product;
import amazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {

	Product product;
	Search search;
	@Given("I have a Search text field on Amazon page")
	public void i_have_a_search_text_field_on_amazon_page() {
		System.out.println("Step 1 :  I am on amazon page");
	}

	@When("I Search a product name {string} and price {int}")
	public void i_search_a_product_name_and_price(String productName, Integer price) {
	   System.out.println("Step 2 : search a product with name "+productName+" price "+price);
	   
	   product=new Product(productName, price);
	}
	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3 : The product "+productName+" is displayed");
		
		search=new Search();
		String name=search.displayProduct(product);
		System.out.println("The search product is: "+productName);
		
		Assert.assertEquals(product.getProductName(), productName);
		
	} 
	
	@Then("Order id {int} and username is {string}")
	public void order_id_and_username_is(Integer orderId, String name) {
		System.out.println("The order is :"+orderId+" Name : "+name);
	}
	
	
}
