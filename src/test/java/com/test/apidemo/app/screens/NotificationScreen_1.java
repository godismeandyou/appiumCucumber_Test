package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by priyankp.shah on 9/17/15.
 */
@Component
@Scope("cucumber-glue")
public class NotificationScreen_1 extends AbstractScreen {

    @AndroidFindBy(accessibility = "IncomingMessage")
    private AndroidElement incomingMessageNotificationElement;

    @Autowired
    public NotificationScreen_1(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public void clickOnIncomingMessageLable() {
        incomingMessageNotificationElement.click();
    }


}
