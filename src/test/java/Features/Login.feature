Feature: Login functionality

  Scenario: Login with Valid Credentials
    Given I navigate to application
    And I enter username "Admin" and password "Adminpassword"
    When I click on Signin button
    Then I should see home page

  Scenario: Login with Valid Credentials regression
    Given I navigate to application
    And I enter username "test" and password "test"
    When I click on Signin button
    Then I should see home page

  Scenario: Login with Valid Credentials sanity
    Given I navigate to application
    And I enter the following crenetials
      | UserName | Password      |
      | Admin    | adminpassword |
    When I click on Signin button
    Then I should see home page




    


