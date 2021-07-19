Feature: To test he facebook Post wall

Background: Common steps
	Given User should be logged in
	And Should be present at its own wall
	
Scenario: Post a text on user wall
	When I type the text as "this is a sample post" in the text box
	And Click on Post button
	Then The message get posted
	
Scenario: Post a video on user wall
	When User supply the youtube link as "http://www.google.com" in the text box
	And Click on Post button
	Then Video should get posted on teh user wall
	And The video should have proper thumbnail