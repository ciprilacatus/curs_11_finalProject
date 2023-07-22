package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformationPage {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement inputFirstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement inputLastName;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement inputUsername;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement inputConfirmPassword;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clickNextButton_FromPersonalInformationStep;



    public void inputValueInFirstNameField(String string){
        inputFirstName.sendKeys(string);
    }
    public void inputValueInLastNameField(String string){
        inputLastName.sendKeys(string);
    }
    public void inputValueInUsernameField(String string){
        inputUsername.sendKeys(string);
    }
    public void inputValueInPasswordField(String string) {
        inputPassword.sendKeys(string);
    }
    public void inputValueConfirmPassword(String string) {
        inputConfirmPassword.sendKeys(string);
    }

    public void clickNextButtonFromPersonalInformationStep() {
        clickNextButton_FromPersonalInformationStep.click();
    }

    public void fillInPersonalInformationWithValidData(){
        inputValueInFirstNameField("Ciprian");
        inputValueInLastNameField("Lacatus");
        inputValueInUsernameField("azimut");
        inputValueInPasswordField("123456abc!");
        inputValueConfirmPassword("123456abc!");
        clickNextButtonFromPersonalInformationStep();
    }



    public PersonalInformationPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
