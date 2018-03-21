package com.test.stepdefs;

import com.test.steps.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class SecureDialogNavigationStepDefs {
//    @Autowired
//    private LoginSteps loginSteps;
    @Autowired
    private NewPageSteps newPageSteps;

    @When("^I click on \"([^\"]*)\" on \"([^\"]*)\"$")
    public void i_click_on_on(String clickOn, String screenName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        switch (clickOn) {
            case "linkpage_start_register":
                newPageSteps.getNewPageScreen();
                break;
        }
    }

    @Then("^\"([^\"]*)\" text should display$")
    public void text_should_display(String textToCheck) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        switch (textToCheck) {
            case "已有帐号? 登录":
//                Assert.assertTrue(appScreenSteps.checkForActivityScreen());
                break;
            case "Secure Surfaces":
//                Assert.assertTrue(activityScreenSteps.checkForSecureSurfaceScreen());
                break;
            case "Secure Dialog\"":
//                Assert.assertTrue(secureSurfaceSteps.checkForSecureDialog());
                break;
        }
        Thread.sleep(1000);
    }

    @Then("^\"([^\"]*)\" text should visible on button$")
    public void text_should_visible_on_button(String buttonText) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        switch (buttonText) {
            case "Show secure dialog":
//                Assert.assertTrue(secureDialogSteps.checkForSecureDialog());
                break;
            case "Show App Notification":
//                Assert.assertTrue(incomingMessageNotificationSteps.checkIncomingNotification());
        }

    }

    @When("^I click on \"([^\"]*)\" button on \"([^\"]*)\"$")
    public void i_click_on_button_on(String buttonText, String screenName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        switch (buttonText) {
            case "Show secure dialog":
//                secureDialogSteps.getSecureDialog();
                break;
            case "Show App Notification":
//                incomingMessageNotificationSteps.openMessageNotification();
                break;
        }

    }

    @Then("^Dialog should be visible$")
    public void dialog_should_be_visible() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);
    }
}