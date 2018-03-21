package com.test.steps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class NewPageSteps extends AbstractSteps {
    public void getNewPageScreen() throws InterruptedException {
        newPageScreen.clickOnNewPageButtonLable();
    }

}
