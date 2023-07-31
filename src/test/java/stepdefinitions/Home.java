package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class Home {

    HomePage homePage = new HomePage();

    WebDriver driver = Driver.getDriver();

   Actions actions=new Actions(driver);
   SoftAssert softAssert = new SoftAssert();

   Faker faker = new Faker();

   String expectedTitle="";
   String actualTitle="";
   String expectedConfirmationMessage="";
   String actualConfirmationMessage="";

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


    @Given("The user verifies that the {string} is visible in the navbar section")
    public void the_user_verifies_that_the_is_visible_in_the_navbar_section(String mail) {
        String expectedMailAddress = ConfigReader.getProperty(mail);
        String actualMailAdress = homePage.mailInfo_header.getText();
        assertEquals(expectedMailAddress, actualMailAdress);
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

    // ============================= US_02 =============================
    @Then("The user verifies that the Latest News information in the top bar of the home page is visible in scrolling text")
    public void theUserVerifiesThatTheLatestNewsInformationInTheTopBarOfTheHomePageIsVisibleInScrollingText() {
    }

    @Then("The user verifies that the site logo in the home page top bar is displayed")
    public void the_user_verifies_that_the_site_logo_in_the_home_page_top_bar_is_displayed() {
     //softAssert.assertTrue(homePage.WonderWorldCollegeSiteLogo.isDisplayed());
     homePage.wonderWorldCollegeSiteLogoIsVisible();
    }
    @Then("The user verifies that the Home menu title on the home page top bar is displayed")
    public void the_user_verifies_that_the_home_menu_title_on_the_home_page_top_bar_is_displayed() {
     softAssert.assertTrue(homePage.homeLink_header.isDisplayed());
    }
    @Then("The user verifies that the Online Admission menu title in the top bar of the home page is displayed")
    public void the_user_verifies_that_the_online_admission_menu_title_in_the_top_bar_of_the_home_page_is_displayed() {
     softAssert.assertTrue(homePage.onlineAdmissionLink_header.isDisplayed());
    }
    @Then("The user verifies that the Exam Result menu title in the top bar of the home page is displayed")
    public void the_user_verifies_that_the_exam_result_menu_title_in_the_top_bar_of_the_home_page_is_displayed() {
     softAssert.assertTrue(homePage.examResultLink_header.isDisplayed());
    }
    @Then("The user verifies that the About Us menu title in the top bar of the home page is displayed")
    public void the_user_verifies_that_the_about_us_menu_title_in_the_top_bar_of_the_home_page_is_displayed() {
     softAssert.assertTrue(homePage.aboutUsLink_header.isDisplayed());
    }
    @Then("The user verifies that the Academics menu heading in the top bar of the home page is displayed")
    public void the_user_verifies_that_the_academics_menu_heading_in_the_top_bar_of_the_home_page_is_displayed() {
     softAssert.assertTrue(homePage.academicsLink_header.isDisplayed());
    }
    @Then("The user verifies that the Course menu title in the home page top bar is displayed")
    public void the_user_verifies_that_the_course_menu_title_in_the_home_page_top_bar_is_displayed() {
     softAssert.assertTrue(homePage.courseLink_header.isDisplayed());
    }
    @Then("The user verifies that the Gallery menu title in the home page top bar is displayed")
    public void the_user_verifies_that_the_gallery_menu_title_in_the_home_page_top_bar_is_displayed() {
     softAssert.assertTrue(homePage.gelleryLink_header.isDisplayed());
    }
    @Then("The user verifies that the News menu title in the top bar of the home page is displayed")
    public void the_user_verifies_that_the_news_menu_title_in_the_top_bar_of_the_home_page_is_displayed() {
     softAssert.assertTrue(homePage.newsLink_header.isDisplayed());
    }
    @Then("The user verifies that the Contact menu title in the home page top bar is displayed")
    public void the_user_verifies_that_the_contact_menu_title_in_the_home_page_top_bar_is_displayed() {
     softAssert.assertTrue(homePage.contactLink_header.isDisplayed());
     softAssert.assertAll();
    }
    @When("The user clicks on the site logo in the home page top bar")
    public void the_user_clicks_on_the_site_logo_in_the_home_page_top_bar() {
     homePage.WonderWorldCollegeSiteLogo.click();
    }
    @Then("The user verifies that their homepage has been refreshed")
    public void the_user_verifies_that_their_homepage_has_been_refreshed() {
    }

    @When("The user clicks on the Academics menu title at the top of the home page")
    public void theUserClicksOnTheAcademicsMenuTitleAtTheTopOfTheHomePage() {
     homePage.academicsLink_header.click();
    }

    @When("The user descends to the footer section of the page")
    public void the_user_descends_to_the_footer_section_of_the_page() {
     JSUtilities.scrollToElement(Driver.getDriver(),homePage.footerComplainIcon);
    }

    @When("The user waits {int} seconds")
    public void theUserWaitsSeconds(int seconds) {
     ReusableMethods.bekle(seconds);
    }

    @Then("The user, on the homepage top bar, it  verify that the school's phone information is visible as Call Us")
    public void theUserOnTheHomepageTopBarItVerifyThatTheSchoolSPhoneInformationIsVisibleAsCallUs() {
        String expectedResult="Call Us";
        String actualResult=homePage.callUs.getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Then("The user verifies that he or she was redirected to the complain page that the title is Complain")
    public void theUserVerifiesThatHeOrSheWasRedirectedToTheComplainPageThatTheTitleIsComplain() {
     String expectedTitle=ConfigReader.getProperty("complainTitle");
     String actualTitle=Driver.getDriver().getTitle();
     assertEquals(expectedTitle,actualTitle);
    }

 //================================================================================================

    @When("The user clicks on Home, which is the menu title on the home page top bar")
    public void the_user_clicks_on_home_which_is_the_menu_title_on_the_home_page_top_bar() {
     homePage.homeLink_header.click();
    }
    @Then("The user verifies that the title is Home on the opened page")
    public void the_user_verifies_that_the_title_is_home_on_the_opened_page() {
    expectedTitle=ConfigReader.getProperty("homePageHomeTitle");
    actualTitle=Driver.getDriver().getTitle();
    softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on Online Admission, which is the menu title on the home page top bar")
    public void the_user_clicks_on_online_admission_which_is_the_menu_title_on_the_home_page_top_bar() {
    homePage.onlineAdmissionLink_header.click();
    }
    @Then("The user verifies that the title is Online Admission Form on the opened page")
    public void the_user_verifies_that_the_title_is_online_admission_form_on_the_opened_page() {
     expectedTitle=ConfigReader.getProperty("homePageOnlineAdmissionTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on Exam Result, which is the menu title on the home page top bar")
    public void the_user_clicks_on_exam_result_which_is_the_menu_title_on_the_home_page_top_bar() {
     homePage.examResultLink_header.click();
    }
    @Then("The user verifies that the title is Student Exam Result on the opened page")
    public void the_user_verifies_that_the_title_is_student_exam_result_on_the_opened_page() {
     expectedTitle=ConfigReader.getProperty("homePageExamResultTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on About Us, which is the menu title on the home page top bar")
    public void the_user_clicks_on_about_us_which_is_the_menu_title_on_the_home_page_top_bar() {
     homePage.aboutUsLink_header.click();
    }
    @Then("The user verifies that the title is About Us on the opened page")
    public void the_user_verifies_that_the_title_is_about_us_on_the_opened_page() {
     expectedTitle=ConfigReader.getProperty("homePageAboutUSTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on Course, which is the menu title on the home page top bar")
    public void the_user_clicks_on_course_which_is_the_menu_title_on_the_home_page_top_bar() {
     homePage.courseLink_header.click();
    }
    @Then("The user verifies that the title is Course on the opened page")
    public void the_user_verifies_that_the_title_is_course_on_the_opened_page() {
     expectedTitle=ConfigReader.getProperty("homePageCourseTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on Gallery, which is the menu title on the home page top bar")
    public void the_user_clicks_on_gallery_which_is_the_menu_title_on_the_home_page_top_bar() {
     homePage.gelleryLink_header.click();
    }
    @Then("The user verifies that the title is Gallery on the opened page")
    public void the_user_verifies_that_the_title_is_gallery_on_the_opened_page() {
     expectedTitle=ConfigReader.getProperty("homePageGalleryTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on News, which is the menu title on the home page top bar")
    public void the_user_clicks_on_news_which_is_the_menu_title_on_the_home_page_top_bar() {
     homePage.newsLink_header.click();
    }
    @Then("The user verifies that the title is News on the opened page")
    public void the_user_verifies_that_the_title_is_news_on_the_opened_page() {
     expectedTitle=ConfigReader.getProperty("homePageNewsTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on Contact, which is the menu title on the home page top bar")
    public void the_user_clicks_on_contact_which_is_the_menu_title_on_the_home_page_top_bar() {
     homePage.contactLink_header.click();
    }
    @Then("The user verifies that the title is Contact us on the opened page")
    public void the_user_verifies_that_the_title_is_contact_us_on_the_opened_page() {
     expectedTitle=ConfigReader.getProperty("homePageContactTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
     softAssert.assertAll();
    }

    @Then("The user verifies that there is a Facilities link in the drop-down menu")
    public void the_user_verifies_that_there_is_a_facilities_link_in_the_drop_down_menu() {
     softAssert.assertTrue(homePage.facilitiesLink.isDisplayed());
    }
    @Then("The user verifies that there is a School Uniform link in the drop-down menu")
    public void the_user_verifies_that_there_is_a_school_uniform_link_in_the_drop_down_menu() {
     softAssert.assertTrue(homePage.schoolUniformLink.isDisplayed());
    }
    @Then("The user verifies that there is a Principal Message link in the drop-down menu")
    public void the_user_verifies_that_there_is_a_principal_message_link_in_the_drop_down_menu() {
     softAssert.assertTrue(homePage.principalMessageLink.isDisplayed());
    }
    @Then("The user verifies that there is a Know Us link in the drop-down menu")
    public void the_user_verifies_that_there_is_a_know_us_link_in_the_drop_down_menu() {
     softAssert.assertTrue(homePage.knowUsLink.isDisplayed());
    }
    @Then("The user verifies that there is a Approach link in the drop-down menu")
    public void the_user_verifies_that_there_is_a_approach_link_in_the_drop_down_menu() {
     softAssert.assertTrue(homePage.approachLink.isDisplayed());
    }
    @Then("The user verifies that there is a Teacher link in the drop-down menu")
    public void the_user_verifies_that_there_is_a_teacher_link_in_the_drop_down_menu() {
     softAssert.assertTrue(homePage.teacherLink.isDisplayed());
    }
    @Then("The user verifies that there is a Houses & Mentoring link in the drop-down menu")
    public void the_user_verifies_that_there_is_a_houses_mentoring_link_in_the_drop_down_menu() {
     softAssert.assertTrue(homePage.housesMentoringLink.isDisplayed());
    }
    @Then("The user verifies that there is a Student Council link in the drop-down menu")
    public void the_user_verifies_that_there_is_a_student_council_link_in_the_drop_down_menu() {
     softAssert.assertTrue(homePage.studentCouncilLink.isDisplayed());
     softAssert.assertAll();
    }

    @When("The user clicks on the Facilities link in the drop-down menu")
    public void the_user_clicks_on_the_facilities_link_in_the_drop_down_menu() {
     homePage.facilitiesLink.click();
    }
    @Then("The user confirms that the title is Facilities on the page that opens")
    public void the_user_confirms_that_the_title_is_facilities_on_the_page_that_opens() {
     expectedTitle=ConfigReader.getProperty("facilitiesTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on the School Uniform link in the drop-down menu")
    public void the_user_clicks_on_the_school_uniform_link_in_the_drop_down_menu() {
     homePage.schoolUniformLink.click();
    }
    @Then("The user confirms that the title is School Uniform on the page that opens")
    public void the_user_confirms_that_the_title_is_school_uniform_on_the_page_that_opens() {
     expectedTitle=ConfigReader.getProperty("schoolUniformTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on the Principal Message link in the drop-down menu")
    public void the_user_clicks_on_the_principal_message_link_in_the_drop_down_menu() {
     homePage.principalMessageLink.click();
    }
    @Then("The user confirms that the title is Principal Message on the page that opens")
    public void the_user_confirms_that_the_title_is_principal_message_on_the_page_that_opens() {
     expectedTitle=ConfigReader.getProperty("principalMessageTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on the Know Us link in the drop-down menu")
    public void the_user_clicks_on_the_know_us_link_in_the_drop_down_menu() {
     homePage.knowUsLink.click();
    }
    @Then("The user confirms that the title is Know Us on the page that opens")
    public void the_user_confirms_that_the_title_is_know_us_on_the_page_that_opens() {
     expectedTitle=ConfigReader.getProperty("knowUsTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on the Approach link in the drop-down menu")
    public void the_user_clicks_on_the_approach_link_in_the_drop_down_menu() {
     homePage.approachLink.click();
    }
    @Then("The user confirms that the title is Approach on the page that opens")
    public void the_user_confirms_that_the_title_is_approach_on_the_page_that_opens() {
     expectedTitle=ConfigReader.getProperty("approachTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on the Teacher link in the drop-down menu")
    public void the_user_clicks_on_the_teacher_link_in_the_drop_down_menu() {
     homePage.teacherLink.click();
    }
    @Then("The user confirms that the title is Teacher on the page that opens")
    public void the_user_confirms_that_the_title_is_teacher_on_the_page_that_opens() {
     expectedTitle=ConfigReader.getProperty("teacherTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on the Houses & Mentoring link in the drop-down menu")
    public void the_user_clicks_on_the_houses_mentoring_link_in_the_drop_down_menu() {
     homePage.housesMentoringLink.click();
    }
    @Then("The user confirms that the title is Houses & Mentoring on the page that opens")
    public void the_user_confirms_that_the_title_is_houses_mentoring_on_the_page_that_opens() {
     expectedTitle=ConfigReader.getProperty("housesMentoringTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on the Student Council link in the drop-down menu")
    public void the_user_clicks_on_the_student_council_link_in_the_drop_down_menu() {
     homePage.studentCouncilLink.click();
    }
    @Then("The user confirms that the title is Student Council on the page that opens")
    public void the_user_confirms_that_the_title_is_student_council_on_the_page_that_opens() {
     expectedTitle=ConfigReader.getProperty("studentCouncilTitle");
     actualTitle=Driver.getDriver().getTitle();
     softAssert.assertEquals(actualTitle,expectedTitle);
    }

    @Then("Verifies that the Comlain heading in the user footer is visible")
    public void verifies_that_the_comlain_heading_in_the_user_footer_is_visible() {
     homePage.footerComplainIconIsVisiable();
    }
    @Then("Verifies that the Comlain icon in the user footer is visible")
    public void verifies_that_the_comlain_icon_in_the_user_footer_is_visible() {
     homePage.footerComplainTextIsVisiable();
    }

    @When("The user clicks on the Complain heading in the footer section")
    public void theUserClicksOnTheComplainHeadingInTheFooterSection() {
     homePage.footerComplainText.click();
    }
    @When("The user clicks on the Complain icon in the footer section")
    public void theUserClicksOnTheComplainIconInTheFooterSection() {
     homePage.footerComplainIcon.click();
    }

    @Then("The user verifies that Name textbox is visible on complain page")
    public void the_user_verifies_that_name_textbox_is_visible_on_complain_page() {
     softAssert.assertTrue(homePage.complainPageNameTextbox.isDisplayed());
    }
    @Then("The user verifies that Email textbox is visible on complain page")
    public void the_user_verifies_that_email_textbox_is_visible_on_complain_page() {
     softAssert.assertTrue(homePage.complainPageEmailTextbox.isDisplayed());
    }
    @Then("The user verifies that Contact No. textbox is visible on complain page")
    public void the_user_verifies_that_contact_no_textbox_is_visible_on_complain_page() {
     softAssert.assertTrue(homePage.complainPageContactNoTextbox.isDisplayed());
    }
    @Then("The user verifies that Description textbox is visible on complain page")
    public void the_user_verifies_that_description_textbox_is_visible_on_complain_page() {
     softAssert.assertTrue(homePage.complainPageDescriptionTextbox.isDisplayed());
    }
    @When("The user enters correct data in Name textbox on complain page")
    public void the_user_enters_correct_data_in_name_textbox_on_complain_page() {
     homePage.complainPageNameTextbox.sendKeys(faker.name().firstName());
    }
    @When("The user enters correct data in Email textbox on complain page")
    public void the_user_enters_correct_data_in_email_textbox_on_complain_page() {
     homePage.complainPageEmailTextbox.sendKeys(faker.internet().emailAddress());
    }
    @When("The user enters correct data in Contact No. textbox on complain page")
    public void the_user_enters_correct_data_in_contact_no_textbox_on_complain_page() {
    homePage.complainPageContactNoTextbox.sendKeys(ConfigReader.getProperty("complainTrueContactNo"));
    }
    @When("The user enters correct data in Description textbox on complain page")
    public void the_user_enters_correct_data_in_description_textbox_on_complain_page() {
     homePage.complainPageDescriptionTextbox.sendKeys(ConfigReader.getProperty("complainTrueDescrption")+Keys.TAB+Keys.ENTER);
    }
    @When("The user clicks submit button on complain page")
    public void the_user_clicks_submit_button_on_complain_page() {
    }
    @When("The user verifies that the request was sent with the confirmation message")
    public void the_user_verifies_that_the_request_was_sent_with_the_confirmation_message() {
     assertTrue(homePage.complainPageConfirmationMessage.isDisplayed());
    }

    @When("The user leaves name textbox on complain page blank")
    public void theUserLeavesNameTextboxOnComplainPageBlank() {
    }

    @Then("The user confirms with the incoming message that the name textbox should not be left blank")
    public void theUserConfirmsWithTheIncomingMessageThatTheNameTextboxShouldNotBeLeftBlank() {
     assertTrue(homePage.complainPageNameFieldMessage.isDisplayed());
    }

    @When("The user enters two character name in name textbox on complain page")
    public void theUserEntersTwoCharacterNameInNameTextboxOnComplainPage() {
     homePage.complainPageNameTextbox.sendKeys(ConfigReader.getProperty("complainTwoCharacterName"));
    }

    @Then("The user verifies that no less than six characters can be entered in the name textbox with the incoming message")
    public void theUserVerifiesThatNoLessThanSixCharactersCanBeEnteredInTheNameTextboxWithTheIncomingMessage() {
     assertFalse(homePage.complainPageConfirmationMessage.isDisplayed());
    }

    @When("The user leaves email textbox on complain page blank")
    public void theUserLeavesEmailTextboxOnComplainPageBlank() {
    }

    @Then("The user confirms that the email textbox should not be left blank with the incoming message")
    public void theUserConfirmsThatTheEmailTextboxShouldNotBeLeftBlankWithTheIncomingMessage() {
     assertTrue(homePage.complainPageEmailFieldMessage.isDisplayed());
    }

    @When("The user enters email without @ in the email textbox on the complain pagee")
    public void theUserEntersEmailWithoutInTheEmailTextboxOnTheComplainPagee() {
     homePage.complainPageEmailTextbox.sendKeys(ConfigReader.getProperty("complainEmailWithout@"));
    }

    @Then("The user verifies that email without @ cannot be written in email textbox with incoming message")
    public void theUserVerifiesThatEmailWithoutCannotBeWrittenInEmailTextboxWithIncomingMessage() {
    }


    @When("The user enters email without .com in email textbox on complain page")
    public void theUserEntersEmailWithoutComInEmailTextboxOnComplainPage() {
     homePage.complainPageEmailTextbox.sendKeys(ConfigReader.getProperty("complainEmailWithout.com"));
    }

    @Then("The user verifies that email cannot be written without typing .com in the email textbox with the incoming message")
    public void theUserVerifiesThatEmailCannotBeWrittenWithoutTypingComInTheEmailTextboxWithTheIncomingMessage() {
     assertTrue(homePage.complainPageValidEmailFieldMessage.isDisplayed());
    }

    @When("The user leaves contact no. textbox on complain page blank")
    public void theUserLeavesContactNoTextboxOnComplainPageBlank() {
    }

    @Then("The user confirms with the incoming message that the Contact No. textbox should not be left blank")
    public void theUserConfirmsWithTheIncomingMessageThatTheContactNoTextboxShouldNotBeLeftBlank() {
     assertTrue(homePage.complainPageContactNoFieldMessage.isDisplayed());
    }

    @When("The user enters word in contact no textbox on complain page")
    public void theUserEntersWordInContactNoTextboxOnComplainPage() {
     homePage.complainPageContactNoTextbox.sendKeys(ConfigReader.getProperty("complainContactNoWord"));
    }

    @Then("The user contact No. with incoming message. Verifies that letters cannot be entered in the textbox")
    public void theUserContactNoWithIncomingMessageVerifiesThatLettersCannotBeEnteredInTheTextbox() {
     assertFalse(homePage.complainPageConfirmationMessage.isDisplayed());
    }


    @When("The User enters negative number in contact no textbox on complain page")
    public void theUserEntersNegativeNumberInContactNoTextboxOnComplainPage() {
     homePage.complainPageContactNoTextbox.sendKeys(ConfigReader.getProperty("complainContactNegativeNumber"));
    }

    @Then("The user confirms that negative numbers cannot be entered in the contact no textbox with the incoming message")
    public void theUserConfirmsThatNegativeNumbersCannotBeEnteredInTheContactNoTextboxWithTheIncomingMessage() {
     assertFalse(homePage.complainPageConfirmationMessage.isDisplayed());
    }

    @When("The User enters special character in contact no textbox on complain page")
    public void theUserEntersSpecialCharacterInContactNoTextboxOnComplainPage() {
     homePage.complainPageContactNoTextbox.sendKeys(ConfigReader.getProperty("complainContactSpecialCharacter"));
    }

    @Then("The user confirms that special character cannot be entered in the contact no textbox with the incoming message")
    public void theUserConfirmsThatSpecialCharacterCannotBeEnteredInTheContactNoTextboxWithTheIncomingMessage() {
     assertFalse(homePage.complainPageConfirmationMessage.isDisplayed());
    }

    @When("The user scrolls down to the graduates text")
    public void theUserScrollsDownToTheGraduatesText() {
     JSUtilities.scrollToElement(Driver.getDriver(),homePage.graduatesText);
    }

    @Then("The user verifies that OUR EXPERIENCE STAFFS is visible in our experienced staffs section")
    public void theUserVerifiesThatOUREXPERIENCESTAFFSIsVisibleInOurExperiencedStaffsSection() {
     assertTrue(homePage.ourExperiencedStaffsText.isDisplayed());
    }

    @Then("The user verifies that Anthony Carter exists in our experienced staffs section")
    public void the_user_verifies_that_anthony_carter_exists_in_our_experienced_staffs_section() {
     homePage.ourExperiencedStaffsAnthonyCarterIsVisiable();
    }
    @Then("The user verifies that Ava Turner exists in our experienced staffs section")
    public void the_user_verifies_that_ava_turner_exists_in_our_experienced_staffs_section() {
     homePage.ourExperiencedStaffsAvaTurnerIsVisiable();
    }
    @Then("The user verifies that David Morgan exists in our experienced staffs section")
    public void the_user_verifies_that_david_morgan_exists_in_our_experienced_staffs_section() {
     homePage.ourExperiencedStaffsDavidMorganIsVisiable();
    }
    @Then("The user verifies that Lily Peterson exists in our experienced staffs section")
    public void the_user_verifies_that_lily_peterson_exists_in_our_experienced_staffs_section() {
     homePage.ourExperiencedStaffsLilyPetersonIsVisiable();
    }

    @When("The user goes down to our experienced staffs section on the main page")
    public void theUserGoesDownToOurExperiencedStaffsSectionOnTheMainPage() {
     JSUtilities.scrollToElement(Driver.getDriver(),homePage.ourExperiencedStaffsText);
    }
}
