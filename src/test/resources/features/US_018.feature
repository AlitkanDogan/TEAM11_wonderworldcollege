@US18
Feature: As an administrator (admin), I want an admin panel to be available for performing administrative tasks,
  and I want to be able to log in to the admin panel with registered email and password

  @TC1_US18

  Scenario: It should be verified that the URL used for accessing the school panels is accessible

    Given The user goes to the 'url' address

  @TC2_US18

  Scenario: On the panels page, it should be verified that there is a visible admin login button to enter the admin panel, and when clicked,
  it redirects to the "sitelogin" page.

    Given The user goes to the 'url' address
    And The user clicks to admin login button
    And The user enters admin login page"

  @TC3_US18

  Scenario: On the "sitelogin" page, there should be a login window on the left side and information about
  "What's New In Wonder World College" on the right side.

    Given The user goes to the 'url' address
    And The user clicks to admin login button
    And The user enters admin login page
    And The user sees a login window on the left side and information about "What's New In Wonder World College" on the right side

  @TC4_US18

  Scenario: On the "sitelogin" page, it should be verified that the login window displays "Admin login."

    Given The user goes to the 'url' address
    And The user enters admin login page
    And The user verifies that  the login window displays "Admin login"

  @TC5_US18

  Scenario: On the "sitelogin" page, it should be verified that the Username and Password
  text boxes and the SignIn button are visible and functional

    Given The user goes to the 'url' address
    And The user clicks to admin login button
    And The user enters admin login page
    And The user verifies that the Username and Password text boxes and the SignIn button are visible and functional"

  @TC6_US18

  Scenario: When clicking on the "Forgot password?" link, it should open a page with an email text box and a Submit button,
  and they should be visible and functional

    Given The user goes to the 'url' address
    And The user clicks to admin login button
    And The user enters admin login page
    And The user clicks on  ""Forgot password?"" link
    And The user goes to  a page with an email text box and a Submit button
    And The user verifies that they are visible and functional

  @TC7_US18

  Scenario: On the "Forgot password" page, after entering an email address in the email text box and clicking the Submit button,
  it should be verified that an email is sent to the entered email address.

    Given The user goes to the 'url' address
    And The user clicks to admin login button
    And The user enters admin login page
    And The user clicks on  ""Forgot password?"" link
    And The user enters an email address in the email text box and clicking the Submit button
    And The user verifies that  an email is sent to the entered email address.
    And The user verifies that it is sent to the entered email address."

  @TC8_US18
  Scenario: When clicking on the "Admin Login" link on the "Forgot password" page,
  it should redirect to the "sitelogin" page.

    Given The user goes to the 'url' address
    And The user clicks to admin login button
    And The user enters admin login page
    And The user clicks on  ""Forgot password?"" link
    And The user enters an email address in the email text box and clicking the Submit button
    Then The user verifies that the page is redirect to the ""sitelogin"" page."

  @TC9_US18
  Scenario:When clicking on the "User login" link on the "sitelogin" page,
  it should redirect to the "userlogin" page.

    Given The user goes to the 'url' address
    And The user clicks to admin login button
    And The user enters admin login page
    And The user clicks on  ""Forgot password?"" link
    And The user enters an email address in the email text box and clicking the Submit button
    And The user verifies that the page is redirect to the ""sitelogin"" page.
    Then The user clicks on ""Usr Login"" link and  it redirects to the ""userlogin"" page."

  @TC10_US18
  Scenario: On the "sitelogin" page, there should be a link for returning to the Front Site,
  and when clicked, it should redirect to the homepage (anasayfa).

    Given The user goes to the 'url' address
    And The user clicks to admin login button
    And The user enters admin login page
    And The user clicks on  ""Forgot password?"" link
    And The user enters an email address in the email text box and clicking the Submit button
    And The user verifies that the page is redirect to the ""sitelogin"" page
    And The user clicks on ""Front Site"" and it redirects to the homepage"

  @TC11_US18
  Scenario: On the "sitelogin" page, it should be verified that after entering a system registered email and password in the text boxes and clicking the SignIn button,
  access to the relevant panel is granted.

    Given The user goes to the 'url' address
    And The user clicks to admin login button
    And The user enters admin login page
    And The user clicks on  ""Forgot password?"" link
    And The user enters an email address in the email text box and clicking the Submit button
    And The user verifies that the page is redirect to the ""sitelogin"" page
    And The user enters an valid email and password and clicks on Signin button
    And The user verifies that reachs to th relevant page


  @TC12_US18
  Scenario: On the "sitelogin" page, it should be verified that after entering an email and password that are not registered in the system and clicking the SignIn button,
  access to the panel should not be granted.

    Given The user goes to the 'url' address
    And The user clicks to admin login button
    And The user enters admin login page
    And The user clicks on  ""Forgot password?"" link
    And The user enters an email address in the email text box and clicking the Submit button
    And The user verifies that the page is redirect to the ""sitelogin"" page
    And The user enters an not valid email and password and clicks on Signin button
    And The user verifies if it reachs to the relevant page or no

















