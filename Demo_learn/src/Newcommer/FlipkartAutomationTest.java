package Newcommer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutomationTest {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable (assuming it's in your system PATH)
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Launch Flipkart website
        driver.get("https://www.flipkart.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Locate the login button and click
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        loginButton.click();

        // Enter username and password
        WebElement usernameField = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
        usernameField.sendKeys("your_username");

        WebElement passwordField = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
        passwordField.sendKeys("your_password");

        // Click on the login button
        WebElement submitButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
        submitButton.click();

        // Wait for the login process to complete
        try {
            Thread.sleep(3000); // Example wait, not recommended for actual use
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify login by checking the presence of user profile element
        WebElement userProfile = driver.findElement(By.xpath("//div[contains(text(),'My Account')]"));
        if (userProfile.isDisplayed()) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        // Close the browser
        //driver.quit();
    }
}