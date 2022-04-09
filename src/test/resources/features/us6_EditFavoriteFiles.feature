Feature: As a user, I should be able to remove files from favorites and upload a file directly

  Background: navigating to Files module
    Given user on the dashboard page
    When the user clicks the "Files" module


  Scenario: verify users to remove files to Favorites

    When the users click action-icon from any file "Tasks" on the page to remove
    And  user choose the "Remove from favorites" option
    And user clicks the "Favorites" sub-module on the left side
    Then Verify that the file is removed from the Favorites sub-module’s table

  Scenario: verify users to upload a file from Files
    When the user clicks the add icon on the top
    And users uploads file with the "Upload file" option
    Then verify the file is displayed on the page