package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Home {

    HomePage homePage=new HomePage();

    WebDriver driver= Driver.getDriver();

//VVVVVVVVVVVVVVVV  US01 VVVVVVVVVVVVVVVVVVV

    @Given("The user verifies that  {string} is displayed in  the Follow Us section")
    public void the_user_verifies_that_is_displayed_in_the_follow_us_sectionD(String string) {



    }
    @Given("The user verifies that {string} is displayed in the Follow Us section")
    public void the_user_verifies_that_is_displayed_in_the_follow_us_sectionA(String string) {

    }
    @Given("The user verifies that  {string} is displayed in the Follow Us section")
    public void the_user_verifies_that_is_displayed_in_the_follow_us_sectionS(String string) {

    }
    @Given("The user verifies that {string} is dispalyed in the Follow Us section")
    public void the_user_verifies_that_is_dispalyed_in_the_follow_us_section(String string) {

    }
    @Given("The user verifies that {string} is redirected to itself")
    public void the_user_verifies_that_is_redirected_to_itself(String string) {

    }



}
