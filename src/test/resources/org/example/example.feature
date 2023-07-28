Feature: An example

  Scenario:[01 Positive]Valid email US
    Given I am on the main page
    When The email value of "ciprilacatus@gmail.com" is inputted
    And The submit button is clicked

  Scenario:[02 Positive ]Valid email RO
    Given I am on the main page
    When The email value of "cipcatus@gmail.ro" is inputted
    And The submit button is clicked

  Scenario:[03  Negative] over character limit
    Given I am on the main page
    When The email value of "zxcvbnmasdfghjklqwertyuiop" is inputted
    And The submit button is clicked

  Scenario:[04 Positive] access Questions
    Given I am on the main page
    When i click on acces Questions button

  Scenario:[05 Positive] Positive Frequently Asking Question expand button
    Given I am on the Frequently Asking Question from the Home Page
    When i click on Question expand button

  Scenario:[06 Positive] Read More In Person
    Given I am on the main page
    When i click on read more button from In Person

  Scenario:[07 Positive] Click on return button from In Person page
    Given I am on In Person page
    When i click on return to main page button

  Scenario:[07 Positive] Click on return button from Virtual page
    Given I am on Virtual Page
    When i click on return to main page button

  Scenario:[08 Positive] Click on back to top button from Main page
    Given I am on the main page
    When i click on back to top button

  Scenario: [09 Positive] Access Enrollment page
    Given I am on the main page
    When i click on enrollment button
    Then I am on Personal Information page

  Scenario: [10 Positive: Personal_Information_Step] Adding correct values in all fields
    Given I am on Personal Information page
    When the first name value of "ciprian" is inputted
    And the last name value of "lacatus" is inputted
    * the username value of "azimut" is inputted
    * the password value of "lkjlrgkjw564888%1!" is inputted
    * the confirm password value of "lkjlrgkjw564888%1!" is inputted
    * i click on next button from personal information page

  Scenario: [11 Negative: Personal_Information_Step] Adding 26 characters on First Name field
    Given I am on Personal Information page
    When the first name value of "ciprian" is inputted
    And the last name value of "zxcvbnmasdfghjklqwertyuiop" is inputted
    * the username value of "azimut" is inputted
    * the password value of "lkjlrgkjw564888%1!" is inputted
    * the confirm password value of "lkjlrgkjw564888%1!" is inputted
    * i click on next button from personal information page

  Scenario: [12 Negative: Personal_Information_Step] Adding 26 characters on Last Name field
    Given I am on Personal Information page
    When the first name value of "zxcvbnmasdfghjklqwertyuiop" is inputted
    And the last name value of "lacatus" is inputted
    * the username value of "azimut" is inputted
    * the password value of "lkjlrgkjw564888%1!" is inputted
    * the confirm password value of "lkjlrgkjw564888%1!" is inputted
    * i click on next button from personal information page

  Scenario: [13 Negative: Personal_Information_Step] Adding 5 characters to Password field
    Given I am on Personal Information page
    When the first name value of "ciprian" is inputted
    And the last name value of "lacatus" is inputted
    * the username value of "azimut" is inputted
    * the password value of "zx1!9" is inputted
    * the confirm password value of "lkjlrgkjw564888%1!" is inputted
    * i click on next button from personal information page

  Scenario: [14 Positive: Personal_Information_Step] Confirm password field with same value as password field
    Given I am on Personal Information page
    When the first name value of "ciprian" is inputted
    And the last name value of "lacatus" is inputted
    * the username value of "azimut" is inputted
    * the password value of "lkjlrgkjw564888%1!" is inputted
    * the confirm password value of "lkjlrgkjw564888%1!" is inputted
    * i click on next button from personal information page

  Scenario: [15 Negative: Personal_Information_Step] Different value in confirm password field
    Given I am on Personal Information page
    When the first name value of "ciprian" is inputted
    And the last name value of "lacatus" is inputted
    * the username value of "azimut" is inputted
    * the password value of "lkjlrgkjw564888%1!" is inputted
    * the confirm password value of "lljh" is inputted
    * i click on next button from personal information page

  Scenario: [16 Negtive: Personal_Information_Step] Empty fields
    Given I am on Personal Information page
    When the first name value of "" is inputted
    And the last name value of "" is inputted
    * the username value of "" is inputted
    * the password value of "" is inputted
    * the confirm password value of "" is inputted
    * i click on next button from personal information page

    Scenario: [17 Positive: Contact_Information_Step] Valid Data
      Given I am Contact Information page
      When the contact information email value of "cineva@gmail.com" is inputted
      And the contact information phone value of "0742945546" is inputted
      * the country value of "Romania" is inputted
      * the city value of "Brasov" is inputted
      * the post code value of "500217" is inputted
      * i click on next button from contact information page

  Scenario: [18 Positive: Course_Option_Page] Adding Valid Data
    Given I am on Course Option page
    When i click on preferred course
    And i click on next button from course option page

  Scenario: [19 Positive: Course_Option_Page] Click on Preview button
    Given I am on Course Option page
    When i click on preferred course
    And i click on preview button from course option page

  Scenario: [20 Positive: Payment_Information_Page] Adding Valid Data
    Given I am on Payment Information page
    When the card holder name value of "Ciprian Lacatus" is inputted
    And the card number value of "238945678914" is inputted
    * the CVC value of "123" is inputted
    * the expire month value "May" card is selected
    * the expire year value "2022" card is selected
    * the next button from payment information page is clicked
    * the return to home page button is clicked






