package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class tazabanapik {

    @Test
    public void bookingsTest() {

        apik api = new apik();

        String token = api.loginTest();

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://eventhub.rahulshettyacademy.com/");

        ((JavascriptExecutor) driver).executeScript(
                "localStorage.setItem('eventhub_token', arguments[0]);",
                token
        );

        driver.navigate().refresh();


        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("[data-testid='nav-bookings']")
                )
        ).click();
    }
}
