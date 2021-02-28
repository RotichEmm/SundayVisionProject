@regression
Feature: Ebay Brand Outline

Scenario Outline: Search for items with Brand verification
    Given Open Ebay Website
    When Search for "<Items>"
    And Filter by "<Brand>"
    Then Item list should have product of "<Brand>" related products
    
    Examples:
    	|Items |Brand			|
    	|Shirts|Adidas		|
    	|Pants |Nike			|
    	|Shoes |Unbranded	|
    	