package tests;

import actions.ShopActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buyBroccoli {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        ShopActions actions = new ShopActions(driver);

        actions.searchProduct("brocolli");
        actions.addToCart();
        actions.openCartAndCheckout();
        actions.applyPromo();
        actions.placeOrder();

        driver.quit();
    }
}
