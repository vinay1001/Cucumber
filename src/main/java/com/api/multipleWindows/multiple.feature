Feature: To navigate between multiple windows


    
Scenario: Switch from main page to sub page and to another page
    Given given page is "https://www.w3schools.com/tags/tag_a.asp"
    When I click on the page tryityourself option and will open the child browser window
    And switch to child browser window and click on home button
    When I call the quit method and it will close the browser