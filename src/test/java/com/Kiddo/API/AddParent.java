package com.Kiddo.API;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import com.Kiddo.Constants.Endpoints;
import com.Kiddo.Constants.TestData;
import com.Kiddo.Driver.BaseTest;
import com.Kiddo.Utils.Log;
import io.restassured.path.json.JsonPath;

public class AddParent extends BaseTest {

	public static String ParentId;
	public static String getName;
	public static String getFirstname;
	public static String getLastname;
	public static String getEmail;
	public static String getUnit;
	public static String getPhone;
	public static String getPic_url;
	public static String getOccupationName;
	public static int getOccupationId;
	public static String getCompanyName;

	public static void SetAddParentAuth() throws IOException {
		Log.info("Set path for add parent");
		RequestAccessToken = given().header("Authorization", "Bearer " + AccessToken).header("Content-Type",
				"application/json");
	}

	public static void AddParent() throws IOException {
		Log.info("Send request body for add parent");
		System.out.println("send access : " + AccessToken);
		HashMap<String, Object> AddParent = new HashMap<String, Object>();
		AddParent.put("id", "");
		AddParent.put("name", TestData.Name);
		AddParent.put("First Name", TestData.FirstName);
		AddParent.put("Last Name", TestData.LastName);
		AddParent.put("email", TestData.Email);
		AddParent.put("unit", TestData.Unit);
		AddParent.put("phone", TestData.Phone);
		AddParent.put("pic_url", TestData.Pic_url);

		Map<String, Object> moredetails = new HashMap<String, Object>();
		moredetails.put("occupationName", TestData.OccupationName);
		moredetails.put("occupation_id", TestData.Occupation_id);
		moredetails.put("company_name", TestData.Company_name);
		AddParent.put("more_details", moredetails);
//		AddParent.put("more_details.location.latitude", TestData.Latitude);
//		AddParent.put("more_details.location.longitude", TestData.Longitude);
//		AddParent.put("more_details.location.address", TestData.Address);

		responseAccessToken = RequestAccessToken.body(AddParent).when().post(Endpoints.Post_AdddParent);
		String responsebodytoke = responseAccessToken.getBody().asString();
		System.out.println("Get the parent response body" + responsebodytoke);
	}

	public static void SetParentID() {
		Log.info("Get and set parent id");
		JsonPath js2 = responseAccessToken.jsonPath();
		ParentId = js2.get("id");
		System.out.println("print ParentId : " + ParentId);
	}

	public static void ValidateStatusCodeAddParent() {
		Log.info("Check the status code is 200");
		int AccessToken = responseAccessToken.getStatusCode();
		Assert.assertEquals(AccessToken, TestData.Status_Code_200);
		int statuscode1 = responseAccessToken.getStatusCode();
		System.out.println("print statuscode : " + statuscode1);
	}

	public static void ValidateResponseBodyAddParent() {
		Log.info("Check the response body input given in request");
		JsonPath ResponseValue = responseAccessToken.jsonPath();
		getName = ResponseValue.get("name");
		getEmail = ResponseValue.get("email");
		getUnit = ResponseValue.get("unit");
		getPhone = ResponseValue.get("phone");
		getPic_url = ResponseValue.get("pic_url");
		getOccupationName = ResponseValue.get("more_details.occupationName");
		getOccupationId = ResponseValue.get("more_details.occupation_id");
		getCompanyName = ResponseValue.get("more_details.company_name");
		
		Assert.assertEquals( getName, TestData.Name);
		Assert.assertEquals(getEmail, TestData.Email);
		Assert.assertEquals(getUnit, TestData.Unit);
		Assert.assertEquals(getPhone, TestData.Phone);
		Assert.assertEquals(getPic_url, TestData.Pic_url);
		Assert.assertEquals(getOccupationName, TestData.OccupationName);
		Assert.assertEquals(getOccupationId, TestData.Occupation_id);
		Assert.assertEquals(getCompanyName, TestData.Company_name);
	}

	public static void GetParentEmail() throws IOException {
		Log.info("Set the auth token for get parent end point for email");
		RequestAccessToken = given().pathParam("email", TestData.Email).header("Authorization", "Bearer " + AccessToken)
				.header("Content-Type", "application/json");
		responseAccessToken = RequestAccessToken.get(Endpoints.Get_ParentEmail);
		String responsebodytoke1 = responseAccessToken.getBody().asString();
		System.out.println("VerifySuccessGetParentEmail " + responsebodytoke1);
	}

	public static void VerifySuccessGetParentEmail() {

		Log.info("Check the status code for 200 for get parent api");
		int StatuscodeEmail = responseAccessToken.getStatusCode();
		System.out.println("VerifySuccessGetParentEmail : " + StatuscodeEmail);
		Assert.assertEquals(StatuscodeEmail, TestData.Status_Code_200);

	}

	public static void VerifyBodyGetParentEmail() {

		Log.info("Check the response body input given in request get parent");
		JsonPath ResponseValue = responseAccessToken.jsonPath();
		getName = ResponseValue.get("name");
		getEmail = ResponseValue.get("email");
		getUnit = ResponseValue.get("unit");
		getPhone = ResponseValue.get("phone");
		getPic_url = ResponseValue.get("pic_url");
		getOccupationName = ResponseValue.get("more_details.occupationName");
		getOccupationId = ResponseValue.get("more_details.occupation_id");
		getCompanyName = ResponseValue.get("more_details.company_name");
		
		Assert.assertEquals(getName, TestData.Name);
		Assert.assertEquals(getEmail, TestData.Email);
		Assert.assertEquals(getUnit, TestData.Unit);
		Assert.assertEquals(getPhone, TestData.Phone);
		Assert.assertEquals(getPic_url, TestData.Pic_url);
		Assert.assertEquals(getOccupationName, TestData.OccupationName);
		Assert.assertEquals(getOccupationId, TestData.Occupation_id);
		Assert.assertEquals(getCompanyName, TestData.Company_name);

	}

	public static void GetParentId() throws IOException {

		Log.info("Set the auth token for get parent end point for id");
		System.out.println("Get the parentid " + ParentId);
		RequestAccessToken = given().pathParam("id", ParentId).header("Authorization", "Bearer " + AccessToken)
				.header("Content-Type", "application/json");
		responseAccessToken = RequestAccessToken.when().get(Endpoints.Get_ParentId);
		String responsebodytoke1 = responseAccessToken.getBody().asString();
		System.out.println("VerifyGetParentId response " + responsebodytoke1);

	}

	public static void VerifyGetParentId() {
		Log.info("Check the status code for 200 for get parent api");
		int StatuscodeId = responseAccessToken.getStatusCode();
		System.out.println("VerifyGetParentId : " + StatuscodeId);
		Assert.assertEquals(StatuscodeId, TestData.Status_Code_200);

	}

	public static void VerifyBodyGetParentId() {
		Log.info("Check the response body input given in request");
		JsonPath ResponseValue = responseAccessToken.jsonPath();
		getName = ResponseValue.get("name");
		getEmail = ResponseValue.get("email");
		getUnit = ResponseValue.get("unit");
		getPhone = ResponseValue.get("phone");
		getPic_url = ResponseValue.get("pic_url");
		getOccupationName = ResponseValue.get("more_details.occupationName");
		getCompanyName = ResponseValue.get("more_details.company_name");

		Assert.assertEquals(getName, TestData.Name);
		Assert.assertEquals(getEmail, TestData.Email);
		Assert.assertEquals(getUnit, TestData.Unit);
		Assert.assertEquals(getPhone, TestData.Phone);
		Assert.assertEquals(getPic_url, TestData.Pic_url);
		Assert.assertEquals(getOccupationName, TestData.OccupationName);
		Assert.assertEquals(getCompanyName, TestData.Company_name);

	}

	public static void DeleteAccount() {
		Log.info("Set the auth token for delete parent end point");
		RequestAccessToken = given().header("Authorization", "Bearer " + AccessToken).header("Content-Type",
				"application/json");
		HashMap<String, String> deleteAccount = new HashMap<String, String>();
		deleteAccount.put("id", ParentId);
		responseAccessToken = RequestAccessToken.body(deleteAccount).when().delete(Endpoints.Post_AdddParent);
		String responsebodytoke = responseAccessToken.getBody().asString();
		System.out.println("print delete response code : " + responsebodytoke);
	}

	public static void ValidateStatusCodeDeleteAccount() {
		Log.info("Check the status code for 200 for delete parent endpoint");
		int StatusCodeDelete = responseAccessToken.getStatusCode();
		Assert.assertEquals(StatusCodeDelete, TestData.Status_Code_200);
		System.out.println("Chekc the status code for delete parent api" + StatusCodeDelete);
	}

	public static void VerifyBodyDeleteAccount() {

		Log.info("Check the response body input given in delete parent api");
		JsonPath ResponseValue = responseAccessToken.jsonPath();
		String getMethod = ResponseValue.get("method");
		String getStatus = ResponseValue.get("status");
		Assert.assertEquals(getMethod, TestData.Method);
		Assert.assertEquals(getStatus, TestData.Status);

	}
	
	// Update Parent API
	
	public static void SetUpdateParentAuth() throws IOException {
		Log.info("Set path for add parent");
		RequestAccessToken = given().header("Authorization", "Bearer " + AccessToken).header("Content-Type",
				"application/json");
	}

	public static void UpdateParent() throws IOException {
		Log.info("Send request body for add parent");
		System.out.println("send access : " + AccessToken);
		System.out.println("update floor" +ParentId);
		HashMap<String, Object> UpdateParent = new HashMap<String, Object>();
		UpdateParent.put("id", ParentId);
		UpdateParent.put("accepted_eula", "yes");
		UpdateParent.put("name", TestData.UpdateName);
		UpdateParent.put("accepted_eula", "yes");
		UpdateParent.put("First Name", TestData.UpdateFirstName);
		UpdateParent.put("Last Name", TestData.UpdateLastName);
		UpdateParent.put("email", TestData.UpdateEmail);
		UpdateParent.put("phone", TestData.UpdatePhone);
		UpdateParent.put("pic_url", TestData.UpdatePic_url);	

		responseAccessToken = RequestAccessToken.body(UpdateParent).when().post(Endpoints.Post_AdddParent);
		String responsebodytoke = responseAccessToken.getBody().asString();
		System.out.println("Get the parent response body" + responsebodytoke);
	}
	public static void ValidateStatusCodeUpdateParent() {
		Log.info("Check the status code is 200");
		int AccessToken = responseAccessToken.getStatusCode();
		Assert.assertEquals(AccessToken, TestData.Status_Code_200);
		int statuscode1 = responseAccessToken.getStatusCode();
		System.out.println("print statuscode : " + statuscode1);
	}

	public static void ValidateResponseBodyUpdateParent() {
		Log.info("Check the response body input given in request");
		JsonPath ResponseValue = responseAccessToken.jsonPath();
		getName = ResponseValue.get("name");
		getEmail = ResponseValue.get("email");
		getPhone = ResponseValue.get("phone");
		getPic_url = ResponseValue.get("pic_url");
		
		Assert.assertEquals(getName, TestData.UpdateName);
		Assert.assertEquals(getEmail, TestData.UpdateEmail);
		Assert.assertEquals(getPhone, TestData.UpdatePhone);
		Assert.assertEquals(getPic_url, TestData.UpdatePic_url);
	
	}

}
