package demo.base;

import demo.pages.CartPage;
import demo.pages.CheckoutPage;
import demo.pages.LoginPage;
import demo.pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver; // Declare WebDriver instance to control the browser
    // Declare page objects for different parts of the application
    protected LoginPage loginPage;
    protected ProductPage productPage;
    protected CartPage cartPage;
    protected CheckoutPage checkoutPage;

    @BeforeClass // This method runs once before any test method in this class
    public void setUp() {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Set the system property for ChromeDriver
        driver = new ChromeDriver(); // Initialize the WebDriver with ChromeDriver
        driver.manage().window().maximize(); // Maximize the browser window for better visibility
        driver.get("https://www.saucedemo.com/"); // Navigate to the SauceDemo login page

        // Initialize page objects
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @AfterClass // This method runs once after all test methods in this class
    public void tearDown() {
        // Close browser after tests
        if (driver != null) {
            driver.quit();
        }
    }
}



