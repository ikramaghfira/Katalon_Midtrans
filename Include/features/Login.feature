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
@tag
Feature: Login Feature

  @tag1
  Scenario Outline: Test login with valid credential
    Given Navigate to login page
    When User input email <email> and password <password>
    And Click on login button
    Then User is <status> navigated to homepage

    Examples: 
      | email  					| passworrd | status  |
      | name1@gmail.com | 123456 		| successfully |
      | name2@gmail.com | 123456 		| failed    |