package org.NYE.pageObjects;

import org.NYE.factory.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Component
public class CommunitiesPage extends CommonPage {
    public CommunitiesPage(WebDriverFactory factory) {
        super(factory);
    }

    @FindBy(className = "evnt-search-filter")
    private WebElement searchBar;

    public void pageIsLoaded() {
        assertTrue(searchBar.isDisplayed());
    }

    @FindBy(className = "evnt-community-card")
    private List<WebElement> communityCards;

    public void communityCardsAreLoaded() {
        assertFalse(communityCards.isEmpty());
    }

    public void assertFirstCommunityCardTitle(String expectedTitle) {
        String actualTitle = communityCards.get(0).findElement(By.className("evnt-name-wrapper")).getText();
        assertEquals(expectedTitle, actualTitle);
    }
}
