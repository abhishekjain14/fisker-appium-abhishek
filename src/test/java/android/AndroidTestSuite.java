package android;

import appium.AppiumServerController;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features"
)

public class AndroidTestSuite {

    @Managed(uniqueSession = true)
    WebDriver driver;

    @BeforeClass
    public static void startAppium() {
        AppiumServerController.startAppiumServer();
    }

    @AfterClass
    public static void stopAppium() {
        AppiumServerController.stopAppiumServer();
    }
}
