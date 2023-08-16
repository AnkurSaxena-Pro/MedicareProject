package com.medicare.testscripts.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MedicareHomePage {

    private Actions actions;
    private WebDriverWait wait;

    //ViewProducts
    @FindBy(xpath = "//a[normalize-space()='View Products']")
    WebElement viewProduct;


    //ParacetmolViewButton
    //@FindBy(xpath = "(//a[@class='btn btn-primary pull-right'][normalize-space()='View'])[1]")
    @FindBy(xpath = "(//a[@class='btn btn-primary pull-right'])[1]")
    WebElement ParacetmolViewButton;

    //AddtoCart
    //(//span[@class='glyphicon glyphicon-shopping-cart'])[1]
    //@FindBy(xpath = "//a[@class='btn btn-success']")
    //@FindBy(xpath = "(//span[@class='glyphicon glyphicon-shopping-cart'])[1]")
    @FindBy(xpath = "//tbody/tr[1]/td[6]/a[2]")
    WebElement addtocartParacetmol;

    @FindBy(xpath = "//tbody/tr[2]/td[6]/a[2]/span[1]")
    WebElement addtocartCombiflame;

    @FindBy(xpath = "//tbody/tr[3]/td[6]/a[2]/span[1]")
    WebElement addtocartDiclofenac;

    //analgesicstab
    @FindBy(xpath = "//a[@id='a_Analgesics']")
    WebElement analgesicstab;


    public MedicareHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
    }

    public void clickonProductViewtab()
    {
        wait.until(ExpectedConditions.visibilityOf(viewProduct));
        viewProduct.click();
    }

//    public void clickParacetmolViewButton()
//    {
//        wait.until(ExpectedConditions.visibilityOf(ParacetmolViewButton));
//        ParacetmolViewButton.click();
//    }
    public void clickAddtoCartforParacetmol()
    {
        wait.until(ExpectedConditions.visibilityOf(addtocartParacetmol));
        addtocartParacetmol.click();
    }

    public void clickAddtocartforCombiflame() {
        wait.until(ExpectedConditions.visibilityOf(addtocartCombiflame));
        addtocartCombiflame.click();
    }

    public void clickAddtocartforDiclofenac() {
        wait.until(ExpectedConditions.visibilityOf(addtocartDiclofenac));
        addtocartDiclofenac.click();
    }

    public void ClickonAnalgesicsCategory() {
        wait.until(ExpectedConditions.visibilityOf(analgesicstab));
        analgesicstab.click();
    }
}
