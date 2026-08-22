import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class acba1 {
    @Test
    public void loginPage(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.qacloud.dev/");
        driver.findElement(By.cssSelector("#loginButton")).click();
        driver.findElement(By.cssSelector("#modalLoginTab")).click();
        driver.findElement(By.cssSelector("#loginUsername"))
                .sendKeys("tigranadamyan1994@gmail.com");

       driver.findElement(By.cssSelector("#loginPassword"))
               .sendKeys("Adam212555!!!");
        driver.findElement(By.cssSelector("[type='submit']")).click();

        WebElement message = wait.until(

                     ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("#heroName")
            )
        );

        Assert.assertTrue(
                message.getText().contains("Welcome back,")
        );
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/profile.html")
        );


        driver.findElement(
                By.cssSelector("#appsGrid a[href='/bank.html']")
        ).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);


        }

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/bank.html")
        );


        System.out.println(
                driver.findElement(By.cssSelector("button.admin-panel-btn")).getText()
        );
        Assert.assertTrue(
      driver.findElement(By.cssSelector("[onclick='openAdminPanelModal();']"))
               .getText().contains("ADMIN PANEL")
        );




    }

}
