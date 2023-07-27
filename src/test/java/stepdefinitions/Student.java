package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.StudentPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Student {

    WebDriver driver= Driver.getDriver();

    StudentPage studentPage = new StudentPage();

    //VVVVVVVVVVVVVVVV  US01 VVVVVVVVVVVVVVVVVVV
    @Given("Given The user  navigates to the {string}")
    public void givenTheUserNavigatesToThe(String url) {

        driver.get(ConfigReader.getProperty(url));
    }


    @When("on the homepage, the Login button should be visible and functional.")
    public void on_the_homepage_the_login_button_should_be_visible_and_functional() {
        Assert.assertTrue(studentPage.loginButtonStudent.isDisplayed());

    }
    @When("the user clicks on the Login button")
    public void the_user_clicks_on_the_login_button() {
        studentPage.loginButtonStudent.click();
    }
    @Then("the user should be redirected to the \"\"userlogin\" page.")
    public void the_user_should_be_redirected_to_the_userlogin_page() {

        Assert.assertTrue(studentPage.userLoginPage.isDisplayed());
    }




    //=====================================================
}
