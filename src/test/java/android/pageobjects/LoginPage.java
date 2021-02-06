package android.pageobjects;

import android.AndroidUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageObject {

    @AndroidFindBy(id="com.fisker.connectedcar.basiclogin:id/username")
    private WebElement loginUsernameField;

    @AndroidFindBy(id="com.fisker.connectedcar.basiclogin:id/password")
    private WebElement loginPasswordField;

    @AndroidFindBy(id="com.fisker.connectedcar.basiclogin:id/login")
    private WebElement loginButton;

    @AndroidFindBy(id="com.fisker.connectedcar.basiclogin:id/lottieAnimationView")
    private WebElement loginFailed;

    //public LoginPage(WebDriver driver) {
       // super(driver);
    //};

    @Step
    public void clickUsername() {
        loginUsernameField.click();
    }

    @Step
    public void fillOutUsername(String username) {
        loginUsernameField.sendKeys(username);
    }

    @Step
    public void fillOutPassword(String password) {
        loginPasswordField.sendKeys(password);
    }

    @Step
    public void clickLogin() {
        loginButton.click();
    }

    @Step
    public boolean loginFailed() {
        return loginFailed.isDisplayed();
    }

}
