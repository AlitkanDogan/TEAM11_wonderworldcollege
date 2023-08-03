@US11
Feature: As a user, I want a "Complaints" section on the website where I can submit my requests and complaints.

  Background: Goes to wonder world college page
    Given The user goes to the "url" address

  @TC1_US11
  Scenario: It should be verified that there is a "Complain" heading and icon visible in the footer of the homepage.

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    Then Verifies that the Comlain heading in the user footer is visible
    Then Verifies that the Comlain icon in the user footer is visible
    And User closes the page

  @TC2_US11
  Scenario: When clicking on the "Complain" heading and icon in the footer of the homepage, it should redirect to the relevant page.

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain heading in the footer section
    Then The user verifies that he or she was redirected to the complain page that the title is Complain
    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    Then The user verifies that he or she was redirected to the complain page that the title is Complain
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
    When The user waits 1 seconds
    When The user enters correct data in Description textbox on complain page
    When The user clicks submit button on complain page
    When The user waits 1 seconds
    Then The user verifies that the request was sent with the confirmation message
    And User closes the page

  @TC4_US11_01
  Scenario:

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    When The user leaves name textbox on complain page blank
    When The user enters correct data in Email textbox on complain page
    When The user enters correct data in Contact No. textbox on complain page
    When The user enters correct data in Description textbox on complain page
    When The user clicks submit button on complain page
    When The user waits 1 seconds
    Then The user confirms with the incoming message that the name textbox should not be left blank
    And User closes the page

  @TC4_US11_02
  Scenario:

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    When The user enters two character name in name textbox on complain page
    When The user enters correct data in Email textbox on complain page
    When The user enters correct data in Contact No. textbox on complain page
    When The user enters correct data in Description textbox on complain page
    When The user clicks submit button on complain page
    When The user waits 1 seconds
    Then The user verifies that no less than six characters can be entered in the name textbox with the incoming message
    And User closes the page

  @TC4_US11_03
  Scenario:

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    When The user enters correct data in Name textbox on complain page
    When The user leaves email textbox on complain page blank
    When The user enters correct data in Contact No. textbox on complain page
    When The user enters correct data in Description textbox on complain page
    When The user clicks submit button on complain page
    When The user waits 1 seconds
    Then The user confirms that the email textbox should not be left blank with the incoming message
    And User closes the page

  @TC4_US11_04
  Scenario:

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    When The user enters correct data in Name textbox on complain page
    When The user enters email without @ in the email textbox on the complain pagee
    When The user enters correct data in Contact No. textbox on complain page
    When The user enters correct data in Description textbox on complain page
    When The user clicks submit button on complain page
    When The user waits 1 seconds
    Then The user verifies that email without @ cannot be written in email textbox with incoming message
    And User closes the page

  @TC4_US11_05
  Scenario:

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    When The user enters correct data in Name textbox on complain page
    When The user enters email without .com in email textbox on complain page
    When The user enters correct data in Contact No. textbox on complain page
    When The user enters correct data in Description textbox on complain page
    When The user clicks submit button on complain page
    When The user waits 1 seconds
    Then The user verifies that email cannot be written without typing .com in the email textbox with the incoming message
    And User closes the page

  @TC4_US11_06
  Scenario:

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    When The user enters correct data in Name textbox on complain page
    When The user enters correct data in Email textbox on complain page
    When The user leaves contact no. textbox on complain page blank
    When The user enters correct data in Description textbox on complain page
    When The user clicks submit button on complain page
    When The user waits 1 seconds
    Then The user confirms with the incoming message that the Contact No. textbox should not be left blank
    And User closes the page

  @TC4_US11_07
  Scenario:

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    When The user enters correct data in Name textbox on complain page
    When The user enters correct data in Email textbox on complain page
    When The user enters word in contact no textbox on complain page
    When The user enters correct data in Description textbox on complain page
    When The user clicks submit button on complain page
    When The user waits 1 seconds
    Then The user contact No. with incoming message. Verifies that letters cannot be entered in the textbox
    And User closes the page

  @TC4_US11_08
  Scenario:

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    When The user enters correct data in Name textbox on complain page
    When The user enters correct data in Email textbox on complain page
    When The User enters negative number in contact no textbox on complain page
    When The user enters correct data in Description textbox on complain page
    When The user clicks submit button on complain page
    When The user waits 1 seconds
    Then The user confirms that negative numbers cannot be entered in the contact no textbox with the incoming message
    And User closes the page

  @TC4_US11_09
  Scenario:

    When The user descends to the footer section of the page
    When The user waits 1 seconds
    When The user clicks on the Complain icon in the footer section
    When The user enters correct data in Name textbox on complain page
    When The user enters correct data in Email textbox on complain page
    When The User enters special character in contact no textbox on complain page
    When The user enters correct data in Description textbox on complain page
    When The user clicks submit button on complain page
    When The user waits 1 seconds
    Then The user confirms that special character cannot be entered in the contact no textbox with the incoming message
    And User closes the page