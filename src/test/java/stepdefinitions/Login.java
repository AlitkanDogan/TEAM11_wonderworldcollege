package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class Login {

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    WebDriver driver = Driver.getDriver();

    Actions actions=new Actions(driver);

    //VVVVVVVVVVVVVVVV  US016 VVVVVVVVVVVVVVVVVVV

    @Then("The user verifies that, the Login button is visible on the homepage.")
    public void the_user_verifies_that_the_login_button_is_visible_on_the_homepage() {
        Assert.assertTrue(loginPage.loginButtonStudentParent.isDisplayed());
    }
    @When("The user clicks on the Login button")
    public void the_user_clicks_on_the_login_button() {
        loginPage.loginButtonStudentParent.click();
    }
    @Then("The user verifies that Login button redirects to the userlogin page.")
    public void the_user_verifies_that_login_button_redirects_to_the_page() {

        Assert.assertTrue(loginPage.userLoginPageStudentParent.isDisplayed());
    }

    @Then("The user verifies that there are a login window on the left side and information about What's New In Wonder World College on the right side.")
    public void theUserVerifiesThatThereAreALoginWindowOnTheLeftSideAndInformationAboutOnTheRightSide() {
        Assert.assertTrue(loginPage.userLoginPageStudentParent.isDisplayed());
        Assert.assertTrue(loginPage.whatsNewInWonderWorldCollege.isDisplayed());
    }

    @When("The user enters their {string} in to the username textbox")
    public void the_user_enters_their_username_in_to_the_username_textbox(String username) {
        loginPage.userNameTextbox.sendKeys(ConfigReader.getProperty(username));
    }
    @When("The user enters their {string} in to the password textbox")
    public void the_user_enters_their_password_in_to_the_password_textbox(String password) {
        loginPage.passwordTextbox.sendKeys(ConfigReader.getProperty(password));
    }
    @When("The user clicks on the Sign In button")
    public void the_user_clicks_on_the_sign_in_button() {

        loginPage.signInButtonUserLogin.click();
    }


    @And("The user enters incorrect username in to the username textbox")
    public void theUserEntersIncorrectUsernameInToTheUsernameTextbox() {
        loginPage.userNameTextbox.sendKeys("fatma");
    }

    @And("The user enters incorrect password in to the password textbox")
    public void theUserEntersIncorrectPasswordInToThePasswordTextbox() {
        loginPage.passwordTextbox.sendKeys("fatma");
    }

    @Then("The user verifies that they can not log in in to their panels if they enter incorrect, missing, or unregistered information.\"")
    public void theUserVerifiesThatTheyCanNotLogInInToTheirPanelsIfTheyEnterIncorrectMissingOrUnregisteredInformation(){
        Assert.assertTrue(loginPage.invalidUsernameOrPasswordAlert.isDisplayed());
    }

    @And("The user clicks on forgot password link")
    public void theUserClicksOnForgetPasswordLink() {
        loginPage.forgotPasswordLinkStudentParent.click();
    }

    @Then("The user verifies that the forgot password link redirects to the ufpassword page.")
    public void theUserVerifiesThatTheForgetPasswordLinkRedirectsToTheUfpasswordPage() {
        Assert.assertTrue(loginPage.ufPasswordPageStudentParent.isDisplayed());
    }

    @Then("The user verifies that they can enter their email addresses in the relavent textbox on the ufpassword page to reset their password and select the appropriate panels.")
    public void theUserVerifiesThatTheyCanEnterTheirEmailAddressesInTheRelaventTextboxOnTheUfpasswordPageToResetTheirPasswordAndSelectTheAppropriatePanels() {
        Assert.assertTrue(loginPage.resetPasswordEmailTextbox.isEnabled());
        Assert.assertTrue(loginPage.resetPasswordEmailRadioButton.isEnabled());
    }

    @And("The user enters their emailadress in to the mailtextbox")
    public void theUserEntersTheirEmailadressInToTheMailtextbox() {
        loginPage.resetPasswordEmailTextbox.sendKeys("fatma.aydin@student.wonderworldcollege.com");
    }

    @And("The user selects the appropriate panel.")
    public void theUserSelectsTheAppropriatePanel() {
        loginPage.resetPasswordEmailRadioButton.click();
    }

    @And("clicks on submit button.")
    public void clicksOnSubmitButton() {
        loginPage.resetEmailSubmitButton.click();
    }

    @Then("the user verifies that they receive 'password reset email.")
    public void theUserVerifiesThatTheyReceivePasswordResetEmail() {
        Assert.assertTrue(loginPage.resetEmailSendingFailAlert.isDisplayed());
    }

    @And("The user verifies that  there is a user login link on the ufpassword page to return to the login page")
    public void theUserVerifiesThatThereIsAUserLoginLinkOnTheUfpasswordPageToReturnToTheLoginPage() {
        Assert.assertTrue(loginPage.ufpasswordPageUserLoginLink.isDisplayed());
    }

    @And("The user clicks on the user login link")
    public void theUserClicksOnTheUserLoginLink() {
        loginPage.ufpasswordPageUserLoginLink.click();
    }

    @Then("The user verifies that the link redirects to the userlogin page.")
    public void theUserVerifiesThatTheLinkRedirectsToTheUserloginPage() {
        Assert.assertTrue(loginPage.userLoginPageStudentParent.isDisplayed());
    }

    @And("The user clicks on the Front Site link")
    public void theUserClicksOnTheFrontSiteLink() {

        loginPage.frontSiteLink.click();
    }

    @Then("The user verifies that the Front Site link redirects to the homepage.")
    public void theUserVerifiesThatTheFrontSiteLinkRedirectsToTheHomepage() {
        Assert.assertTrue(homePage.logoCollege_header.isDisplayed());
    }


    //=====================================================

    //=======================US_19==============================
    @When("The user verifies that they are on the mainLogin page")
    public void the_user_verifies_that_they_are_on_the_mainLogin_page() {
    Assert.assertTrue(loginPage.mainLoginPage.isDisplayed());
    }
    @When("The user clicks on the Admin Login button.")
    public void the_user_clicks_on_the_admin_login_button() {
        loginPage.adminLoginButton.click();
    }

    @Then("The user verifies that they are on the {string} page")
    public void theUserVerifiesThatTheyAreOnThePage(String adminSiteLoginUrl) {
        driver.get(ConfigReader.getProperty(adminSiteLoginUrl));

    }

    @Then("The user switchs to an other new Admin Login page")
    public void theUserNavigatesToAnOtherNewAdminLoginPage() {
        String firstWindowHV= Driver.getDriver().getWindowHandle();
        Set<String> whv=Driver.getDriver().getWindowHandles();
        String secondWHV= "";
        for (String each:whv
             ) {
            if (!each.equals(firstWindowHV)){
                secondWHV=each;
            }

        }
        Driver.getDriver().switchTo().window(secondWHV);

    }

    @When("The user enters their mail address and password to the mailtextbox and passwordtextbox")
    public void the_user_enters_their_mail_address_and_password_to_the_mailtextbox_and_passwordtextbox(){
        loginPage.adminLoginUsernameTextbox.sendKeys("fatma.aydin@admin.wonderworldcollege.com");
        loginPage.adminLoginPasswordTextbox.sendKeys("wonderworld123");
    }


    //=====================================================


    //=======================US_36==============================

    @When("The user clicks on the Teacher Login button.")
    public void the_user_clicks_on_the_teacher_login_button() {
        loginPage.teacherLoginButton.click();
    }

    @When("The user enters their {string} to the mailtextbox")
    public void the_user_enters_their_to_the_mailtextbox(String teacherLoginFatma) {
        loginPage.teacherUsernameTextbox.sendKeys(ConfigReader.getProperty(teacherLoginFatma));
    }
    @When("The user enters their {string} to the passwordtextbox")
    public void the_user_enters_their_to_the_passwordtextbox(String password) {
        loginPage.adminLoginPasswordTextbox.sendKeys(ConfigReader.getProperty(password));
    }

    //=====================================================
}
