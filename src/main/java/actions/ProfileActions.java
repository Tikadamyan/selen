package actions;

import elements.ProfileElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfileActions {


    private final ProfileElements elements;
    private final WebDriverWait wait;

    public ProfileActions(WebDriver driver) {


        this.elements = new ProfileElements();

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }

    public String getWelcomeMessage() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        elements.heroName
                )
        ).getText();
    }
}