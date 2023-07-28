package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Home {

    HomePage homePage = new HomePage();

    WebDriver driver = Driver.getDriver();

   Actions actions=new Actions(driver);

    //VVVVVVVVVVVVVVVV  US01 VVVVVVVVVVVVVVVVVVV
    @Given("The user goes to the {string} address")
    public void the_user_goes_to_the_address(String url) {
        driver.get(ConfigReader.getProperty(url));
    }

    @Given("It verifies that the logo is visible on the homepage")
    public void it_verifies_that_the_is_visible_on_the_homepage() {
        Assert.assertTrue(homePage.logoCollege_header.isDisplayed());
    }

    @And("User closes the page")
    public void userClosesThePage() {
        Driver.quitDriver();
    }

    //========================US02=============================

    @Given("The user verifies that the {string} is visible in the navbar section")
    public void the_user_verifies_that_the_is_visible_in_the_navbar_section(String mail) {
        String expectedMailAddress = ConfigReader.getProperty(mail);
        String actualMailAdress = homePage.mailInfo_header.getText();
        Assert.assertEquals(expectedMailAddress, actualMailAdress);
    }

    @When("The user goes to the homepage footer section")
    public void the_user_goes_to_the_homepage_footer_section() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);

    }

    @When("The user verifies that the school's phone number information is visible in the footer section")
    public void the_user_verifies_that_the_school_s_phone_number_information_is_visible_in_the_footer_section() {
        Assert.assertTrue(homePage.contactLink_footer.isDisplayed());
    }

    @Then("The user verifies that the school's email address information is visible in the footer section")
    public void the_user_verifies_that_the_school_s_email_address_information_is_visible_in_the_footer_section() {
        Assert.assertTrue(homePage.emailUsLink_footer.isDisplayed());
    }

    @Then("The user verifies that the school's school address information is visible in the footer section")
    public void the_user_verifies_that_the_school_s_school_address_information_is_visible_in_the_footer_section() {
        Assert.assertTrue(homePage.addressLink_footer.isDisplayed());
    }

    //VVVVVVVVVVVVVVVV  US016 VVVVVVVVVVVVVVVVVVV

    @Then("The user verifies that, the Login button is visible on the homepage.")
    public void the_user_verifies_that_the_login_button_is_visible_on_the_homepage() {
       Assert.assertTrue(homePage.loginButtonStudentParent.isDisplayed());
    }
    @When("The user clicks on the Login button")
    public void the_user_clicks_on_the_login_button() {
        homePage.loginButtonStudentParent.click();
    }
    @Then("The user verifies that Login button redirects to the userlogin page.")
    public void the_user_verifies_that_login_button_redirects_to_the_page() {

        Assert.assertTrue(homePage.userLoginPageStudentParent.isDisplayed());
    }

    @Then("The user verifies that there are a login window on the left side and information about What's New In Wonder World College on the right side.")
    public void theUserVerifiesThatThereAreALoginWindowOnTheLeftSideAndInformationAboutOnTheRightSide() {
        Assert.assertTrue(homePage.userLoginPageStudentParent.isDisplayed());
        Assert.assertTrue(homePage.whatSNewInWonderWorldCollege.isDisplayed());
    }

    //=====================================================

}
