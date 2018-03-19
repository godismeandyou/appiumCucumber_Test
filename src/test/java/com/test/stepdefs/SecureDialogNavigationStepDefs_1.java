//package com.test.stepdefs;
//
//import com.test.steps.*;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class SecureDialogNavigationStepDefs_1 {
//    @Autowired
//    private HomeScreenSteps_1 homeScreenSteps;
//    @Autowired
//    private AppScreenSteps_1 appScreenSteps;
//    @Autowired
//    private ActivityScreenSteps_1 activityScreenSteps;
//    @Autowired
//    private NotificationSteps_1 notificationSteps;
//    @Autowired
//    private SecureSurfaceSteps_1 secureSurfaceSteps;
//    @Autowired
//    private SecureDialogSteps_1 secureDialogSteps;
//    @Autowired
//    private IncomingMessageNotificationSteps_1 incomingMessageNotificationSteps;
//
//    @When("^I click on \"([^\"]*)\" on \"([^\"]*)\"$")
//    public void i_click_on_on(String clickOn, String screenName) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        switch (clickOn) {
//            case "App":
//                homeScreenSteps.getAppScreen();
//                break;
//            case "Activity":
//                appScreenSteps.getActivityScreen();
//                break;
//            case "Secure Surfaces":
//                activityScreenSteps.getSecureSurfaceScreen();
//                break;
//            case "Secure Dialog":
//                secureSurfaceSteps.getSecureDialogScreen();
//                break;
//            case "Notification":
//                appScreenSteps.getNotificationScreen();
//                break;
//            case "IncomingMessage":
//                notificationSteps.getIncomingMessageNotificationScreen();
//                break;
//        }
//    }
//
//    @Then("^\"([^\"]*)\" text should display$")
//    public void text_should_display(String textToCheck) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        switch (textToCheck) {
//            case "Activity":
//                Assert.assertTrue(appScreenSteps.checkForActivityScreen());
//                break;
//            case "Secure Surfaces":
//                Assert.assertTrue(activityScreenSteps.checkForSecureSurfaceScreen());
//                break;
//            case "Secure Dialog\"":
//                Assert.assertTrue(secureSurfaceSteps.checkForSecureDialog());
//                break;
//        }
//        Thread.sleep(1000);
//    }
//
//    @Then("^\"([^\"]*)\" text should visible on button$")
//    public void text_should_visible_on_button(String buttonText) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        switch (buttonText) {
//            case "Show secure dialog":
//                Assert.assertTrue(secureDialogSteps.checkForSecureDialog());
//                break;
//            case "Show App Notification":
//                Assert.assertTrue(incomingMessageNotificationSteps.checkIncomingNotification());
//        }
//
//    }
//
//    @When("^I click on \"([^\"]*)\" button on \"([^\"]*)\"$")
//    public void i_click_on_button_on(String buttonText, String screenName) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        switch (buttonText) {
//            case "Show secure dialog":
//                secureDialogSteps.getSecureDialog();
//                break;
//            case "Show App Notification":
//                incomingMessageNotificationSteps.openMessageNotification();
//                break;
//        }
//
//    }
//
//    @Then("^Dialog should be visible$")
//    public void dialog_should_be_visible() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        Assert.assertTrue(true);
//    }
//}