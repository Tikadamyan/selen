import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Woodscenter {
    @Test
    public void  SigIn(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://woodscenter.am/");
        driver.findElement(By.cssSelector(".dashboard-btn")).click();


        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
        By.cssSelector(".auth-modal-data [type='email']"))
                );
        element.sendKeys("tigranadamyan1994@gmail.com");


        driver.findElement(By.cssSelector("[formcontrolname='password']"))
                .sendKeys("Adam212555444595");

        driver.findElement(By.cssSelector(".auth-modal-data [type='submit']"))
                .click();


        WebElement dashboardButton =wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                       By.cssSelector(".dashboard-btn"))

               );
       Assert.assertEquals(
               dashboardButton.getText(),
               "Dashboard"
      );
        driver.quit();

    }
}
