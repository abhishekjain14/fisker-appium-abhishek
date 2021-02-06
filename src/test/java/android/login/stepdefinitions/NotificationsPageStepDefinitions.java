package android.login.stepdefinitions;

import android.pageobjects.NotificationsPage;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class NotificationsPageStepDefinitions {
    @Steps
    NotificationsPage notificationsPage;

    @Then("I should end up on a new screen")
    public void checkNotificationsPage() {
        notificationsPage.notificationFragmentExists();
    }
}
