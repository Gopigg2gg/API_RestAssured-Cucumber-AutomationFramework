package com.Kiddo.Stepdef;

import java.io.IOException;
import java.util.NoSuchElementException;
import com.Kiddo.API.AddParent;
import com.Kiddo.API.Auth;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddParentStep {

	@Given("^Launch the App$")
	public void Launch_the_app() throws Throwable {
		System.out.println("App launched");
		Thread.sleep(5000);
//		Log.info("App launched");
	}

	@When("^I send body \"([^\"]*)\" API$")
	public void user_in_current_page(String Page) throws InterruptedException, IOException {

		if (Page.equals("AddParent")) {
			AddParent.AddParent();
			AddParent.ValidateStatusCodeAddParent();
		} else if (Page.equals("UpdateParent")) {
			AddParent.UpdateParent();
		} 
	}

	@Then("^Check the response body details \"([^\"]*)\" API$")
	public void validate_the_access_token(String Page)
			throws InterruptedException, IOException, NoSuchElementException {

		if (Page.equals("AddParent")) {
			AddParent.ValidateResponseBodyAddParent();
		} else if (Page.equals("GetParentEmail")) {
			AddParent.VerifyBodyGetParentEmail();
		} else if (Page.equals("GetParentId")) {
			AddParent.VerifyBodyGetParentId();
		} else if (Page.equals("DeleteParent")) {
			AddParent.VerifyBodyDeleteAccount();
		} else if (Page.equals("UpdateParent")) {
			AddParent.ValidateResponseBodyUpdateParent();
		}  
		
	}
	@Then("^Check the invalid response body details \"([^\"]*)\" API$")
	public void validate_the_invalid_response_body(String Page)
			throws InterruptedException, IOException, NoSuchElementException {

		if (Page.equals("GetDevices")) {
			
		}
	} 
}
