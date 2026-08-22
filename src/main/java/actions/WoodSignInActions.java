package actions;
import org.openqa.selenium.WebDriver;
import elements.WoodSignInElements;


public class WoodSignInActions  {

    WebDriver driver;
    WoodSignInElements  elements;


    public WoodSignInActions(WebDriver driver) {
        this.driver = driver;
        this.elements = new WoodSignInElements();


    }

        public void openModal(){
            driver.findElement(elements.JoinAndDashboard)
                    .click();

        }
        public void fillEmail(String email){
            driver.findElement(elements.EmailInput)
                    .sendKeys(email);
        }

        public void fillPassword(String password){
            driver.findElement(elements.PasswordInput)
                    .sendKeys(password);
        }

        public void clickSubmit(){
            driver.findElement(elements.SubmitButton)
                    .click();
        }
        public String getDashboardText() {
            return driver.findElement(elements.JoinAndDashboard)
                    .getText();

        }
}

