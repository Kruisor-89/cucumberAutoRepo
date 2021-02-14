Feature: Create account of Facebook11
  As a user u need to open facebook home page and do the validations

  Scenario: Validate First Name field111
    Given User need to be on Facebook login page
    When User enters user "Luis" first name
    Then User checks user "Luis" first name is present
    #Then close browser : si hay tag @after

  Scenario: Validate create user multiple fields112
    Given User need to be on Facebook login page
    When User enters user "Joan" first name
    And User enters user "Brown" surname
    Then User checks user "Joan" first name is present
    Then User Mobile field should be blank
    #Then close browser : si hay tag @after
