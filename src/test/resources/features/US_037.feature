@US37
Feature: As an administrator (teacher), I want a page where I can create online permission records and check all the permissions I have used.

  Scenario: The Apply Date page link should be displayed under the Human Resource menu title on the sidebar of the Teacher panel, and when clicked, it should redirect to the leave request#adleave page
    Given  login_teacher "hamza.cicek@teacher.wonderworldcollege.com" "wonderworld123"
    And Page Closed
