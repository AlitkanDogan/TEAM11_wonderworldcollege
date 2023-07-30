@US9

  Feature: As a user, I want a "Contact" page on the website with contact information so that
       I can get in touch with the school administration.

@TC1_US9
  Scenario: When the 'Contact' menu title in the top bar of the homepage is clicked,
              it should redirect to the 'Contact' page.

  Given The user goes to the "url" address
  When Click on the Contact menu title on the home page top bar
  Then It is tested that the contact page is redirected
  And User closes the page


  @TC2_US9
  Scenario: On the 'Contact' page, it should be verified that the 'Send In Your Query' section contains visible
             and editable text boxes for Name, Email, Subject, and Description.
    Given The user goes to the "url" address
    When Click on the Contact menu title on the home page top bar
    Then It is tested that the contact page is redirected
    Then In the Send In Your Query section Name Email Subject Description textBoxes is confirmed to be visible
    Then Name, Email, Subject, Description textBoxes It is verified that data can be entered
    And User closes the page


    @TC3_US9

    Scenario:When data is entered in Name, Email, Subject, Description textBoxes and the Submit button is clicked, it is verified that the query has been sent.
      Given The user goes to the "url" address
      When Click on the Contact menu title on the home page top bar
      Then Name, Email, Subject, Description textBoxes It is verified that data can be entered
      Then Clicking the Submit button confirms that the query has been submitted
      And User closes the page

      @TC4_US9
      Scenario:
        Given The user goes to the "url" address
        When Click on the Contact menu title on the home page top bar
        Then On the Contact page, Our Location, Call Us,Verify that Working Hours information is visible
        And User closes the page

