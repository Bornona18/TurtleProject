Feature: Google Search

  Scenario Outline: Siple Search
    Given I am on the google homepage
    When I enter search "<term>" 
    And I click on the google search button
    Then I receive related search result

    Examples: 
      | term              | 
      | Quality Assurance |
      | Software Testing  |     
