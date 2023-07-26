package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;
import utilities.Driver;

public class Home {

    WebDriver driver= Driver.getDriver();

//VVVVVVVVVVVVVVVV  US01 VVVVVVVVVVVVVVVVVVV
    @Given("The user goes to the {string} address")
    public void the_user_goes_to_the_address(String url) {
        driver.get(ConfigReader.getProperty(url));

    }

    @Given("It verifies that the logo is visible on the homepage")
    public void it_verifies_that_the_is_visible_on_the_homepage() {

    }


    //=====================================================

}
