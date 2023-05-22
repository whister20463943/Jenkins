package jenkinsDemo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {

		@When("I clicked on the search area")
		public void i_clicked_on_the_search_area() {
			// Write code here that turns the phrase above into concrete actions
			// throw new io.cucumber.java.PendingException();
		}

		@When("I entered the productName")
		public void i_entered_the_product_name() {
			// Write code here that turns the phrase above into concrete actions
			// throw new io.cucumber.java.PendingException();
//			NykaHomePage.clickAndENterTextInSearchingArea("lipstick");
		}

		@Then("I verified the search results")
		public void i_verified_the_search_results() {
			// Write code here that turns the phrase above into concrete actions
			// throw new io.cucumber.java.PendingException();
		}

	}

