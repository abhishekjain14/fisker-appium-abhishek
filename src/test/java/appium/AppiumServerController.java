package appium;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

import static appium.AppiumUtils.*;
import static io.appium.java_client.service.local.AppiumDriverLocalService.buildService;

public class AppiumServerController {
    AppiumDriver<MobileElement> driver;

    static {
        System.out.println("Print Default Data");
        System.out.println(APPIUM_HOST +"    "+ APPIUM_PORT + "     " + APPIUM_LOG_LEVEL + "     " + GeneralServerFlag.LOG_LEVEL + "   " + IMPLICIT_WAIT_TIME );


    }

    public void startAppiumServer() {
        try{
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability("deviceName", "emulator-5554");
            dc.setCapability("udid","emulator-5554");
            dc.setCapability("platformName","Android");
            dc.setCapability("platformVersion","8.1");
            dc.setCapability("appPackage","com.fisker.connectedcar.basiclogin");
            dc.setCapability("appActivity","com.fisker.connectedcar.basiclogin.ui.login.LoginActivity");
            driver = new AndroidDriver<MobileElement>(new URL("http://" + APPIUM_HOST + ":" + APPIUM_PORT + "/wd/hub"), dc);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
