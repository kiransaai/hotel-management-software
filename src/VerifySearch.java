import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySearch {
    public static void main(String[] args) {
        // Set up the WebDriver (make sure chromedriver is in the correct path)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://example.com");  // Replace with your website URL

        // Locate search textbox
        WebElement searchBox = driver.findElement(By.name("q")); // Update locator if needed
        if (searchBox.isDisplayed()) {
            System.out.println("Search textbox is present.");
        } else {
            System.out.println("Search textbox is NOT present.");
        }

        // Locate search button
        WebElement searchButton = driver.findElement(By.name("btnK")); // Update locator if needed
        if (searchButton.isDisplayed()) {
            System.out.println("Search button is present.");
        } else {
            System.out.println("Search button is NOT present.");
        }

        // Close browser
        driver.quit();
    }