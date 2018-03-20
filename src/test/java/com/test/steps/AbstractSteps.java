package com.test.steps;

import com.test.apidemo.app.screens.*;
import com.test.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by priyankp.shah on 5/3/16.
 */
public abstract class AbstractSteps {
    @Autowired
    public AppUtils utils;

    @Autowired
    public AppScreen_1 appScreen;
    @Autowired
    public HomeScreen_1 homeScreen;
    @Autowired
    public ActivityScreen_1 activityScreen;
    @Autowired
    public SecureSurfaceScreen_1 secureSurfaceScreen;
    @Autowired
    public SecureDialogScreen_1 secureDialogScreen;
    @Autowired
    public NotificationScreen_1 notificationScreen;
    @Autowired
    public IncomingMessageNotificationScreen_1 incomingMessageNotificationScreen;
    @Autowired
    public LoginScreen loginScreen;
    @Autowired
    public NewPageScreen newPageScreen;

}
