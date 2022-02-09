
Feature: To perform login operation

Scenario: Login to the application
Given user is on homepage
When click on signin button
Then signin is successful

@SmokeTest
Scenario: Login to the application
Given user is on homepage
When click on signin button
Then signin is not successful

@SmokeTest
Scenario: Login to the application
Given user is on homepage
When user enters username and password
|username	|	password	|
|	apoorva	|	test123	|
Then signin is not successful




