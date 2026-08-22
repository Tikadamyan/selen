package actions;
import locators.ShopLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopActions {

    WebDriver driver;
    WebDriverWait wait;

    public ShopActions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void searchProduct(String product) {
        driver.findElement(ShopLocators.searchInput).sendKeys(product);
    }

    public void addToCart() {
        driver.findElement(ShopLocators.addToCartBtn).click();
    }

    public void openCartAndCheckout() {
        driver.findElement(ShopLocators.cartIcon).click();
        driver.findElement(ShopLocators.checkoutBtn).click();
    }

    public void applyPromo() {
        wait.until(ExpectedConditions.elementToBeClickable(ShopLocators.promoBtn)).click();
    }

    public void placeOrder() {
        driver.findElement(ShopLocators.placeOrderBtn).click();
        driver.findElement(ShopLocators.checkbox).click();
        driver.findElement(ShopLocators.proceedBtn).click();
    }
}
