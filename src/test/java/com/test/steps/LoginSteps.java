package com.test.steps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("cucumber-glue")
public class LoginSteps extends AbstractSteps {
    public void getLoginScreen(){
        loginScreen.clickOnLoginButtonLabile();
    }

}
