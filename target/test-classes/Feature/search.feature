Feature: Search
  @Test1
  Scenario: User is able to search on Amazon Main page
    Given open the browser and launch Amazon application
    When user can type item name in the search box
    And click on search button
    Then close the browser
    @Test2
    Scenario:
    User is able to search on Amazon Main page
      Given open the browser and launch Amazon application
      When user can click on card
      And see if there are added items
      Then close the browser