package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class AppScreen_1 extends AbstractScreen {

    @AndroidFindBy(accessibility = "Activity")
    private AndroidElement appActivityElement;

    @AndroidFindBy(accessibility = "Notification")
    private WebElement appNotificationElement;

    @Autowired
    public AppScreen_1(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public void clickOnActivityLable() {
//      点击事件
        appActivityElement.click();
//      滑动屏幕找到Secure Surfaces
        driver.scrollTo("Secure Surfaces");

    }

    public void clickOnNotificationLable() {
        appNotificationElement.click();
    }
}
