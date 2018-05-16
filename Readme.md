Selenium WebDriver:
The webdriver setup is based on the FirefoxDriver , and i have not configured DesiredCapabilitiesFactory  for this task.

Page Objects Pattern
page object pattern is used to have reusable WebElements/small helper methods seperated from actual test classes and give the opportunity to have nice structured and easily readable tests (without the overhead of BDD-Frameworks like Cucumber or JBehave).

Project overview:
This project is e coomerce web application.
We have created 4 diffenet test cases with selenium in Page Objects Pattern
 - 3 test cases with Home page (contains invalid signin , registation and add to cart)
 - 1 test cases with Settings page (contains back navigation test scenario)

--------------------------------

Prerequisites

Machine: windows 7, vista or windows 10
Browser: Firefox: 33 , 43,,
Java JDK version : 1.8.0_161
java Editor: Eclipse
Maven (if using eclipse, install Maven Integration for Eclipse)
TestNG

Please configure machine environent with following steps: 
Pre requisite : 
1. JAVA Set up (java Editor: Eclipse)
Before proceeding, Please make sure you have installed JAVA and set JAVA environamental variables in your machine.
Please check how to install JAVA and set the environmental variables. 
link: https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/

2. Implemented Browsers
This supports the following browsers and already supported (windows and MAC) OS specific binaries are available and seup correctly:

 - Fire fox (Supported versions33.1 to 43.0.1)

3. Install Eclipse editor for running and execute project

4. Install Maven on Windows machine. Please, follow below link and make environent ready.
https://www.mkyong.com/maven/how-to-install-maven-in-windows/

------------
Here are some details and how to run the test project:
– Project is Maven based, so you need to have Maven installed on your computer.
– The project needs to be run with Java 8.
– Project uses: TestNG for the assertions, Selenium 3, FireFox browser to run the tests (so you need to have FireFox installed on your computer).
– The project can be run on Windows machine
– After downloading the code, before running any test, Maven should be installed and configured correctly on machine.
– All test examples will be grouped in packages, in src/test/java. For example, the first code example has the tests in the following location: src/test/java/seOO/example1. The non-test code parts are found in src/main/java (the PageObjects and other helper classes).
– Running a test is done as you would run any TestNG test: Run As –> TestNG test.


The following describes how to set up a Processing Library project in Eclipse and build it successfully, and to make your Library ready for distribution.

Import to Eclipse
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


Steps to run project once project is imported:

1. Once project is imported, need to configure JRE for project
On eclipse, left click project ->Build Path->Configure build path ->JAVA build path-> Library->JRE System Librabry->Edit->Execution Librbary->
Installed Librbay--> DOuble click on location and select path of latest instlled JRE (Like > C:\Program Files\Java\jdk1.8.0_144)
Save the settings. ( 
2. After project is imported , open POM.xml page and refresh it till all the dependancies gets downloaded.
3. For running a test is done: opn project left click and select  Run As –> TestNG test.

Project overview
Src/main/java (contains base method and page methods)
This is base method - com.pom.automation.brabblerPro.testBase.TestBase.java
Src/test/java (contains test cases )


To Check Test Run result.
HTML test repot will be availble at( Location path :< user dir> \test-output\emailable-report.html)
All Pass and failed test cases are available with screeenshot.
All the test cases are pass. and result is also visible in TestNG 

