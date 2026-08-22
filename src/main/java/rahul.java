import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.WindowType;


public class rahul {
    public static void main(String[]args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("[value=radio1]")).click();
        driver.findElement(By.id("checkBoxOption1")).click();

        Select dropdown = new Select(
        driver.findElement(By.id("dropdown-class-example"))
        );
        dropdown.selectByValue("option2");
        

        //driver.findElement(By.cssSelector("[type='text']")).sendKeys("Ar");

      /*  WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );

        driver.findElement(By.id("autocomplete"))
                .sendKeys("Ar");

        // 2. Սպասում ենք մինչև Armenia-ն հայտնվի և click ենք անում
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[text()='Armenia']")
                )
        ).click();


        driver.findElement(By.id("autocomplete"))
                .sendKeys("Ar");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Armenia']")).click();


        System.out.println(driver.getCurrentUrl());

////////////////////////////////////////////////////////////////////////////////

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.qaclickacademy.com/");

        System.out.println(driver.getCurrentUrl());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.qaclickacademy.com/");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.id("opentab")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        driver.findElement(
                By.cssSelector(".footer-link.mt-40 li:nth-child(5) a")
        ).click();

        driver.switchTo().window(parentWindow);

        driver.findElement(By.id("name")).sendKeys("Tigran");
        driver.findElement(By.id("alertbtn")).click();


        Alert alert = driver.switchTo().alert();

       alert.accept();
*/

        driver.findElement(By.id("name")).sendKeys("Tigran");
        driver.findElement(By.id("confirmbtn")).click();
        Alert alert = driver.switchTo().alert();

        alert.dismiss();






        Actions actions = new Actions(driver);

        actions.moveToElement(
                driver.findElement(By.id("mousehover"))
        ).perform();
        driver.findElement(By.cssSelector("[href='#top']")).click();



        driver.switchTo().frame("iframe-name");

        driver.findElement(By.cssSelector(".theme-btn")).click();

        driver.switchTo().defaultContent();


        WebElement cell = driver.findElement(
                By.cssSelector("#product tr:nth-child(1) td:nth-child(2)")
        );

        System.out.println(cell.getText());

    }

}
