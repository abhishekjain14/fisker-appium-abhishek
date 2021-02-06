package android.pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class NotificationsPage extends PageObject {

    @AndroidFindBy(id="com.fisker.connectedcar.basiclogin:id/text_notifications")
    private WebElement notificationFragment;

    @Step
    public void notificationFragmentExists() {
        notificationFragment.isDisplayed();
    }
}
