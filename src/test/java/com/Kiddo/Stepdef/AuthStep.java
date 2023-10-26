package com.Kiddo.Stepdef;

import java.io.IOException;
import java.util.NoSuchElementException;
import com.Kiddo.API.Auth;

import com.Kiddo.Driver.BaseTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AuthStep {

	@Given("^I Set \"([^\"]*)\" API$")
	public void verify_the_given_page(String Page1) throws InterruptedException, IOException, NoSuchElementException {

		if (Page1.equals("Auth")) {
			BaseTest.setBaseURI();
		} else if (Page1.equals("RefreshToken")) {
			BaseTest.setBaseURI();
		} else if (Page1.equals("UserInfo")) {
			Auth.GetUserLogs();
		} 
	}

	@Given("^Get \"([^\"]*)\"$")
	public void set_auth_access_token(String Page1) throws InterruptedException, IOException, NoSuchElementException {

		if (Page1.equals("AccessToken")) {
			BaseTest.setBaseURI();
			Auth.GetAccessToken();
		}

	}

	@Then("^Check the status code \"([^\"]*)\" API$")
	public void validate_the_auth(String Page) throws InterruptedException, IOException, NoSuchElementException {

		if (Page.equals("Auth")) {
			Auth.ValidateAccessToken();
		}  else if (Page.equals("UserInfo")) {
			Auth.ValidateStatusCodeGetUserLogs();
		}
		
	}

	@Then("^Check the invalid status code \"([^\"]*)\" API$")
	public void validate_Invalid_statuscode(String Page)
			throws InterruptedException, IOException, NoSuchElementException {

		if (Page.equals("GetAppVersion")) {
			
		} else if (Page.equals("Articles")) {
			
		}
	}

	@Then("^Set the \"([^\"]*)\" Token$")
	public void validate_the_access_token(String Page)
			throws InterruptedException, IOException, NoSuchElementException {

		if (Page.equals("Access")) {
			Auth.SetAccessToken();
		}
	}

	@Given("^I Set invalid \"([^\"]*)\" API$")
	public void verify_with_invalid_body(String Page1)
			throws InterruptedException, IOException, NoSuchElementException {

		if (Page1.equals("GetAppVersion")) {
			

		}  else if (Page1.equals("Articles")) {

		}
	}
}
