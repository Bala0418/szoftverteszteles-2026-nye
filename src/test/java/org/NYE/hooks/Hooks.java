package org.NYE.hooks;

import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.NYE.factory.WebDriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {
    @Autowired
    private WebDriverFactory factory;

    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) factory.getInstance()).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Screenshot on failure", "image/png",
                    new java.io.ByteArrayInputStream(screenshot), ".png");
        }
    }
}
