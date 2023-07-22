package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CourseOptionPage {
    public CourseOptionPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
