import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;



public class Acba {
    public static void main(String[] args) throws InterruptedException{
        //WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://platform.tesvan.com/login");
       driver.findElement(By.cssSelector("[placeholder='johnsmith@example.com']"))
               .sendKeys("tigranadamyan1994@gmail.com");
        driver.findElement(By.cssSelector("[type='password']"))
                .sendKeys("Adam212555444595!");
        driver.findElement(By.className("button_primary__kwlMb")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("navigation_container__NopHO")).getText()
                        .contains("Ելք");
        System.out.println(driver.getCurrentUrl());


       driver.quit();

    }

}
