Feature: Multi Login feature

  @tag2
  Scenario Outline: Open Crm Login using scenario outline
    Given Launch the Chrome Browser
    And Enter OpenCrm Bse URL
    When  enter "<Username>"  and "<Password>" 
    And Click on enter login button
    Then Open Crm home page displays

    Examples: 
      | Username  | Password |   
      | Shubham   | pass|
      | Admin     |Admin123|
       |star      | mink|
