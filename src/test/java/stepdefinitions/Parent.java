package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;
import pages.ParentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class Parent {
    WebDriver driver = Driver.getDriver();
    ParentPage parentPage =new ParentPage();
    LoginPage loginPage=new LoginPage();


    /*US_53 Parent*/
    @Given("The user should be able to enter username and password in the relevant box")
    public void parent_button()
    {
        System.out.println("--------------------------");
        Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
        parentPage.parent_button.click();
        System.out.println(parentPage.parent_button.isDisplayed());
        ReusableMethods.bekle(2);
        ReusableMethods.switchToWindow("Login : Wonder World College");
        WebElement usertextbox = parentPage.parent_usernametextbox;
        System.out.println(usertextbox.isDisplayed());
        usertextbox.click();
        usertextbox.sendKeys("dasda");
        WebElement passwordtextbox = parentPage.parent_passwordtextbox;
        System.out.println(passwordtextbox.isDisplayed());
        passwordtextbox.click();
        passwordtextbox.sendKeys("1231241243");
        parentPage.submit.click();

    }
    @Then("If the user logs in with the wrong data, they should see the warning message The username or password incorrect")
    public void US_53_02()
    {
        System.out.println(parentPage.Invalid_Username_Or_Password.isDisplayed());
        ReusableMethods.bekle(2);
        parentPage.forgotpassword.click();
        ReusableMethods.switchToWindow("Wonder World College");
        System.out.println(parentPage.forgotpasswordpage.isDisplayed());
        System.out.println(parentPage.forgotpasswordpage.getText());
    }
    @And("Page Closed US_53")
    public void close()
    {
        Driver.closeDriver();
    }



    @When("User clicks parent login button")
    public void userClicksParentLoginButton() {
        loginPage.parentLoginButton.click();

    }
   @Then("User enters the email and password and clicks the Login Button")
    public void userEntersTheEmailAndPasswordAndClicksTheLoginButton() {

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
       loginPage.adminLoginUsernameTextbox.sendKeys(ConfigReader.getProperty("parentUsername_kbr"));
        loginPage.adminLoginPasswordTextbox.sendKeys(ConfigReader.getProperty("password_kbr"));
        loginPage.parentLoginSignInButton.click();
    }




    @When("User must have an access to Change Username button from Profile Picture")
    public void userMustHaveAnAccessToChangeUsernameButtonFromProfilePicture() {
        parentPage.imageClick.click();
        String expected="Change Username";
        String actual=parentPage.changePassword.getText();
        Assert.assertEquals(expected,actual);
    }

// ########################################### US_50 ###################################################

    @Given("The user opens the Browser.")
    public void the_user_opens_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User goes to Url.")
    public void user_goes_to_url() {

    }
    @Then("User clicks Parent Login button on Wonder world college page.")
    public void user_clicks_parent_login_button_on_wonder_world_college_page() {

    }
    @Then("User enters valid username in Username textbox on User Login page.")
    public void user_enters_valid_username_in_username_textbox_on_user_login_page() {

    }
    @Then("User enters valid password in Password textbox on User Login page.")
    public void user_enters_valid_password_in_password_textbox_on_user_login_page() {

    }
    @Then("The user clicks the Sign In button.")
    public void the_user_clicks_the_sign_ın_button() {

    }
    @Then("The user clicks on the {string} link in the Sidebar of the panel.")
    public void the_user_clicks_on_the_link_in_the_sidebar_of_the_panel(String string) {

    }
    @Then("The user is verified that the text {string} is displayed on the page that opens")
    public void the_user_is_verified_that_the_text_is_displayed_on_the_page_that_opens(String string) {

    }


}
