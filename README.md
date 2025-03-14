Overview:

This automation framework is built using Java, Selenium, and TestNG to test the functionalities of 
SauceDemo. The framework follows the Page Object Model (POM) for better maintainability and includes 
test cases for:

○ Login (positive and negative cases)
○ Navigation through the product catalog
○ Adding products to the cart
○ Complete checkout process

Prerequisites:

Before running the tests, ensure you have the following installed:

○ Java Development Kit (JDK 11+)
○ Maven
○ Google Chrome (Latest version)
○ ChromeDriver (Compatible with your Chrome version)

Project Structure:

project-root/
│-- src/
│   ├── main/
│   │   ├── java/demo/base
│   │   │   ├── BaseTest.java
│   │   ├── java/demo/pages
│   │   │   ├── CartPage.java
│   │   │   ├── CheckoutPage.java
│   │   │   ├── LoginPage.java
│   │   │   ├── ProductPage.java
│   │   ├── java/demo/tests
│   │   │   ├── ApiTest.java
│   │   │   ├── DemoTest.java
│-- pom.xml
│-- README.md

How to Run the Tests:

1. Clone this repository:
git clone 

2. Install dependencies using Maven:
mvn clean install

3. Run the TestNG test suite:
mvn test