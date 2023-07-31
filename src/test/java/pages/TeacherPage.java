package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherPage {
    public TeacherPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
