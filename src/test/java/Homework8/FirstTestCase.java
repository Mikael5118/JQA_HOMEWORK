package Homework8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class FirstTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mikaelderderyan/Selenium/chromedriver-mac-arm64/chromedriver");

        //Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        //Navigate to the target site
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        // Locate username, password, and login button
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // Send login credentials and click login
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        WebElement inventoryLabel = driver.findElement(By.className("title"));
        if (inventoryLabel.getText().equals("Products")) {
            System.out.println("Successfully logged in.");
        } else {
            System.out.println("Login failed.");
            driver.quit();
        }
        // Add item to the cart
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCartButton.click();

        // Click on the shopping cart icon
        WebElement cartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartIcon.click();

        // Confirm that we are on the cart page
        WebElement cartTitle = driver.findElement(By.xpath("//span[@class='title']"));
        if (cartTitle.getText().equals("Your Cart")) {
            System.out.println("Successfully navigated to the cart.");
        } else {
            System.out.println("Failed to navigate to the cart.");
        }

        // Close the browser
        driver.quit();

    }

}
