package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement contactInformationEmailField;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneContactInformationField;
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement countryContactInformationField;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement cityContactInformationField;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postCodeContactInformationField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement contactInformationClickNextButton;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement getContactInformationTitle;

    public String getContactInformationTitleText(){
        return getContactInformationTitle.getText();
    }

    public void contactInformation_EmailField(String string) {
        contactInformationEmailField.sendKeys(string);
    }
    public void contactInformation_PhoneField(String string) {
        phoneContactInformationField.sendKeys(string);

    }
    public void contactInformation_CountryField(String string) {
        countryContactInformationField.sendKeys(string);
    }
    public void contactInformation_CityField(String string) {
        cityContactInformationField.sendKeys(string);
    }
    public void contactInformation_PostCodeField(String string) {
        postCodeContactInformationField.sendKeys(string);
    }
    public void contactInformation_ClickNextButton(){
        contactInformationClickNextButton.click();
    }
    public void fillInContactInformationWithValidData(){
        contactInformation_EmailField("ciprian_lacatus@gmail.com");
        contactInformation_PhoneField("0745549010");
        contactInformation_CountryField("Romania");
        contactInformation_CityField("Brasov");
        contactInformation_PostCodeField("500217");
        contactInformation_ClickNextButton();

    }
    public ContactInformationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
