@B32G23-148
Feature: Default

	Background:
		Then user logs in as marketing

	
	@B32G23-146
	Scenario: Verify that the user can attach a link to the specified text.
		When User clicks message button and link button in message box
		    And  User types "google" in text box
		    And User add "https://www.google.com/" in link box
		    And User clicks save and send buttons
		    Then User should see "google" on the feed	

	
	@B32G23-147
	Scenario: Verify that the user can navigate and open the link text in a new tab 
		When User clicks link text on the feed
		Then User is on a new page