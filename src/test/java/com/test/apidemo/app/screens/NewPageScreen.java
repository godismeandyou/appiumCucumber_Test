package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")

public class NewPageScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.iqianjin.client:id/linkpage_start_register")
    private WebElement webElement;

    @Autowired
    public NewPageScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public void clickOnNewPageButtonLable() throws InterruptedException {
        Thread.sleep(3000);
        webElement.click();
    }

}
