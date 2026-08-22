package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class verjoActions{
    verjoElements elements =new verjoElements();
    WebDriver driver;
    WebDriverWait wait;

    public verjoActions(WebDriver driver ){
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public void openPage() {
        driver.get("https://rahulshettyacademy.com/client/#/dashboard/dash");
    }




    public void fillMinPrice(String price) {

        WebElement minPrice = wait.until(
                ExpectedConditions.visibilityOf(
                        driver.findElements(elements.minPrice).get(1)
                )
        );

        minPrice.sendKeys(price);
    }
}