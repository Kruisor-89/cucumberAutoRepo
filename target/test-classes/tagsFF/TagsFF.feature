@Important
Feature: Create account of Facebook121
  As a user u need to open facebook home page and do the validations
  @Smoke
  Scenario: Validate First Name field122
    Given User need to be on Facebook login page
    When User enters user "Luis" first name
    Then User checks user "Luis" first name is present
    Then close browser
  @Smoke @Regression
  Scenario: Validate create user multiple fields123
    Given User need to be on Facebook login page
    When User enters user "Joan" first name
    And User enters user "Brown" surname
    Then User checks user "Joan" first name is present
    Then User Mobile field should be blank
    Then close browser

  Scenario: Validate First Name field124
    Given User need to be on Facebook login page
    When User enters user "Luis" first name
    Then User checks user "Luis" first name is present
    Then close browser
  @Regression
  Scenario: Validate First Name field125
    Given User need to be on Facebook login page
    When User enters user "Luis" first name
    Then User checks user "Luis" first name is present
    Then close browser
  @Smoke
  Scenario: Validate First Name field126
    Given User need to be on Facebook login page
    When User enters user "Luis" first name
    Then User checks user "Luis" first name is present
    Then close browser
