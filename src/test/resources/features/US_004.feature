Feature: As a user, I want there to be menu titles on the top bar of the Homepage that will facilitate easy navigation within the site.

  @TC1_US4

  Scenario: When user clicks 'Exam Result' menu title in the top bar of the homepage is clicked,
  it should redirect to the 'Exam Result' page.

    Given The user goes to the "url" address
    Then User clicks “Exam Result” on the homepage and goes through the Exam Results page.
    And User closes the page

  @TC2_US4

  Scenario: User should be verified that Admission No and Exam text boxes are visible and
  are mandatory fields for data input.

    Given The user goes to the "url" address
    Then User clicks “Exam Result” on the homepage and goes through the Exam Results page.
    Then User verifies that Admission No and Exam text boxes are visible
    Then User completes properly Admission No and Exam text boxes.
    And User closes the page

  @TC3_US4

  Scenario: On the 'Exam Result' page, it should be verified that there is a
  Search button that performs a search based on the data entered in the Admission No and Exam text boxes.

  Given