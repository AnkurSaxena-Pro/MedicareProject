package com.medicare.testscripts.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MedicareSignUpPersonalAddress {

    private Actions actions;
    private WebDriverWait wait;

    /*
    //address line one
//input[@id='addressLineOne']

//address line two
//input[@id='addressLineTwo']

//city
//input[@id='city']

postal code
//input[@id='postalCode']

state
//input[@id='state']

country
//input[@id='country']

//nextconfirm
//button[@name='_eventId_confirm']
     */


    //sig uo address header
    @FindBy(xpath = "//h4[normalize-space()='Sign Up - Address']")
    private WebElement signUpAddressHeader;

    //address line one
    @FindBy(xpath = "//input[@id='addressLineOne']")
    private WebElement addressLineOne;

    //address line two
    @FindBy(xpath = "//input[@id='addressLineTwo']")
    private WebElement addressLineTwo;

    //city
    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;

    //postalcode
    @FindBy(xpath = "//input[@id='postalCode']")
    private WebElement postalCode;

    //state
    @FindBy(xpath = "//input[@id='state']")
    private WebElement state;

    //country
    @FindBy(xpath = "//input[@id='country']")
    private WebElement country;

    //nextconfirmButton
    @FindBy(xpath = "//button[@name='_eventId_confirm']")
    private WebElement nextConfirmButton;

    //confirmButton
    @FindBy(xpath = "//button[@name='_eventId_confirm']")
    private WebElement confirmButton;



    public MedicareSignUpPersonalAddress(WebDriver driver) {
        PageFactory.initElements (driver, this);
        actions = new Actions (driver);
        wait = new WebDriverWait(driver, 10);
    }

    public String  validateHeader() {
        wait.until(ExpectedConditions.visibilityOf(signUpAddressHeader));
        String headervalue = signUpAddressHeader.getText();
        return headervalue;
    }

    public void SelectAddressLineOneandGiveValue(String addresslineone) {
        wait.until(ExpectedConditions.visibilityOf(addressLineOne));
        addressLineOne.click();
        addressLineOne.sendKeys(addresslineone);
    }

    public void SelectAddressLineTwoandGiveValue(String AddressLineTwo) {
        wait.until(ExpectedConditions.visibilityOf(addressLineTwo));
        addressLineTwo.click();
        addressLineTwo.sendKeys(AddressLineTwo);
    }

    public void SelectCityAndGiveValue(String City) {
        wait.until(ExpectedConditions.visibilityOf(city));
        city.click();
        city.sendKeys(City);

    }

    public void SelectPostalCodeAndGiveValue(String PostalCode) {
        wait.until(ExpectedConditions.visibilityOf(postalCode));
        postalCode.click();
        postalCode.sendKeys(PostalCode);

    }

    public void SelectStateAndGiveValue(String State) {
        wait.until(ExpectedConditions.visibilityOf(state));
        state.click();
        state.sendKeys(State);
    }

    public void SelectCountryandGiveValue(String Country) {
        wait.until(ExpectedConditions.visibilityOf(country));
        country.click();
        country.sendKeys(Country);
    }

    public void clickonConfirmbutton() {
        wait.until(ExpectedConditions.visibilityOf(confirmButton));
        confirmButton.click();
    }
}
