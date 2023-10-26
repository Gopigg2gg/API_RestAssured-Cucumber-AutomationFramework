package com.Kiddo.API;

import com.Kiddo.Constants.Endpoints;

/**
 * @author Gopinath Angusamy
 * created on 20/12/22
 */

import com.Kiddo.Constants.TestData;
import com.Kiddo.Driver.BaseTest;
import com.Kiddo.Utils.LoadProperties;
import com.Kiddo.Utils.Log;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;
import java.io.IOException;
import org.junit.Assert;

public class Auth extends BaseTest {
	
	public static final String Get_UserInfo = "https://prodauth.goodparents.co/oauth2/userInfo";

	public static void GetRefreshToken() {
		Log.info("Get and set refresh token into string value in refreshtoken ");
		JsonPath js = RefreshResponseToken.jsonPath();
		refreshToken = js.get("refresh_token");
	}

	public static void ValidateAccessToken() {
		Log.info("Check the status code is coming 200 for get access auth token");
		int AccessToken = responseAccessToken.getStatusCode();
		Assert.assertEquals(AccessToken, TestData.Status_Code_200);
	}

	public static void SetAccessToken() {
		Log.info("Get and set the accesstoken in the name accesstoken");
		JsonPath Access_Token = responseAccessToken.jsonPath();
		AccessToken = Access_Token.get("access_token");
		System.out.println("print final tokens : " + AccessToken);
	}

	public static void GetAccessToken() throws IOException, InterruptedException {
		Log.info("Check the response body input given in request");
		BaseTest.setBaseURI();
		SetAccessToken();
	}
	
	public static void GetUserLogs() throws IOException {
		Log.info("Check the response body input given in request");
	
		RequestAccessToken = given()
			
				.header("Authorization", "Bearer " + AccessToken)
				.header("Content-Type", "application/json");
		responseAccessToken = RequestAccessToken.when().get("https://authorizer.goodparents.co/oauth2/userInfo");

		
			System.out.println("Get the parent response body" + responseAccessToken);
			
			String responsebodytoke = responseAccessToken.getBody().asString();
			System.out.println("Get the parent response body" + responsebodytoke);

		}
   public static void ValidateStatusCodeGetUserLogs() {
		
	Log.info("Check the response body input given in request");
		int AccessToken = responseAccessToken.getStatusCode();
		System.out.println(AccessToken);	
		Assert.assertEquals(AccessToken, TestData.Status_Code_200);
		System.out.println(AccessToken);	
	}
}
