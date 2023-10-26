 #Author:  Gopinath Angusamy

@Sanity @Regression
Feature: Auth

  Background: Launch the AccessToken
    #Given Launch the API
 
 @Auth @Userinfo
  Scenario: Get and Set the Access token 
  
    Given I Set "RefreshToken" API
    Then Check the status code "Refresh" API
		Given I Set "Auth" API
    Then Check the status code "Auth" API
    Then Set the "Access" Token
    
   Given I Set "UserInfo" API
    Then Check the status code "UserInfo" API
  