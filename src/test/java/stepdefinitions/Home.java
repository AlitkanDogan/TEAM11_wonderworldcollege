package stepdefinitions;

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
     softAssert.assertTrue(homePage.WonderWorldCollegeSiteLogo.isDisplayed());
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

    @When("The user clicks on {string}, which is the menu title on the home page top bar")
    public void theUserClicksOnWhichIsTheMenuTitleOnTheHomePageTopBar(String menuTitle) {
     if (menuTitle.equalsIgnoreCase("Home")){
      homePage.homeLink_header.click();
     }else if (menuTitle.equalsIgnoreCase("Online Admission")){
      homePage.onlineAdmissionLink_header.click();
     }else if (menuTitle.equalsIgnoreCase("Exam Result")){
      homePage.examResultLink_header.click();
     }else if (menuTitle.equalsIgnoreCase("About Us")) {
      homePage.aboutUsLink_header.click();
     }else if (menuTitle.equalsIgnoreCase("Course")) {
      homePage.courseLink_header.click();
     }else if (menuTitle.equalsIgnoreCase("Gallery")) {
      homePage.gelleryLink_header.click();
     }else if (menuTitle.equalsIgnoreCase("News")) {
      homePage.newsLink_header.click();
     }else if (menuTitle.equalsIgnoreCase("Contact")) {
      homePage.contactLink_header.click();
     }
    }

    @Then("The user verifies that the title is {string} on the opened page")
    public void theUserVerifiesThatTheTitleIsOnTheOpenedPage(String title) {

     String expectedTitle="";
     String actualTitle="";

     if (title.equalsIgnoreCase("Home")){
      expectedTitle=ConfigReader.getProperty("homePageHomeTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("Online Admission Form")){
      expectedTitle=ConfigReader.getProperty("homePageOnlineAdmissionTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("Student Exam Result")){
      expectedTitle=ConfigReader.getProperty("homePageExamResultTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("About Us")){
      expectedTitle=ConfigReader.getProperty("homePageAboutUSTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("Course")){
      expectedTitle=ConfigReader.getProperty("homePageCourseTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("Gallery")){
      expectedTitle=ConfigReader.getProperty("homePageGalleryTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("News")){
      expectedTitle=ConfigReader.getProperty("homePageNewsTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("Contact us")){
      expectedTitle=ConfigReader.getProperty("homePageContactTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }
    }

    @When("The user clicks on the Academics menu title at the top of the home page")
    public void theUserClicksOnTheAcademicsMenuTitleAtTheTopOfTheHomePage() {
     homePage.academicsLink_header.click();
    }

    @Then("The user verifies that there is a {string} link in the drop-down menu")
    public void theUserVerifiesThatThereIsALinkInTheDropDownMenu(String link) {

     if (link.equalsIgnoreCase("Facilities")){
      softAssert.assertTrue(homePage.facilitiesLink.isDisplayed());
     }else if (link.equalsIgnoreCase("School Uniform")) {
      softAssert.assertTrue(homePage.schoolUniformLink.isDisplayed());
     }else if (link.equalsIgnoreCase("Principal Message")) {
      softAssert.assertTrue(homePage.principalMessageLink.isDisplayed());
     }else if (link.equalsIgnoreCase("Know Us")) {
      softAssert.assertTrue(homePage.knowUsLink.isDisplayed());
     }else if (link.equalsIgnoreCase("Approach")) {
      softAssert.assertTrue(homePage.approachLink.isDisplayed());
     }else if (link.equalsIgnoreCase("Teacher")) {
      softAssert.assertTrue(homePage.teacherLink.isDisplayed());
     }else if (link.equalsIgnoreCase("Houses & Mentoring")) {
      softAssert.assertTrue(homePage.housesMentoringLink.isDisplayed());
     }else if (link.equalsIgnoreCase("Student Council")) {
      softAssert.assertTrue(homePage.studentCouncilLink.isDisplayed());
      softAssert.assertAll();
     }
    }

    @When("The user clicks on the {string} link in the drop-down menu")
    public void theUserClicksOnTheLinkInTheDropDownMenu(String link) {
     if (link.equalsIgnoreCase("Facilities")) {
      homePage.facilitiesLink.click();
     }else if (link.equalsIgnoreCase("School Uniform")) {
      homePage.schoolUniformLink.click();
     }else if (link.equalsIgnoreCase("Principal Message")) {
      homePage.principalMessageLink.click();
     }else if (link.equalsIgnoreCase("Know Us")) {
      homePage.knowUsLink.click();
     }else if (link.equalsIgnoreCase("Approach")) {
      homePage.approachLink.click();
     }else if (link.equalsIgnoreCase("Teacher")) {
      homePage.teacherLink.click();
     }else if (link.equalsIgnoreCase("Houses & Mentoring")) {
      homePage.housesMentoringLink.click();
     }else if (link.equalsIgnoreCase("Student Council")) {
      homePage.studentCouncilLink.click();
     }
    }

    @Then("The user confirms that the title is {string} on the page that opens")
    public void theUserConfirmsThatTheTitleIsOnThePageThatOpens(String title) {

     String expectedTitle="";
     String actualTitle="";

     if (title.equalsIgnoreCase("Facilities")) {
      expectedTitle=ConfigReader.getProperty("facilitiesTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("School Uniform")) {
      expectedTitle=ConfigReader.getProperty("schoolUniformTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("Principal Message")) {
      expectedTitle=ConfigReader.getProperty("principalMessageTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("Know Us")) {
      expectedTitle=ConfigReader.getProperty("knowUsTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("Approach")) {
      expectedTitle=ConfigReader.getProperty("approachTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("Teacher")) {
      expectedTitle=ConfigReader.getProperty("teacherTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("Houses & Mentoring")) {
      expectedTitle=ConfigReader.getProperty("housesMentoringTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
     }else if (title.equalsIgnoreCase("Student Council")) {
      expectedTitle=ConfigReader.getProperty("studentCouncilTitle");
      actualTitle=Driver.getDriver().getTitle();
      softAssert.assertEquals(actualTitle,expectedTitle);
      softAssert.assertAll();
     }
    }

    @When("The user descends to the footer section of the page")
    public void the_user_descends_to_the_footer_section_of_the_page() {
     JSUtilities.scrollToElement(Driver.getDriver(),homePage.footerComplainIcon);
    }

    @Then("Verifies that the “Comlain” heading in the user footer is visible")
    public void verifies_that_the_comlain_heading_in_the_user_footer_is_visible() {
     softAssert.assertTrue(homePage.footerComplainText.isDisplayed());
    }

    @Then("Verifies that the {string} icon in the user footer is visible")
    public void verifies_that_the_icon_in_the_user_footer_is_visible(String string) {
     softAssert.assertTrue(homePage.footerComplainIcon.isDisplayed());
     softAssert.assertAll();
    }

    @When("The user waits {int} seconds")
    public void theUserWaitsSeconds(int seconds) {
     ReusableMethods.bekle(seconds);
    }

    @When("The user clicks on the {string} heading in the footer section")
    public void theUserClicksOnTheHeadingInTheFooterSection(String text) {
     homePage.footerComplainText.click();
    }

    @When("The user clicks on the {string} icon in the footer section")
    public void theUserClicksOnTheIconInTheFooterSection(String arg0) {
     homePage.footerComplainIcon.click();
    }

    @Then("The user verifies that he or she was redirected to the complain page that the title is {string}")
    public void theUserVerifiesThatHeOrSheWasRedirectedToTheComplainPageThatTheTitleIs(String arg0) {
     String expectedTitle=ConfigReader.getProperty("complainTitle");
     String actualTitle=Driver.getDriver().getTitle();
     assertEquals(expectedTitle,actualTitle);
    }

    @Then("The user verifies that {string} textbox is visible on complain page")
    public void theUserVerifiesThatTextboxIsVisibleOnComplainPage(String textbox) {
     if (textbox.equalsIgnoreCase("Name")) {
      softAssert.assertTrue(homePage.complainPageNameTextbox.isDisplayed());
     }else if (textbox.equalsIgnoreCase("Email")) {
      softAssert.assertTrue(homePage.complainPageEmailTextbox.isDisplayed());
     }else if (textbox.equalsIgnoreCase("Contact No.")) {
      softAssert.assertTrue(homePage.complainPageContactNoTextbox.isDisplayed());
     }else if (textbox.equalsIgnoreCase("Description")) {
      softAssert.assertTrue(homePage.complainPageDescriptionTextbox.isDisplayed());


     }
    }

}
