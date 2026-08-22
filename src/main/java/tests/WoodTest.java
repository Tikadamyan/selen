package tests;

import actions.WoodSignInActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WoodTest {
    @Test
    public void signIn() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://woodscenter.am/");

        WoodSignInActions actions =
                new WoodSignInActions(driver);

        actions.openModal();
        actions.fillEmail("your@email.com");
        actions.fillPassword("yourPassword");
        actions.clickSubmit();

        Assert.assertEquals(
                actions.getDashboardText(),
                "Dashboard"
        );

        driver.quit();
    }
}
