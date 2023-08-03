package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.StudentPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

import static org.junit.Assert.assertTrue;

public class Student {

    WebDriver driver= Driver.getDriver();

    StudentPage studentPage = new StudentPage();

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    //VVVVVVVVVVVVVVVV  US016 VVVVVVVVVVVVVVVVVVV

    @Then("The user verifies that they can log in to their panels by enterin their \\(previously registered) information.")
    public void the_user_verifies_that_they_can_log_in_to_their_panels_by_enterin_their_previously_registered_information() {
        assertTrue(studentPage.userStudentDashboardPage.isDisplayed());
    }


    //=======================US_47==============================
    @Then("The user verifies that they are on the student panel")
    public void theUserVerifiesThatTheyAreOnTheStudentPanel() {
        assertTrue(studentPage.studentUserPage.isDisplayed());
    }

    @When("The user clicks on the Homework button link on student panel")
    public void theUserClicksOnTheHomeworkButtonLinkOnStudentPanel() {
        studentPage.homeworkButton.click();
    }

    @Then("The user verifies that, on the homework page, column fields in the Upcoming Homework segment are visible.")
    public void theUserVerifiesThatOnTheHomeworkPageColumnFieldsInTheUpcomingHomeworkSegmentAreVisible() {
        assertTrue(studentPage.homeworkPage.isDisplayed());
    }

    //=====================================================

    //=======================US_44==============================

    @When("The user clicks Student Login button on wonder world college page")
    public void the_user_clicks_student_login_button_on_wonder_world_college_page() {
        loginPage.studentLoginButton.click();
    }
    @When("The user enters valid username in Username textbox on User Login page")
    public void the_user_enters_valid_username_in_username_textbox_on_user_login_page() {

        String firstWhd=Driver.getDriver().getWindowHandle();
        String secondWhd="";
        Set<String> whd = Driver.getDriver().getWindowHandles();
        for (String each:whd
             ) {
            if (!each.equals(firstWhd)) {
                secondWhd=each;
            }
        }

        Driver.getDriver().switchTo().window(secondWhd);

        loginPage.userLoginUsernameTextbox.sendKeys(ConfigReader.getProperty("studentUsername_dln"));
    }
    @When("The user enters valid password in Password textbox on User Login page")
    public void the_user_enters_valid_password_in_password_textbox_on_user_login_page() {
        loginPage.userLoginPasswordTextbox.sendKeys(ConfigReader.getProperty("adminPassword_dln"));
    }
    @When("The user clicks profile image on the opened page")
    public void the_user_clicks_profile_image_on_the_opened_page() {
        studentPage.studentLoginProfileImage.click();
    }
    @Then("The user verifies that the Change Password button is accessed in the drop-down menu")
    public void the_user_verifies_that_the_change_password_button_is_accessed_in_the_drop_down_menu() {
        assertTrue(studentPage.studentLoginProfileImageChangePasswordLink.isDisplayed());
    }

    @When("The user clicks the Change Password button in the drop-down menu")
    public void the_user_clicks_the_change_password_button_in_the_drop_down_menu() {
        studentPage.studentLoginProfileImageChangePasswordLink.click();
    }
    @Then("The user confirms that she wrote the Change Password on the page that opens")
    public void the_user_confirms_that_she_wrote_the_change_password_on_the_page_that_opens() {
        assertTrue(studentPage.studentLoginProfileImageChangePasswordText.isDisplayed());
    }

    @When("The user types the current password into the Current Password textbox on the Change Password page")
    public void the_user_types_the_current_password_into_the_current_password_textbox_on_the_change_password_page() {
        studentPage.studentLoginChangePasswordCurrentPasswordTextbox.sendKeys(ConfigReader.getProperty("adminPassword_dln"));
    }
    @When("The user retypes the newly created password in the Confirm Password textbox on the Change Password page")
    public void the_user_retypes_the_newly_created_password_in_the_confirm_password_textbox_on_the_change_password_page() {
        studentPage.studentLoginChangePasswordConfirmPasswordTextbox.sendKeys(ConfigReader.getProperty("studentWrongNewPassword_dln"));
    }
    @When("The user clicks save button on Change Password page")
    public void the_user_clicks_save_button_on_change_password_page() {
        studentPage.studentLoginChangePasswordSaveButton.click();
    }
    @Then("The user verifies that the password is invalid message is received because the wrong password combination was entered")
    public void the_user_verifies_that_the_password_is_invalid_message_is_received_because_the_wrong_password_combination_was_entered() {
        String expectedMessage=ConfigReader.getProperty("studentChangePasswordWrongNewPasswordMessage");
        String actual=studentPage.studentLoginChangePasswordPage.getText();
        assertTrue(actual.contains(expectedMessage));
    }

    @When("The user types a new password in the New Password textbox on the Change Password page, with less than six characters, a wrong password combination that does not contain uppercase letters and special characters")
    public void theUserTypesANewPasswordInTheNewPasswordTextboxOnTheChangePasswordPageWithLessThanSixCharactersAWrongPasswordCombinationThatDoesNotContainUppercaseLettersAndSpecialCharacters() {
        studentPage.studentLoginChangePasswordNewPasswordTextbox.sendKeys(ConfigReader.getProperty("studentWrongNewPassword_dln"));
    }

    @When("The user types a new password in the New Password textbox on the Change Password page, not less than six characters, with the correct password combination containing uppercase letters and one special character")
    public void the_user_types_a_new_password_in_the_new_password_textbox_on_the_change_password_page_not_less_than_six_characters_with_the_correct_password_combination_containing_uppercase_letters_and_one_special_character() {
        studentPage.studentLoginChangePasswordNewPasswordTextbox.sendKeys(ConfigReader.getProperty("studentCorrectNewPassword"));
    }
    @When("The user correctly retypes the newly created password into the Confirm Password textbox on the Change Password page")
    public void the_user_correctly_retypes_the_newly_created_password_into_the_confirm_password_textbox_on_the_change_password_page() {
        studentPage.studentLoginChangePasswordConfirmPasswordTextbox.sendKeys(ConfigReader.getProperty("studentCorrectNewPassword"));
    }
    @Then("The user verifies that the password has been changed successfully message has been received because the correct password combination has been entered")
    public void the_user_verifies_that_the_password_has_been_changed_successfully_message_has_been_received_because_the_correct_password_combination_has_been_entered() {
       String expectedMessage=ConfigReader.getProperty("studentChangePasswordCorrectNewPasswordMessage");
        String actual= studentPage.studentLoginChangePasswordPage.getText();
        assertTrue(actual.contains(expectedMessage));
    }



    //=====================================================
}
