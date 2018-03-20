package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by puhui on 2018-3-19.
 */

@Component
@Scope("cucumber-glue")

public class NewPageScreen extends AbstractScreen {

    @AndroidFindBy(accessibility = "立即注册领108811元红包")
    private AndroidElement appActivityElement;

    @Autowired
    public NewPageScreen(AppiumDriver<? extends MobileElement> driver, AndroidElement appActivityElement) {
        super(driver);
        this.appActivityElement = appActivityElement;
    }

    public void clickOnNewPageButtonLable(){
        appActivityElement.click();
    }

}
