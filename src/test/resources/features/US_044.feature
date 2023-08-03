@US44
Feature: Bir Kullanici olarak Student Panel e giris yaptiktan sonra password u Change Password sayfasindan değiştirebilmeliyim.

  Background: Goes to wonder world college page
    Given The user goes to the "loginUrl" address

  @TC1_US44
  Scenario: The user should have access to the "Change Password" button from the Profile Image.

    When The user clicks Student Login button on wonder world college page
    When The user enters valid username in Username textbox on User Login page
    When The user enters valid password in Password textbox on User Login page
    When The user clicks Sing In buton
    When The user clicks profile image on the opened page
    When The user waits 1 seconds
    Then The user verifies that the Change Password button is accessed in the drop-down menu
    And User closes the page

  @TC2_US44
  Scenario: Clicking on the "Change Password" button should provide the user with access to the relevant page.

    When The user clicks Student Login button on wonder world college page
    When The user enters valid username in Username textbox on User Login page
    When The user enters valid password in Password textbox on User Login page
    When The user clicks Sing In buton
    When The user clicks profile image on the opened page
    When The user clicks the Change Password button in the drop-down menu
    Then The user confirms that she wrote the Change Password on the page that opens
    And User closes the page

  @TC3_US44
  Scenario: "password is invalid." when user enters wrong password combination in new password. should receive the message.

    When The user clicks Student Login button on wonder world college page
    When The user enters valid username in Username textbox on User Login page
    When The user enters valid password in Password textbox on User Login page
    When The user clicks Sing In buton
    When The user clicks profile image on the opened page
    When The user clicks the Change Password button in the drop-down menu
    When The user types the current password into the Current Password textbox on the Change Password page
    When The user types a new password in the New Password textbox on the Change Password page, with less than six characters, a wrong password combination that does not contain uppercase letters and special characters
    When The user retypes the newly created password in the Confirm Password textbox on the Change Password page
    When The user clicks save button on Change Password page
    Then The user verifies that the password is invalid message is received because the wrong password combination was entered
    And User closes the page

  @TC4_US44
  Scenario: When the user enters the correct password combination in the new password, "password has been changed successfully." should receive your message

    When The user clicks Student Login button on wonder world college page
    When The user enters valid username in Username textbox on User Login page
    When The user enters valid password in Password textbox on User Login page
    When The user clicks Sing In buton
    When The user clicks profile image on the opened page
    When The user clicks the Change Password button in the drop-down menu
    When The user types the current password into the Current Password textbox on the Change Password page
    When The user types a new password in the New Password textbox on the Change Password page, not less than six characters, with the correct password combination containing uppercase letters and one special character
    When The user correctly retypes the newly created password into the Confirm Password textbox on the Change Password page
    When The user clicks save button on Change Password page
    Then The user verifies that the password has been changed successfully message has been received because the correct password combination has been entered
    And User closes the page


