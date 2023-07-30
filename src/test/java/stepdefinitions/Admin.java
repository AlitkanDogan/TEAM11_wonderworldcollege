package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Admin {

    WebDriver driver = Driver.getDriver();
    AdminPage adminPage = new AdminPage();
    LoginPage loginPage = new LoginPage();


    //__________________________US_022________________________________________

    @When("The user clicks on the admin login tab")
    public void the_user_clicks_on_the_admin_login_tab() {
        String WHD = driver.getWindowHandle();
        loginPage.adminLoginButton.click();
    }

    @When("The user navigates to a new page that opens in the browser")
    public void the_user_navigates_to_a_new_page_that_opens_in_the_browser() {
        ReusableMethods.switchToWindow("Login : Wonder World College");
        ReusableMethods.bekle(2);


    }

    @When("The user enters {string} into the username textbox")
    public void the_user_enters_into_the_username_textbox(String adminName) {
        loginPage.adminLoginUsernameTextbox.sendKeys(ConfigReader.getProperty(adminName));

    }

    @When("The user enters {string} into the password textbox")
    public void the_user_enters_admin_password_into_the_password_textbox(String adminPassword) {
        loginPage.adminLoginPasswordTextbox.sendKeys(ConfigReader.getProperty(adminPassword));

    }

    @When("The user clicks the Sign In button and goes to the admin page")
    public void the_user_clicks_the_sign_ın_button_and_goes_to_the_admin_page() {
        loginPage.adminLoginSignInButton.click();
        ReusableMethods.bekle(1);

    }

    @When("The user clicks on the Student Information link in the admin panel's sidebar")
    public void the_user_clicks_on_the_student_ınformation_link_in_the_admin_panel_s_sidebar() {
        adminPage.studentInformationLink.click();
        ReusableMethods.bekle(1);
    }

    @Then("The user verifies that the dropdown menu displays the \"\"Multi Class Student\"\" link")
    public void the_user_verifies_that_the_dropdown_menu_displays_the_multi_class_student_link() {
        ;
        assertTrue(adminPage.multiClassStudentLink.isDisplayed());
    }

    @When("The user clicks on the Multi Class Student link in the opened dropdown menu")
    public void the_user_clicks_on_the_multi_class_student_link_in_the_opened_dropdown_menu() {
        adminPage.multiClassStudentLink.click();
        ReusableMethods.bekle(1);
    }

    @Then("The user verifies that the opened page goes to the {string} address")
    public void the_user_verifies_that_the_opened_page_goes_to_the_address(String string) {
        String expectedUrl = "https://qa.wonderworldcollege.com/student/multiclass";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    /*


     */
    @Then("The user verifies that the Class and Section textboxes are visible on the opened page")
    public void the_user_verifies_that_the_class_and_section_textboxes_are_visible_on_the_opened_page() {
        assertTrue(adminPage.classTextBox_multiClassStudent.isDisplayed());
        assertTrue(adminPage.sectionTextBox_multiClassStudent.isDisplayed());

    }

    @Then("The user clicks on the Class textbox and selects the \"\"Class2\"\" tab from the opened dropdown menu")
    public void the_user_clicks_on_the_class_textbox_and_selects_the_class_tab_from_the_opened_dropdown_menu(Integer int1) {
        adminPage.classTextBox_multiClassStudent.click();
        ReusableMethods.bekle(1);
        adminPage.class2DropDown_ClassTextBox.click();
        ReusableMethods.bekle(1);
    }

    @Then("The user clicks on the Section textbox and selects the \"\"A\"\" tab from the opened dropdown menu")
    public void the_user_clicks_on_the_section_textbox_and_selects_the_a_tab_from_the_opened_dropdown_menu() {
        adminPage.sectionTextBox_multiClassStudent.click();
        ReusableMethods.bekle(1);
        adminPage.A_DropDown_ClassTextBox.click();
        ReusableMethods.bekle(1);
    }

    @When("The user clicks Search button in Multi Class Student page")
    public void theUserClicksSearchButtonInMultiClassStudentPage() {
        adminPage.selectButton_MultiClassStudent.click();
        ReusableMethods.bekle(1);
    }

    @Then("The user confirms that a colored circle is spinning on the user icon or that a color transition is visible at the top of the page, indicating that the search has been performed.")
    public void the_user_confirms_that_a_colored_circle_is_spinning_on_the_user_icon_or_that_a_color_transition_is_visible_at_the_top_of_the_page_indicating_that_the_search_has_been_performed() {

    }


    //_________________________________________________________________________
}
