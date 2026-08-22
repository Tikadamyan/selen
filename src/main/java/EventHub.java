import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EventHub {
    public static void main(String[]args){
    WebDriver driver =new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    driver.get("https://fasttv.am/");
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    driver.findElement(By.cssSelector("[type='email']")).sendKeys("tigranadamyan1994@gmail.com");
    driver.findElement(By.cssSelector("[type='password']")).sendKeys("gMZRhxYs+6fCG*j");
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
//
//
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
//                By.cssSelector("[type='checkbox']")
//        )).get(9).click();

    }


}
