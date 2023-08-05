package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOptionPage {

@FindBy(xpath = "//*[@id=\"flexRadioButton2\"]")
private WebElement clickOnPreferredCourse;
@FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
private WebElement clickOnNextButtonFromCourseOption;
@FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[1]")
private WebElement clickOnPreviewButtonFromCourseOption;
public void clickOn_PreviewButtonFromCourseOption() {
    clickOnPreviewButtonFromCourseOption.click();
}
public void clickOn_PreferredCourse(){
    clickOnPreferredCourse.click();
}
public void clickOn_NextButtonFromCourseOption(){
    clickOnNextButtonFromCourseOption.click();
}
public void fillCourseOptionValidData(){
    clickOn_PreferredCourse();
    clickOn_NextButtonFromCourseOption();
}
    public CourseOptionPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
