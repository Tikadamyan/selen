package actions;

import elements.BankElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BankActions {

    private final WebDriver driver;
    private final BankElements elements;
    private final WebDriverWait wait;

    public BankActions(WebDriver driver) {

        this.driver = driver;
        this.elements = new BankElements();

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }

    public void openBank() {

        driver.findElement(elements.bankLink)
                .click();
    }

    public void switchToBankTab() {

        wait.until(
                ExpectedConditions.numberOfWindowsToBe(2)
        );

        for (String tab : driver.getWindowHandles()) {

            driver.switchTo().window(tab);

            if (driver.getCurrentUrl().contains("/bank.html")) {
                return;
            }
        }
    }

    public String getAdminPanelText() {

        return driver.findElement(
                elements.adminPanelButton
        ).getText();
    }
}