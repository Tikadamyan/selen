import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Random;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class Selen4Test{
    @Test
    public void openSite(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.className("search-keyword")).sendKeys("Brocolli");
        driver.findElement(By.className("increment")).click();
        driver.findElement(By.className("product-action")).click();
        driver.findElement(By.cssSelector("[alt='Cart']")).click();
        driver.findElement(By.className("action-block")).click();

      //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(
       //         By.xpath("//button[contains(text(),'Place Order')]")
      //  )).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector(".action-block button")
        )).click();



        driver.findElement(By.cssSelector(".wrapperTwo > div")).click();

        // находим select
        Select countryDropdown = new Select(
                driver.findElement(By.cssSelector("select"))
        );

// получаем все options
        List<WebElement> options = countryDropdown.getOptions();

// убираем первый option "Select"
       // options.remove(0);

// random
        Random random = new Random();
        int randomIndex = random.nextInt(options.size());

// выбираем случайную страну
        countryDropdown.selectByIndex(randomIndex);

        driver.findElement( By.className("chkAgree")).click();
        driver.findElement(By.cssSelector(".wrapperTwo > button")).click();

        String bodyText = driver.findElement(By.tagName("body")).getText();

        Assert.assertTrue(bodyText.contains(
                "Thank you, your order has been placed successfully"
        ));

        Assert.assertTrue(bodyText.contains(
                "You'll be redirected to Home page shortly"
        ));

        driver.quit();
    }

}

