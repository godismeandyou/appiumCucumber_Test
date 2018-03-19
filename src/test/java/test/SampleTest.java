package test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appPackage", "com.iqianjin.client");
        desiredCapabilities.setCapability("appActivity", ".asurface.activity.StartActivity");
        desiredCapabilities.setCapability("deviceName", "demo");
        desiredCapabilities.setCapability("NoReset", "ture");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.iqianjin.client:id/linkpage_start_register");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.iqianjin.client:id/tv_other");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.iqianjin.client:id/etUserName");
        el3.sendKeys("15011518955");
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
        el8.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
