import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class selen2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        WebElement aaa  = driver.findElement(By.className("search-keyword"));
        aaa.sendKeys("brocolli");

        //driver.findElement(By.className("search-keyword")).sendKeys("brocolli");
        driver.findElement(By.className("product-action")).click();
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.className("action-block")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("promoBtn")));
        driver.findElement(By.className("promoBtn")).click();

        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();


        driver.quit();

    }
}
