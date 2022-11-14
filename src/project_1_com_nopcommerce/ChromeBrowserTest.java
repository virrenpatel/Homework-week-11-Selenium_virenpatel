package project_1_com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = " https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Get Current URL
        System.out.println("Current URL:" + driver.getCurrentUrl());
        // Get Page Source
        System.out.println("Page source:"+ driver.getPageSource());
        // Find the email field elements
        WebElement emailField = driver.findElement(By.id("Email"));
        // Type email to email field
        emailField.sendKeys("test123@gmail.com");
        // Find the Password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        //Type password to password field
        passwordField.sendKeys("Password12345");
        //Close the browser
        //driver.close();
    }
}
