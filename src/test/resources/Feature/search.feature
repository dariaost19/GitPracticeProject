Feature: Search
  Scenario: User is able to search on Amazon Main page
    Given open the browser and launch Amazon application
    When user can type item name in the search box
    And click on search button
    Then close the browser