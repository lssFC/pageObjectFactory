package com.pom.automation.brabblerPro.homePage;

import com.pom.automation.brabblerPro.testBase.TestBase;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pom.automation.brabblerPro.uiActions.HomePage;

/**
 * 
 * @author Falgun C
 *
 */

public class TC002_verifyRegistrationProcess extends TestBase {

	public static final Logger log = Logger.getLogger(TC002_verifyRegistrationProcess.class.getName());
	HomePage homepage;
	String firstName = "demoFName";
	String lastName = "demoLName";
	String emailAddress = System.currentTimeMillis() + "@gmail.com";
	String password = "fakepassword";
	String verifyUserName = firstName + " " + lastName;

	@BeforeClass
	public void setUp() throws IOException {
		init();
	}

	/*
	 * This test case is to verify registration process works correctly.
	 */
	@Test
	public void verifyingRegistration() {
		try {
			log.info("======= Starting test execution:  verifyingRegistration ===========");
			homepage = new HomePage(driver);
			homepage.registeringUser(firstName, lastName, emailAddress, password);
			Assert.assertEquals(verifyUserName, homepage.getUserName());
			log.info("======= Ending test execution: verifyingRegistration ===========");
			getScreenShot("verifyingRegistration");
		} catch (AssertionError e) {
			getScreenShot("verifyingRegistration");
			Assert.assertTrue(false, "verifyingRegistration");
		} catch (Exception e) {
			log.info(e.fillInStackTrace().toString());
			getScreenShot("verifyingRegistration");
			Assert.assertTrue(false, "verifyingRegistration");
		}
	}

}
