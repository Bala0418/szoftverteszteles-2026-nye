package org.NYE;

import io.cucumber.java.en.*;
import org.NYE.factory.WebDriverFactory;
import org.NYE.pageObjects.CommunitiesPage;
import org.NYE.pageObjects.HomePage;
import org.springframework.beans.factory.annotation.Autowired;

public class StepDefinitions {
    @Autowired
    private WebDriverFactory webDriverFactory;

    @Autowired
    private HomePage homePage;

    @Autowired
    private CommunitiesPage communitiesPage;

    @Given("the home page is opened")
    public void mainPageIsOpened() {
        webDriverFactory.getInstance().get("https://wearecommunity.io/");
    }

    @When("the Communities button is clicked on")
    public void theCommunitiesButtonIsClickedOn() {
        homePage.clickOnCommunitiesButton();
    }

    @Then("the Communities page search bar is displayed")
    public void theCommunitiesPageSearchBarIsDisplayed() {
        communitiesPage.pageIsLoaded();
    }

    @Then("the cards should be present on the Communities page")
    public void theCardsShouldBePresentOnTheCommunitiesPage() {
        communitiesPage.communityCardsAreLoaded();
    }

    @And("the first card title should be {string}")
    public void theFirstCardTitleShouldBe(String expectedTitle) {
        communitiesPage.assertFirstCommunityCardTitle(expectedTitle);
    }

}
