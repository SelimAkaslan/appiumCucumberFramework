package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Class01 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/buse/IdeaProjects/appiumCucumberFramework/src/Apps/GestureTool.apk");
        desiredCapabilities.setCapability("appPackage","com.davemac327.gesture.tool");
        desiredCapabilities.setCapability("appActivity","com.davemac327.gesture.tool.GestureBuilderActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,false);
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,15);
        AndroidDriver<WebElement> driver  = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(5000);
    }
    }

