@US05
Feature:As a user, I want there to be an "About Us" page on the website so that I can have more information about the school.

  Background:
    Given  The user goes to the 'url' address
    Then The user verifies that the About Us menu title in the top bar of the home page is displayed
    When  The user clicks on the About Us menu button.

  @TC1_US05
    Scenario:When the 'About Us' menu title in the top bar of the homepage is clicked, it should redirect to the 'About Us' page.

      Then The user verifies that About Us menu button redirects to the About us page.

  @TC2_US05
    Scenario:On the 'About Us' page, it should be verified that there are sections titled 'Who We Are' and 'Why Choose Our Institution?'.

      Then The user verifies that the sections titled Who We Are and Why Choose Our Institution are displayed.

  @TC3_US05
    Scenario: In the 'Why Choose Our Institution?' section on the 'About Us' page,
              it should be verified that the following headings are visible:
              Scholarship Facility, Skilled Lecturers, Book Library & Store, Library Facilities, Book Collection, Digital Resources.

      Then The user verifies that Scholarship Facility, Skilled Lecturers, Book Library & Store, Library Facilities, Book Collection, Digital Resources headings are visible in the Why Choose Our Institution? section.




