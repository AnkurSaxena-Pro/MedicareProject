package com.medicare.testscripts;

import java.net.MalformedURLException;
import java.net.URL;


import com.medicare.testscripts.medicare.pages.*;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Driver extends Tools {
	protected static DesiredCapabilities cap;
	//protected static Landinpage landingPage;
	//protected static Items items;
	//protected static PlaceOrder placeOrder;
	//protected static CheckOut checkOut;

	protected static MedicareSignUpPersonal medicareSignUpPersonal;
	protected static MedicareLogin medicareLogin;

	protected static MedicareFirstLandingPage medicarefirstLandingPage;

	protected static MedicareConfirmPage medicareconfirmPage;

	protected static MedicareSignUpPersonalAddress medicaresignUpPersonalAddress;
	protected static MedicareWelcomePage medicarewelcomePage;

	protected static MedicareHomePage medicarehomePage;




	public static void init() throws MalformedURLException {

		cap =  new DesiredCapabilities();

		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		//cap.chrome();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		//driver = new ChromeDriver();
		medicareSignUpPersonal = new MedicareSignUpPersonal(driver);
		medicareLogin = new MedicareLogin(driver);
		medicarefirstLandingPage = new MedicareFirstLandingPage(driver);
		medicareconfirmPage = new MedicareConfirmPage(driver);
		medicaresignUpPersonalAddress = new MedicareSignUpPersonalAddress(driver);
		medicarewelcomePage = new MedicareWelcomePage(driver);
		medicarehomePage = new MedicareHomePage(driver);

	}
}