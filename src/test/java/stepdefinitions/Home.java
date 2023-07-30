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

    Actions actions = new Actions(driver);

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


    /////////us09///////////
    @When("Click on the Contact menu title on the home page top bar")
    public void click_on_the_contact_menu_title_on_the_home_page_top_bar() {
        homePage.contactLink_header.click();

    }

    @Then("It is tested that the contact page is redirected")
    public void redirects_to_contact_page() {
        Assert.assertTrue(homePage.contactLink_pageTitle.isDisplayed());
    }


        @Then("In the Send In Your Query section Name Email Subject Description textBoxes is confirmed to be visible")
        public void in_the_send_in_your_query_section_name_email_subject_description_text_boxes_is_confirmed_to_be_visible() {
           Assert.assertTrue(homePage.contactLink_Name.isDisplayed());
           Assert.assertTrue(homePage.contactLink_Email.isDisplayed());
           Assert.assertTrue(homePage.contactLink_Subject.isDisplayed());
           Assert.assertTrue(homePage.contactLink_Description.isDisplayed());


        }
        @Then("Name, Email, Subject, Description textBoxes It is verified that data can be entered")
        public void name_email_subject_description_text_boxes_it_is_verified_that_data_can_be_entered() {

        homePage.contactLink_Name.sendKeys("");
        homePage.contactLink_Email.sendKeys("");
        homePage.contactLink_Subject.sendKeys("");
        homePage.contactLink_Description.sendKeys("");
        }
    @Then("Clicking the Submit button confirms that the query has been submitted")
    public void clicking_the_submit_button_confirms_that_the_query_has_been_submitted() {
        homePage.contactLink_Submit.click();

        //ReusableMethods.bekle(60);
      // Assert.assertTrue(homePage.contactLink_Alert.isDisplayed());
        //ReusableMethods.bekle(60);

    }
    @Then("On the Contact page, Our Location, Call Us,Verify that Working Hours information is visible")
    public void on_the_contact_page_our_location_call_us_verify_that_working_hours_information_is_visible() {
     Assert.assertTrue( homePage.contactlink_OurLocation.isDisplayed());
     Assert.assertTrue(homePage.contactlink_CallUs.isDisplayed());
     Assert.assertTrue(homePage.contactLink_WorkingHours.isDisplayed());

    }





}
