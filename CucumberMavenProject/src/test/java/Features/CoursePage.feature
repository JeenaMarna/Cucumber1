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
@All
Feature: Title of your feature
  I want to use this template for my feature file

	Background: 
		Given way2automation page should load
    And AllCourser menu should be present
    When I hover on AllCourser
    
  Scenario: Launch Devops course page
    And select Devops
    Then I validate the Page
    
  Scenario: Launch Selenium course page
    And select Selenium
    Then I validate the Page
  
 	Scenario: Launch Appium course page
    And select Appium
    Then I validate the Page


