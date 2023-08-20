# MedicareProject

This project is Cucumber-Selenium-Testng-java Based project which contain 2 assignment .

Assignment-1

UI Automation using selenium
	• Create a Maven project
	• Add all  the dependencies for Selenium, TestNg, RestAssured 
	• Write the following testng test cases/scenarios
		○ Validate the SignUp as supplier scenario 
		○ Validate the SignUp as User scenario 
		○ Validate that user and supplier are able to login
		○ Validate that after login user is able to add items into the cart
			§ One item and checkout is working
			§ Multiple Items and checkout is working
	• Add tesntg xml and run all the scenarios using testng.xml
	• Create Jenkins job to run all the scenarios as CI/CD


Assignment- 2

Part-2 API Automation using RestAssured
	• Get call :  http://localhost:8080/medicare/show/all/products
		○ Validate the response code is 200
	• Get call :  http://localhost:8080/medicare/show/category/2/products
		○ Validate the response code is 200
		○ Validate the response contains  Analgesics
	• Push the project on GitHub
	• Create a write up document with all the screenshots- also mention the GitHub  URL
Submit the writeup document on the LMS portal


Project Details

We have created maven project based on cucumber framework POM based.

basically we have created webdriver instance in tools and extend this class to "BeforeAfter" class and "Diver" class.

first talk about test/java/com.medicare.testscripts  class

Driver class  - bacially its conains instance of all the pages om medicare and pass driver as argument while creating instance of it.IT also contain hub node IP (Remote webdriver).
BeforeAfter - its is maximazing screen and calling init() from driver and passing medicare url in it in @before annotations and @after annotations is quiting driver.

MedicareTestStep - its contain all the steps defination for steps define in feature file.

Test runner class - its is basically pass the feature fole location ujnder which all the feature file resides.

then under main/javacom.medicare.testscripts, we have listeners and medicare.pages folder.

listeners - these contains class for reporting purposes.

medicare.pages - bascially its contain webelements xpath for pages wise using testng .

Kept feature folder on top under which we have 4 features file.

Signup , login, Additem and 4th one is related to Rest assured - RestAssuredGetcallToshowAllProducts.

Project is hosted on Github and once user clone it - user need to start selenium grid and then hub on it.








