Overview:

This automation framework is built using Java, Selenium, and TestNG to test the functionalities of 
SauceDemo. The framework follows the Page Object Model (POM) for better maintainability and includes 
test cases for:

- Login (positive and negative cases)
- Navigation through the product catalog
- Adding products to the cart
- Complete checkout process

Prerequisites:

Before running the tests, ensure you have the following installed:

- Java Development Kit (JDK 11+)
- Maven
- Google Chrome (Latest version)
- ChromeDriver (Compatible with your Chrome version)

How to Run the Tests:

1. Clone this repository:
    git clone https://github.com/JaviGarcia7/practical_exercise_demo.git
2. Install dependencies using Maven:
    mvn clean install
3. Run the TestNG test suite:
    mvn test

How to Generate and View Allure Reports:

1. Ensure Allure is installed. If not, install it using:
    npm install -g allure-commandline --save-dev or brew install allure
2. Run tests and generate Allure results:
    mvn clean test
3. Serve the Allure report:
   allure serve target/allure-results
