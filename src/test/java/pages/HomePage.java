package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //======================ortak============================

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
    public WebElement teitteLink_header;

    //WonderWorldCollege twitter link in the footer section of the homepage.
    @FindBy(xpath = "(//i[@class='fa fa-twitter'])[2]")
    public WebElement twitterLink_footer;


    //=========================================================


    //====================us005=========================



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
}
