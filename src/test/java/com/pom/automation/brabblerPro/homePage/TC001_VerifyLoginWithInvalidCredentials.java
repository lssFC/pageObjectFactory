package com.pom.automation.brabblerPro.homePage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;

import com.pom.automation.brabblerPro.testBase.TestBase;
import com.pom.automation.brabblerPro.uiActions.HomePage;

/**
 * 
 * @author Falgun C
 *
 */
public class TC001_VerifyLoginWithInvalidCredentials extends TestBase {

	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());
	HomePage homepage;

	@BeforeMethod
	@BeforeClass
	public void setUp() {
		init();
	}

	
	/*This test case is to verify the invalid login and verify the error message
	 * */
	@Test
	public void VerifyLoginWithInvalidCredentials() {
		log.info("========== Start Testcase excection: VerifyLoginWithInvalidCredentials =========  ");
		homepage = new HomePage(driver);		
		homepage.loginToApplication("abc@gmail.com", "password");
		AssertJUnit.assertEquals(homepage.getInvalidLoginText(), "Authentication failed.");
		log.info("========== End Testcase excection: VerifyLoginWithInvalidCredentials =========  ");
	}

}
