package com.test.steps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by puhui on 2018-3-19.
 */
@Component
@Scope("cucumber-glue")

public class LoginSteps extends AbstractSteps {
    public void getLoginScreen(){
        loginScreen.clickOnLoginButtonLable();
    }

}
