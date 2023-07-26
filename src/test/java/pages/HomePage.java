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




    //Home page logo
    @FindBy(xpath = "//div[@name='name']")
    public WebElement logo;



    //=========================================================


    //====================us005=========================



    //=========================================================


}
