package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationConfirmationPage {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement returnToHomePageButton;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement successPageText;

    public String successPage_Text () {
        return successPageText.getText();
    }

    public void clickReturn_HomePageButton(){
        returnToHomePageButton.click();
    }
    public RegistrationConfirmationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}


