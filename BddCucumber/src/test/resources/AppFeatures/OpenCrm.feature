
Feature: OpenCrm Test
  I want to use this template for my feature file

Background:
Given User login  the system
 Then User opend the browser
 And user enter the open Crm url
 
  Scenario: Open Crm Login
    Given user open firefox  Browser
    And  user Enter Open Crm URL
    When User enter "Admin"  and "Admin123" 
    And Click on login button
    Then Crm Welcome page displays
   
   Scenario: Impatient ward Check
    Given user open chrome  Browser
    And  user Enter other URL
    When Registered user enter "Admin2"  and "Admin123" 
    And Enter login button
    Then Crm lab page displays