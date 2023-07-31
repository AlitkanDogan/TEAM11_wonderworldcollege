package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import pages.HomePage;
import pages.ParentPage;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Home {

    WebDriver driver= Driver.getDriver();
    HomePage page=new HomePage();

//VVVVVVVVVVVVVVVV  US01 VVVVVVVVVVVVVVVVVVV
    @Given("The user goes to the {string} address")
    public void the_user_goes_to_the_address(String url) {
        driver.get(ConfigReader.getProperty(url));

    }

    @Given("It verifies that the logo is visible on the homepage")
    public void it_verifies_that_the_is_visible_on_the_homepage() {

    }


    //=====================================================



    /* US_17 Hamza */
    @Given("user goes to wonderworldcollege homepage")
    public void user_homepage_url()
    {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("user clicks on academic dropdown")
    public void user_dropdownmenu()
    {
        page.Academics_DropDown.click();
    }
    @Then("user clicks on teacher in dropdown")
    public void user_dropdownmenu_teacher_click()
    {
        ReusableMethods.bekle(2);
        page.Academics_DropDown_Teacher.click();
        List<WebElement> staffteamimgElements = driver.findElements(By.className("staffteamimg"));
        int count = staffteamimgElements.size();
        System.out.println("Number of staffteamimg elements: " + count);
        WebElement lastname= page.HomePage_Teacher_Lastname;
        Assert.assertTrue("Lastname İs Disabled", lastname.isDisplayed());
        WebElement branch= page.HomePage_Teacher_branch;
        Assert.assertTrue("Branch İs Disabled", branch.isDisplayed());

    }
    @And("Page Closed US_17")
    public void close()
    {
        Driver.closeDriver();
    }
}
