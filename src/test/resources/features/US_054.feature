@US54

  Feature: As a user, I should be able to change my password from the Parent
    page When entering the Parent Panel

@TC1_US54

    Scenario: The user should have access to the "Change Password" button from the Profile Image.

Given The user goes to the 'url' address
And The user clicks on Parent Login
And The user enters usarname and password and clicks on Sign in
And The user clicks on User image
And The user verifies that  ""Change Password"" button is displayed


  @TC2_US54

  Scenario: Clicking on the "Change Password" button should provide the user with
  access to the relevant page.

  Given The user goes to the 'url' address
  And The user clicks on Parent Login
  And The user enters usarname and password and clicks on Sign in
  And The user clicks on User image
  And The user clicks on ""Change Password"" button
  And The user verifies that access to relevant page"

    @TC3_US54

    Scenario: The user's new password should be at least 6 characters long.

    Given The user goes to the 'url' address
    And The user clicks on Parent Login
    And The user enters usarname and password and clicks on Sign in
    And The user clicks on User image
    And The user clicks on ""Change Password"" button
    And The user verifies that access to relevant page
    And The user enters his Current Password
    And The user enters his New Password that conatins at least 6 characters long
    And The user repeats his password


  @TC4_US54

    Scenario: The user's new password should contain at least
      one uppercase letter and one special character.

  Given The user goes to the 'url' address
  And The user clicks on Parent Login
  And The user enters usarname and password and clicks on Sign in
  And The user clicks on User image
  And The user clicks on ""Change Password"" button
  And The user verifies that access to relevant page
  And The user enters his Current Password
  And The user enters his New Password contain at least one uppercase letter and one special character.
  And The user repeats his password"

    @TC5_54

     Scenario: If the user enters an invalid password combination,
        they should receive an error message indicating that the "password is invalid."

    Given The user goes to the 'url' address
    And The user enters usarname and password and clicks on Sign in
    And The user clicks on User image
    And The user clicks on ""Change Password"" button
    And The user verifies that access to relevant page
    And The user enters an invalid password combination
    Then The user verifies to see  an error message indicating that the password is invalid"

   @TC6_54

     Scenario: If the user enters a valid password combination, they should receive a success message
          stating that their "password has been changed successfully."

   Given The user goes to the 'url' address
   And The user clicks on Parent Login
   And The user enters usarname and password and clicks on Sign in
   And The user clicks on User image
   And The user clicks on ""Change Password"" button
   And The user verifies that access to relevant page
   And The user enters a valid password combination
   And The user verifies to recieve a success message stating that their ""password has been changed successfully.""


