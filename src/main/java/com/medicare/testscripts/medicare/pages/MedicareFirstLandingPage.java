package com.medicare.testscripts.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MedicareFirstLandingPage {

    private Actions actions;
    private WebDriverWait wait;
    //signup
    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    private WebElement signup;

    //login
    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement login;

    public MedicareFirstLandingPage(WebDriver driver) {
        PageFactory.initElements (driver, this);
        actions = new Actions (driver);
        wait = new WebDriverWait(driver, 10);
    }


    public void clickOnSignUp() {
        wait.until(ExpectedConditions.visibilityOf(signup));
        signup.click();
    }

    public void clickOnLogin() {
        wait.until(ExpectedConditions.visibilityOf(login));
        login.click();
    }
}
