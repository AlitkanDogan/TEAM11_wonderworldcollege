@US05
Feature:As a user, I want there to be an "About Us" page on the website so that I can have more information about the school.

  Background:
    Given  The user goes to the 'url' address
    Then The user verifies that the About Us menu title in the top bar of the home page is displayed
    When  The user clicks on the About Us menu button.

  @TC1_US05
    Scenario:When the 'About Us' menu title in the top bar of the homepage is clicked, it should redirect to the 'About Us' page.

      Then The user verifies that About Us menu button redirects to the About us page.

  @TC1_US05
    Scenario:

