
Feature: Federal Test
  I want to use this template for my feature file

 
  Scenario: Federal Finance Login
    Given I want to Open Chrome Browser
    And Enter Federal URL
    When I enter "Admin2"  and "Admin123" 
    And Click on submit button
    Then Federal Finance Welcome page displays
   