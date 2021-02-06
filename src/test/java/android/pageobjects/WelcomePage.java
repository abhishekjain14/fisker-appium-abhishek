package android.pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class WelcomePage extends PageObject {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView")
    private WebElement welcomeImage;

    @AndroidFindBy(id="com.fisker.connectedcar.basiclogin:id/navigation_notifications")
    private WebElement notifications;

    @Step
    public void checkWelcomePage() {
        welcomeImage.isDisplayed();
    }

    @Step
    public void clickOnNotifications() {
        notifications.click();
    }
}
