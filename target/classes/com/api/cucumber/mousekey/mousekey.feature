Feature: To understand mouse and keyboard actions

Background: common step for the scenario
    Given we are working with this website "https://demos.telerik.com/kendo-ui/dragdrop/events"
    
Scenario: Working with context click 
    When i create the composite action for context click
    Then I build the actions
    And I perform the action
    And I take the screenshot
    When I call the quit method to close the webdriver

