package org.NYE.pageObjects;

import org.NYE.factory.WebDriverFactory;
import org.springframework.stereotype.Component;
import org.openqa.selenium.support.PageFactory;

@Component
public class CommonPage {
    public CommonPage(final WebDriverFactory factory) {
        PageFactory.initElements(factory.getInstance(), this);
    }
}
