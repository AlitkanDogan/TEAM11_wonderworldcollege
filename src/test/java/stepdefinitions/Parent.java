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



}
