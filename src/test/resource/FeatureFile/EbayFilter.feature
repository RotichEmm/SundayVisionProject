
@Smoke
Feature: Ebay Filter Functionality
 
  Scenario: Filter type  for shirts
    Given Open Ebay Website
    When In search bar type shirts
    And Click shirts for men
    Then Item list should show shirts for men
    
    

  