package elements;

import org.openqa.selenium.By;

public class LoginElements {

    public final By loginButton =
            By.cssSelector("#loginButton");

    public final By modalLoginTab =
            By.cssSelector("#modalLoginTab");

    public final By username =
            By.cssSelector("#loginUsername");

    public final By password =
            By.cssSelector("#loginPassword");

    public final By submitButton =
            By.cssSelector("[type='submit']");
}