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

    //************************* Methods ********************

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

    //==================================================================
}
