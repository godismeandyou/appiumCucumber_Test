package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
/**
 * Created by puhui on 2018-3-19.
 */
public class LoginScreen extends AbstractScreen {

    @AndroidFindBy(accessibility = "loginButton")
    private AndroidElement appActivityElemexnt;

    @Autowired
    public LoginScreen(AppiumDriver<? extends MobileElement> driver, AndroidElement appActivityElement) {
        super(driver);
        this.appActivityElement = appActivityElement;
    }

    public void clickOnLoginButtonLable(){
        appActivityElement.click();
    }

}
