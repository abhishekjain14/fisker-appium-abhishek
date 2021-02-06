  @login @android
  Feature: Login Success
    Scenario: User can successfully log in
      Given I am on the welcome screen
      And I enter the correct username
      And I enter a valid password
      Then I should be taken to the Welcome Screen

    Scenario: User fails logging in
      Given I am on the welcome screen
      And I enter a valid username
      And I enter an incorrect password
      Then I should be taken to the login failed screen