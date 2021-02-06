package android.login.stepdefinitions;

import android.pageobjects.LoginPage;
import android.pageobjects.WelcomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WelcomePageStepDefinitions {
    WelcomePage welcomePage;
    LoginPage loginPage;

    @Then("^I should be taken to the Welcome Screen$")
    public void welcomeScreen() {
        loginPage.clickLogin();
        welcomePage.checkWelcomePage();
    }

    @Then("^I should be taken to the login failed screen$")
    public void iShouldBeTakenToTheLoginFailedScreen() {
        loginPage.clickLogin();
        loginPage.loginFailed();
    }

    @When("^I click on the notifications button$")
    public void iClickOnTheNotificationsButton() {
        welcomePage.clickOnNotifications();
    }
}
