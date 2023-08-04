package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import pages.AdminPage;

import pages.TeacherPage;


import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import pages.LoginPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;


import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.util.List;
import java.util.Set;


public class Admin {
    WebDriver driver = Driver.getDriver();

    TeacherPage tpage = new TeacherPage();
    AdminPage adminPage = new AdminPage();

    Faker faker = new Faker();




    /*US_29 Admin*/
    @Given("{string} {string} login admin")
    public void Us_29(String email, String sifre) {
        Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
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

    @Then("The Add complain window with Complain Type, Source dropdown menus and Phone, Date, Description, Action Taken, Assigned, Note textBoxes should be displayed on the Complain page")
    public void US_29_2() {
        ReusableMethods.switchToWindow("Wonder World College");
        adminPage.frontoffice.click();
        adminPage.frontoffice_Complain.click();
        List<WebElement> cardSidebarElements = driver.findElements(By.className("form-group"));
        int limit = Math.min(cardSidebarElements.size(), 11);
        for (int i = 0; i < limit; i++) {
            WebElement element = cardSidebarElements.get(i);
            String[] terms = element.getText().split("\\s+"); // Boşluklara göre veriyi böler
            if (terms.length > 0) {
                System.out.println(terms[0]); // Sadece ilk terimi yazdırır
            }
        }
    }

    @Then("It should be possible to upload the document related to the complaint in the Add complain window on the Complain page")
    public void US_29_03() {

        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));

        // Dosya yolu belirt (örneğin, "C:\\Users\\kullanici_adi\\dosya.txt")
        String filePath = "C://Users//griff//Downloads//x.jpg";
        // JavaScript Executor kullanarak dosya yolu belirleme işlemini gerçekleştir
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.display='block';", fileInput);
        fileInput.sendKeys(filePath);
    }

    @Then("The Complain List with the titles Complain, Complain Type, Name, Phone, Date, Action should be displayed in the Complain List window")
    public void US_29_04() {

        System.out.println("-----------------------");
        List<WebElement> complainSidebarElements = driver.findElements(By.className("sorting"));
        int limit2 = Math.min(complainSidebarElements.size(), 6);
        for (int i = 0; i < limit2; i++) {
            WebElement element = complainSidebarElements.get(i);
            String[] terms = element.getText().split("\\s+"); // Boşluklara göre veriyi böler
            if (terms.length > 0) {
                System.out.println(terms[0]); // Sadece ilk terimi yazdırır
            }
        }
    }

    @Then("The details of the complaint should be displayed in the Edit Complain window opened by clicking the Edit icon under the Action title in the Complain List, it should be updated and saved with the save button")
    public void US_29_05() {
        WebElement ComplainBy = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/div[3]/input"));
        ComplainBy.click();
        ComplainBy.sendKeys("ss");
        scrollDown(driver, 500);
        adminPage.savebutton.click();
        adminPage.complainsearch.click();
        adminPage.complainsearch.sendKeys("ss");
        ReusableMethods.bekle(2);
        adminPage.complainview.click();
        ReusableMethods.bekle(2);
        adminPage.complainview_close.click();
        adminPage.complainview_edit.click();
        ReusableMethods.bekle(5);
        WebElement complain = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/div[3]/input"));
        complain.click();
        complain.sendKeys("2");
        scrollDown(driver, 500);
        WebElement save = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[2]/button"));
        save.click();
        ReusableMethods.bekle(3);
        WebElement complaindelete = driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a[3]"));
        complaindelete.click();
        Alert alert = driver.switchTo().alert();

        // Onay kutusunu kabul et (OK düğmesine tıkla)
        alert.accept();
        ReusableMethods.bekle(5);
    }

    /*US_29*/
    public static void scrollDown(WebDriver driver, int pixels) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, " + pixels + ");");
    }

    @And("Page Closed US_29")
    public void close() {
        Driver.closeDriver();
    }


    LoginPage loginPage = new LoginPage();

    Actions actions = new Actions(driver);


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

        @When("The user clicks the Sign In button and goes to the student page")
        public void the_user_clicks_the_sign_ın_button_and_goes_to_the_student_page () {
            loginPage.adminLoginSignInButton.click();
            ReusableMethods.bekle(1);

        }

        @When("The user clicks on the Student Information link in the admin panel's sidebar")
        public void the_user_clicks_on_the_student_ınformation_link_in_the_admin_panel_s_sidebar () {
            adminPage.studentInformationLink.click();
            ReusableMethods.bekle(1);
        }

        @Then("The user verifies that the dropdown menu displays the \"\"Multi Class Student\"\" link")
        public void the_user_verifies_that_the_dropdown_menu_displays_the_multi_class_student_link () {
            ;
            assertTrue(adminPage.multiClassStudentLink.isDisplayed());
        }

        @When("The user clicks on the Multi Class Student link in the opened dropdown menu")
        public void the_user_clicks_on_the_multi_class_student_link_in_the_opened_dropdown_menu () {
            adminPage.multiClassStudentLink.click();
            ReusableMethods.bekle(1);
        }

        @Then("The user verifies that the opened page goes to the {string} address")
        public void the_user_verifies_that_the_opened_page_goes_to_the_address (String string){
            String expectedUrl = "https://qa.wonderworldcollege.com/student/multiclass";
            String actualUrl = driver.getCurrentUrl();
            assertEquals(expectedUrl, actualUrl);
        }

    @When("The user selects relevant criteria from Class dropdown on Select Criteria page")
    public void the_user_selects_relevant_criteria_from_class_dropdown_on_select_criteria_page() {
        Select select = new Select(adminPage.studentDetailsClassDropdown);
        select.selectByVisibleText("Class 2");
    }
    @When("The user selects the relevant criteria from the Section dropdown on the Select Criteria page")
    public void the_user_selects_the_relevant_criteria_from_the_section_dropdown_on_the_select_criteria_page() {
        Select select = new Select(adminPage.studentDetailsSectionDropdown);
        select.selectByVisibleText("A");
    }
    @When("The user clicks Search button on Select Criteria page")
    public void the_user_clicks_search_button_on_select_criteria_page() {
        adminPage.studentDetailsFirstSearchButton.click();
    }
    @Then("The user verifies that a List has been created in the List View according to the relevant criteria")
    public void the_user_verifies_that_a_list_has_been_created_in_the_list_view_according_to_the_relevant_criteria() {
        for (WebElement each:adminPage.studentDetailsListView
             ) {
            assertTrue(each.isDisplayed());
        }
    }




    @Then("The user clicks on the Class textbox and selects the Class 2 tab from the opened dropdown menu")
    public void the_user_clicks_on_the_class_textbox_and_selects_the_class_tab_from_the_opened_dropdown_menu() {
        Select select = new Select(adminPage.classDropDowntBox_multiClassStudent);
        select.selectByIndex(2);
        ReusableMethods.bekle(1);

    }

    @Then("The user clicks on the Section textbox and selects the A tab from the opened dropdown menu")
    public void the_user_clicks_on_the_section_textbox_and_selects_the_a_tab_from_the_opened_dropdown_menu() {
        Select select = new Select(adminPage.sectionDropDownBox_multiClassStudent);
        select.selectByIndex(1);
        ReusableMethods.bekle(1);
    }

    @When("The user clicks on the student name from the list in the List View")
    public void the_user_clicks_on_the_student_name_from_the_list_in_the_list_view() {
        adminPage.studentDetailsListViewStudentName.click();
    }
    @Then("The user verifies from the student name that he or she is redirected to the profile page of the relevant student")
    public void the_user_verifies_from_the_student_name_that_he_or_she_is_redirected_to_the_profile_page_of_the_relevant_student() {
        assertTrue(adminPage.studentDetailsStudentName.isDisplayed());
    }

    @When("The user clicks the View icon under the Action heading from the list in the List View")
    public void the_user_clicks_the_view_icon_under_the_action_heading_from_the_list_in_the_list_view() {
        adminPage.studentDetailsViewIcon.click();
    }

    @When("The user clicks the Edit icon under the Action title from the list in the List View")
    public void the_user_clicks_the_edit_icon_under_the_action_title_from_the_list_in_the_list_view() {
        adminPage.studentDetailsEditIcon.click();
    }
    @Then("The user verifies from the Edit Student article on the page where the relevant student is directed to the edit page")
    public void the_user_verifies_from_the_edit_student_article_on_the_page_where_the_relevant_student_is_directed_to_the_edit_page() {
        assertTrue(adminPage.studentDetailsEditStudentText.isDisplayed());

    }

    @When("The user enters the relevant data in the textboxes in the Edit Student section of the edit page")
    public void the_user_enters_the_relevant_data_in_the_textboxes_in_the_edit_student_section_of_the_edit_page() {
        adminPage.studentDetailsEditStudentRollNumberTextbox.clear();
        adminPage.studentDetailsEditStudentRollNumberTextbox.sendKeys(ConfigReader.getProperty("editStudentRollNumber"));

        Select select = new Select(adminPage.studentDetailsEditStudentClassDropdown);
        select.selectByVisibleText("Class 1");

        Select select1 = new Select(adminPage.studentDetailsEditStudentSectionDropdown);
        select1.selectByVisibleText("B");

        adminPage.studentDetailsEditStudentFirstNameTextbox.clear();
        adminPage.studentDetailsEditStudentFirstNameTextbox.sendKeys(faker.name().firstName());
        adminPage.studentDetailsEditStudentLastNameTextbox.sendKeys(faker.name().lastName());

        Select select2 = new Select(adminPage.studentDetailsEditStudentGenderDropdown);
        select2.selectByVisibleText("Female");

        adminPage.studentDetailsEditStudentDateOfBirthTextbox.click();
        adminPage.studentDetailsEditStudentDateOfBirth.click();

        Select select3 = new Select(adminPage.studentDetailsEditStudentCategoryDropdown);
        select3.selectByVisibleText("Special");

        adminPage.studentDetailsEditStudentReligionTextbox.clear();
        adminPage.studentDetailsEditStudentReligionTextbox.sendKeys(ConfigReader.getProperty("editStudentReligion"));
        adminPage.studentDetailsEditStudentMobileNumberTextbox.clear();
        adminPage.studentDetailsEditStudentMobileNumberTextbox.sendKeys(ConfigReader.getProperty("editStudentMobileNumber"));
        adminPage.studentDetailsEditStudentEmailTextbox.clear();
        adminPage.studentDetailsEditStudentEmailTextbox.sendKeys(faker.internet().emailAddress());
        adminPage.studentDetailsEditStudentAdmissionDateTextbox.click();
        adminPage.studentDetailsEditStudentDate.click();

        Select select4 = new Select(adminPage.studentDetailsEditStudentBloodGroupDropdown);
        select4.selectByVisibleText("A+");

        Select select5 = new Select(adminPage.studentDetailsEditStudentHouseDropdown);
        select5.selectByVisibleText("Blue");

        adminPage.studentDetailsEditStudentHeightTextbox.clear();
        adminPage.studentDetailsEditStudentHeightTextbox.sendKeys(ConfigReader.getProperty("editStudentHeight"));
        adminPage.studentDetailsEditStudentWeightTextbox.clear();
        adminPage.studentDetailsEditStudentWeightTextbox.sendKeys(ConfigReader.getProperty("editStudentWeight"));
        adminPage.studentDetailsEditStudentMeasurementDateTextbox.click();
        adminPage.studentDetailsEditStudentMeasurementDate.click();
        adminPage.studentDetailsEditStudentMedicalHistoryTextbox.sendKeys(ConfigReader.getProperty("editStudentMedicalHistory"));
    }

/*
    @And("The user verifies that the {string} heading is visible on the page that opens as a result of the search")
    public void theUserVerifiesThatTheHeadingIsVisibleOnThePageThatOpensAsAResultOfTheSearch(String arg0) {
        String expectesResult = "Select Criteria";
        String actualResult = adminPage.selectCriteriaTitleText.getText();
        assertEquals(expectesResult, actualResult);


 */
    @When("The user enters the relevant data in the textboxes in the Transport Details section of the edit page")
    public void the_user_enters_the_relevant_data_in_the_textboxes_in_the_transport_details_section_of_the_edit_page() {
        JSUtilities.scrollToElement(Driver.getDriver(),adminPage.studentDetailsEditStudentMedicalHistoryTextbox);

        adminPage.studentDetailsTransportDetailsRouteListDropdown.click();
        adminPage.studentDetailsTransportDetailsRouteList.click();
    }
    @When("The user selects corresponding checkboxes in Fees Details on edit page")
    public void the_user_selects_corresponding_checkboxes_in_fees_details_on_edit_page() {
        adminPage.studentDetailsFeesDetails.click();
    }
    @When("The user enters the relevant data in the textboxes in the Parent Guardian Detail section on the edit page")
    public void the_user_enters_the_relevant_data_in_the_textboxes_in_the_parent_guardian_detail_section_on_the_edit_page() {
        adminPage.studentDetailsParentGuardianDetailFatherNameTextbox.clear();
        adminPage.studentDetailsParentGuardianDetailFatherNameTextbox.sendKeys(ConfigReader.getProperty("parentGuardianDetailFatherName"));
        adminPage.studentDetailsParentGuardianDetailPhoneNoTextbox.clear();
        adminPage.studentDetailsParentGuardianDetailPhoneNoTextbox.sendKeys(ConfigReader.getProperty("parentGuardianDetailPhoneNo"));
        adminPage.studentDetailsParentGuardianDetailFatherOccupationTextbox.clear();
        adminPage.studentDetailsParentGuardianDetailFatherOccupationTextbox.sendKeys(ConfigReader.getProperty("parentGuardianDetailFatherOccupation"));
        adminPage.studentDetailsParentGuardianDetailMotherNameTextbox.clear();
        adminPage.studentDetailsParentGuardianDetailMotherNameTextbox.sendKeys(ConfigReader.getProperty("parentGuardianDetailMotherName"));
        adminPage.studentDetailsParentGuardianDetailMotherPhoneTextbox.clear();
        adminPage.studentDetailsParentGuardianDetailMotherPhoneTextbox.sendKeys(ConfigReader.getProperty("parentGuardianDetailMotherPhone"));
        adminPage.studentDetailsParentGuardianDetailMotherOccupationTextbox.clear();
        adminPage.studentDetailsParentGuardianDetailMotherOccupationTextbox.sendKeys(ConfigReader.getProperty("parentGuardianDetailMotherOccupation"));
        adminPage.studentDetailsParentGuardianDetailIfGuardianIsRadioButton.click();
    }
    @When("The user enters the relevant data in the textboxes in the Address Details section of the edit page")
    public void the_user_enters_the_relevant_data_in_the_textboxes_in_the_address_details_section_of_the_edit_page() {
        adminPage.studentDetailsAddressDetailsCurrentAddressTextbox.clear();
        adminPage.studentDetailsAddressDetailsCurrentAddressTextbox.sendKeys(ConfigReader.getProperty("addressDetailsCurrentAddress"));
        adminPage.studentDetailsAddressDetailsPermanentAddressTextbox.clear();
        adminPage.studentDetailsAddressDetailsPermanentAddressTextbox.sendKeys(ConfigReader.getProperty("addressDetailsPermanentAddress"));
    }
    @When("The user enters the relevant data in the textboxes in the Miscellaneous Details section of the edit page")
    public void the_user_enters_the_relevant_data_in_the_textboxes_in_the_miscellaneous_details_section_of_the_edit_page() {
        adminPage.studentDetailsMiscellaneousDetailsBankAccountNumberTextbox.clear();
        adminPage.studentDetailsMiscellaneousDetailsBankAccountNumberTextbox.sendKeys(ConfigReader.getProperty("miscellaneousDetailsBankAccountNumber"));
        adminPage.studentDetailsMiscellaneousDetailsIFSCCodeTextbox.clear();
        adminPage.studentDetailsMiscellaneousDetailsIFSCCodeTextbox.sendKeys(ConfigReader.getProperty("miscellaneousDetailsIFSCCode"));
        adminPage.studentDetailsMiscellaneousDetailsNationalIdentificationNumberTextbox.clear();
        adminPage.studentDetailsMiscellaneousDetailsNationalIdentificationNumberTextbox.sendKeys(ConfigReader.getProperty("miscellaneousDetailsNationalIdentificationNumber"));
        adminPage.studentDetailsMiscellaneousDetailsLocalIdentificationNumberTextbox.clear();
        adminPage.studentDetailsMiscellaneousDetailsLocalIdentificationNumberTextbox.sendKeys(ConfigReader.getProperty("miscellaneousDetailsLocalIdentificationNumber"));
        adminPage.studentDetailsMiscellaneousDetailsPreviousSchoolDetailsTextbox.clear();
        adminPage.studentDetailsMiscellaneousDetailsPreviousSchoolDetailsTextbox.sendKeys(ConfigReader.getProperty("miscellaneousDetailsPreviousSchoolDetails"));
        adminPage.studentDetailsMiscellaneousDetailsNoteTextbox.sendKeys(ConfigReader.getProperty("miscellaneousDetailsNote"));
    }
    @When("The user clicks the Save button on the edit page")
    public void the_user_clicks_the_save_button_on_the_edit_page() {
        adminPage.studentDetailsSaveButton.click();
    }
    @Then("The user verifies that the edited information has been recorded")
    public void the_user_verifies_that_the_edited_information_has_been_recorded() {
        assertTrue(adminPage.studentDetailsRecordUpdatedSuccessfullyText.isDisplayed());

    }

    @When("The user clicks Add Fees icon under Action from List in List View")
    public void the_user_clicks_add_fees_icon_under_action_from_list_in_list_view() {
        adminPage.selectCriteriaAddFeesLink.click();
    }
    @Then("The user verifies from the Student Fees article on the page where the relevant student is directed to the edit page")
    public void the_user_verifies_from_the_student_fees_article_on_the_page_where_the_relevant_student_is_directed_to_the_edit_page() {
        assertTrue(adminPage.selectCriteriaAddFeesStudentFeesText.isDisplayed());
    }
    //=========================================================

        @Then("The user verifies that the Class and Section textboxes are visible on the opened page")
        public void the_user_verifies_that_the_class_and_section_textboxes_are_visible_on_the_opened_page () {
            assertTrue(adminPage.classDropDowntBox_multiClassStudent.isDisplayed());
            assertTrue(adminPage.sectionDropDownBox_multiClassStudent.isDisplayed());


        }


/*
        @Then("The user clicks on the Section textbox and selects the A tab from the opened dropdown menu")
        public void the_user_clicks_on_the_section_textbox_and_selects_the_a_tab_from_the_opened_dropdown_menu () {
            Select select = new Select(adminPage.sectionDropDownBox_multiClassStudent);
            select.selectByIndex(1);
            ReusableMethods.bekle(1);

        }

 */

        @When("The user clicks Search button in Multi Class Student page")
        public void theUserClicksSearchButtonInMultiClassStudentPage () {
            adminPage.searchtButton_MultiClassStudent.click();

        }
        @And("The user verifies that the {string} heading is visible on the page that opens as a result of the search")
        public void theUserVerifiesThatTheHeadingIsVisibleOnThePageThatOpensAsAResultOfTheSearch (String arg0){
            String expectesResult = "Select Criteria";
            String actualResult = adminPage.selectCriteriaTitleText.getText();
            assertEquals(expectesResult, actualResult);
        }

        @When("The user clicks on the + icon in the student's window in the top-left corner")
        public void the_user_clicks_on_the_icon_in_the_student_s_window_in_the_top_left_corner () {
            adminPage.plusIconButton.click();
            ReusableMethods.bekle(3);

        }
        /*

        @Then("The user verifies that a new section has been added")
        public void the_user_verifies_that_a_new_section_has_been_added () {

            assertTrue(adminPage.classBox_ClassNewLine().isDisplayed());

        }



        @When("The user enters different class information in \"\"Class\"\" and \"\"Section\"\" constructors")
        public void the_user_enters_different_class_information_in_class_and_section_constructors () {
            Select select = new Select(adminPage.classBox_ClassNewLine());
            select.selectByIndex(3);
            ReusableMethods.bekle(1);

            select = new Select(adminPage.sectionBox_ClassNewLine());
            select.selectByIndex(1);
            ReusableMethods.bekle(1);


        }

         */

        @When("The user clicks \"\"Update\"\"\" button")
        public void the_user_clicks_update_button () {
            adminPage.updateButton_multiClassStudent.click();
        }

        @Then("The user verifies that the class was added successfully.")
        public void the_user_verifies_that_the_class_was_added_successfully () {

            assertTrue(adminPage.recordSavedSuccesfullyText_MultiClass.isDisplayed());
        }
        @And("Kullanıcı sol üst köşede bulunan ögrenciye ait en altta bulunan sınıf bilgisini \"\"Remove\"\" butonuna tıklayarak siler.")
        public void kullanıcıSolÜstKöşedeBulunanÖgrenciyeAitEnAlttaBulunanSınıfBilgisiniRemoveButonunaTıklayarakSiler ()
        {

            adminPage.removeButton_ClassNewLine().click();
        }


        //_________________________________________________________________________


        //=======================US_19==============================
        @Then("The user verifies that the admin panel s top bar has a visible profile icon")
        public void the_user_verifies_that_the_admin_panel_s_top_bar_has_a_visible_profile_icon () {
            Assert.assertTrue(adminPage.topBarAdminProfileIcon.isDisplayed());
        }

        @Then("The user clicks on the profile icon on the admin panels top bar.")
        public void the_user_clicks_on_the_profile_icon_on_the_admin_panels_top_bar () {
            adminPage.topBarAdminProfileIcon.click();
        }

        @Then("The user verifies that a window opens displaying the account owner's name, role, and links to Profile, Password, and Logout.\"")
        public void the_user_verifies_that_a_window_opens_displaying_the_account_owner_s_name_role_and_links_to_profile_password_and_logout
        () {
            Assert.assertTrue(adminPage.topBarAccountOwnersName.isDisplayed());
            Assert.assertTrue(adminPage.topBarAccountOwnersRole.isDisplayed());
            Assert.assertTrue(adminPage.topBarAccountOwnersProfileLink.isDisplayed());
            Assert.assertTrue(adminPage.topBarAccountOwnersPassword.isDisplayed());
            Assert.assertTrue(adminPage.topBarAccountOwnersLogout.isDisplayed());
        }

        @When("The user clicks on the profile link")
        public void the_user_clicks_on_the_profile_link () {
            adminPage.topBarAccountOwnersProfileLink.click();
        }

        @When("The user verifies that they are linked to the profile page")
        public void the_user_verifies_that_they_are_linked_to_the_profile_page () {
            Assert.assertTrue(adminPage.adminProfilePageBodyBox.isDisplayed());
        }

        @Then("The user verifies that there are  transitions to the Profile, Payroll, Leaves, Attendance, Documents pages and the General Information, Address Details, Bank Account Details, and Social Media Link information should be displayed.")
        public void the_user_verifies_that_there_are_transitions_to_the_profile_payroll_leaves_attendance_documents_pages_and_the_general_information_address_details_bank_account_details_and_social_media_link_information_should_be_displayed
        () {
            Assert.assertTrue(adminPage.adminProfilePageProfile.isDisplayed());
            Assert.assertTrue(adminPage.adminProfilePagePayroll.isDisplayed());
            Assert.assertTrue(adminPage.adminProfilePageLeaves.isDisplayed());
            Assert.assertTrue(adminPage.adminProfilePageAttendance.isDisplayed());
            Assert.assertTrue(adminPage.adminProfilePageDocuments.isDisplayed());

            Assert.assertTrue(adminPage.adminProfilePageGeneralInfoWindow.isDisplayed());
            Assert.assertTrue(adminPage.adminProfilePageAddressDetails.isDisplayed());
            Assert.assertTrue(adminPage.adminProfileBankAccountDetails.isDisplayed());
            Assert.assertTrue(adminPage.adminProfileSocialMediaLinkDetails.isDisplayed());

        }

        @When("The user clicks on the payroll link button")
        public void theUserClicksOnThePayrollLinkButton () {
            adminPage.adminProfilePagePayroll.click();
        }

        @Then("The user verifies that on the Payroll page info boards \\(Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction) are visible.")
        public void theUserVerifiesThatOnThePayrollPageInfoBoardsTotalNetSalaryPaidTotalGrossSalaryTotalEarningTotalDeductionAreVisible
        () {
            Assert.assertTrue(adminPage.payrollTotalNetSalaryPaid.isDisplayed());
            Assert.assertTrue(adminPage.payrollTotalGrossSalary.isDisplayed());
            Assert.assertTrue(adminPage.payrollTotalEarning.isDisplayed());
            Assert.assertTrue(adminPage.payrollTotalDeduction.isDisplayed());
        }

        @Then("The user verifies that, on the Payroll page, the Payslip List are displayed with columns \\(Month-Year, Date, Mode, Status, Net Salary, Action).")
        public void theUserVerifiesThatOnThePayrollPageThePayslipListAreDisplayedWithColumnsMonthYearDateModeStatusNetSalaryAction
        () {
            Assert.assertTrue(adminPage.payrollPayslip.isDisplayed());
            Assert.assertTrue(adminPage.payrollMonthYear.isDisplayed());
            Assert.assertTrue(adminPage.payrollDate.isDisplayed());
            Assert.assertTrue(adminPage.payrollMode.isDisplayed());
            Assert.assertTrue(adminPage.payrollStatus.isDisplayed());
            Assert.assertTrue(adminPage.payrollNetSalary.isDisplayed());
            Assert.assertTrue(adminPage.payrollAction.isDisplayed());

        }

        @And("The user clicks on the View Payslip link under the Action column on the Payslip List")
        public void theUserClicksOnTheLinkUnderTheActionColumnOnThePayslipList () {
            adminPage.payrollViewPayslipButton.click();
        }

        @Then("The user verifies that, the corresponding payslip for that period is displayed.")
        public void theUserVerifiesThatTheCorrespondingPayslipForThatPeriodIsDisplayed () {
            Assert.assertTrue(adminPage.payrollPayslipDetails.isDisplayed());
        }

        @Then("The user verifies that,  the Payroll page has a search textBox for searching within the Paylist.")
        public void theUserVerifiesThatThePayrollPageHasASearchTextBoxForSearchingWithinThePaylist () {
            Assert.assertTrue(adminPage.payrollSearchBox.isDisplayed());
        }

        @Then("the user verifies that,  the Payroll page allows filtering within the Paylist using menu headings.")
        public void theUserVerifiesThatThePayrollPageAllowsFilteringWithinThePaylistUsingMenuHeadings () {
            Assert.assertTrue(adminPage.payrollPayslip.isEnabled());
            Assert.assertTrue(adminPage.payrollMonthYear.isEnabled());
            Assert.assertTrue(adminPage.payrollDate.isEnabled());
            Assert.assertTrue(adminPage.payrollMode.isEnabled());
            Assert.assertTrue(adminPage.payrollStatus.isEnabled());
            Assert.assertTrue(adminPage.payrollNetSalary.isEnabled());
        }

        @When("The user clicks on the Leaves link button")
        public void theUserClicksOnTheLeavesLinkButton () {
            adminPage.adminProfilePageLeaves.click();
        }

        @Then("The user verifies that,  on the Leaves page, the Leave List is displayed with columns \\(Leave Type, Leave Date, Days, Apply Date, Status, Action).")
        public void theUserVerifiesThatOnTheLeavesPageTheLeaveListIsDisplayedWithColumnsLeaveTypeLeaveDateDaysApplyDateStatusAction
        () {
            Assert.assertTrue(adminPage.leavesLeaveType.isDisplayed());
            Assert.assertTrue(adminPage.leavesLeaveDate.isDisplayed());
            Assert.assertTrue(adminPage.leavesDays.isDisplayed());
            Assert.assertTrue(adminPage.leavesApplyDate.isDisplayed());
            Assert.assertTrue(adminPage.leavesStatus.isDisplayed());
            Assert.assertTrue(adminPage.leavesAction.isDisplayed());
        }

        @And("The user clicks on the view icon on the Leaves page below the Action column")
        public void theUserClicksOnTheViewIconOnTheLeavesPageBelowTheActionColumn () {
            adminPage.leavesViewButton.click();

        }

        @Then("The user verifies that, the relevant leave information is displayed.")
        public void theUserVerifiesThatTheRelevantLeaveInformationIsDisplayed () {
            adminPage.leavesViewDetails.isDisplayed();
        }

        @When("The user clicks on the Attendance link button")
        public void theUserClicksOnTheAttendanceLinkButton () {
            adminPage.adminProfilePageAttendance.click();
        }

        @Then("The user verifies that on the Attendance page, info boards \\(Total Present, Total Late, Total Absent, Total Half Day, Total Holiday) are visible.")
        public void theUserVerifiesThatOnTheAttendancePageInfoBoardsTotalPresentTotalLateTotalAbsentTotalHalfDayTotalHolidayAreVisible
        () {
            Assert.assertTrue(adminPage.attendanceTotalPresent.isDisplayed());
            Assert.assertTrue(adminPage.attendanceTotalLate.isDisplayed());
            Assert.assertTrue(adminPage.attendanceTotalAbsent.isDisplayed());
            Assert.assertTrue(adminPage.attendanceTotalHalfDay.isDisplayed());
            Assert.assertTrue(adminPage.attendanceTotalHoliday.isDisplayed());
        }

        @Then("The user verifies that on the Attendance page, a selectable attendance year is available.")
        public void theUserVerifiesThatOnTheAttendancePageASelectableAttendanceYearIsAvailable () {
            Assert.assertTrue(adminPage.selectableAttendanceYear.isEnabled());
        }

        @Then("The user verifies that, on the Attendance page, there is an explanation of the letters \\(P, L, A, F, H) used for attendance marking.")
        public void theUserVerifiesThatOnTheAttendancePageThereIsAnExplanationOfTheLettersPLAFHUsedForAttendanceMarking
        () {
            Assert.assertTrue(adminPage.attendanceExplanationOfTheLetters.isDisplayed());
        }

        @And("The user clicks on the columns icon")
        public void theUserClicksOnTheColumnsIcon () {
            adminPage.attendanceColumnsIcon.click();
        }

        @Then("The user verifies that, on the Attendance page, the Attendance List displays the staff's attendance for the selected month and days.")
        public void theUserVerifiesThatOnTheAttendancePageTheAttendanceListDisplaysTheStaffSAttendanceForTheSelectedMonthAndDays
        () {
            adminPage.attendanceDisplayOfSelectedDateMonth.isEnabled();

        }

        @And("The user clicks on the password link")
        public void theUserClicksOnThePasswordLink () {
            adminPage.topBarAccountOwnersPassword.click();
        }

        @Then("The user verifies that, the password link opens a page with Current Password, New Password, Confirm Password text boxes, and a Change Password button.")
        public void theUserVerifiesThatThePasswordLinkOpensAPageWithCurrentPasswordNewPasswordConfirmPasswordTextBoxesAndAChangePasswordButton
        () {
            Assert.assertTrue(adminPage.passwordChangeCurrentPasswordLine.isDisplayed());
            Assert.assertTrue(adminPage.passwordChangeNewPasswordLine.isDisplayed());
            Assert.assertTrue(adminPage.passwordChangeConfirmPasswordLine.isDisplayed());
            Assert.assertTrue(adminPage.passwordChangeChangePasswordButton.isDisplayed());
        }

        @And("The user enters valid values in the Current Password {string}, New Password {string}, and Confirm Password {string} text boxes")
        public void theUserEntersValidValuesInTheCurrentPasswordNewPasswordAndConfirmPasswordTextBoxes (String
        adminPassword, String newPassword, String newPasswordConfirm){

            adminPage.passwordChangeCurrentPasswordTextbox.sendKeys(ConfigReader.getProperty(adminPassword));
            adminPage.passwordChangeNewPasswordTextbox.sendKeys(ConfigReader.getProperty(newPassword));
            adminPage.passwordChangeConfirmPasswordTextbox.sendKeys(ConfigReader.getProperty(newPasswordConfirm));
        }

        @And("The user clicks on the Change Password button.")
        public void theUserClicksOnTheChangePasswordButton () {

            adminPage.passwordChangeChangePasswordButton.click();
        }

        @Then("The user verifies that, the password is changed.")
        public void theUserVerifiesThatThePasswordIsChanged () {
            Assert.assertTrue(adminPage.passwordChangeSuccessfullyChangedMessage.isDisplayed());
        }

        @And("The user clicks on the Logout link")
        public void theUserClicksOnTheLogoutLink () {
            adminPage.topBarAccountOwnersLogout.click();
        }

        @Then("The user verifies that, clicking on the Logout link in the window that opens when clicking on the profile icon in the admin panel's top bar, the admin is logged out of the admin panel.")
        public void theUserVerifiesThatClickingOnTheLogoutLinkInTheWindowThatOpensWhenClickingOnTheProfileIconInTheAdminPanelSTopBarTheAdminIsLoggedOutOfTheAdminPanel() {
            Assert.assertTrue(adminPage.adminLoginPage.isDisplayed());
        }


        //=====================================================


        //======================= US_023 ==================================

        @When("The user clicks Admin Login button on wonder world college page")
        public void the_user_clicks_admin_login_button_on_wonder_world_college_page () {
            loginPage.adminLoginButton.click();
        }
        @When("The user enters valid username in Username textbox on Admin Login page")
        public void the_user_enters_valid_username_in_username_textbox_on_admin_login_page () {
            String firstWhd = Driver.getDriver().getWindowHandle();
            String secondsWhd = "";
            Set<String> whd = Driver.getDriver().getWindowHandles();
            for (String eachWhd : whd
            ) {
                if (!eachWhd.equals(firstWhd)) {
                    secondsWhd = eachWhd;
                }
            }

            Driver.getDriver().switchTo().window(secondsWhd);

            loginPage.adminLoginUsernameTextbox.sendKeys(ConfigReader.getProperty("adminUsername_dln"));
        }
        @When("The user enters valid password in Password textbox on Admin Login page")
        public void the_user_enters_valid_password_in_password_textbox_on_admin_login_page () {
            loginPage.adminLoginPasswordTextbox.sendKeys(ConfigReader.getProperty("adminPassword_dln"));
        }
        @When("The user clicks Sing In buton")
        public void the_user_clicks_sing_in_buton () {
            loginPage.adminLoginSignInButton.click();
        }
        @When("The user clicks on the Student Information menu title in the sidebar in the admin panel")
        public void the_user_clicks_on_the_student_information_menu_title_in_the_sidebar_in_the_admin_panel () {
            adminPage.studentInformationButton.click();
        }
        @Then("The user verifies that the Student Detalis link is displayed in the drop-down menu")
        public void the_user_verifies_that_the_student_detalis_link_is_displayed_in_the_drop_down_menu () {
            assertTrue(adminPage.studentDetailsLink.isDisplayed());
        }
        @When("The user clicks on the Student Detalis link in the drop-down menu")
        public void the_user_clicks_on_the_student_detalis_link_in_the_drop_down_menu () {
            adminPage.studentDetailsLink.click();
        }
        @Then("The user verifies from the url she was redirected to the search page")
        public void the_user_verifies_from_the_url_she_was_redirected_to_the_search_page () {
            String expectedUrl = ConfigReader.getProperty("studentDetailsUrl");
            String actualUrl = Driver.getDriver().getCurrentUrl();
            assertEquals(expectedUrl, actualUrl);
        }

        @Then("The user verifies that Class dropdown in Select Criteria is visible")
        public void the_user_verifies_that_class_dropdown_in_select_criteria_is_visible () {
            assertTrue(adminPage.studentDetailsClassDropdown.isDisplayed());
        }
        @Then("The user verifies that Class dropdown in Select Criteria is active")
        public void the_user_verifies_that_class_dropdown_in_select_criteria_is_active () {
            assertTrue(adminPage.studentDetailsClassDropdown.isEnabled());
        }
        @Then("The user verifies that Section dropdown in Select Criteria is visible")
        public void the_user_verifies_that_section_dropdown_in_select_criteria_is_visible () {
            assertTrue(adminPage.studentDetailsSectionDropdown.isDisplayed());
        }
        @Then("The user verifies Section dropdown in Select Criteria is active")
        public void the_user_verifies_section_dropdown_in_select_criteria_is_active () {
            assertTrue(adminPage.studentDetailsSectionDropdown.isEnabled());
        }
        @Then("The user verifies that the Search By Keyword textbox in the Select Criteria section is visible")
        public void the_user_verifies_that_the_search_by_keyword_textbox_in_the_select_criteria_section_is_visible () {
            assertTrue(adminPage.studentDetailsSearchByKeywordTextbox.isDisplayed());
        }
        @Then("The user verifies that the Search By Keyword textbox in the Select Criteria section is active")
        public void the_user_verifies_that_the_search_by_keyword_textbox_in_the_select_criteria_section_is_active () {
            assertTrue(adminPage.studentDetailsSearchByKeywordTextbox.isEnabled());
        }
        @Then("The user verifies that the Search buttons in the Select Criteria section are visible")
        public void the_user_verifies_that_the_search_buttons_in_the_select_criteria_section_are_visible () {
            assertTrue(adminPage.studentDetailsFirstSearchButton.isDisplayed());
            assertTrue(adminPage.studentDetailsSecondSearchButton.isDisplayed());
        }
        @Then("The user verifies that the Search buttons in the Select Criteria section are active")
        public void the_user_verifies_that_the_search_buttons_in_the_select_criteria_section_are_active () {
            assertTrue(adminPage.studentDetailsFirstSearchButton.isEnabled());
            assertTrue(adminPage.studentDetailsSecondSearchButton.isEnabled());
        }


        //=========================================================




    @Then("The user verifies that a new section has been added")
    public void the_user_verifies_that_a_new_section_has_been_added() {

        assertTrue(adminPage.classBox_ClassNewLine().isDisplayed());

    }

    @When("The user enters different class information in \"\"Class\"\" and \"\"Section\"\" constructors")
    public void the_user_enters_different_class_information_in_class_and_section_constructors() {
        Select select = new Select(adminPage.classBox_ClassNewLine());
        select.selectByIndex(3);
        ReusableMethods.bekle(1);

        select = new Select(adminPage.sectionBox_ClassNewLine());
        select.selectByIndex(1);
        ReusableMethods.bekle(1);


    }







    //_________________________________________________________________________


    //=======================US_19==============================

    @When("User sees and clicks the Admin Login Button.")
    public void user_sees_and_clicks_the_admin_login_button() {
        loginPage.adminLoginButton.click();

    }

    @Then("User enters the {string} and {string} and clicks the Login Button.")
    public void userEntersTheAndAndClicksTheLoginButton(String email, String password) {
        String firstWhd = Driver.getDriver().getWindowHandle();
        String secondsWhd = "";
        Set<String> whd = Driver.getDriver().getWindowHandles();
        for (String each : whd

        ) {
            if (!each.equals(firstWhd)) {
                secondsWhd = each;
            }
        }
        Driver.getDriver().switchTo().window(secondsWhd);
        loginPage.adminLoginUsernameTextbox.sendKeys(email);
        loginPage.adminLoginPasswordTextbox.sendKeys(password);
        loginPage.adminLoginSignInButton.click();
    }


    @Then("Fees Master page link should be displayed under the Fees Collection menu title")
    public void fees_master_page_link_should_be_displayed_under_the_fees_collection_menu_title() {
        adminPage.feesCollectionClick.click();
    }

    @Then("Fees Master page link should be clicked and redirected to the feemaster page.")
    public void fees_master_page_link_should_be_clicked_and_redirected_to_the_feemaster_page() {
        adminPage.feesMasterClicl.click();
        String expectedUrl = ConfigReader.getProperty("feesMasterUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("Add Fees Master should be displayed")
    public void add_fees_master_should_be_displayed() {
        Assert.assertTrue(adminPage.addFeesMaster.isDisplayed());


    }

    @Then("Fees Group is displayed on the Add Fees Master page")
    public void fees_group_is_displayed_on_the_add_fees_master_page() {
        Assert.assertTrue(adminPage.feesGroup.isDisplayed());

    }

    @Then("Fees Type is displayed on the Add Fees Master page")
    public void fees_type_is_displayed_on_the_add_fees_master_page() {
        Assert.assertTrue(adminPage.feesType.isDisplayed());


    }

    @Then("Due Date is displayed on the Add Fees Master page")
    public void due_date_is_displayed_on_the_add_fees_master_page() {
        Assert.assertTrue(adminPage.dueDate.isDisplayed());
    }

    @Then("Amount Percantage\\(%), is displayed on the Add Fees Master page")
    public void amount_percantage_is_displayed_on_the_add_fees_master_page() {
        Assert.assertTrue(adminPage.amount.isDisplayed());

    }

    @Then("Fees Master \\(Fees Group, Fees Type, Due Date, Amount Percantage\\(%), Fix Amount textBoxes and Fine Type radio buttons should be seen")
    public void fees_master_fees_group_fees_type_due_date_amount_percantage_fix_amount_text_boxes_and_fine_type_radio_buttons_should_be_seen() {
        Assert.assertTrue(adminPage.fixAmount.isDisplayed());
        Assert.assertTrue(adminPage.FineTypeNone.isDisplayed());
        Assert.assertTrue(adminPage.percentageButon.isDisplayed());
        Assert.assertTrue(adminPage.finePencere.isDisplayed());
        Assert.assertTrue(adminPage.finePencere.isDisplayed());
        Assert.assertTrue(adminPage.fineAmount.isDisplayed());

    }

    @Then("Fees Master List \\(with Fees Group, Fees Code, Amount, Action titles) should be displayed.")
    public void fees_master_list_with_fees_group_fees_code_amount_action_titles_should_be_displayed() {
        Assert.assertTrue(adminPage.feesGroupList.isDisplayed());
        Assert.assertTrue(adminPage.feesCodeList.isDisplayed());
        Assert.assertTrue(adminPage.amountList.isDisplayed());
        Assert.assertTrue(adminPage.actionList.isDisplayed());

    }

    @Then("A searchBox appears to search through the Fees Master List")
    public void a_search_box_appears_to_search_through_the_fees_master_list() {
        Assert.assertTrue(adminPage.searchboxList.isDisplayed());

    }

    @Then("Valid values are entered in the Add Fees Master window.")
    public void valid_values_are_entered_in_the_add_fees_master_window() {

        Select select = new Select(adminPage.dropdownMenuElementi);
        select.selectByVisibleText("SDK2");
        Select select1 = new Select(adminPage.dropDowntBoxFeetype);
        select1.selectByVisibleText("6th Installment Fees");
        adminPage.dueDate.click();
        adminPage.date.click();
        adminPage.amount.sendKeys(ConfigReader.getProperty("Amount"));


    }

    @Then("After the valid values are entered in the Add Fees Master window, the Save button is clicked.")
    public void after_the_valid_values_are_entered_in_the_add_fees_master_window_the_save_button_is_clicked() {
        adminPage.addFeesMasterSave.click();

    }

    @Then("After clicking the Save button, a new Fees Master record is made.")
    public void after_clicking_the_save_button_a_new_fees_master_record_is_made() {
        Assert.assertTrue(adminPage.addFeesRecordSaved.isDisplayed());
    }

    // ======US25 TC5==
    @Then("Click on the edit icon in the Fees Main List.")
    public void click_on_the_edit_icon_in_the_fees_main_list() {
        adminPage.feesMasterListEdit.click();
    }

    @Then("Click on the edit icon in the Fees Master List and the Edit Fees Master window opens.")
    public void click_on_the_edit_icon_in_the_fees_master_list_and_the_edit_fees_master_window_opens() {
        Assert.assertTrue(adminPage.editFeesMaster.isDisplayed());
    }

    @Then("Update data in Edit Fees Master window and click the Save button")
    public void update_data_in_edit_fees_master_window_and_click_the_save_button() {
        Select select = new Select(adminPage.dropdownMenuElementi);
        select.selectByVisibleText("Certificate Fee");
        Select select1 = new Select(adminPage.dropDowntBoxFeetype);
        select1.selectByVisibleText("FERO");
        adminPage.dueDate.click();
        adminPage.date.click();
        adminPage.addFeesMasterSave.click();

        // adminPage.amount.sendKeys(ConfigReader.getProperty("Amount1"));

    }

    @Then("In the Edit Fees Master window, the registered fees are updated.")
    public void in_the_edit_fees_master_window_the_registered_fees_are_updated() {


    }

    @Then("Click the delete icon in the Fees Master List and the registered fees are deleted.")
    public void click_the_delete_icon_in_the_fees_master_list_and_the_registered_fees_are_deleted() {
        adminPage.feesMasterListDelete.click();
        Assert.assertTrue(adminPage.feesMasterListDelete.isDisplayed());


    }

    //=====uS30 TC1========
    @When("Move menu appears and clicked in sidebar in admin panel")
    public void move_menu_appears_and_clicked_in_sidebar_in_admin_panel() {
        adminPage.transport.isDisplayed();
        adminPage.transport.click();
    }

    @When("The Routes page link is displayed under the Transport menu title and")
    public void the_routes_page_link_is_displayed_under_the_transport_menu_title_and() {
        Assert.assertTrue(adminPage.routesClick.isDisplayed());


    }

    @When("Clicking the Routes page link under the Transport menu title leads to the route page")
    public void clicking_the_routes_page_link_under_the_transport_menu_title_leads_to_the_route_page() {
        adminPage.routesClick.click();
        String expectedUrl = ConfigReader.getProperty("routeUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    //US30 TC2

    @Then("Route Title textBox is active and visible in the Create Route window on the Route page")
    public void route_title_text_box_is_active_and_visible_in_the_create_route_window_on_the_route_page() {

        Assert.assertTrue(adminPage.Route_Title.isDisplayed());
        Assert.assertTrue(adminPage.Route_Title.isEnabled());

    }

    @Then("On the Route page, the Save button is active and visible in the Create Route window.")
    public void on_the_route_page_the_save_button_is_active_and_visible_in_the_create_route_window() {
        Assert.assertTrue(adminPage.saveRoute.isDisplayed());
        Assert.assertTrue(adminPage.saveRoute.isEnabled());

    }

    @Then("In the Create Route window, data is entered in the Route Title text box and saved")
    public void in_the_create_route_window_data_is_entered_in_the_route_title_text_box_and_saved() {
        adminPage.Route_Title.sendKeys("KÜBRA");
        adminPage.saveRoute.click();
    }

    @Then("Data is entered in the Route Title textBox, click on the Save button, and save the route.")
    public void data_is_entered_in_the_route_title_text_box_click_on_the_save_button_and_save_the_route() {
        Assert.assertTrue(adminPage.RecordSaved.isDisplayed());
    }

    @When("Route List should be displayed with Route Title and Action title")
    public void route_list_should_be_displayed_with_route_title_and_action_title() {
        Assert.assertTrue(adminPage.routeList.isDisplayed());
        Assert.assertTrue(adminPage.Route_Title.isDisplayed());
        Assert.assertTrue(adminPage.routeAction.isDisplayed());
    }

    @When("Necessary updates can be made and saved in the Edit Route window")
    public void necessary_updates_can_be_made_and_saved_in_the_edit_route_window() {
        adminPage.routeEdit.click();
        adminPage.Route_Title.sendKeys("TAN");
        adminPage.saveRoute.click();


    }
    @When("When the delete icon under the Action title is clicked, the record should be deleted.")
    public void when_the_delete_icon_under_the_action_title_is_clicked_the_record_should_be_deleted() {
     adminPage.routeDelete.click();
    }

    //################################# US_27 #############################################



    @Given("The user goes to the {string} address.")
    public void the_user_goes_to_the_address(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));

    }
    @When("Clicks on User Admin Login Button.")
    public void clicks_on_user_admin_login_button() throws InterruptedException {
        adminPage.adminLoginButton.click();
        Thread.sleep(1000);


    }
    @Then("User Click the Login button to protect the username and password.")
    public void user_click_the_login_button_to_protect_the_username_and_password() {
        loginPage.adminNameBox.sendKeys(ConfigReader.getProperty("adminUsername_dgn"));

    }


    @Then("In the sidebar in the Admin panel, the user clicks on the {string} table under the {string} menu heading.")
    public void ın_the_sidebar_in_the_admin_panel_the_user_clicks_on_the_table_under_the_menu_heading(String string, String string2) {
        adminPage.adminFeesTypeButton.click();
        adminPage.getAdminFeesCollectionButton.click();



    }
    @Then("User verifies that the {string} window opens.")
    public void user_verifies_that_the_window_opens(String string) {
        assertTrue(adminPage.adminFeesTypeVerification.isDisplayed());

    }
    @Then("The user closes the page.")
    public void turn_off_user_security() {
        Driver.closeDriver();

    }


    @Then("The user should verify that there are {string},{string},{string},{string} buttons in the {string} section of the page that opens.")
    public void the_user_should_verify_that_there_are_buttons_in_the_section_of_the_page_that_opens(String string, String string2, String string3, String string4, String string5) {
        assertTrue(adminPage.adminFeesTypeNameBox.isDisplayed());
        assertTrue(adminPage.adminFeesTypeCodeBox.isDisplayed());
        assertTrue(adminPage.adminFeesTypeDescriptionBox.isDisplayed());
        assertTrue(adminPage.adminFeesTypeSaveButton.isDisplayed());

    }

    @Then("The user additionally verifies that there are columns {string},{string},{string} in the {string} section of the same page.")
    public void the_user_additionally_verifies_that_there_are_columns_in_the_section_of_the_same_page(String string, String string2, String string3, String string4) {
        assertTrue(adminPage.adminFeesTypeListName.isDisplayed());
        assertTrue(adminPage.adminFeesTypeListFeesCode.isDisplayed());
        assertTrue(adminPage.adminFeesTypeListAction.isDisplayed());

    }

    @When("The user clicks on the Fees Collection menu item on the sidebar in the Admin panel.")
    public void the_user_clicks_on_the_fees_collection_menu_item_on_the_sidebar_in_the_admin_panel() {
        adminPage.adminFeesTypeButton.click();

    }
    @Then("User must enter valid data in Add Fees Type window and click Save button.")
    public void user_must_enter_valid_data_in_add_fees_type_window_and_click_save_button() {
        adminPage.adminFeesTypeNameBox.sendKeys("Tala");
        actions.sendKeys(Keys.TAB);
        adminPage.adminFeesTypeCodeBox.sendKeys("123456");
        adminPage.adminFeesTypeListSaveButton.click();

    }
    @Then("The user should confirm that a new Add Fees Type is created when he clicks the {string} button.")
    public void the_user_should_confirm_that_a_new_add_fees_type_is_created_when_he_clicks_the_button(String string) {
        assertTrue(adminPage.adminRecordUpdatedSuccessfully.isDisplayed());

    }



    @When("User clicks {string} icon in {string} section.")
    public void user_clicks_icon_in_section(String string, String string2) {
        adminPage.adminEditButton.click();
    }

    @When("The user updates the data in the {string} window that opens.")
    public void the_user_updates_the_data_in_the_window_that_opens(String string) {
        adminPage.adminFeesTypeNameBox.clear();
        adminPage.adminFeesTypeCodeBox.clear();
        adminPage.adminFeesTypeNameBox.sendKeys("Nalan");
        actions.sendKeys(Keys.TAB);
        adminPage.adminFeesTypeCodeBox.sendKeys("654321");

    }
    @When("The user clicks the {string} button and confirms that the changes have been saved.")
    public void the_user_clicks_the_button_and_confirms_that_the_changes_have_been_saved(String string) {
        adminPage.adminFeesTypeListSaveButton.click();

    }
    @Then("The user should verify that the {string} section has been refreshed.")
    public void the_user_should_verify_that_the_section_has_been_refreshed(String string) {
        assertTrue(adminPage.adminRecordUpdatedSuccessfully.isDisplayed());
    }

    @Then("The user clicks the {string} icon in the {string} section.")
    public void the_user_clicks_the_icon_in_the_section(String string, String string2) throws InterruptedException {
        adminPage.adminDeleteButton.click();
        Thread.sleep(1000);

    }
    @Then("The user deletes the selected Fee Type from the list.")
    public void the_user_deletes_the_selected_fee_type_from_the_list() {
        driver.switchTo().alert().accept();

    }

    //############################################### US_31 #########################################################



    @Then("The user clicks on the {string} menu item on the sidebar in the Admin panel.")
    public void the_user_clicks_on_the_menu_item_on_the_sidebar_in_the_admin_panel(String string) {
        adminPage.adminAcademicsButton.click();

    }
    @Then("The user clicks on the {string} page displayed under the {string} menu title on the sidebar in the Admin panel.")
    public void the_user_clicks_on_the_page_displayed_under_the_menu_title_on_the_sidebar_in_the_admin_panel(String string, String string2) {
        adminPage.adminAssignClassTeacherButton.click();

    }
    @Then("The user confirms that the page that opens is {string}.")
    public void the_user_confirms_that_the_page_that_opens_is(String string) {
        Driver.getDriver().getTitle().equalsIgnoreCase("assign_class_teacher");

    }
    @Then("The user verifies that in the {string} section, all teachers with checkboxes under the {string} column are displayed.")
    public void the_user_verifies_that_in_the_section_all_teachers_with_checkboxes_under_the_column_are_displayed(String string, String string2) {
        assertTrue(adminPage.adminClassTeacherList.isDisplayed());
    }

    @Then("The user verifies that the {string} and {string} drop-down menus are visible on the page that opens.")
    public void the_user_verifies_that_the_and_drop_down_menus_are_visible_on_the_page_that_opens(String string, String string2) {
        assertTrue(adminPage.adminClassSelectBox.isDisplayed());
        assertTrue(adminPage.adminSectionSelectBox.isDisplayed());

    }

    @Then("User verifies being displayed from the {string} control in the {string} section.")
    public void user_verifies_being_displayed_from_the_control_in_the_section(String string, String string2) {
        actions.sendKeys(Keys.END).perform();
        assertTrue(adminPage.adminAssignClassTeacherSaveButton.isDisplayed());

    }

    @Then("The user confirms that the teacher has been assigned to the selected class by selecting the {string} and {string} in the {string} section, marking the teacher to be assigned, clicking the {string} button.")
    public void the_user_confirms_that_the_teacher_has_been_assigned_to_the_selected_class_by_selecting_the_and_in_the_section_marking_the_teacher_to_be_assigned_clicking_the_button(String string, String string2, String string3, String string4) {
        Select select = new Select(adminPage.adminClassSelectBox);
        select.selectByIndex(1);
        select= new Select(adminPage.adminSectionSelectBox);
        select.selectByIndex(1);
        adminPage.adminTeacherBox.click();
        actions.sendKeys(Keys.END).perform();
        adminPage.adminAssignClassTeacherSaveButton.click();
        actions.sendKeys(Keys.HOME).perform();
        assertTrue(adminPage.adminRecordSavedSuccessfully.isDisplayed());

    }

    @Then("It is verified that there are Class, Department, Class Teacher and Action columns on the {string} side in the User {string} section.")
    public void ıt_is_verified_that_there_are_class_department_class_teacher_and_action_columns_on_the_side_in_the_user_section(String string, String string2) {
        assertTrue(adminPage.adminClassTeacherListClassText.isDisplayed());
        assertTrue(adminPage.adminClassTeacherListSectionText.isDisplayed());
        assertTrue(adminPage.adminClassTeacherListClassTeacherText.isDisplayed());
        assertTrue(adminPage.adminFeesTypeListAction.isDisplayed());
    }


    @Then("The user clicks the {string} icon under the {string} column in the {string} in the {string} section.")
    public void the_user_clicks_the_icon_under_the_column_in_the_in_the_section(String string, String string2, String string3, String string4) {
        adminPage.adminEditButton.click();
        ReusableMethods.bekle(2);
    }


    @Then("The user confirms that the classroom teacher assignment has been updated in the {string} window.")
    public void the_user_confirms_that_the_classroom_teacher_assignment_has_been_updated_in_the_window(String string) {
        Select select = new Select(adminPage.adminClassSelectBox);
        select.selectByIndex(2);
        select= new Select(adminPage.adminSectionSelectBox);
        select.selectByIndex(1);
        ReusableMethods.bekle(1);
        ReusableMethods.jseClick(adminPage.adminTeacherBox);

        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(1);
        ReusableMethods.jseClick(adminPage.adminAssignClassTeacherSaveButton);

        ReusableMethods.bekle(3);

        String expected = "Record Updated Successfully";
        String actual = adminPage.adminAssignRecordUpdatedSuccessfully.getText();

        assertEquals(expected,actual);

    }


    @Then("The user class-teacher assignment is deleted.")
    public void the_user_class_teacher_assignment_is_deleted() {
        String expected = "Record Delete Successfully";
        String actual = adminPage.adminRecordDeleteSuccessfully.getText();

        assertEquals(expected,actual);
    }

    @Then("The user clicks the Delete icon under the Action column in the Classroom List in the Assign Classroom Teacher section")
    public void theUserClicksTheDeleteIconUnderTheActionColumnInTheClassroomListInTheAssignClassroomTeacherSection() {
        adminPage.adminDeleteTeacherButton.click();
    }

}


