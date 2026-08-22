package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class verjoui {
    @Test
public  void test(){
    verjo api = new verjo();
    String token = api.Login();

    WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://rahulshettyacademy.com/client/#/dashboard/dash");
    ((JavascriptExecutor) driver).executeScript(
            "localStorage.setItem('token', arguments[0]);",
            token
    );
    driver.navigate().refresh();


        WebElement minPrice = wait.until(
                ExpectedConditions.visibilityOf(
                        driver.findElements(By.cssSelector("[name='minPrice']")).get(1)
                )
        );

        minPrice.sendKeys("200");
}
}
