import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class acbaNG {
    @Test
    public void loginTest()  throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)
        );

        driver.get("https://rahulshettyacademy.com/client");
        driver.findElement(By.cssSelector("[type='email']"))
                .sendKeys("tigranadamyan1994@gmail.com");
        driver.findElement(By.cssSelector("[type='password']"))
                .sendKeys("Adam212555!!!");
        driver.findElement(By.cssSelector("[type='submit']")).click();

        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("#toast-container")
                )
        );


        Assert.assertEquals(
                message.getText(),
                "Login Successfully"


        );
        WebElement viewButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector(".btn.w-40.rounded")
                )
        );

        viewButton.click();




        By priceLocator = By.cssSelector(".col-lg-6.rtl-text h3");

        wait.until(
                ExpectedConditions.textToBePresentInElementLocated(
                        priceLocator,
                        "$ 11500"
                )
        );

        Assert.assertEquals(
                driver.findElement(priceLocator).getText(),
                "$ 11500"
        );

//Thread.sleep(2000);
//        driver.findElement(By.className("btn-primary")).click();


        WebElement viewButton1 = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("btn-primary")
                )
        );

        viewButton1.click();






WebElement element3 =wait.until(
        ExpectedConditions.elementToBeClickable(
                (By.cssSelector("btn.btn-primary"))
        )
);

        element3.click();







        driver.findElements(
                By.cssSelector(".btn.btn-custom")
        ).get(2).click();


        driver.findElements(
                By.cssSelector(".btn.btn-primary")
        ).get(1).click();
   }
}

