@US11
Feature: As a user, I want a "Complaints" section on the website where I can submit my requests and complaints.

  Background:
    Given The user goes to the "url" address

  @TC1_US11
  Scenario: It should be verified that there is a "Complain" heading and icon visible in the footer of the homepage.

    When The user descends to the footer section of the page
<<<<<<< HEAD
    When The user waits 1 seconds
    Then Verifies that the Comlain heading in the user footer is visible
    Then Verifies that the Comlain icon in the user footer is visible
=======
    Then Verifies that the “Comlain” heading in the user footer is visible
    Then Verifies that the "Comlain" icon in the user footer is visible
    When The user waits 1 seconds
>>>>>>> main
    And User closes the page

  @TC2_US11
  Scenario: When clicking on the "Complain" heading and icon in the footer of the homepage, it should redirect to the relevant page.

    When The user descends to the footer section of the page
    When The user waits 1 seconds
<<<<<<< HEAD
    When The user clicks on the Complain heading in the footer section
    Then The user verifies that he or she was redirected to the complain page that the title is Complain
    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    Then The user verifies that he or she was redirected to the complain page that the title is Complain
=======
    When The user clicks on the "Complain" heading in the footer section
    Then The user verifies that he or she was redirected to the complain page that the title is "Complain"
    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the "Complain" icon in the footer section
    Then The user verifies that he or she was redirected to the complain page that the title is "Complain"
>>>>>>> main
    And User closes the page

  @TC3_US11
  Scenario: On the opened page, it should be verified that there are text boxes for Name, Email, Contact No., and Description.

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    Then The user verifies that Name textbox is visible on complain page
    Then The user verifies that Email textbox is visible on complain page
    Then The user verifies that Contact No. textbox is visible on complain page
    Then The user verifies that Description textbox is visible on complain page
    And User closes the page

  @TC4_US11
  Scenario: On the "Complain" page, after entering data in the Name, Email, Contact No., and Description text boxes, when the Submit button is clicked, it should be verified that the complaint is successfully submitted.

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    When The user enters correct data in Name textbox on complain page
    When The user enters correct data in Email textbox on complain page
    When The user enters correct data in Contact No. textbox on complain page
    When The user enters correct data in Description textbox on complain page
    When The user clicks submit button on complain page
    Then The user verifies that the request was sent with the confirmation message
