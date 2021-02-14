Feature: Create account of Facebook1
  As a user u need to open facebook home page and do the validations

  Background: common login steps11
    Given User need to be on Facebook login page

  Scenario: Validate First Name field12
    When User enters user "Luis" first name
    Then User checks user "Luis" first name is present
    Then close browser

  Scenario: Validate create user multiple fields13
    When User enters user "Joan" first name
    And User enters user "Brown" surname
    Then User checks user "Joan" first name is present
    Then User Mobile field should be blank
    Then close browser