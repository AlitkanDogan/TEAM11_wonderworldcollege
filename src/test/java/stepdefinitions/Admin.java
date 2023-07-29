package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminPage;

public class Admin {

    AdminPage adminPage = new AdminPage();

    @Then("The user verifies that the admin panel s top bar has a visible profile icon")
    public void the_user_verifies_that_the_admin_panel_s_top_bar_has_a_visible_profile_icon() {
        Assert.assertTrue(adminPage.topBarAdminProfileIcon.isDisplayed());
    }
    @Then("The user clicks on the profile icon on the admin panels top bar.")
    public void the_user_clicks_on_the_profile_icon_on_the_admin_panels_top_bar() {
        adminPage.topBarAdminProfileIcon.click();
    }
    @Then("The user verifies that a window opens displaying the account owner's name, role, and links to Profile, Password, and Logout.\"")
    public void the_user_verifies_that_a_window_opens_displaying_the_account_owner_s_name_role_and_links_to_profile_password_and_logout() {
        Assert.assertTrue(adminPage.topBarAccountOwnersName.isDisplayed());
        Assert.assertTrue(adminPage.topBarAccountOwnersRole.isDisplayed());
        Assert.assertTrue(adminPage.topBarAccountOwnersProfileLink.isDisplayed());
        Assert.assertTrue(adminPage.topBarAccountOwnersPassword.isDisplayed());
        Assert.assertTrue(adminPage.topBarAccountOwnersLogout.isDisplayed());
    }

    @When("The user clicks on the profile link")
    public void the_user_clicks_on_the_profile_link() {
        adminPage.topBarAccountOwnersProfileLink.click();
    }
    @When("The user verifies that they are linked to the profile page")
    public void the_user_verifies_that_they_are_linked_to_the_profile_page() {
        Assert.assertTrue(adminPage.adminProfilePageBodyBox.isDisplayed());
    }
    @Then("The user verifies that there are  transitions to the Profile, Payroll, Leaves, Attendance, Documents pages and the General Information, Address Details, Bank Account Details, and Social Media Link information should be displayed.")
    public void the_user_verifies_that_there_are_transitions_to_the_profile_payroll_leaves_attendance_documents_pages_and_the_general_information_address_details_bank_account_details_and_social_media_link_information_should_be_displayed() {
        Assert.assertTrue(adminPage.adminProfilePageProfile.isDisplayed());
        Assert.assertTrue(adminPage.adminProfilePagePayroll.isDisplayed());
        Assert.assertTrue(adminPage.adminProfilePageLeaves.isDisplayed());
        Assert.assertTrue(adminPage.adminProfilePageAttendance.isDisplayed());
        Assert.assertTrue(adminPage.adminProfilePageDocuments.isDisplayed());

        Assert.assertTrue(adminPage.adminProfilePageGeneralInfoWindow.isDisplayed());
        Assert.assertTrue(adminPage.adminProfilePageAddressDetails.isDisplayed());
        Assert.assertTrue(adminPage.adminProfileBankAccountDetails.isDisplayed());
        Assert.assertTrue(adminPage.adminProfileSocialMediaLinkDetails.isDisplayed());

    }

}
