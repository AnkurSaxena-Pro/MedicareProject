package com.medicare.testscripts.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MedicareLogin  {

    private Actions actions;
    private WebDriverWait wait;

    //loginheader
    @FindBy(xpath = "//h4[normalize-space()='Login']")
    WebElement loginheader;

    //email
    @FindBy(xpath = "//input[@id='username']")
    WebElement email;

    //password
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    //loginbutton
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    public MedicareLogin(WebDriver driver) {
        PageFactory.initElements (driver, this);
        actions = new Actions (driver);
        wait = new WebDriverWait(driver, 10);
    }

    public String validateLoginDialogHeader() {
        wait.until(ExpectedConditions.visibilityOf(loginheader));
        return loginheader.getText();
    }

    public void clickOnEmail(String Email) {
        wait.until(ExpectedConditions.visibilityOf(email));
        email.click();
        email.sendKeys(Email);
    }

    public void clickOnPassword(String Password) {
        wait.until(ExpectedConditions.visibilityOf(password));
        password.click();
        password.sendKeys(Password);
    }

    public void clickOnLoginButton() {
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }
}
