package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //======================ortak==============================

    //WonderWorldCollege logo in the header section of the homepage.
    @FindBy(xpath = "(//img)[1]")
    public WebElement logoCollege_header;

    //WonderWorldCollege logo in the header section of the homepage.
    @FindBy(xpath = "//div[text()='Latest News']")
    public WebElement latestNewsText_header;

    //WonderWorldCollege "Follow Us" text in the header section of the homepage.
    @FindBy(xpath = "//li[text()='Follow Us']")
    public WebElement FoollowUsText_header;

    //WonderWorldCollege "facebook" link in the header section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-facebook'])[1]")
    public WebElement facebookLink_header;

    //WonderWorldCollege "facebook" link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
    public WebElement facebookLink_footer;

    //WonderWorldCollege "twitter" link in the header section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-twitter'])[1]")
    public WebElement twitterLink_header;

    //WonderWorldCollege "twitter" link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-twitter'])[2]")
    public WebElement twitterLink_footer;



    //=========================================================


    //====================us005=========================

    @FindBy(xpath = "//*[@class='container spacet60']")
    public WebElement aboutUsPage;

    @FindBy(xpath = "//*[@class='col-md-12 spacet60 pt-0-mobile']")
    public WebElement aboutUsPageWWA_WCOI;

    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4 col-sm-4'])[1]")
    public WebElement aboutUsPageScholarshipFacility;

    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4 col-sm-4'])[2]")
    public WebElement aboutUsPageSkilledLecturers;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4 col-sm-4'])[3]")
    public WebElement aboutUsPageBookLibraryStore;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4 col-sm-4'])[4]")
    public WebElement aboutUsPageLibraryFacilities;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4 col-sm-4'])[5]")
    public WebElement aboutUsPageBookCollection;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4 col-sm-4'])[6]")
    public WebElement aboutUsPageDigitalResources;





    //========================Hamza=================================
    //WonderWorldCollege academic dropdown menu xpatch location on homepage
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/a")
    public WebElement Academics_DropDown;
    //WonderWorldCollege Teacher location in the Academic drop-down menu on the home page
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/ul/li[6]/a")
    public WebElement Academics_DropDown_Teacher;
    //WonderWorld College Homepage -> Login Button
    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[9]/div/div[2]/h3")
    public WebElement HomePage_Teacher_Lastname;
    //WonderWorld College Homepage -> Login Button -> Branch
    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[9]/div/div[2]/span")
    public WebElement HomePage_Teacher_branch;

    //WonderWorldCollege "google-plus" link in the header section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-google-plus'])[1]")
    public WebElement googlePlusLink_header;

    //WonderWorldCollege "google-plus" link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-google-plus'])[2]")
    public WebElement googlePlusLink_footer;

    //WonderWorldCollege "YouTube" link in the header section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-youtube'])[1]")
    public WebElement youTubeLink_header;

    //WonderWorldCollege "YouTube" link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-youtube'])[2]")
    public WebElement youTubeLink_footer;

    //WonderWorldCollege "LinkedIn" link in the header section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-linkedin'])[1]")
    public WebElement linkedinLink_header;

    //WonderWorldCollege "LinkedIn" link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-linkedin'])[2]")
    public WebElement linkedinLink_footer;

    //WonderWorldCollege "instagram" link in the header section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-instagram'])[1]")
    public WebElement instagramLink_header;

    //WonderWorldCollege "instagram" link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-instagram'])[2]")
    public WebElement instagramLink_footer;

    //WonderWorldCollege "pinterest" link in the header section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-pinterest'])[1]")
    public WebElement pinterestLink_header;

    //WonderWorldCollege "pinterest" link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-pinterest'])[2]")
    public WebElement pinterestLink_footer;

    //WonderWorldCollege "mail address" in the header section of the homepage.
    @FindBy(xpath = "//a[@href='mailto:info@wonderworldcollege.com']")
    public WebElement mailInfo_header;

    //WonderWorldCollege "Call Us" in the header section of the homepage.
    @FindBy(xpath = "//div[text()='Call Us']")
    public WebElement callUs;

    //WonderWorldCollege "Call Us" in the header section of the homepage.
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButton;

    //WonderWorldCollege "home" link in the header section of the homepage.
    @FindBy(xpath = "(//a[text()='Home'])[1]")
    public WebElement homeLink_header;

    //WonderWorldCollege "home" link in the footer section of the homepage.
    @FindBy(xpath = "(//a[text()='Home'])[2]")
    public WebElement homeLink_footer;

    //WonderWorldCollege "Online Admission" link in the header section of the homepage.
    @FindBy(xpath = "//a[text()='Online Admission']")
    public WebElement onlineAdmissionLink_header;


    //WonderWorldCollege "Online Admission" link in the header section of the homepage.
    @FindBy(xpath = "//a[text()='Exam Result']")
    public WebElement examResultLink_header;

    //WonderWorldCollege "About Us" link in the header section of the homepage.
    @FindBy(xpath = "(//a[text()='About Us'])[1]")
    public WebElement aboutUsLink_header;

    //WonderWorldCollege "About Us" link in the footer section of the homepage.
    @FindBy(xpath = "(//a[text()='About Us'])[2]")
    public WebElement aboutUsLink_footer;


    //WonderWorldCollege "Academics " link in the header section of the homepage.
    @FindBy(xpath = "//a[text()='Academics ']")
    public WebElement academicsLink_header;

    //WonderWorldCollege "Course" link in the header section of the homepage.
    @FindBy(xpath = "(//a[text()='Course'])[1]")
    public WebElement courseLink_header;

    //WonderWorldCollege "Course" link in the footer section of the homepage.
    @FindBy(xpath = "(//a[text()='Course'])[2]")
    public WebElement courseLink_footer;

    //WonderWorldCollege "Gallery" link in the header section of the homepage.
    @FindBy(xpath = "(//a[text()='Gallery'])[1]")
    public WebElement gelleryLink_header;

    //WonderWorldCollege "Gallery" link in the footer section of the homepage.
    @FindBy(xpath = "(//a[text()='Gallery'])[2]")
    public WebElement galleryLink_footer;

    //WonderWorldCollege "News" link in the header section of the homepage.
    @FindBy(xpath = "(//a[text()='News'])[1]")
    public WebElement newsLink_header;

    //WonderWorldCollege "News" link in the footer section of the homepage.
    @FindBy(xpath = "(//a[text()='News'])[2]")
    public WebElement newsLink_footer;

    @FindBy(xpath = "(//a[text()='Contact'])[1]")
    public WebElement contactLink_header;

    //WonderWorldCollege "Gallery" link in the footer section of the homepage.
    @FindBy(xpath = "(//div[@class='cright'])[1]")
    public WebElement contactLink_footer;

    //WonderWorldCollege "email Us" link in the footer section of the homepage.
    @FindBy(xpath = "(//div[@class='cright'])[2]")
    public WebElement emailUsLink_footer;


    //WonderWorldCollege "Contact Us" link in the footer section of the homepage.
    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUs_footer;

    //WonderWorldCollege "adress" link in the footer section of the homepage.
    @FindBy(xpath = "(//div[@class='cright'])[3]")
    public WebElement addressLink_footer;



    //=========================================================

    //========================= US_02 - US_011 - US_014================================

    // Site logo in WonderWorldCollege home page top bar.
    @FindBy(xpath = "//img[@src='https://qa.wonderworldcollege.com/./uploads/school_content/logo/front_logo-608ff44a5f8f07.35255544.png']")
    public WebElement WonderWorldCollegeSiteLogo;

    @FindBy(xpath = "//a[text()='Facilities']")
    public WebElement facilitiesLink;

    @FindBy(xpath = "//a[text()='School Uniform']")
    public WebElement schoolUniformLink;

    @FindBy(xpath = "//a[text()='Principal Message']")
    public WebElement principalMessageLink;

    @FindBy(xpath = "//a[text()='Know Us']")
    public WebElement knowUsLink;

    @FindBy(xpath = "//a[text()='Approach']")
    public WebElement approachLink;

    @FindBy(xpath = "//a[text()='Teacher']")
    public WebElement teacherLink;

    @FindBy(xpath = "//a[text()='Houses & Mentoring']")
    public WebElement housesMentoringLink;

    @FindBy(xpath = "//a[text()='Student Council']")
    public WebElement studentCouncilLink;

    @FindBy(xpath = "//i[@class='fa fa-pencil-square-o i-plain']")
    public WebElement footerComplainIcon;

    @FindBy(xpath = "//a[@href='https://qa.wonderworldcollege.com/page/complain']")
    public WebElement footerComplainText;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement complainPageNameTextbox;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement complainPageEmailTextbox;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement complainPageContactNoTextbox;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement complainPageDescriptionTextbox;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement complainPageSubmitButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement complainPageConfirmationMessage;


    //=========================================================


    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement contactLink_Name;

    @FindBy(xpath = "(//input[@id='email'])[3]")
    public WebElement contactLink_Email;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement contactLink_Subject;

    @FindBy(xpath = "//textarea[@id='description'] ")
    public WebElement contactLink_Description;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement contactLink_Submit;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public  WebElement contactLink_Alert;

    @FindBy(xpath = "//h3[text()='Our Location']")
    public WebElement contactlink_OurLocation;

    @FindBy(xpath = "//h3[text()='CALL US']")
    public WebElement contactlink_CallUs;

    @FindBy(xpath = "//h3[text()='Working Hours']")
    public WebElement contactLink_WorkingHours;

    @FindBy(className = "toast-message")
    public WebElement warningMessage;

    @FindBy(xpath = "//h2[text()='Send In Your Query']")
    public WebElement contactLink_pageTitle;



    @FindBy(xpath = "//p[text()='The Name field is required.']")
    public WebElement complainPageNameFieldMessage;

    @FindBy(xpath = "//p[text()='The Email field is required.']")
    public WebElement complainPageEmailFieldMessage;

    @FindBy(xpath = "//p[text()='The Email field must contain a valid email address.']")
    public WebElement complainPageValidEmailFieldMessage;

    @FindBy(xpath = "//p[text()='The Contact No field is required.']")
    public WebElement complainPageContactNoFieldMessage;

    @FindBy(xpath = "//h2[text()='OUR EXPERIENCED STAFFS']")
    public WebElement ourExperiencedStaffsText;

    @FindBy(xpath = "//span[text()='Graduates']")
    public WebElement graduatesText;

    @FindBy(xpath = "(//h3[text()='Anthony Carter'])[2]")
    public WebElement ourExperiencedStaffsAnthonyCarter;

    @FindBy(xpath = "(//h3[text()='Ava Turner'])[2]")
    public WebElement ourExperiencedStaffsAvaTurner;

    @FindBy(xpath = "(//h3[text()='David Morgan'])[2]")
    public WebElement ourExperiencedStaffsDavidMorgan;

    @FindBy(xpath = "(//h3[text()='Lily Peterson'])[2]")
    public WebElement ourExperiencedStaffsLilyPeterson;




    public void wonderWorldCollegeSiteLogoIsVisible(){
        WonderWorldCollegeSiteLogo.isDisplayed();
    }
    public void footerComplainIconIsVisiable(){
        footerComplainIcon.isDisplayed();
    }
    public void footerComplainTextIsVisiable(){
        footerComplainText.isDisplayed();
    }
    public void ourExperiencedStaffsAnthonyCarterIsVisiable(){
        ourExperiencedStaffsAnthonyCarter.isDisplayed();
    }
    public void ourExperiencedStaffsAvaTurnerIsVisiable(){
        ourExperiencedStaffsAvaTurner.isDisplayed();
    }
    public void ourExperiencedStaffsDavidMorganIsVisiable(){
        ourExperiencedStaffsDavidMorgan.isDisplayed();
    }
    public void ourExperiencedStaffsLilyPetersonIsVisiable(){
        ourExperiencedStaffsLilyPeterson.isDisplayed();
    }


//=====================0US7==========================================

    @FindBy(xpath = "//a[@href='https://qa.wonderworldcollege.com/page/gallery']")
    public WebElement GalleryHeader;


    @FindBy(xpath = "(//div[@class='evcontentfix'])[1]")
    public WebElement ArtMusicTitle;


    @FindBy(xpath = "(//div[@class='evcontentfix'])[2]")
    public WebElement CampusTitle;


    @FindBy(xpath = "(//div[@class='evcontentfix'])[3]")
    public WebElement ActivitesTitle;


    @FindBy(xpath = "(//div[@class='evcontentfix'])[1]")
    public WebElement PrePrimaryTitle;


    @FindBy(xpath = "(//div[@class='evcontentfix'])[1]")
    public WebElement ClassroomsTitle;


    @FindBy(xpath = "(//div[@class='evcontentfix'])[1]")
    public WebElement SportsTitle;


    @FindBy(xpath = "//h1")
    public WebElement ArtMusicHeader_InPage;


    @FindBy(xpath = "//h1")
    public WebElement CampusPage_InPage;

    @FindBy(xpath = "//h1")
    public WebElement ActivitiesPanel_InPage;


    @FindBy(xpath = "//h1")
    public WebElement PrePrimaryPanel_InPage;


    @FindBy(xpath = "//h1")
    public WebElement ClassesPanel_InPage_InPage;

    @FindBy(xpath = "(//h3)[2]")
    public WebElement campusTitle_gallery;

    @FindBy(xpath = "//h1")
    public WebElement SportsDashboard_InPage;


    //=============0US10=========================

    //slider of images  Homepage
    @FindBy(xpath = "//img[@src='https://qa.wonderworldcollege.com/uploads/gallery/media/top-banner2-2.jpg']")
    public WebElement sliderOfImages_Homepage;
    @FindBy(xpath = "//a[@class='right carousel-control']")
    public WebElement sliderRigtButton_Homepage;

    @FindBy(xpath = "//*[@id=\"bootstrap-touch-slider\"]/div/div[1]")
    public WebElement slider1_Homepage;

    @FindBy(xpath = "//*[@id=\"bootstrap-touch-slider\"]/div/div[2]")
    public WebElement slider2_Homepage;

    @FindBy(xpath = "//*[@id=\"bootstrap-touch-slider\"]/div/div[3]")
    public WebElement slider3_Homepage;

    @FindBy(xpath = "//*[@id=\"bootstrap-touch-slider\"]/div/div[4]")
    public WebElement slider4_Homepage;

    @FindBy(xpath = "//*[@id=\"bootstrap-touch-slider\"]/div/div[5]")
    public WebElement slider5_Homepage;
    @FindBy(xpath = "(//a[text()='Gallery'])[1]")
    public WebElement galleryTitle;

    @FindBy(xpath = "(//a[text()='Gallery'])[1]")
    public WebElement galleryButton;

    //########################## US_06 ###############################

    @FindBy(xpath = "//h4[text()='English and Literature']")
    public WebElement englishandLiteratureText;

    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-4'][2])")
    public WebElement mathematicsText;
    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-4'][3])")
    public WebElement sciencesText;
    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-4'][4])")
    public WebElement scialSciencesText;
    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-4'][5])")
    public WebElement historyText;
    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-4'][6])")
    public WebElement artsAndMusicText;
    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-4'][7])")
    public WebElement healthAndExerciseSciencesText;
    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-4'][8])")
    public WebElement foreignLanguaText;
    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-4'][9])")
    public WebElement computerSciencesText;

    @FindBy(xpath = "(//a[@href='https://qa.wonderworldcollege.com/page/course'][1])")
    public WebElement courseTitle;
    @FindBy(xpath = "(//a[@class='btn-read'])[1]")
    public WebElement englishandLiteratureDetails;
    @FindBy(xpath = "(//a[@class='btn-read'])[2]")
    public WebElement mathematicsDetails;
    @FindBy(xpath = "(//a[@class='btn-read'])[3]")
    public WebElement sciencesDetails;
    @FindBy(xpath = "(//a[@class='btn-read'])[4]")
    public WebElement scialSciencesDetails;
    @FindBy(xpath = "(//a[@class='btn-read'])[5]")
    public WebElement historyDetails;
    @FindBy(xpath = "(//a[@class='btn-read'])[6]")
    public WebElement artsAndMusicDetails;
    @FindBy(xpath = "(//a[@class='btn-read'])[7]")
    public WebElement healthAndExerciseSciencesDetails;
    @FindBy(xpath = "(//a[@class='btn-read'])[8]")
    public WebElement foreignLanguaDetails;
    @FindBy(xpath = "(//a[@class='btn-read'])[9]")
    public WebElement computerSciencesDetails;
    @FindBy(xpath = "//img[@class='img-responsive img-rounded']")
    public WebElement englishandLiteratureTitle;


    //========================= US_03================================

    @FindBy(xpath = "//*[text()='Online Admission']")
    public WebElement OnlineAdmissionButton;

    @FindBy(xpath = "//*[text()='Instructions']")
    public WebElement InstructionSection;

    //BasicSection Class,First name,last name, gender, date of birth and email.
    @FindBy(xpath = "//*[text()='Class']")
    public WebElement BasicSectionClassButonu;


    @FindBy(xpath = "//*[text()='First Name']")
    public WebElement BasicSecFirstName;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement fisrtnamesection;

    @FindBy(xpath = "//*[text()='Last Name']")
    public WebElement BasicSecLastName;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastnamesection;


    @FindBy(xpath = "//*[text()='Gender']")
    public WebElement BasicSecGender;

    @FindBy(xpath = "//option[text()='Female']")
    public WebElement GenderFemailbutonu;


    @FindBy(xpath = "(//tbody/tr/td)[7]")
    public WebElement OnlineAddmissionDOB;

    @FindBy(xpath ="(//input[@class='form-control date2'])[1]")
    public WebElement DateofbirthButonu;



    @FindBy(xpath = "//input[@name='mobileno']")
    public WebElement BasicSecMobileNumber;

    @FindBy(xpath = "(//input[@class='form-control'])[6]")
    public WebElement BasicSecEmail;

    @FindBy(xpath = "//div/input[@name='father_name']" )
    public WebElement FatherName;

    @FindBy(xpath = "//div/input[@name='mother_name']" )
    public WebElement MotherName;

    @FindBy(xpath = "//div/label[@class='radio-inline'][2]")
    public WebElement GuardMother;

    @FindBy(xpath = "//div/label[@class='radio-inline'][1]")
    public WebElement GuardFather;

    @FindBy(xpath = "//div/label[@class='radio-inline'][3]")
    public WebElement GuardOther;

    @FindBy(xpath = "//div/input[@id='guardian_name']")
    public WebElement GuardianName;

    @FindBy(xpath = "//div/input[@id='guardian_relation']")
    public WebElement GuardionRel;

    @FindBy(xpath = "//div/input[@id='guardian_email']")
    public WebElement GuardEmail;

    @FindBy(xpath = "//div/label[text()='Guardian Photo']")
    public WebElement GuardianPhoto;

    @FindBy(xpath = "//div/input[@id='guardian_phone']")
    public WebElement GuardianPhone;

    @FindBy(xpath = "//div/input[@id='guardian_occupation']")
    public WebElement GuardianOcc;

    @FindBy(xpath = "//div/textarea[@id='guardian_address']")
    public WebElement GuardianAddress;

    @FindBy(xpath ="//div/input[@id='adhar_no']" )
    public WebElement NIdNumber;

    @FindBy(xpath = "//div/textarea[@name='previous_school']")
    public WebElement PreSchoolDetails;

    @FindBy(xpath = "//div/button[@class='onlineformbtn mt10']")
    public WebElement SubmitButonu;

    @FindBy(xpath = "//div/ul/li[text()='Reference No']")
    public WebElement RefNumber;

    @FindBy(xpath = "//span[text()='Not Submitted']")
    public WebElement FormStatus;

    @FindBy(xpath = "//div/input[@type='checkbox']")
    public WebElement IAgreeCheckBox;

    @FindBy(xpath = "//a[text()='I Agree To The Terms And Conditions']")
    public WebElement IAgreeYazisi;

    @FindBy(xpath = "//button[@id='submitbtn']")
    public WebElement IAgreeSubmit;

    @FindBy(xpath = "//div[text()='Form Has Been Submitted Successfully..!! ']")
    public WebElement SuccessfulYazisi;

    @FindBy(xpath = "//span[text()='Submitted']")
    public WebElement SubmittedYazisi;

    @FindBy(xpath = "//h4[text()='Upload Documents']")
    public WebElement scrollsToSubmittedYazisi;



    //US4

    @FindBy(xpath ="//li/a[text()='Exam Result']")
    public WebElement ExamResult;

    @FindBy(xpath = "//div/h3[@class='entered mt0']")
    public WebElement ExamResultYazisi;

    @FindBy(xpath ="//input[@id='admission_no']")
    public WebElement AdmissionNo;

    @FindBy(xpath = "//select[@class='form-control']")
    public WebElement ExamSelect;

    //US15

    @FindBy(xpath = "//div/h2[text()='WHAT PEOPLE SAYS']")
    public WebElement WhatPeopleSay;

    @FindBy(xpath = "(//h3[text()='Ava Turner'])[2]")
    public WebElement scrolltoWPS;





}
