package locators;
import org.openqa.selenium.By;

public class ShopLocators {

    public static By searchInput = By.className("search-keyword");
    public static By addToCartBtn = By.className("product-action");
    public static By cartIcon = By.cssSelector("img[alt='Cart']");
    public static By checkoutBtn = By.className("action-block");
    public static By promoBtn = By.className("promoBtn");
    public static By placeOrderBtn = By.xpath("//button[text()='Place Order']");
    public static By checkbox = By.cssSelector("[type='checkbox']");
    public static By proceedBtn = By.xpath("//button[text()='Proceed']");
}
