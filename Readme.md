Selenium WebDriver:

- The web drive setup is based on the FirefoxDriver, and i have not configured DesiredCapabilitiesFactory for this task.

Page Objects Pattern:

- page object pattern is used to have reusable WebElements/small helper methods separated from actual test classes and give the opportunity to have nice structured and easily readable tests (without the overhead of BDD-Frameworks like Cucumber or JBehave).

Project overview:

This project is e-commerce web application.
We have created 4 different test cases with selenium in Page Objects Pattern
 - 3 test cases with Homepage (contains invalid sign in, registration and add to cart)
 - 1 test cases with Settings page (contains back navigation test scenario)

- Src/main/java (contains base method and page methods)
This is the base method - com.pom.automation.brabblerPro.testBase.TestBase.java
 - Src/test/java (contains test cases )

--------------------------------

Prerequisites:

Machine- Windows 7, Vista or Windows 10
Browser Firefox version 33 to 43
Java JDK version- 1.8.0_161
java Editor- Eclipse
Maven (if using eclipse, install Maven Integration for Eclipse)
TestNG
--------------------------------------------------
Please configure machine environment with following steps: 

1. JAVA Set up (java Editor: Eclipse)
Before proceeding, Please make sure you have installed JAVA and set JAVA environmental variables in your machine.
Please check how to install JAVA and set the environmental variables. 
link: https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/

2. Implemented Browsers
This supports the following browsers and already supported (Windows and MAC) OS specific binaries are available and setup correctly:

 - Firefox (Supported versions33.1 to 43.0.1)

3. Install Eclipse editor for running and execute the project

4. Install Maven on Windows machine. Please, follow the link and make environment ready.
https://www.mkyong.com/maven/how-to-install-maven-in-windows/

-------------------------------
Here are some details and how to run the test project:

– The project is Maven based, so you need to have Maven installed on your computer.
– The project needs to be run with Java 8.
– The project uses: TestNG for the assertions, Selenium, FireFox browser to run the tests (so you need to have FireFox installed on your computer).
– The project can be run on Windows machine
– After downloading the code, before running any test, Maven should be installed and configured correctly on the machine.
– All test examples will be grouped in packages, in src/test/java. For example, the first code example has the tests in the following location: \src\test\java\com\pom\automation\brabblerPro\homePage\TC001_VerifyLoginWithInvalidCredentials.java. The non-test code parts are found in src/main/java (the PageObjects and other helper classes).
– Running a test is done as you would run any TestNG test: Run As –> TestNG test.

------------------------------------
The following describes how to set up a Processing Library project in Eclipse and build it successfully, and to make your Library ready for distribution. :

Import to Eclipse:

To import the template project into Eclipse: using a Git fork

- Clone your new repository to your Eclipse workspace.
- Open Eclipse and select the File → Import... menu item.
- Select Git → Projects from Git, and click "Next >".
- Select "URI" and click "Next >".
- Enter your repository's clone URL in the "URI" field. The remaining fields in the "Location" and "Connection" groups will get automatically filled in.
- Enter your GitHub credentials in the "Authentication" group, and click "Next >".
- Select the master branch on the next screen, and click "Next >".
- The default settings on the "Local Configuration" screen should work fine, click "Next >".
- Make sure "Import existing projects" is selected, and click "Next >".
- Eclipse should find and select the processing-library-template automatically, click "Finish".


Steps to run project once the project is imported:

1. Once a project is imported, need to configure JRE for project
On eclipse, left click project ->Build Path->Configure build path ->JAVA build path-> Library->JRE System Librabry->Edit->Execution Librbary->
Installed Library--> DOuble click on a location and select path of latest installed JRE (Like > C:\Program Files\Java\jdk1.8.0_144)
Save the settings. ( 
2. After the project is imported, open POM.xml page and refresh it till all the dependencies get downloaded.
3. For running a test is done: open project left click and select  Run As –> TestNG test.


To Check Test Run result:

HTML test report will be available at( Location path :< user dir> \test-output\emailable-report.html)
All Pass and failed test cases are available with screenshot.
All the test cases are the pass result  and the result is also visible in TestNG 
