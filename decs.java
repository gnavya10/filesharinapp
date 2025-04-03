package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class decs {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://file-sharing-application.netlify.app/login");
    }

    @Test(priority = 1)
    public void testLogin() {
        // Perform login
        WebElement emailField = driver.findElement(By.id("email")); // Update ID or selector if different
        WebElement passwordField = driver.findElement(By.id("password")); // Update ID or selector if different
        WebElement loginButton = driver.findElement(By.id("loginButton")); // Update ID or selector if different
        
        emailField.sendKeys("garikinanavya99@gmail.com");
        passwordField.sendKeys("qwerty123");
        loginButton.click();

        // Validate login
        WebElement dashboard = driver.findElement(By.id("dashboard")); // Update ID or selector if different
        assert dashboard.isDisplayed() : "Login failed";
    }

    @Test(priority = 2)
    public void testFileUpload() {
        // File upload functionality
        WebElement fileInput = driver.findElement(By.id("fileInput")); // Update ID or selector if different
        fileInput.sendKeys("path/to/your/file.txt");
        
        WebElement uploadButton = driver.findElement(By.id("uploadButton")); // Update ID or selector if different
        uploadButton.click();
        
        // Validate file upload
        WebElement uploadSuccess = driver.findElement(By.id("uploadSuccess")); // Update ID or selector if different
        assert uploadSuccess.isDisplayed() : "File upload failed";
    }

    @Test(priority = 3)
    public void testFileDownload() {
        // File download functionality
        WebElement downloadLink = driver.findElement(By.id("downloadLink")); // Update ID or selector if different
        downloadLink.click();
        
        // Validate file download (e.g., check file existence in download directory)
        // Implement logic as per your requirement
    }

    @AfterClass
    public void tearDown() {
        // Close WebDriver
        driver.quit();
    }
}
