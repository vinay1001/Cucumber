Feature: User login feature

  Scenario: Use Login Scenario
    Given User is at the login page of the application
    When User login with the following username and password
      | UserName      | Password      |
      | UserNameTwo   | PasswordTwo   |
      | UserNameThree | PasswordThree |
      | UserNameFour  | PasswordFour  |
    Then User should be able to login with correct username and password