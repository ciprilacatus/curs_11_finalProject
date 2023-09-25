Feature: An example

  Scenario:TC01 [Positive] Valid email US
    Given I am on the main page
    When The email value of "ciprilacatus@gmail.com" is inputted
    And The submit button is clicked
    Then the news letter confirmation pop-up appears

  Scenario:TC02 [Positive ] Valid email RO
    Given I am on the main page
    When The email value of "cipcatus@gmail.ro" is inputted
    And The submit button is clicked
    Then the news letter confirmation pop-up appears

  Scenario:TC03 [Negative] Over character limit
    Given I am on the main page
    When The email value of "zxcvbnmasdfghjklqwertyuiop" is inputted
    And The submit button is clicked
    Then The popup don't appears


  Scenario:TC04 [Positive] Access Questions
    Given I am on the main page
    When i click on access Questions button
    Then Then i am taken to Frequently Asked Question

  Scenario:TC05 [Positive] Positive Frequently Asking Question expand button
    Given I am on the Frequently Asking Question from the Home Page
    When i click on Question expand button
    Then the question is expanded

  Scenario:TC06 [Positive] Read More In Person
    Given I am on the main page
    When i click on read more button from In Person
    Then the "In Person" page is opened

  Scenario:TC07 [Positive] Click on return button from In Person page
    Given I am on In Person page
    When i click on return to main page button
    Then i am on the "Software Testing Course" page

  Scenario:TC07 [Positive] Click on return button from Virtual page
    Given I am on Virtual Page
    When i click on return to main page button
    Then i am on the "Software Testing Course" page
#
  Scenario:TC08 [Positive] Click on back to top button from Main page
    Given I am on the main page
    When i click on back to top button
    Then i am on the top of the Main page

  Scenario: TC09 [Positive] Access Enrollment page
    Given I am on the main page
    When i click on enrollment button
    Then I am on Personal Information page

  Scenario: TC10 [ Positive: Personal_Information_Step] Adding correct values in all fields
    Given I am on Personal Information page
    When the first name value of "ciprian" is inputted
    And the last name value of "lacatus" is inputted
    * the username value of "azimut" is inputted
    * the password value of "lkjlrgkjw564888%1!" is inputted
    * the confirm password value of "lkjlrgkjw564888%1!" is inputted
    * i click on next button from personal information page
    Then Contact Information page open

  Scenario: TC11 [Negative: Personal_Information_Step] Adding 26 characters on First Name field
    Given I am on Personal Information page
    When the first name value of "ciprian" is inputted
    And the last name value of "zxcvbnmasdfghjklqwertyuiop" is inputted
    * the username value of "azimut" is inputted
    * the password value of "lkjlrgkjw564888%1!" is inputted
    * the confirm password value of "lkjlrgkjw564888%1!" is inputted
    * i click on next button from personal information page
    Then Contact Information page open

  Scenario: TC12 [Negative: Personal_Information_Step] Adding 26 characters on Last Name field
    Given I am on Personal Information page
    When the first name value of "zxcvbnmasdfghjklqwertyuiop" is inputted
    And the last name value of "lacatus" is inputted
    * the username value of "azimut" is inputted
    * the password value of "lkjlrgkjw564888%1!" is inputted
    * the confirm password value of "lkjlrgkjw564888%1!" is inputted
    * i click on next button from personal information page
    Then Contact Information page open


  Scenario: TC13 [Negative: Personal_Information_Step] Adding 5 characters to Password field
    Given I am on Personal Information page
    When the first name value of "ciprian" is inputted
    And the last name value of "lacatus" is inputted
    * the username value of "azimut" is inputted
    * the password value of "zx1!9" is inputted
    * the confirm password value of "lkjlrgkjw564888%1!" is inputted
    * i click on next button from personal information page
    Then Contact Information page open

  Scenario: TC14 [Positive: Personal_Information_Step] Confirm password field with same value as password field
    Given I am on Personal Information page
    When the first name value of "ciprian" is inputted
    And the last name value of "lacatus" is inputted
    * the username value of "azimut" is inputted
    * the password value of "lkjlrgkjw564888%1!" is inputted
    * the confirm password value of "lkjlrgkjw564888%1!" is inputted
    * i click on next button from personal information page
    Then Contact Information page open

  Scenario: TC15 [Negative: Personal_Information_Step] Different value in confirm password field
    Given I am on Personal Information page
    When the first name value of "ciprian" is inputted
    And the last name value of "lacatus" is inputted
    * the username value of "azimut" is inputted
    * the password value of "lkjlrgkjw564888%1!" is inputted
    * the confirm password value of "lljh" is inputted
    * i click on next button from personal information page
    Then Contact Information page open
#
  Scenario: TC16 [Negative: Personal_Information_Step] Empty fields
    Given I am on Personal Information page
    When the first name value of " " is inputted
    And the last name value of " " is inputted
    * the username value of " " is inputted
    * the password value of " " is inputted
    * the confirm password value of " " is inputted
    * i click on next button from personal information page
    Then I should remain on Personal Information page

  Scenario: TC17 [Positive: Contact_Information_Step] Valid Data
    Given I am Contact Information page
    When the contact information email value of "cineva@gmail.com" is inputted
    And the contact information phone value of "0742945546" is inputted
    * the country value of "Romania" is inputted
    * the city value of "Brasov" is inputted
    * the post code value of "500217" is inputted
    * i click on next button from contact information page
    Then Course option page open

  Scenario: TC18 [Positive: Course_Option_Page] Adding Valid Data
    Given I am on Course Option page
    When i click on preferred course
    And i click on next button from course option page
    Then Payment Information page open

#
  Scenario: TC19 [Positive: Payment_Information_Page] Adding Valid Data
    Given I am on Payment Information page
    When the card holder name value of "Ciprian Lacatus" is inputted
    And the card number value of "238945678914" is inputted
    * the CVC value of "123" is inputted
    * the expire month value "May" card is selected
    * the expire year value "2022" card is selected
    * the next button from payment information page is clicked
    Then Registration Succeed page open

  Scenario: TC20 [Positive: Registration Succeed Page] Adding Valid Data
    Given I am on Registration Confirmation Page
    When the return to home page button is clicked
    Then i am on the "Software Testing Course" page

  Scenario: TC21 [Positive: Main Page] Access Instructor Twitter Page
    Given I am on the main page
    When i click on Twitter icon of John Doe
    Then I am on Twitter web page

  Scenario:TC23 [Positive: Main Page] Access Learn Selenium-Read More
    Given I am on the main page
    When the Read More button from Learn Selenium is clicked
    Then i am on the "Learn Selenium" page




