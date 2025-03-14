package demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver; // Declare a WebDriver instance to interact with the browser

    @FindBy(id = "user-name") // Locate the username input field using its ID
    private WebElement usernameField;

    @FindBy(id = "password") // Locate the password input field using its ID
    private WebElement passwordField;

    @FindBy(id = "login-button") // Locate the login button using its ID
    private WebElement loginButton;

    // Constructor to initialize the WebDriver and page elements
    public LoginPage(WebDriver driver) {
        this.driver = driver; // Assign the driver instance to the class variable
        PageFactory.initElements(driver, this); // Initialize WebElements using PageFactory
    }

    // Method to perform login using provided username and password
    public void login(String username, String password) {
        usernameField.sendKeys(username); // Enter the username in the input field
        passwordField.sendKeys(password); // Enter the password in the input field
        loginButton.click(); // Click the login button to submit the form
    }
}
