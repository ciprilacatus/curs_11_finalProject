package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement inputEmailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement elementSubmitButton;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement elementQuestionButton;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement expandQuestionButton;
    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement scrolToQuestionHeader;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/div/i")
    private WebElement scrolToReadMoreButton;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/div/i")
    private WebElement scrolToReadMoreInPerson;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement clickOnReadMoreInPerson;
    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement backToTopButton;
    @FindBy(xpath = "/html/body/footer/div/p")
    private WebElement scrolToBottom;
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement clickEnrollmentButton;


    public void clickOnEnrollmentButton(){
        clickEnrollmentButton.click();
    }




    public WebElement getScrolToBottom() { return scrolToBottom;}


    public void clickBackToTopButton() {
        backToTopButton.click();
    }

    public void clickReadMoreInPerson() {clickOnReadMoreInPerson.click();}


    public WebElement getScrolToQuestionHeader() {
        return scrolToQuestionHeader;
    }
    public WebElement getScrolToReadMoreInPerson() {return scrolToReadMoreInPerson;}


    public void clickOnQuestionExpandButton() {
        expandQuestionButton.click();
    }

    public void clickOnQuestionButton() {
        elementQuestionButton.click();
    }




    public void inputValueInEmailField(String string) {
        inputEmailField.sendKeys(string);
    }

    public void clickOnSubmitButton() {
        elementSubmitButton.click();
    }
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
