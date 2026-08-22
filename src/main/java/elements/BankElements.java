package elements;

import org.openqa.selenium.By;

public class BankElements {

    public final By bankLink =
            By.cssSelector("#appsGrid a[href='/bank.html']");

    public final By adminPanelButton =
            By.cssSelector("[onclick='openAdminPanelModal();']");
}