package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")

public class NewPageScreen extends AbstractScreen {

    @Autowired
    public NewPageScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public void clickOnNewPageButtonLable(){
        WebElement appActivityElement = driver.findElement(By.id("linkpage_start_register"));
        appActivityElement.click();
    }

}
