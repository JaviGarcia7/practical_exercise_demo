package demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutPage {
    private WebDriver driver; // Declare a WebDriver instance to interact with the browser

    @FindBy(id = "checkout") // Locate the "Checkout" button using its ID
    private WebElement checkoutButton;

    @FindBy(id = "first-name") // Locate the first name input field using its ID
    private WebElement firstNameField;

    @FindBy(id = "last-name") // Locate the last name input field using its ID
    private WebElement lastNameField;

    @FindBy(id = "postal-code") // Locate the postal code input field using its ID
    private WebElement postalCodeField;

    @FindBy(id = "continue") // Locate the "Continue" button using its ID
    private WebElement continueButton;

    @FindBy(id = "finish") // Locate the "Finish" button using its ID
    private WebElement finishButton;

    // Constructor to initialize the WebDriver and page elements
    public CheckoutPage(WebDriver driver) {
        this.driver = driver; // Assign the driver instance to the class variable
        PageFactory.initElements(driver, this); // Initialize WebElements using PageFactory
    }

    // Method to click the "Checkout" button and proceed to the checkout process
    public void proceedToCheckout() {
        checkoutButton.click(); // Click on the checkout button
    }

    // Method to fill in the checkout form with user details
    public void fillCheckoutForm(String firstName, String lastName, String postalCode) {
        firstNameField.sendKeys(firstName); // Enter the first name
        lastNameField.sendKeys(lastName); // Enter the last name
        postalCodeField.sendKeys(postalCode); // Enter the postal code
        continueButton.click(); // Click the Continue button to proceed
    }

    // Method to complete the checkout process
    public void finishCheckout() {
    	finishButton.click(); // Click the Finish button to complete the order
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-complete.html")); // Verify that the user is redirected to the checkout completion page
    }
}
