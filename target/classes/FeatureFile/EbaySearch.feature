
@regression
Feature: Ebay Search Functionality
 
  Scenario: Search for mens shirts
    Given Open Ebay website
    When Search for mens shirts
    Then Item list should have only Shirts related products
    
    