package com.medicare.testscripts.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MedicareWelcomePage {

    private Actions actions;
    private WebDriverWait wait;




    //welcome
    @FindBy(xpath = "//h1[normalize-space()='Welcome!']")
    private WebElement welcomeButton;

    //login

    @FindBy(xpath = "//a[@class='btn btn-lg btn-success']")
    private WebElement loginbutton;

    public MedicareWelcomePage(WebDriver driver) {
        PageFactory.initElements (driver, this);
        actions = new Actions (driver);
        wait = new WebDriverWait(driver, 10);
    }

    public String validateheadervalueofWelcome()
    {
        wait.until(ExpectedConditions.visibilityOf(welcomeButton));
        String welcomevalue = welcomeButton.getText();
        return welcomevalue;
    }
    public void clickonLogin()
    {
        wait.until(ExpectedConditions.visibilityOf(loginbutton));
        loginbutton.click();
    }
}
