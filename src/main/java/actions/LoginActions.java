package actions;

import elements.LoginElements;
import org.openqa.selenium.WebDriver;

public class LoginActions {

    private final WebDriver driver;
    private final LoginElements elements;

    public LoginActions(WebDriver driver) {
        this.driver = driver;
        this.elements = new LoginElements();
    }

    public void openSite() {
        driver.get("https://www.qacloud.dev/");
    }

    public void openLoginModal() {

        driver.findElement(elements.loginButton).click();

        driver.findElement(elements.modalLoginTab).click();
    }

    public void enterUsername(String username) {

        driver.findElement(elements.username)
                .sendKeys(username);
    }

    public void enterPassword(String password) {

        driver.findElement(elements.password)
                .sendKeys(password);
    }

    public void clickLogin() {

        driver.findElement(elements.submitButton)
                .click();
    }

    public void login(String username, String password) {

        openLoginModal();

        enterUsername(username);

        enterPassword(password);

        clickLogin();
    }
}