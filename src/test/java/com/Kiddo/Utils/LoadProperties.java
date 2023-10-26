package com.Kiddo.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {

	public static Properties property;

	private static String configpath = "Properties_File/apiConfig.properties";

	public static Properties propertiesfile() throws IOException

	{
		property = new Properties();

		InputStream insta = new FileInputStream(configpath);

		property.load(insta);

		String text = property.getProperty("Host");

		return property;
	}

	public String GetBaseURL() throws IOException {
		return propertiesfile().getProperty("host");
	}
	public String GetEnvironment() throws IOException {
		return propertiesfile().getProperty("env");
		
	}
	
	public String GetDevice() throws IOException {
		return propertiesfile().getProperty("device");
		
	}
	public String ClientId() throws IOException {
		return propertiesfile().getProperty("clientid");
	}
	public String RedirectUri() throws IOException {
		return propertiesfile().getProperty("redirecturi");
	}
	public String Code() throws IOException {
		return propertiesfile().getProperty("code");
	}
	public String GrantType() throws IOException {
		return propertiesfile().getProperty("granttype");
	}
	public String ContentType() throws IOException {
		return propertiesfile().getProperty("contenttype");
	}
	public String GrantTypeAccess() throws IOException {
		return propertiesfile().getProperty("granttypeaccess");
	}
	public String CacheControl() throws IOException {
		return propertiesfile().getProperty("cachecontrol");
	}
	public String GetIOSclientid() throws IOException {
		return propertiesfile().getProperty("IOSclientid");
	}
	public String GetStagingBaseUrl() throws IOException {
		return propertiesfile().getProperty("baseurl");
	}
	public String GetProductionBaseUrl() throws IOException {
		return propertiesfile().getProperty("baseurl");
	}
	public String GetRefreshTokenAndroid() throws IOException {
		return propertiesfile().getProperty("refreshtokenandroid");
	}
	public String GetRefreshTokenIos() throws IOException {
		return propertiesfile().getProperty("refreshtokenios");
	}
	
	
	
}