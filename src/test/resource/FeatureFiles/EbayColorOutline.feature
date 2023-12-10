@regression @smoke @us-247
Feature: Ebay Brand Outline

Description: User should able to filter items by Brand

	Background: 
		Given Open Ebay Homepage
	
	Scenario Outline: Filter items by Color 
		Given Search for "<Items>"
		When Specific color of "<Color>"
		Then Item list should have "<Color>"
	
	Examples:
		|Items		|Color			|
		|Shoes		|Black			|
		|Shirts		|White			|
		|Pants		|Blue 			|