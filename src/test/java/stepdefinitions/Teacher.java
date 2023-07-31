package stepdefinitions;

<<<<<<< HEAD
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
=======
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
>>>>>>> Dogan
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

<<<<<<< HEAD
import java.util.List;

public class Teacher {
    WebDriver driver = Driver.getDriver();

    TeacherPage tpage=new TeacherPage();
    /*US_37 Teacher*/
    @Given("login_teacher {string} {string}")
    public void human_resource(String mail,String password)
    {
        Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
        tpage.TeacherLogin.click();
        ReusableMethods.bekle(1);
        System.out.println(driver.getTitle());
        ReusableMethods.switchToWindow("Login : Wonder World College");
        WebElement usertext = tpage.Teacher_UserNameTextbox;
        usertext.click();
        usertext.sendKeys(mail);
        tpage.Teacher_PasswordTextbox.click();
        tpage.Teacher_PasswordTextbox.sendKeys(password);
        tpage.Teacher_Login_Button.click();
        ReusableMethods.switchToWindow("Wonder World College");
        tpage.human_resource.click();
        tpage.human_resource_applyleave.click();
        ReusableMethods.bekle(2);
        tpage.human_resource_applyleave_button.click();
        ReusableMethods.bekle(2);
        tpage.LeaveFromDate.click();
        tpage.LeaveFromDate_9.click();
        tpage.LeaveToDate.click();
        tpage.LeaveToDate_10.click();
        tpage.Reason.click();
        tpage.Reason.sendKeys("Hamza");
        ReusableMethods.bekle(2);
        tpage.submit.click();
        ReusableMethods.bekle(1);
        System.out.println(tpage.error.getText());

    }
    /* US_41 Teacher*/
    @Given("User goes to url")
    public void user_goes_to_url()
    {
        Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
    }
    @Then("{string} {string} login teacher")
    public void email_password(String email,String sifre)
    {
        tpage.Teacher_Button.click();
        ReusableMethods.bekle(1);
        System.out.println(driver.getTitle());
        ReusableMethods.switchToWindow("Login : Wonder World College");
        WebElement usertext = tpage.Teacher_UserNameTextbox;
        usertext.click();
        usertext.sendKeys(email);
        tpage.Teacher_PasswordTextbox.click();
        tpage.Teacher_PasswordTextbox.sendKeys(sifre);
        tpage.Teacher_Login_Button.click();
    }
    @Then("Quicks Links text and Quicks Links icon should be visible on the sidebar on the teacher panel.")
    public void quicks_link()
    {
        ReusableMethods.switchToWindow("Wonder World College");
        tpage.Teacher_Quick_Links.click();
        List<WebElement> cardSidebarElements = driver.findElements(By.className("card-sidebar"));
        int limit = Math.min(cardSidebarElements.size(), 10);
        for (int i = 0; i < limit; i++) {
            WebElement element = cardSidebarElements.get(i);
            String[] terms = element.getText().split("\\s+"); // Boşluklara göre veriyi böler
            if (terms.length > 0) {
                System.out.println(terms[0]); // Sadece ilk terimi yazdırır
            }
        }
    }


    @And("Page Closed")
    public void close()
    {
        Driver.closeDriver();
    }
=======
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Teacher {
    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    TeacherPage teacherPage = new TeacherPage();
    Actions actions = new Actions(driver);


    //------------------------US32--------------------------------------
/*





    Daha sonra kullanıcı açılan sayfanın url'sinin "examGroupUrl" olduğunu doğrular.
    Ardından Kullanıcı, ad metin kutusunu doğrular
    Ardından Kullanıcı, Muayene Türü açılır menüsünü doğrular
    Sonra Kullanıcı Açıklamayı Doğrular metin kutusu
    Ardından Kullanıcı, Kaydet düğmesinin görünür olduğunu doğrular.
    Ve Kullanıcı sayfayı kapatır"
 */
    @When("The user clicks on the teacher login tab")
    public void the_user_clicks_on_the_teacher_login_tab() {
        loginPage.teacherLoginButton.click();
    }

    @When("The user teacher clicks the Exam Group page link under the Examination menu title in the sidebar on the panel")
    public void the_user_teacher_clicks_the_exam_group_page_link_under_the_examination_menu_title_in_the_sidebar_on_the_panel() {
        teacherPage.examinationsLink.click();
        teacherPage.examGroupLink.click();
    }

    @Then("The user verifies that the url of the opened page is {string}.")
    public void the_user_verifies_that_the_url_of_the_opened_page_is(String examGroupUrl) {

        String expectedUrl = ConfigReader.getProperty(examGroupUrl);
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @Then("User verifies name textbox")
    public void user_verifies_name_textbox() {
        assertTrue(teacherPage.nameBox_examGroup.isDisplayed());

    }

    @Then("User verifies Exam Type dropdown menu")
    public void user_verifies_exam_type_dropdown_menu() {
        assertTrue(teacherPage.ExamTypeDropdown_examGroup.isDisplayed());
    }

    @Then("User Verifies Description textbox")
    public void user_verifies_description_textbox() {
        assertTrue(teacherPage.descriptionBox_examGroup.isDisplayed());
    }

    @Then("User verifies that the Save button is visible.")
    public void user_verifies_that_the_save_button_is_visible() {
        assertTrue(teacherPage.saveButton_examGroup.isDisplayed());
    }

    @When("The user enters {string} in NameBox")
    public void the_user_enters_in_name_box(String name) {
        teacherPage.nameBox_examGroup.sendKeys(ConfigReader.getProperty(name));
    }

    @When("The user selects the relevant field from the Exam Type dropdown menu.")
    public void the_user_selects_the_relevant_field_from_the_exam_type_dropdown_menu() {
        Select select = new Select(teacherPage.ExamTypeDropdown_examGroup);
        select.selectByIndex(2);
    }

    @When("Adds {string} to User DescriptionBox")
    public void adds_to_user_description_box(String examInfo) {
        teacherPage.descriptionBox_examGroup.sendKeys(ConfigReader.getProperty(examInfo));
    }

    @When("The user presses the Save button")
    public void the_user_presses_the_save_button() {
        teacherPage.saveButton_examGroup.click();
    }

    @Then("The user verifies that the text Record Saved Successfully has been seen.")
    public void the_user_verifies_that_the_text_record_saved_successfully_has_been_seen() {
        String expectedResult = "Record Saved Successfully";
        String actualResult = teacherPage.recordSavedSuccessfulyText.getText();
        assertEquals(expectedResult, actualResult);

    }

    @Then("The user Type {string} in the Search... box under User Exam Group List.")
    public void the_user_type_in_the_search_box_under_user_exam_group_list(String name) {
        teacherPage.searchBox_examGroupList.sendKeys(ConfigReader.getProperty(name));
        ReusableMethods.bekle(1);
    }

    @Then("The user verifies that the added {string} is seen in the list")
    public void the_user_verifies_that_the_added_is_seen_in_the_list(String name) {
        String expectedResult = ConfigReader.getProperty(name);
        String actualResult = teacherPage.nameFirstBox_examGroupList.getText();
        assertEquals(expectedResult, actualResult);
    }

    @Then("The user verifies that Name appears under Exam Group List")
    public void the_user_verifies_that_name_appears_under_exam_group_list() {
        ReusableMethods.bekle(1);
        assertTrue(teacherPage.nameText_examGroupList.isDisplayed());
    }

    @Then("The user verifies that No Of Exams appears under Exam Group List")
    public void the_user_verifies_that_no_of_exams_appears_under_exam_group_list() {
        assertTrue(teacherPage.noOfExamText_examGroupList.isDisplayed());
    }

    @Then("The user verifies that under Exam Group List , the title Exam Type appears")
    public void the_userr_verifies_that_under_exam_group_list_the_title_exam_type_appears() {
        assertTrue(teacherPage.examTypeText_examGroupList.isDisplayed());
    }

    @Then("The user verifies that the title Action appears under Exam Group List")
    public void the_user_verifies_that_the_title_action_appears_under_exam_group_list() {
        assertTrue(teacherPage.actionText_examGroupList.isDisplayed());
    }

    @Then("The user user clicks the + icon under the Action heading")
    public void the_user_user_clicks_the_icon_under_the_action_heading() {
        teacherPage.plusButton_Action_examGroupList.click();
        ReusableMethods.bekle(3);
    }

    @Then("The user, It is verified that the user redirected page is the add exam page")
    public void the_user_it_is_verified_that_the_user_redirected_page_is_the_add_exam_page() {
        assertTrue(teacherPage.examListTitle_inPlusButton_examGroupList.isDisplayed());
    }

    @Then("The user confirms that their page has been updated when they click the edit icon under the Action heading")
    public void theUserConfirmsThatTheirPageHasBeenUpdatedWhenTheyClickTheEditIconUnderTheActionHeading() {
        String expectedTitle=driver.getTitle();
        teacherPage.editButton_Action_examGroupList.click();
        String actualTitle=driver.getTitle();

        assertEquals(expectedTitle,actualTitle);

    }


    //--------------------------------------------------------------
>>>>>>> Dogan
}
