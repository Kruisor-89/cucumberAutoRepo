Feature: Create account of Facebook3
  As a user u need to open facebook home page and do the validations

  Scenario: Validate create user multiple fields31
    Given User need to be on Facebook login page
    When Enter followind data
      | UserName | UserSurname | Mobile    |
      | Luis     | Arguijo     | 123456789 |
      | Julio    | Lopez       | 987654321 |