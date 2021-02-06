@login
  Feature: Login Success
    Scenario: User can successfully log in
      Given I am on the welcome screen
      And I enter a valid username
      And I enter a valid password
      Then I should be taken to the Welcome Screen