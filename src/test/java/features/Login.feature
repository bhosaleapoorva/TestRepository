
Feature: To perform login operation

Scenario: Login to the application case1
Given user is on homepage
When click on signin button
Then signin is successful

@SmokeTest
Scenario: Login to the application case2
Given user is on homepage
When click on signin button
Then signin is not successful


@RegressionTest
Scenario: Login to the application case3
Given user is on homepage
When user enters username and password
|	apoorva	|	test123	|
Then signin is not successful




