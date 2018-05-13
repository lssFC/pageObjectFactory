package com.pom.automation.brabblerPro.testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class TestBase {

	// Logs gets generated for this class..

	public static final Logger log = Logger.getLogger(TestBase.class.getName());

	public WebDriver driver;
	String url = "http://automationpractice.com/index.php";
	String browser = "firefox";

	// Lauch browser and initializing the configuration
	public void init() {
		selectBrowser(browser);
		getUrl(url);
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}

	/**
	 * Please try either 1. webdriver.gecko.driver OR
	 * 2.webdriver.firefox.marionette properties in windows machine.
	 */

	// Selecting browser
	public void selectBrowser(String browser) {
		System.out.println(System.getProperty("os.name"));
		if (browser.equals("firefox")) {
			System.out.println(System.getProperty("user.dir"));

			// System.setProperty("webdriver.gecko.driver",
			// System.getProperty("user.dir") + "/drivers/geckodriver.exe");

			// foe MAC os
			System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/drivers/geckodriver");
			driver = new FirefoxDriver();
		}

	}

	// Launching the main baseUrl
	public void getUrl(String url) {
		log.info("Navigating to url :-  " + url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void getScreenShot(String name) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
					+ "/src/main/java/com/test/automation/uiAutomation/screenshot/";
			File destFile = new File(
					(String) reportDirectory + name + "_" + formater.format(calendar.getTime()) + ".png");
			FileUtils.copyFile(scrFile, destFile);
			// For linking the screenshots in our testNG report
			Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath()
					+ "' height='120' width='120'/> </a>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
