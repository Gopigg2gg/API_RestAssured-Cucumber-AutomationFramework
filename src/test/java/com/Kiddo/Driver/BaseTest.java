package com.Kiddo.Driver;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Assert;

import com.Kiddo.Constants.TestData;
import com.Kiddo.Utils.LoadProperties;
import com.Kiddo.Utils.Log;

import io.cucumber.java.Before;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseTest {

	protected static RequestSpecification requestSpec;
	protected static RequestSpecification RequestAccessToken;
	protected static ResponseSpecification responseSpec;
	public static Response RefreshResponseToken;
	public static String Stagingurl = "";
	public static String Produrl = "";
	
	
	public static String refreshToken;
	public static String AccessToken;
	public static Response responseAccessToken;
	public Logger logger;

	@Before(order = 0)

//	public static void setBaseURI() throws IOException, InterruptedException {
//		LoadProperties prop = new LoadProperties();
//
//		if (prop.GetEnvironment().equalsIgnoreCase("staging") && (prop.GetDevice().equalsIgnoreCase("android"))) {
//
//			requestSpec = given().param("grant_type", prop.GrantType()).param("client_id", prop.ClientId())
//					.param("redirect_uri", prop.RedirectUri()).param("code", prop.Code());
//			RefreshResponseToken = requestSpec.post(Stagingurl);
//			baseURI = prop.GetStagingBaseUrl();
//
//		} else if (prop.GetEnvironment().equalsIgnoreCase("staging") && (prop.GetDevice().equalsIgnoreCase("ios"))) {
//
//			System.out.println("strat with iod");
//			requestSpec = given().param("grant_type", prop.GrantType()).param("client_id", prop.GetIOSclientid())
//					.param("redirect_uri", prop.RedirectUri()).param("code", prop.Code());
//			RefreshResponseToken = requestSpec.post(Stagingurl);
//			baseURI =  prop.GetStagingBaseUrl();
//			
//
//		} else if (prop.GetEnvironment().equalsIgnoreCase("prod") && (prop.GetDevice().equalsIgnoreCase("android"))) {
//
//			System.out.println("strat with iod");
//			requestSpec = given().param("grant_type", prop.GrantType()).param("client_id", prop.GetIOSclientid())
//					.param("redirect_uri", prop.RedirectUri()).param("code", prop.Code());
//			RefreshResponseToken = requestSpec.post(Produrl);
//			int RefreshToken = RefreshResponseToken.getStatusCode();
//			Assert.assertEquals(RefreshToken, TestData.Status_Code_200);
//
//		} else if (prop.GetEnvironment().equalsIgnoreCase("prod") && (prop.GetDevice().equalsIgnoreCase("ios"))) {
//
//			System.out.println("strat with iod");
//			requestSpec = given().param("grant_type", prop.GrantType()).param("client_id", prop.GetIOSclientid())
//					.param("redirect_uri", prop.RedirectUri()).param("code", prop.Code());
//			RefreshResponseToken = requestSpec.post(Produrl);
//			
//			int RefreshToken = RefreshResponseToken.getStatusCode();
//			Assert.assertEquals(RefreshToken, TestData.Status_Code_200);
//
//		}
//
//	}
	public static void setBaseURI() throws IOException, InterruptedException {
		Log.info("Sent the refreshtoken to generate the accesstoken");
		LoadProperties prop = new LoadProperties();
	
	if (prop.GetEnvironment().equalsIgnoreCase("staging") && (prop.GetDevice().equalsIgnoreCase("android"))) {

		RequestAccessToken = given().param("refresh_token", prop.GetRefreshTokenAndroid()).param("client_id", prop.ClientId())
				.param("redirect_uri", prop.RedirectUri()).param("code", prop.Code())
				.param("grant_type", prop.GrantTypeAccess()).header("content-type", prop.ContentType())
				.header("cache-control", prop.CacheControl());
		responseAccessToken = RequestAccessToken.post(Stagingurl);
		baseURI =  prop.GetStagingBaseUrl();
		
	} else if (prop.GetEnvironment().equalsIgnoreCase("staging") && (prop.GetDevice().equalsIgnoreCase("ios"))) {

		RequestAccessToken = given().param("refresh_token", prop.GetRefreshTokenIos()).param("client_id", prop.GetIOSclientid())
				.param("redirect_uri", prop.RedirectUri()).param("code", prop.Code())
				.param("grant_type", prop.GrantTypeAccess()).header("content-type", prop.ContentType())
				.header("cache-control", prop.CacheControl());
		responseAccessToken = RequestAccessToken.post(Stagingurl);
		baseURI =  prop.GetStagingBaseUrl();
		
	} else if (prop.GetEnvironment().equalsIgnoreCase("prod") && (prop.GetDevice().equalsIgnoreCase("android"))) {

		RequestAccessToken = given().param("refresh_token", prop.GetRefreshTokenAndroid()).param("client_id", prop.ClientId())
				.param("redirect_uri", prop.RedirectUri()).param("code", prop.Code())
				.param("grant_type", prop.GrantTypeAccess()).header("content-type", prop.ContentType())
				.header("cache-control", prop.CacheControl());
		responseAccessToken = RequestAccessToken.post(Produrl);
		baseURI =  prop.GetProductionBaseUrl();
		
	} else if (prop.GetEnvironment().equalsIgnoreCase("prod") && (prop.GetDevice().equalsIgnoreCase("ios"))) {

		RequestAccessToken = given().param("refresh_token", prop.GetRefreshTokenIos()).param("client_id", prop.GetIOSclientid())
				.param("redirect_uri", prop.RedirectUri()).param("code", prop.Code())
				.param("grant_type", prop.GrantTypeAccess()).header("content-type", prop.ContentType())
				.header("cache-control", prop.CacheControl());
		responseAccessToken = RequestAccessToken.post(Produrl);
		baseURI =  prop.GetProductionBaseUrl();
	}
	}
}
