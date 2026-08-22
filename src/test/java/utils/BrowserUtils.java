package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

    public class BrowserUtils {

        WebDriver driver;

        public BrowserUtils(WebDriver driver) {
            this.driver = driver;
        }

        public void openPage(String url) {
            driver.get(url);
        }

        public void setToken(String token) {
            ((JavascriptExecutor) driver).executeScript(
                    "localStorage.setItem('token', arguments[0]);",
                    token
            );
        }

        public void refresh() {
            driver.navigate().refresh();
        }
    }
