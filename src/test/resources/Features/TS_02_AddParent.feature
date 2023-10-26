#Author:  Gopinath Angusamy

@Sanity @Regression
Feature: Add Parent, Delete Parent, GetParent

 Background: Launch the AccessToken
    Given Launch the App
 
 @AddParent @DeleteParent @GetParent @UpdateParent
  Scenario: Verify add,get and delete parent api. 
  
  	Given Get "AccessToken"
    Given I Set "Parent" API
    When I send body "AddParent" API
    And Get "ParentId" API
    Then Check the status code "AddParent" API
    Then Check the response body details "AddParent" API
    
    When I Set "GetParent" API
    Then Check the status code "GetParentId" API
    Then Check the response body details "GetParentId" API
    
    When I Set "GetParentEmail" API
    Then Check the status code "GetParentEmail" API
    Then Check the response body details "GetParentEmail" API
    
    When I Set "GetParentEmail" API
    Then Check the status code "GetParentEmail" API
    Then Check the response body details "GetParentEmail" API
    
    Given I Set "UpdateParent" API
    When I send body "UpdateParent" API
    Then Check the status code "UpdateParent" API
    Then Check the response body details "UpdateParent" API
    
    When I Set "DeleteParent" API
   	Then Check the status code "DeleteParent" API
   	Then Check the response body details "DeleteParent" API
    