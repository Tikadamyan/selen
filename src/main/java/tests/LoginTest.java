package tests;

import actions.BankActions;
import actions.LoginActions;
import actions.ProfileActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    @Test
    public void userCanLoginAndOpenBank() {

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(10)
                );

        LoginActions loginActions =
                new LoginActions(driver);

        ProfileActions profileActions =
                new ProfileActions(driver);

        BankActions bankActions =
                new BankActions(driver);


        // Login

        loginActions.openSite();

        loginActions.login(
                "tigranadamyan1994@gmail.com",
                "Adam212555!!!"
        );


        // Verify Profile

        wait.until(
                ExpectedConditions.urlContains("/profile.html")
        );

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/profile.html"),
                "Profile page was not opened"
        );

        Assert.assertTrue(
                profileActions
                        .getWelcomeMessage()
                        .contains("Welcome back,"),
                "Welcome message was not displayed"
        );


        // Bank

        bankActions.openBank();

        bankActions.switchToBankTab();


        // Verify Bank

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/bank.html"),
                "Bank page was not opened"
        );


        // Verify Admin Panel

        Assert.assertTrue(
                bankActions
                        .getAdminPanelText()
                        .contains("ADMIN PANEL"),
                "Admin Panel was not displayed"
        );


        driver.quit();
    }
}