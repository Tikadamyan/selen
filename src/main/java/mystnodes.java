import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class mystnodes {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://my.mystnodes.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement email = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("[type='email']")
                )
        );
        email.sendKeys("tigranadamyan1994@gmail.com");

        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("[type='password']")
                )
        );
        password.sendKeys("Adam212555444595!");

        WebElement submit = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("[type='submit']")
                )
        );

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block: 'center'});", submit);

        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
    }
}