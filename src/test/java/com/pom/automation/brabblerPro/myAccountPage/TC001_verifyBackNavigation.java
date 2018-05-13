package com.pom.automation.brabblerPro.myAccountPage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;

import com.pom.automation.brabblerPro.testBase.TestBase;
import com.pom.automation.brabblerPro.uiActions.HomePage;
import com.pom.automation.brabblerPro.uiActions.MyAccountPage;

/**
 * 
 * @author Falgun C
 *
 */
public class TC001_verifyBackNavigation extends TestBase {

	public static final Logger log = Logger.getLogger(TC001_verifyBackNavigation.class.getName());
	MyAccountPage myAccountPage;

	
	@BeforeClass
	public void setUp() {
		init();
	}

	/*
	 * This test case is to verify the back navigation on My account page Steps:
	 * 1. Login into application 2. On My account page 3. Navigate to Order
	 * History Page 4. On My account page 5. Navigate to Order Slip Page 6.
	 * Check the page title 7. Verify back navigation works correctly.
	 * 
	 */
	@Test
	public void verifyBackNavigation() {
		try {
			log.info("========== Start Testcase excection: verifyBackNavigation =========  ");
			myAccountPage = new MyAccountPage(driver);
			myAccountPage.loginToApplication("falguncontractor87@gmail.com", "lsspl123");
			myAccountPage.backNavigation();
			log.info("========== End Testcase excection: verifyBackNavigation =========  ");
			getScreenShot("verifyBackNavigation");
		} catch (AssertionError e) {
			getScreenShot("verifyBackNavigation");
			Assert.assertTrue(false, "verifyBackNavigation");
		} catch (Exception e) {
			log.info(e.fillInStackTrace().toString());
			getScreenShot("verifyBackNavigation");
			Assert.assertTrue(false, "verifyBackNavigation");
		}
	}

}
