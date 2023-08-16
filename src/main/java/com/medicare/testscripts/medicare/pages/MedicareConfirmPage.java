package com.medicare.testscripts.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MedicareConfirmPage {


    private Actions actions;
    private WebDriverWait wait;


    //confirm button
    ////a[@class='btn btn-lg btn-primary']
    @FindBy(xpath = "//a[@class='btn btn-lg btn-primary']")
    private WebElement confirmButton;


    public MedicareConfirmPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
    }

    public void clickonConfirmButton(){
        wait.until(ExpectedConditions.visibilityOf(confirmButton));
        confirmButton.click();
    }
}
