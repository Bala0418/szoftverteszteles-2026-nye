Feature: An example

  Scenario: First scenario
    Given the home page is opened
    When the Communities button is clicked on
    Then the Communities page search bar is displayed

  Scenario: Check card title on Communities page
    Given the home page is opened
    When the Communities button is clicked on
    Then the Communities page search bar is displayed
    Then the cards should be present on the Communities page
    And the first card title should be "Communities"

