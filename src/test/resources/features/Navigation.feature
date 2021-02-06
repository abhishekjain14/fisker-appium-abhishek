  @navigation @android
  Feature: Navigation
    Scenario: Navigate to a different screen
      Given I am on the welcome screen
      And I enter the correct username
      And I enter a valid password
      Then I should be taken to the Welcome Screen
      When I click on the notifications button
      Then I should end up on a new screen