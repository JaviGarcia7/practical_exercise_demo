package demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private WebDriver driver; // Declare a WebDriver instance to interact with the browser

    @FindBy(className = "inventory_item") // Locate the product list section using its class name
    private WebElement productList;

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]") // Locate the "Add to Cart" button using XPath
    private WebElement addToCartButton;

    // Constructor to initialize the WebDriver and page elements
    public ProductPage(WebDriver driver) {
        this.driver = driver; // Assign the driver instance to the class variable
        PageFactory.initElements(driver, this); // Initialize WebElements using PageFactory
    }

    // Method to check if the product list is displayed on the page
    public boolean isProductListDisplayed() {
        return productList.isDisplayed(); // Returns true if the product list is visible
    }

    // Method to add a product to the shopping cart
    public void addProductToCart() {
        addToCartButton.click(); // Click on the Add to Cart button
    }
}
