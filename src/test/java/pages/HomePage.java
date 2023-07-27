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
    @FindBy(xpath = "(//img)[1])")
    public WebElement logoCollege_header;

    //WonderWorldCollege logo in the header section of the homepage.
    @FindBy(xpath = "//div[text()='Latest News']")
    public WebElement latestNewsText_header;

    //WonderWorldCollege "Follow Us" text in the header section of the homepage.
    @FindBy(xpath = "//li[text()='Follow Us']")
    public WebElement FoollowUsText_header;

    //WonderWorldCollege facebook link in the header section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-facebook'])[1]")
    public WebElement facebookLink_header;

    //WonderWorldCollege facebook link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
    public WebElement facebookLink_footer;

    //WonderWorldCollege twitter link in the header section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-twitter'])[1]")
    public WebElement twitteLink_header;

    //WonderWorldCollege twitter link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-twitter'])[2]")
    public WebElement twitterLink_footer;


    //WonderWorldCollege google-plus link in the header section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-google-plus'])[1]")
    public WebElement googlePlusLink_header;

    //WonderWorldCollege google-plus link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-google-plus'])[2]")
    public WebElement googlePlusLink_footer;

    //WonderWorldCollege YouTube link in the header section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-google-plus'])[1]")
    public WebElement youTubeLink_header;

    //WonderWorldCollege YouTube link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-google-plus'])[2]")
    public WebElement youTubeLink_footer;












    //=========================================================


    //====================us005=========================



    //=========================================================


}
