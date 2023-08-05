package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinitions {
    private WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    MainPage mainPage;
    InPerson inPerson;
    VirtualPage virtualPage;
    PersonalInformationPage personalInformationPage;
    ContactInformationPage contactInformationPage;
    CourseOptionPage courseOptionPage;
    PaymentInformationPage paymentInformationPage;
    RegistrationConfirmationPage registrationConfirmationPage;


    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        inPerson = new InPerson(driver);
        virtualPage = new VirtualPage(driver);
        personalInformationPage = new PersonalInformationPage(driver);
        contactInformationPage = new ContactInformationPage(driver);
        courseOptionPage = new CourseOptionPage(driver);
        paymentInformationPage = new PaymentInformationPage(driver);
        registrationConfirmationPage = new RegistrationConfirmationPage(driver);

    }


    ///////////////////////////////@Given////////////////////////////////


    @Given("I am on Registration Confirmation Page")
    public void i_am_on_registration_information_page() {
        driver.get("file:///C:/Users/cipri/Documents/azimutVison/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformationPage.fillInPersonalInformationWithValidData();
        contactInformationPage.fillInContactInformationWithValidData();
        courseOptionPage.fillCourseOptionValidData();
        paymentInformationPage.fillPaymentInformationPage(driver);
    }

    @Given("I am on Payment Information page")
    public void i_am_on_payment_information_page() {
        driver.get("file:///C:/Users/cipri/Documents/azimutVison/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformationPage.fillInPersonalInformationWithValidData();
        contactInformationPage.fillInContactInformationWithValidData();
        courseOptionPage.fillCourseOptionValidData();

    }

    @Given("I am on Course Option page")
    public void i_am_on_course_option_page() {
        driver.get("file:///C:/Users/cipri/Documents/azimutVison/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformationPage.fillInPersonalInformationWithValidData();
        contactInformationPage.fillInContactInformationWithValidData();
    }

    @Given("I am on Personal Information page")
    public void i_am_on_personal_information_page() {
        driver.get("file:///C:/Users/cipri/Documents/azimutVison/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
    }

    @Given("I am Contact Information page")
    public void i_am_on_contact_information_page() {
        driver.get("file:///C:/Users/cipri/Documents/azimutVison/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformationPage.fillInPersonalInformationWithValidData();
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/cipri/Documents/azimutVison/Testing-Env-master/Testing-Env-master/index.html");
    }


    @Given("I am on the Frequently Asking Question from the Home Page")
    public void frequently_asking_question() {
        driver.get("file:///C:/Users/cipri/Documents/azimutVison/Testing-Env-master/Testing-Env-master/index.html#questions");
    }

    @Given("I am at the end of the Main Page")
    public void end_of_page() {
        driver.get("/html/body/footer");
    }

    @Given("I am on In Person page")
    public void i_am_on_in_person_page() {
        driver.get("file:///C:/Users/cipri/Documents/azimutVison/Testing-Env-master/Testing-Env-master/routes/in_person.html");
    }

    @Given("I am on Virtual Page")
    public void i_am_on_virtual_page() {
        driver.get("file:///C:/Users/cipri/Documents/azimutVison/Testing-Env-master/Testing-Env-master/routes/virtual.html");
    }

    ///////////////////////////////////////////////////////@When/////////////////////

    @When("the Read More button from Learn Selenium is clicked")
    public void click_read_more_learn_selenium_button() {
        Utils.scrollToElement(driver, mainPage.scrollToReadMoreLearnSelenium());
        mainPage.learnSelenium_ReadMoreButton();
    }
    @When("the return to home page button is clicked")
    public void click_return_to_home_page_button(){
        registrationConfirmationPage.clickReturn_HomePageButton();
    }
    @When("the card holder name value of {string} is inputted")
    public void input_card_holder_name(String string) {
        paymentInformationPage.input_CardHolderName(string);
    }

    @When("i click on preferred course")
    public void click_on_preferred_course() {
        courseOptionPage.clickOn_PreferredCourse();
    }

    @When("the contact information email value of {string} is inputted")
    public void input_email(String string) {
        contactInformationPage.contactInformation_EmailField(string);
    }

    @When("the contact information phone value of {string} is inputted")
    public void input_phone(String string) {
        contactInformationPage.contactInformation_PhoneField(string);
    }

    @When("the first name value of {string} is inputted")
    public void input_first_name(String string) {
        personalInformationPage.inputValueInFirstNameField(string);
    }

    @When("the last name value of {string} is inputted")
    public void input_last_name(String string) {
        personalInformationPage.inputValueInLastNameField(string);
    }

    @When("the username value of {string} is inputted")
    public void input_username(String string) {
        personalInformationPage.inputValueInUsernameField(string);
    }

    @When("the password value of {string} is inputted")
    public void input_password(String string) {
        personalInformationPage.inputValueInPasswordField(string);
    }

    @When("the confirm password value of {string} is inputted")
    public void input_confirm_password(String string) {
        personalInformationPage.inputValueConfirmPassword(string);
    }


    @When("i click on Question expand button")
    public void question_expand_button() {
        Utils.scrollToElement(driver, mainPage.getScrollToQuestionHeader());
        mainPage.clickOnQuestionExpandButton();
    }

    @When("i click on access Questions button")
    public void click_on_question_button() {
        mainPage.clickOnQuestionButton();
    }

    @When("The email value of {string} is inputted")
    public void input_email_to_field(String string) {
        mainPage.inputValueInEmailField(string);
    }

    @When("The submit button is clicked")
    public void click_submit_button() {
        mainPage.clickOnSubmitButton();
    }

    @When("i click on read more button from In Person")
    public void click_Read_More_In_Person() {
        Utils.scrollToElement(driver, mainPage.getScrollToReadMoreInPerson());
        mainPage.clickReadMoreInPerson();
    }

    @When("i click on return to main page button")
    public void click_on_return_button() {
        inPerson.clickOnReturnToMainButton();
    }

    @When("i click on back to top button")
    public void click_on_back_to_top_button() {
        Utils.scrollToElement(driver, mainPage.getScrollToBottom());
        mainPage.clickBackToTopButton();

    }

    @When("i click on enrollment button")
    public void enrollment_button() {
        mainPage.clickOnEnrollmentButton();
    }

    @When("i click on Twitter icon of John Doe")
    public void click_John_Doe_Twitter(){
        Utils.scrollToElement(driver, mainPage.scrollTo_TwitterIcon());
        mainPage.accesTwitterPageOf_JohnDoe();
    }

    ////////////////////////////////@And//////////////////////////////////////
    @And("i click on next button from personal information page")
    public void click_next_button_personal_information() {
        personalInformationPage.clickNextButtonFromPersonalInformationStep();
    }

    @And("the country value of {string} is inputted")
    public void input_country(String string) {
        contactInformationPage.contactInformation_CountryField(string);
    }

    @And("the city value of {string} is inputted")
    public void input_city(String string) {
        contactInformationPage.contactInformation_CityField(string);
    }

    @And("the post code value of {string} is inputted")
    public void input_post_code(String string) {
        contactInformationPage.contactInformation_PostCodeField(string);
    }

    @And("i click on next button from contact information page")
    public void click_on_next_button_contact_information_page() {
        contactInformationPage.contactInformation_ClickNextButton();
    }

    @And("i click on next button from course option page")
    public void click_on_next_button_course_option_page() {
        courseOptionPage.clickOn_NextButtonFromCourseOption();
    }

    @And("i click on preview button from course option page")
    public void click_on_preview_button_course_option() {
        courseOptionPage.clickOn_PreviewButtonFromCourseOption();
    }

    @And("the card number value of {string} is inputted")
    public void input_card_number(String string) {
        paymentInformationPage.input_CardNumber(string);
    }

    @And("the CVC value of {string} is inputted")
    public void input_cvc(String string) {
        paymentInformationPage.input_CVC(string);
    }


    @And("the expire month value {string} card is selected")
    public void select_expire_month_card(String month){
        paymentInformationPage.selectMonthByXpath(driver, month);
    }

    @And("the expire year value {string} card is selected")
    public void select_expire_year_card(String year)  {
        paymentInformationPage.selectYearByXpath(driver, year);

    }
    @And("the next button from payment information page is clicked")
    public void click_next_button_payment_information(){
        paymentInformationPage.clickNextButton_PaymentInformation();
    }





    @After
    public  void cleanUp() {
        driver.quit();
    }

}
