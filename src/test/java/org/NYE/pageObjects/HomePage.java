package org.NYE.pageObjects;

import org.NYE.factory.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends CommonPage {
    public HomePage(WebDriverFactory factory) {
        super(factory);
    }

    private static final String HOME_PAGE_URL = "https://wearecommunity.io/";

    @FindBy(className = "communities-icon")
    private WebElement communitiesButton;

    public void clickOnCommunitiesButton() {
        communitiesButton.click();
    }
}
