import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GREENKART {

    @Test
    public void Broccoli()  throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        WebElement broccoli = driver.findElement(
                By.xpath("//h4[text()='Brocolli - 1 Kg']/parent::div")
        );

        broccoli.findElement(By.cssSelector(".increment")).click();

        broccoli.findElement(By.cssSelector("button")).click();

        driver.findElement(By.cssSelector("[alt='Cart']")).click();

        driver.findElement(By.cssSelector("[type='button']")).click();
        Thread.sleep(2000);

        WebElement cart = driver.findElement(
                By.id("productCartTables")
        );

        String quantity = cart
                .findElement(By.cssSelector(".quantity"))
                .getText();

        List<WebElement> amounts =
                cart.findElements(By.cssSelector(".amount"));

        String price = amounts.get(0).getText();

        String total = amounts.get(1).getText();

        Assert.assertEquals(quantity, "2");
        Assert.assertEquals(price, "120");
        Assert.assertEquals(total, "240");

        driver.findElements(By.cssSelector("button")).get(1).click();

        WebElement country = driver.findElement(By.cssSelector("select"));

        Select select = new Select(country);

        select.selectByVisibleText("Armenia");

        driver.findElement(By.cssSelector(".chkAgree")).click();
        driver.findElement(By.cssSelector("button")).click();

        String message = driver
                .findElement(By.cssSelector(".wrapperTwo"))
                .getText();

        Assert.assertTrue(
                message.contains("Thank you, your order has been placed successfully")
        );
        Thread.sleep(5000);
        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/seleniumPractise/#/"
        );
        driver.quit();


    }

    @Test
    public void Cauliflower()  throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        WebElement broccoli = driver.findElement(
                By.xpath("//h4[text()='Cauliflower - 1 Kg']/parent::div")
        );

        broccoli.findElement(By.cssSelector(".increment")).click();

        broccoli.findElement(By.cssSelector("button")).click();

        driver.findElement(By.cssSelector("[alt='Cart']")).click();

        driver.findElement(By.cssSelector("[type='button']")).click();
Thread.sleep(10000);
        WebElement cart = driver.findElement(
                By.id("productCartTables")
        );

        String quantity = cart
                .findElement(By.cssSelector(".quantity"))
                .getText();

        List<WebElement> amounts =
                cart.findElements(By.cssSelector(".amount"));

        String price = amounts.get(0).getText();

        String total = amounts.get(1).getText();

        Assert.assertEquals(quantity, "2");
        Assert.assertEquals(price, "60");
        Assert.assertEquals(total, "120");
        driver.quit();

    }
}
