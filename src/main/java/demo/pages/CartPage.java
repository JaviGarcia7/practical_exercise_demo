package demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver; // Declare a WebDriver instance to interact with the browser

    @FindBy(className = "shopping_cart_link") // Locate the shopping cart icon using its class name
    private WebElement cartIcon;

    // Constructor to initialize the WebDriver and page elements
    public CartPage(WebDriver driver) {
        this.driver = driver; // Assign the driver instance to the class variable
        PageFactory.initElements(driver, this); // Initialize WebElements using PageFactory
    }

    // Method to open the shopping cart by clicking the cart icon
    public void openCart() {
        cartIcon.click(); // Click action on the cart icon
    }
}
