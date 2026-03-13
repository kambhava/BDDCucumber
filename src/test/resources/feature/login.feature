Feature: feature to test google search functionality

 
 Background: 
  Given browser window is open
  Scenario Outline: Validate google search is working
   
    And user is on google search page
    When user enters a text in search box "<EnterText>"
    And hits enter
    Then user is navigated to search results "<Welcome>"
    
    Examples:
    |EnterText                 |  Welcome     |      
    |automationTesting         |      test1   | 
    
           
   
   