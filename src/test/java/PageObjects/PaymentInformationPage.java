package PageObjects;

import org.example.StepDefinitions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement returnToHomePageButton;

    public void clickReturn_HomePageButton(){
        returnToHomePageButton.click();
    }

    public void clickNextButton_PaymentInformatin(){
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

    public PaymentInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
