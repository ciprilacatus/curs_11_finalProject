package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class PaymentInformationPage{


    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement inputCardHolderName;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement inputCardNumber;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement inputCVC;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement clickNextButtonPaymentInformation;


    public void clickNextButton_PaymentInformation(){
        clickNextButtonPaymentInformation.click();
    }

    public void input_CVC(String string) {
        inputCVC.sendKeys(string);
    }

    public void input_CardNumber(String string) {
        inputCardNumber.sendKeys(string);
    }

    public void input_CardHolderName(String string) {
        inputCardHolderName.sendKeys(string);
    }

    public void selectMonthByXpath(WebDriver driver, String month) {
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(month);
    }

    public void selectYearByXpath(WebDriver driver, String year) {
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"year\"]"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(year);
    }

    public void fillPaymentInformationPage(WebDriver driver) {
        input_CardNumber("2356984578124");
        input_CardHolderName("Ciprian Lacatus");
        input_CVC("356");
        selectMonthByXpath(driver, "June");
        selectYearByXpath(driver,"2023");
        clickNextButton_PaymentInformation();

    }

    public PaymentInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
