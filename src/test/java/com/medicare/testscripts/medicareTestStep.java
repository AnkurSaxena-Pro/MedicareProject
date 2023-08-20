package com.medicare.testscripts;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import com.fasterxml.jackson.core.JsonGenerator;
//import groovy.json.JsonGenerator;
//import org.openqa.selenium.remote.Response;
//import org.testng.Assert;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class medicareTestStep extends Driver {

    @Given("a user is on the landingPage of medicare")
    public void aUserIsOnTheHomeOfMedicare() {
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Medicare - Home"));
    }


    @Then("validate sign-up personal page invokes with title {string}")
    public void validateSignUpPersonalPageInvokesWithTitle(String pagetitle) {
        driver.getTitle().equals(pagetitle);
    }

    @Then("user click on First name and give value of First name as {string}")
    public void userClickOnFirstNameAndGiveValueOfFirstNameAs(String firstName) {
        medicareSignUpPersonal.selectfirstnameandGiveValue(firstName);
    }

    @Then("user click on Last name and give value of Last name with value {string}")
    public void userClickOnLastNameAndGiveValueOfLastNameWithValue(String lastName) {
        medicareSignUpPersonal.selectlastnameandGiveValue(lastName);
    }


    @Then("user click on Email and give value of Email")
    public void userClickOnEmailAndGiveValueOfEmail() {
        medicareSignUpPersonal.selectemailandingvalue();
    }

    @Then("user click on ContactNumber name and give value of ContactNumber with value {string}")
    public void userClickOnContactNumberNameAndGiveValueOfContactNumberWithValue(String contactNumber) {
        medicareSignUpPersonal.selectcontactnumberandGiveValue(contactNumber);
    }

    @Then("user click on password and give value of password as {string}")
    public void userClickOnPasswordAndGiveValueOfPasswordAs(String password) {
        medicareSignUpPersonal.selectpasswordandGiveValue(password);
    }

    @Then("user click on ConfirmPassword and give value of ConfirmPassword as {string}")
    public void userClickOnConfirmPasswordAndGiveValueOfConfirmPasswordAs(String confirmPassword) {
        medicareSignUpPersonal.selectConfirmpasswordandGiveValue(confirmPassword);

    }

    @Then("user click on Select role as user")
    public void userClickOnSelectRoleAsUser() {
        medicareSignUpPersonal.selectRoleAsUser();
    }
    @Then("user click on next billing button")
    public void userClickOnNextBillingButton() {
        medicareSignUpPersonal.selectnextbillingbutton();
    }


    @Then("user is on sign up -Address page with header value {string}")
    public void userIsOnSignUpAddressPageWithHeaderValue(String headerValue) {
        String headervalue = medicaresignUpPersonalAddress.validateHeader();
        Assert.assertEquals(headervalue,headerValue);
    }

    @Then("user click on Address Line one and give value of Address Line one as {string}")
    public void userClickOnAddressLineOneAndGiveValueOfAddressLineOneAs(String AdressLineOne) {
        medicaresignUpPersonalAddress.SelectAddressLineOneandGiveValue(AdressLineOne);
    }

    @Then("user click on Address Line two and give value of Address Line two as {string}")
    public void userClickOnAddressLineTwoAndGiveValueOfAddressLineTwoAs(String AddressLineTwo) {
        medicaresignUpPersonalAddress.SelectAddressLineTwoandGiveValue(AddressLineTwo);
    }

    @Then("user click on City and give value of City as {string}")
    public void userClickOnCityAndGiveValueOfCityAs(String City) {
        medicaresignUpPersonalAddress.SelectCityAndGiveValue(City);
    }

    @Then("user click on Postal Code and give value of Postal Code as {string}")
    public void userClickOnPostalCodeAndGiveValueOfPostalCodeAs(String PostalCode) {
        medicaresignUpPersonalAddress.SelectPostalCodeAndGiveValue(PostalCode);
    }

    @Then("user click on State and give value of State as {string}")
    public void userClickOnStateAndGiveValueOfStateAs(String State) {
        medicaresignUpPersonalAddress.SelectStateAndGiveValue(State);
    }

    @Then("user click on Country and give value of Country as {string}")
    public void userClickOnCountryAndGiveValueOfCountryAs(String Country) {
        medicaresignUpPersonalAddress.SelectCountryandGiveValue(Country);
    }

    @Then("user click on next-confirm button")
    public void userClickOnNextConfirmButton() {
        medicaresignUpPersonalAddress.clickonConfirmbutton();
    }

    @Then("user click on confirm button")
    public void userClickOnConfirmButton() {
        medicareconfirmPage.clickonConfirmButton();
    }

    @And("user is on welcome page with header value {string}")
    public void userIsWelcomePageWithHeaderValue(String headerValue) {
       String HeaderValue =  medicarewelcomePage.validateheadervalueofWelcome();
       Assert.assertEquals(HeaderValue,headerValue );
    }

    @When("User click on Signup")
    public void userClickOnSignup() {
        medicarefirstLandingPage.clickOnSignUp();
    }


    @Then("doingWait")
    public void doing_wait() {
        // Write code here that turns the phrase above into concrete actions
        try {
            Thread.sleep(10_000);
        }
        catch(InterruptedException e){
            throw new io.cucumber.java.PendingException();
        }
    }

    @And("user could able to click on login")
    public void userCouldAbleToClickOnLogin() {
        medicarewelcomePage.clickonLogin();
    }
    @Then("refresh page")
    public void refreshPage() {
        driver.navigate().refresh();
    }

    @When("user click on Login button")
    public void userClickOnLoginButton() {
        medicarefirstLandingPage.clickOnLogin();
    }

    @Then("login dialog invokes with header value {string}")
    public void loginDialogInvokesWithHeaderValue(String LoginDialogHeaderValue ) {
        String ActualheaderValue = medicareLogin.validateLoginDialogHeader();
        Assert.assertEquals(LoginDialogHeaderValue,ActualheaderValue);


    }

    @Then("user click on email and enter email address as {string}")
    public void userClickOnEmailAndEnterEmailAddressAs(String email) {
        medicareLogin.clickOnEmail(email);
    }

    @Then("user click on password and enter password as {string}")
    public void userClickOnPasswordAndEnterPasswordAs(String password) {
        medicareLogin.clickOnPassword(password);
    }


    @Then("user click on a login button")
    public void userClickOnALoginButton() {
        medicareLogin.clickOnLoginButton();
    }

    @And("user can able to login successfully and reach to medicare home page tile value {string}")
    public void userCanAbleToLoginSuccessfullyAndReachToMedicareHomePageTileValue(String homePageTitleExpectedValue) {
        driver.getTitle().equals(homePageTitleExpectedValue);
    }

//    @Then("user click on paracetmol medicine view button")
//    public void userClickOnParacetmolMedicineViewButton() {
//        medicarehomePage.clickParacetmolViewButton();
//    }

    @Then("user click on Add to cart medicine view button for paracetmol")
    public void userClickOnAddToCartMedicineViewButton() {
        medicarehomePage.clickAddtoCartforParacetmol();
    }

    @Then("user click on view product tab")
    public void userClickOnViewProductTab() {
        medicarehomePage.clickonProductViewtab();
    }

    @Then("user click on Add to cart medicine view button for Combiflame")
    public void userClickOnAddToCartMedicineViewButtonForCombiflame() {
        medicarehomePage.clickAddtocartforCombiflame();
    }

    @Then("user click on Add to cart medicine view button for Diclofenac")
    public void userClickOnAddToCartMedicineViewButtonForDiclofenac() {
        medicarehomePage.clickAddtocartforDiclofenac();
    }

    @Then("user hit this urlOne {string} and get response {int}")
    public void userHitThisUrlAndGetResponse(String url, int responsecode) {

        RestAssured.baseURI = url;
        // Get the RequestSpecification of the request to be sent to the server.
        RequestSpecification httpRequest = RestAssured.given();
        // specify the method type (GET) and the parameters if any.
        //In this case the request does not take any parameters
        //Response response = httpRequest.request(Method.GET, "");
        Response response =  httpRequest.request(Method.GET,"");
        int responsestatus = response.getStatusCode();
        Assert.assertEquals(responsecode, responsestatus);

    }

    @Then("user hit this urlTwo {string} and get response {int}")
    public void userHitThisUrlTwoAndGetResponse(String url, int ResponseValue) {

        RestAssured.baseURI = url;
        // Get the RequestSpecification of the request to be sent to the server.
        RequestSpecification httpRequest = RestAssured.given();
        // specify the method type (GET) and the parameters if any.
        //In this case the request does not take any parameters
        //Response response = httpRequest.request(Method.GET, "");
        Response response =  httpRequest.request(Method.GET,"");
        int responsestatus = response.getStatusCode();
        Assert.assertEquals(ResponseValue, responsestatus);
    }

    @Then("user click on Analgesics category")
    public void userClickOnAnalgesicsCategory() {
        medicarehomePage.ClickonAnalgesicsCategory();
    }


    @When("hit this urlTwo {string} Also validate response contain {string} and check with {string}")
    public void hitThisUrlTwoAlsoValidateResponseContainAndCheckWith(String url, String ResponseMustContainThisValue, String ExpectedValue) {


        RestAssured.baseURI = url;
        // Get the RequestSpecification of the request to be sent to the server.
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(url);

        // Get the response body as a string
        String responseBody = response.getBody().asString();

        // Parse the HTML response using Jsoup
        Document document = Jsoup.parse(responseBody);

        // Find elements containing the desired value ("Analgesics")
        Elements elementsContainingValue = document.getElementsContainingOwnText(ResponseMustContainThisValue);
        //String Element2 = elementsContainingValue.get(1).toString();
        Attributes abc= elementsContainingValue.get(1).attributes();
        String Actualvalue = abc.get("id");
        Assert.assertEquals(ExpectedValue, Actualvalue);

        //ActualValue.getClass().
        //Assert.assertEquals(ResponseMustContainThisValue, ActualValue);
        //Assert.
        // Check if the value was found in the response
        /*
        if (!elementsContainingValue.isEmpty()) {
            // Value found, your validation passes
            // You can also print or log the extracted information if needed
            System.out.println("Desired value found: " + elementsContainingValue.first().text());
        } else {
            // Value not found, validation fails
            System.out.println("Desired value not found in the response.");
        }
        */
    }



}
