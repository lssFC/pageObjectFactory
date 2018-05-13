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

public class HomePage {

	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	WebDriver driver;
	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;

	@FindBy(xpath = "//*[@id='email']")
	WebElement loginEmailAddress;

	@FindBy(xpath = "//*[@id='passwd']")
	WebElement loginPassword;

	@FindBy(id = "SubmitLogin")
	WebElement submitButton;

	@FindBy(xpath = "//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;

	@FindBy(id = "email_create")
	WebElement newEmailAddress;

	@FindBy(id = "SubmitCreate")
	WebElement createAccountButton;

	@FindBy(id = "id_gender1")
	WebElement genderMale;

	@FindBy(id = "customer_firstname")
	WebElement customerFirstName;

	@FindBy(id = "customer_lastname")
	WebElement customerLastName;

	@FindBy(id = "email")
	WebElement customerEmail;
	@FindBy(id = "passwd")
	WebElement customerPassword;

	@FindBy(id = "address1")
	WebElement customerAddress;

	@FindBy(id = "city")
	WebElement customerCity;

	@FindBy(id = "id_state")
	WebElement customerState;

	@FindBy(id = "postcode")
	WebElement customerPostcode;

	@FindBy(id = "phone_mobile")
	WebElement customerPhone;

	@FindBy(id = "submitAccount")
	WebElement submitAccount;

	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
	WebElement newCreatedUsername;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement moveOnMenu;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")
	// xpath=(//a[contains(text(),'Casual Dresses')])[2]
	WebElement clickToOption;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")
	WebElement moveToProductImage;

	//@FindBy(xpath = "//div[@id='layer_cart']/div/div/div[2]/span")
	@FindBy(xpath = "//span[@id='layer_cart_product_title']")
	WebElement productNameOnPopup;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")
	WebElement moveToProductAddToCart;

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/span")
	WebElement closePopup;

	@FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a")
	WebElement moveToViewCart;

	@FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/div[1]/a")
	WebElement moveToProductNameInCart;

	@FindBy(xpath = "//*[@id='center_column']/div/div/div[3]/h1")
	WebElement productNameOnDetailsPage;

	////////////////
	@FindBy(id = "PreviewFrame")
	WebElement homePageIframe;

	@FindBy(id = "customer_register_link")
	WebElement signUpLink;

	@FindBy(id = "FirstName")
	WebElement firstName;

	@FindBy(id = "LastName")
	WebElement lastName;

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "CreatePassword")
	WebElement createPassword;

	@FindBy(css = "input.btn")
	WebElement createAccount;

	@FindBy(xpath = "//*[@id='shopify-section-header']/div/div[2]/span")
	WebElement registrationMessage;

	@FindBy(xpath = "//*[@id='customer_login_link']")
	WebElement loginLink;

	@FindBy(id = "CustomerEmail")
	WebElement loginEmail;

	@FindBy(xpath = ".//*[@id='CustomerPassword']")
	WebElement password;

	@FindBy(xpath = ".//*[@id='customer_login']/p[1]/input")
	WebElement clickOnSignIn;

	@FindBy(xpath = "//*[@id='customer_logout_link']")
	WebElement logout;

	@FindBy(xpath = "//*[@id='MainContent']/div/p")
	WebElement userNameField;

	/*
	 * Creating Homepage constructor which takes the argument we are
	 * initializing the web element object at the runtime (It initializes all
	 * the web elements)
	 */

	public HomePage(WebDriver driver) {
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

	public String getInvalidLoginText() {
		log.info("error message is :- " + authenticationFailed.getText());
		return authenticationFailed.getText();

	}

	public void registeringUser(String val_firstName, String val_lastName, String val_emailAddress, String val_password)
			throws InterruptedException {

		signIn.click();
		log.info("Clicking on Sign In link - at web element path :-" + signIn.toString());
		newEmailAddress.clear();
		newEmailAddress.sendKeys(val_emailAddress);
		log.info("Entring new email address: " + newEmailAddress + " -at web element :- " + newEmailAddress.toString());
		createAccountButton.click();
		log.info("Clicking on create new account button - at web element path :-" + createAccountButton.toString());
		genderMale.click();
		log.info("Selecting check box Mr - at web element path :-" + genderMale.toString());
		customerFirstName.clear();
		customerFirstName.sendKeys(val_firstName);
		log.info("Entring first name value: " + val_firstName + " -at web element :- " + customerFirstName.toString());
		customerLastName.clear();
		customerLastName.sendKeys(val_lastName);
		log.info("Entring last name value:" + val_lastName + " -at web element :- " + customerLastName.toString());
		customerEmail.clear();
		customerEmail.sendKeys(val_emailAddress);
		log.info("Entring email address: " + val_emailAddress + " -at web element :- " + customerEmail.toString());
		customerPassword.clear();
		customerPassword.sendKeys(val_password);
		log.info("Entring password value: " + val_password + " -at web element :- " + customerPassword.toString());
		customerAddress.clear();
		customerAddress.sendKeys("Test Address");
		log.info("Entring address: Test Address -at web element :- " + customerAddress.toString());
		customerCity.clear();
		customerCity.sendKeys("Test City");
		log.info("Entring city nane: Test City -at web element :- " + customerCity.toString());
		customerState.sendKeys("Alabama");
		log.info("Entring State : Alabama -at web element :- " + customerState.toString());
		customerPostcode.clear();
		customerPostcode.sendKeys("35006");
		log.info("Entring Postcode: 35006 -at web element :- " + customerPostcode.toString());
		customerPhone.clear();
		customerPhone.sendKeys("159753486");
		log.info("Entring phone number: 159753486 -at web element :- " + customerPhone.toString());
		Thread.sleep(5000);
		submitAccount.click();
		log.info("Clicking on Register button - at web element path :-" + submitAccount.toString());

	}

	public void addToCartForUnauthneticatedUser() throws InterruptedException {

		// Generate mouse hover event on main menu to click on sub menu
		Actions actions = new Actions(driver);
		actions.moveToElement(moveOnMenu).moveToElement(clickToOption).click().perform();
		log.info("Mouse hover on menu Dresses -at web element:" + moveOnMenu.toString());
		log.info("and clicking on sub menu Casual Dresses   -at web element:" + clickToOption.toString());
		String pageTitle = driver.getTitle();
		//Verifying page title
		Assert.assertEquals("Casual Dresses - My Store", pageTitle);
		log.info("User is redirected on page :-Casual Dresses - My Store" );
		// To scroll down web page by 600 pixels In x(vertical) direction.
		// You can y parameter to scroll page In horizontal direction.
		log.info("Scrolling down the page to view products..." );
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("window.scrollBy(0,600)", "");
		// Generate mouse hover event on main menu to click on sub menu
		actions.moveToElement(moveToProductImage).moveToElement(moveToProductAddToCart).click().perform();
		log.info("Mouse hover on Product Image -at web element:" + moveToProductImage.toString());
		log.info("and clicking on Add To cart   -at web element:" + moveToProductAddToCart.toString());
		Thread.sleep(3000);
		String addedProductName = productNameOnPopup.getText().toString();
		log.info("Product name:- "+addedProductName+" :is added to cart --at web element:" + productNameOnPopup.toString());
		closePopup.click();
		log.info("clicking on close button -at web element:" + closePopup.toString());
		// Generate mouse hover event on product image to click on add to cart button
		actions.moveToElement(moveToViewCart).moveToElement(moveToProductNameInCart).click().perform();
		log.info("Mouse hover on View cart -at web element:" + moveToViewCart.toString());
		log.info("Clicking on cart product   -at web element:" + moveToProductNameInCart.toString());
		String productNameDispalyedOnDetailsPage = productNameOnDetailsPage.getText().toString();
		log.info("Product name:- "+productNameDispalyedOnDetailsPage+" :is displayed on details page --at web element:" + productNameOnDetailsPage.toString());
		//Verifying product name added on cart
		Assert.assertEquals(addedProductName, productNameDispalyedOnDetailsPage);
				
	}

	public void clickLogout() {
		logout.click();
		log.info("Clicking on Logout - at web element path :-" + logout.toString());
	}

	public String getUserName() {

		String userName = newCreatedUsername.getText();
		log.info("returning the username :" + userName + " - at web element path :-" + newCreatedUsername.toString());
		return userName;
	}

	public void switchToFrame() {
		driver.switchTo().frame(homePageIframe);
		log.info("switching to the iframe....");
	}

	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
		log.info("switching to the default content....");
	}

	public boolean getRegistrationSuccess() {
		try {
			userNameField.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
