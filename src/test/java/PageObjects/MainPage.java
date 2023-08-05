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
    private WebElement scrollToQuestionHeader;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/div/i")
    private WebElement scrollToReadMoreButton;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/div/i")
    private WebElement scrollToReadMoreInPerson;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement clickOnReadMoreInPerson;
    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement backToTopButton;
    @FindBy(xpath = "/html/body/footer/div/p")
    private WebElement scrollToBottom;
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement clickEnrollmentButton;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]/i")
    private WebElement accessTwitterPageOfJohnDoe;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/h3")
    private WebElement scrollToTwitterIcon;
    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/h2")
    private WebElement scrollToReadMoreLearnSelenium;
    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement learnSeleniumReadMoreButton;



    public WebElement scrollToReadMoreLearnSelenium() {
        return scrollToReadMoreLearnSelenium;
    }
    public void learnSelenium_ReadMoreButton() {
        learnSeleniumReadMoreButton.click();
    }

    public void accesTwitterPageOf_JohnDoe() {
        accessTwitterPageOfJohnDoe.click();
    }
    public WebElement scrollTo_TwitterIcon(){
        return scrollToTwitterIcon;
    }

    public void clickOnEnrollmentButton(){
        clickEnrollmentButton.click();
    }
    public WebElement getScrollToBottom() { return scrollToBottom;}
    public void clickBackToTopButton() {
        backToTopButton.click();
    }
    public void clickReadMoreInPerson() {clickOnReadMoreInPerson.click();}
    public WebElement getScrollToQuestionHeader() {
        return scrollToQuestionHeader;
    }
    public WebElement getScrollToReadMoreInPerson() {return scrollToReadMoreInPerson;}
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
