package com.medicare.testscripts.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class MedicareSignUpPersonal {

    private Actions actions;
    private WebDriverWait wait;


/*
firstname
//input[@id='firstName']

lastname
//input[@id='lastName']

email
//input[@id='email']

contact number
//input[@id='contactNumber']

password
//input[@id='password']

confirmpassword
//input[@id='confirmPassword']

//user
//label[normalize-space()='User']

//nextbilling button
//button[@name='_eventId_billing']
 */

    //PersonalPageTitle
    @FindBy(xpath = "//title[normalize-space()='Medicare - Membership']")
    private WebElement PersonalPageTitle;

    //firstname
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;

    //lastname
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;

    //email
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    //contactnumber
    @FindBy(xpath = "//input[@id='contactNumber']")
    private WebElement contactNumber;

    //password
    @FindBy(xpath = "//input[@id='password']")
    private WebElement Password;

    //confirmpassword
    @FindBy(xpath = "//input[@id='confirmPassword']")
    private WebElement ConfirmPassword;

    //user
    @FindBy(xpath = "//label[normalize-space()='User']")
    private WebElement user;

    //nextbilling button
    @FindBy(xpath = "//button[@name='_eventId_billing']")
    private WebElement nextbillingButton;



    public MedicareSignUpPersonal(WebDriver driver) {
        PageFactory.initElements (driver, this);
        actions = new Actions (driver);
        wait = new WebDriverWait(driver, 10);
    }

    public void selectfirstnameandGiveValue(String firstname) {
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.click();
        firstName.sendKeys(firstname);
    }

    public void selectlastnameandGiveValue(String lastname) {
        wait.until(ExpectedConditions.visibilityOf(lastName));
        lastName.click();
        lastName.sendKeys(lastname);
    }

    public void selectemail() {
        wait.until(ExpectedConditions.visibilityOf(email));
        email.click();
    }

    public void selectemailandingvalue() {
        wait.until(ExpectedConditions.visibilityOf(email));
        email.click();
        Random ran = new Random();
        int x = ran.nextInt(6);
        email.sendKeys("abcd"+ x + "@gmail.com");

    }

    public void selectcontactnumberandGiveValue(String contactnumber) {
        wait.until(ExpectedConditions.visibilityOf(contactNumber));
        contactNumber.click();
        contactNumber.sendKeys(contactnumber);
    }

    public void selectpasswordandGiveValue(String password) {
        wait.until(ExpectedConditions.visibilityOf(Password));
        Password.click();
        Password.sendKeys(password);
    }

    public void selectConfirmpasswordandGiveValue(String confirmPassword) {
        wait.until(ExpectedConditions.visibilityOf(ConfirmPassword));
        ConfirmPassword.click();
        ConfirmPassword.sendKeys(confirmPassword);
    }

    public void selectRoleAsUser() {
        wait.until(ExpectedConditions.visibilityOf(user));
        user.click();
    }

    public void selectnextbillingbutton() {
        wait.until(ExpectedConditions.visibilityOf(nextbillingButton));
        nextbillingButton.click();
    }
}
