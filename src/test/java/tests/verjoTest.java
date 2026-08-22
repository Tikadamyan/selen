package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class verjoTest {

    @Test
    public void test() {

        verjo api = new verjo();
        String token = api.Login();

        WebDriver driver = new ChromeDriver();

        verjoActions actions = new verjoActions(driver);

        actions.openPage();


        BrowserUtils browser = new BrowserUtils(driver);

        browser.setToken(token);
        browser.refresh();

        actions.fillMinPrice("200");
        driver.quit();
    }
}