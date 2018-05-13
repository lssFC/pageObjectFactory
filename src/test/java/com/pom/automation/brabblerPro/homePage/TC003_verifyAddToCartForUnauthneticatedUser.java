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

public class TC003_verifyAddToCartForUnauthneticatedUser extends TestBase {

	public static final Logger log = Logger.getLogger(TC003_verifyAddToCartForUnauthneticatedUser.class.getName());
	HomePage homepage;

	@BeforeClass
	public void setUp() throws IOException {
		init();
	}

	/*
	 * This test case is to add to cart functionality when user has not logged
	 * in
	 */
	@Test
	public void verifyAddToCartForUnauthneticatedUser() {
		try {
			log.info("======= Starting test execution:  verifyAddToCartForUnauthneticatedUser ===========");
			homepage = new HomePage(driver);
			homepage.addToCartForUnauthneticatedUser();
			log.info("======= Ending test execution: verifyAddToCartForUnauthneticatedUser ===========");
			getScreenShot("verifyAddToCartForUnauthneticatedUser");
		} catch (AssertionError e) {
			getScreenShot("verifyAddToCartForUnauthneticatedUser");
			Assert.assertTrue(false, "verifyAddToCartForUnauthneticatedUser");
		} catch (Exception e) {
			log.info(e.fillInStackTrace().toString());
			getScreenShot("verifyAddToCartForUnauthneticatedUser");
			Assert.assertTrue(false, "verifyAddToCartForUnauthneticatedUser");
		}
	}

}
