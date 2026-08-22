import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class Selen3Test {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver(); // Открываем браузер перед каждым тестом
    }

    @Test
    public void searchForBrocolli() {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        WebElement searchBox = driver.findElement(By.className("search-keyword"));
        searchBox.sendKeys("brocolli");
        driver.findElement(By.className("product-action")).click();
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.className("action-block")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("promoBtn")));
        driver.findElement(By.className("promoBtn")).click();

        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
    }

    @Test
    public void searchForCarrot() {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        WebElement searchBox = driver.findElement(By.className("search-keyword"));
        searchBox.sendKeys("Carrot");
        driver.findElement(By.className("product-action")).click();
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.className("action-block")).click();

    }



    @AfterMethod
    public void tearDown() {
        driver.quit(); // Закрываем браузер после теста
    }
}
