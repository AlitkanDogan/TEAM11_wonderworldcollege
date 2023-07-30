@US25
  Feature:As an administrator (admin), I would like to be able to view and update the fees so that I can keep the school fees up to date.

    @TC1_US25
    Scenario:
      Given The user goes to the "loginUrl" address
      When Admin clicks the login button
      Then user enters "<email>" as email
      Then Enters "<password>" as password
      Then Enters the Feemaster page
      When A searchBox appears to search through the Fees Master List
      And User closes the page


      Examples:
        | email                                    | password     |
        |kubra.tankisi@admin.wonderworldcollege.com|wonderworld123|