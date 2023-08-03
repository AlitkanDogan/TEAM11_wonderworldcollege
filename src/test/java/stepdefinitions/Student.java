package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.StudentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class Student {

    WebDriver driver= Driver.getDriver();

    StudentPage studentPage = new StudentPage();

    HomePage homePage = new HomePage();

    LoginPage loginPage=new LoginPage();

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

    @When("The user clicks on the Homework button link on the student panel")
    public void theUserClicksOnTheHomeworkButtonLinkOnTheStudentPanel() {

        studentPage.homeworkButton.click();
    }

    @Then("The user verifies that, on the homework page, column fields in the Upcoming Homework segment are visible.")
    public void theUserVerifiesThatOnTheHomeworkPageColumnFieldsInTheUpcomingHomeworkSegmentAreVisible() {
        assertTrue(studentPage.homeworkPage.isDisplayed());
    }
    @And("The user clicks on the viewEdit icon in the action column")
    public void theUserClicksOnTheViewEditIconInTheActionColumn() {
        studentPage.homeworkPageViewEditIcon.click();

    }

    @Then("The user verifies that, they are able to access the homework details")
    public void theUserVerifiesThatTheyAreAbleToAccessTheHomeworkDetails() {

        assertTrue(studentPage.homeworkDetailsWindow.isDisplayed());
        assertTrue(studentPage.assignmentMessageTextbox.isEnabled());
    }

    @And("The user enters their messages in to the Assingment message textbox")
    public void theUserEntersTheirMessagesInToTheAssingmentMessageTextbox() {
        studentPage.assignmentMessageTextbox.sendKeys("Hier is my homework");

    }

    @And("the user clicks on the save button")
    public void theUserClicksOnTheSaveButton() {
        studentPage.AssignmentSaveButton.click();


    }

    @Then("The user verifies that they are able to send their messages successfully")
    public void theUserVerifiesThatTheyAreAbleToSendTheirMessagesSuccessfully() {
        assertTrue(studentPage.AssignmentSubmittedAlert.isDisplayed());
    }

    @And("The user clicks on the Closed Homework headline")
    public void theUserClicksOnTheClosedHomeworkHeadline() {

        studentPage.closedHomeworkHeadline.click();
    }

    @Then("The user verifies that, Closed Homework list is visible")
    public void theUserVerifiesThatClosedHomeworkListIsVisible() {

        studentPage.closedHomeworkList.isDisplayed();
    }

    @And("The user clicks on the closedHomeworkViewEdit icon in the action column")
    public void theUserClicksOnTheClosedHomeworkViewEditIconInTheActionColumn() {
        studentPage.closedHomeworkViewEditIcon.click();
    }

    @Then("The user verifies that, they are able to send a message in the Closed Homework segment")
    public void theUserVerifiesThatTheyAreAbleToSendAMessageInTheClosedHomeworkSegment() {

       Assert.assertTrue(studentPage.closedHomeworkSubmittedLabel.isDisplayed());
    }

    @And("The user clicks on the Daily Assignment link button")
    public void theUserClicksOnTheDailyAssignmentLinkButton() {
        studentPage.dailyAssignmentLinkButton.click();

    }

    @Then("The user verifies that they are in the Daily Assignment segment")
    public void theUserVerifiesThatTheyAreInTheDailyAssignmentSegment() {
        studentPage.dailyAssignmentListPage.isDisplayed();

    }

    @And("The user clicks on the New Assignment button")
    public void theUserClicksOnTheNewAssignmentButton() {
        Assert.assertTrue(studentPage.buttonIsDisplayed(false));

    }


    //=====================================================

    //========================== U S _ 0 4 3 ===========================

    @Given("The user clicks on the student login tab")
    public void the_user_clicks_on_the_student_login_tab() {
        loginPage.studentLoginButton.click();
    }

    @Given("The user verifies that username texbox, password texbox and Sign In button are visible on the opened page")
    public void the_user_verifies_that_username_texbox_password_texbox_and_sign_in_button_are_visible_on_the_opened_page() {
        assertTrue(loginPage.userLoginUsernameTextbox.isDisplayed());
        assertTrue(loginPage.passwordTextbox.isDisplayed());
        assertTrue(loginPage.signInButtonUserLogin.isDisplayed());
    }

    @Given("User enters possible wrong {string} or wrong {string} in username texbox and in password textbox")
    public void user_enters_possible_wrong_or_wrong_in_username_texbox_and_in_password_textbox(String userName, String passWord) {
        loginPage.userLoginUsernameTextbox.sendKeys(ConfigReader.getProperty(userName));
        loginPage.passwordTextbox.sendKeys(ConfigReader.getProperty(passWord));
    }

    @Given("The user should receive an error message your password or username invalid")
    public void the_user_should_receive_an_error_message_your_password_or_username_invalid() {
        assertTrue(loginPage.invalidUsernameOrPassword_Text.isDisplayed());
    }

    @Given("The user clicks the Forgot Password link")
    public void the_user_clicks_the_forgot_password_link() {
        loginPage.forgotPasswordLinkStudentParent.click();
        ReusableMethods.bekle(1);
    }

    @Given("The user verifies that the title of the page that opens is Forgot Password")
    public void the_user_verifies_that_the_title_of_the_page_that_opens_is_forgot_password() {
        assertTrue(loginPage.forgotPaswordPageTitle.isDisplayed());
    }

    @When("The user enters the {string} address on the page that opens")
    public void the_user_enters_the_address_on_the_page_that_opens(String userName) {
        loginPage.userNameBox_forgotPasswordPage.sendKeys(ConfigReader.getProperty(userName));
    }

    @When("The user clicks the studebt radioButton")
    public void the_user_clicks_the_studebt_radio_button() {

        ReusableMethods.jseClick(loginPage.studentRadioButton_forgotPasswordPage);

    }

    @When("User clicks on Submit button")
    public void user_clicks_on_submit_button() {
        loginPage.submitButton_forgotPasswordPage.click();

    }


    @Then("The user password change screen will pop up and verify that the 'Email sending failed. Please try again' warning message does not appear")
    public void theUserPasswordChangeScreenWillPopUpAndVerifyThatTheEmailSendingFailedPleaseTryAgainWarningMessageDoesNotAppear() throws Throwable {
        String expectedResult = "Email sending failed. Please try again.";
        String actualResult = loginPage.emailSendingFailedText.getText();
        System.out.println("===================");
        System.out.println(actualResult);
        System.out.println(expectedResult);
        try {
            assertEquals(expectedResult, actualResult, "Can't open new password creation page");
        } finally {
            driver.quit();
        }
    }

    //-------------------------------US_048----------------------------------

    @When("The use clicks Onleine Exam tab")
    public void the_use_clicks_onleine_exam_tab() {
        studentPage.onlineExamLink.click();
        ReusableMethods.bekle(1);
    }

    @Given("The user sees the Upcoming Exam and Closed Exam columns on the page that opens.")
    public void the_user_sees_the_upcoming_exam_and_closed_exam_columns_on_the_page_that_opens() {

        assertTrue(studentPage.upcomingExamsColumns_OnlineExam.isDisplayed());
        assertTrue(studentPage.closedExamColumns_OnlineExam.isDisplayed());
    }

    @Given("The user clicks on the view link of the first exam under the Action column.")
    public void the_user_clicks_on_the_view_link_of_the_first_exam_under_the_action_column() {
        studentPage.eyeImg_view_upcomingExam.click();
        ReusableMethods.bekle(1);
    }

    @Given("The user verifies on the quiz title visible on the page that opens.")
    public void the_user_verifies_on_the_quiz_title_visible_on_the_page_that_opens() {
        assertTrue(studentPage.examTitle_view_upcomingExam.isDisplayed());
    }


    @Given("User clicks on Closed Exam button")
    public void user_clicks_on_closed_exam_button() {
        studentPage.closedExamColumns_OnlineExam.click();
        ReusableMethods.bekle(1);
    }

    @Given("The user verifies the visibility of Exam, Quiz, Date From, Date To, Duration, Total Attempt , Attempted, Status, Action titles on the page")
    public void the_user_verifies_the_visibility_of_exam_quiz_date_from_date_to_duration_total_attempt_attempted_status_action_titles_on_the_page() {
        studentPage.closedExamColumpVisibility();
    }
}
