package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {

        String baselUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        // Creating object for the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Launching the URL
        driver.get(baselUrl);

        // Maximise the browser window
        driver.manage().window().maximize();

        // Giving implicit wait time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Getting the page title
        String title = driver.getTitle();
        System.out.println("The page title is: " +title);

        // Getting current URL
        System.out.println("Current URL is: " +driver.getCurrentUrl());

        // Getting page source
        System.out.println("Page source is: " +driver.getPageSource());

        // Find the Email field and enter the email id
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        //Find the password field element and enter the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        // Closing the browser
        driver.quit();
    }
}
