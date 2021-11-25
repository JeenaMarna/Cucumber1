#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Everything
Feature: Login Functionalities
	
	@smoke
  Scenario: Login using valid username
    Given Login window should load with username and password field
    When I put correct "username" and correct "password" and click on login
    Then I should be able to login
  
  @integration
  Scenario: Login window should load with username and password field
    Given Login window should load
    When I put incorrect "username" and correct "password" and click on login
    Then I should not be able to login
    
  @regression @smoke
  Scenario: Login window should load with username and password field
    Given Login window should load
    When I put correct "username" and incorrect "password" and click on login
    Then I should not be able to login