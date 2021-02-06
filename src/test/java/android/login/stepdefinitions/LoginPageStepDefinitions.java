package android.login.stepdefinitions;

import android.AndroidUtils;
import android.pageobjects.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginPageStepDefinitions {

    @Steps
    LoginPage loginPage;

    @Given("^I am on the welcome screen$")
    public void openLoginScreen() {
        loginPage.clickLogin();
    }

    @And("^I enter the correct username$")
    public void iEnterTheCorrectUsername() {
        loginPage.fillOutUsername(AndroidUtils.TEST_USERNAME);
    }


    @And("^I enter a valid password$")
    public void iEnterAValidPassword() {
        loginPage.fillOutPassword(AndroidUtils.TEST_PASSWORD);
    }

    @And("^I enter a valid username$")
    public void iEnterAValidUsername() {
        loginPage.fillOutUsername(AndroidUtils.INVALID_USERNAME);
    }


    @And("^I enter an incorrect password$")
    public void iEnterAnIncorrectPassword() {
        loginPage.fillOutPassword(AndroidUtils.INVALID_PASSWORD);
    }
}
