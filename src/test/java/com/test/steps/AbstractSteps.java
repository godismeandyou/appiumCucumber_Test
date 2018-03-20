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
    public LoginScreen loginScreen;
    @Autowired
    public NewPageScreen newPageScreen;

}
