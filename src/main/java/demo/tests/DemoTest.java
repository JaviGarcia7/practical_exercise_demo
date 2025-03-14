package demo.tests;

import demo.base.BaseTest;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest extends BaseTest { // DemoTest class extends BaseTest to inherit setup and teardown methods

    @Test // Test case to verify successful login with valid credentials
    @Description("Verify successful login with valid credentials")
    public void testSuccessfulLogin() {
        loginPage.login("standard_user", "secret_sauce"); // Enter valid credentials and login
        Assert.assertTrue(productPage.isProductListDisplayed(), "Login failed"); // Verify login success by checking if the product list is displayed
    }

    @Test // Test case to verify unsuccessful login with invalid credentials
    @Description("Verify unsuccessful login with invalid credentials")
    public void testUnsuccessfulLogin() {
        loginPage.login("test_user", "test_pass"); // Enter invalid credentials and attempt login
        String errorMessage = driver.findElement(By.cssSelector("div.error-message-container.error")).getText();
        Assert.assertTrue(errorMessage.contains("Epic sadface"));// Verify the logIn failed message
    }

    @Test // Test case to verify that the product catalog is accessible
    @Description("Verify product catalog navigation and validation")
    public void testProductNavigation() {
        testSuccessfulLogin();
        Assert.assertTrue(productPage.isProductListDisplayed(), "Product list is not displayed"); // Ensure the product list is visible
    }

    @Test // Test case to add products to the shopping cart and to complete the checkout process
    @Description("Complete the checkout process")
    public void testCheckoutProcess() {
        testSuccessfulLogin();
        for (int i = 0; i < 3; i++) { // Loop to add three products to the cart
            productPage.addProductToCart(); // Click Add to Cart button
        }
        cartPage.openCart(); // Open the shopping cart page
        checkoutPage.proceedToCheckout(); // Click the checkout button to proceed
        checkoutPage.fillCheckoutForm("Test", "QA", "12345"); // Fill in checkout details
        checkoutPage.finishCheckout(); // Complete the checkout and verify success
    }
}
