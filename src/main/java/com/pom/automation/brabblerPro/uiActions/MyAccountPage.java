package com.pom.automation.brabblerPro.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pom.automation.brabblerPro.homePage.TC001_VerifyLoginWithInvalidCredentials;

public class MyAccountPage {

	public static final Logger log = Logger.getLogger(MyAccountPage.class.getName());
	WebDriver driver;
	@FindBy(linkText = "Sign in")
	WebElement signIn;

	@FindBy(xpath = "//*[@id='email']")
	WebElement loginEmailAddress;

	@FindBy(xpath = "//*[@id='passwd']")
	WebElement loginPassword;

	@FindBy(id = "SubmitLogin")
	WebElement submitButton;

	@FindBy(css = "a[title=\"Orders\"] > span")
	WebElement orderOption;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/a/span")
	WebElement backToYourAccount;

	@FindBy(xpath = "//*[@id='center_column']/div/div[1]/ul/li[2]/a/span")
	WebElement myCreditSlipOption;

	/*
	 * Creating Homepage constructor which takes the argument we are
	 * initializing the web element object at the runtime (It initializes all
	 * the web elements)
	 */

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String emailAddress, String password) {
		signIn.click();
		log.info("Clicked on Sign in and  -at web element :- " + signIn.toString());
		loginEmailAddress.sendKeys(emailAddress);
		log.info("Entring email address: " + emailAddress + " -at web element :- " + loginEmailAddress.toString());
		loginPassword.sendKeys(password);
		log.info("Entring  password: " + password + " -at web element :- " + loginPassword.toString());
		submitButton.click();
		log.info("Clicked on submit button -at web element :- " + submitButton.toString());
	}

	/*
	 * This method us to execute back navigation on My account page Steps: 1.
	 * Navigate to Order History Page 2. On My account page 3. Navigate to Order
	 * Slip Page 4. Check the page title 5. Verify back navigation works
	 * correctly.
	 * 
	 */

	public void backNavigation() {
		String myAccountPage = "My account - My Store";
		String orderHistoryPage = "Order history - My Store";
		String creditSlipPage = "Order slip - My Store";

		String pageTitle1 = driver.getTitle();
		Assert.assertEquals(pageTitle1, myAccountPage);
		orderOption.click();
		log.info("Clicking on order list option - at web element path :-" + orderOption.toString());
		String pageTitle2 = driver.getTitle();
		Assert.assertEquals(pageTitle2, orderHistoryPage);
		backToYourAccount.click();
		log.info("Clicking on back to account page option - at web element path :-" + backToYourAccount.toString());
		String pageTitle3 = driver.getTitle();
		Assert.assertEquals(pageTitle3, myAccountPage);
		myCreditSlipOption.click();
		log.info("Clicking on credit slip option - at web element path :-" + myCreditSlipOption.toString());
		String pageTitle4 = driver.getTitle();
		Assert.assertEquals(pageTitle4, creditSlipPage);
		backToYourAccount.click();
		log.info("Clicking on back to account page option - at web element path :-" + backToYourAccount.toString());
		String pageTitle5 = driver.getTitle();
		Assert.assertEquals(pageTitle5, myAccountPage);
	}
}
