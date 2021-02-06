package login.stepdefinitions;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;

public class LoginPageStepDefinitions extends PageObject {

    @AndroidFindBy(id="com.fisker.connectedcar.basiclogin:id/username")
    private WebElement loginUsernameField;

    @AndroidFindBy(id="com.fisker.connectedcar.basiclogin:id/password")
    private WebElement loginPasswordField;

    @AndroidFindBy(id="com.fisker.connectedcar.basiclogin:id/login")
    private WebElement loginButton;
}
