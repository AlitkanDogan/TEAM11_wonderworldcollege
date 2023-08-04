Feature: As a user, I want there to be menu titles on the top bar of the Homepage that will facilitate easy navigation within the site.

  @TC1_US15

  Scenario: It should be verified that the "WHAT PEOPLE SAY" section is present on the homepage.

    Given The user goes to the "url" address
    Then User scrolls down until “WHAT PEOPLE SAY” text
    Then The user waits 1 seconds
    Then User checks “WHAT PEOPLE SAY” section is visible.
    And User closes the page

  @TC2_US15

  Scenario: It should be visible different people' comments on the  "WHAT PEOPLE SAY" section

    Given The user goes to the "url" address
    Then User checks “WHAT PEOPLE SAY” section , user can see people who share their experiences and their comments.
    And User closes the page

