
Feature: Application Login

Background:
When launch the browser from config variables
And hit the home page url of banking site


@RegressionTest @NetBanking
Scenario: User Page Default login

Given user is on NetBanking landing page
When user login into application with "user" and pasword "9876"
Then Home page is displayed
And cards are displayed

@SmokeTest @RegressionTest @Mortagage
Scenario Outline: Mortgage Page Default login

Given user is on NetBanking landing page
When user login into application with <Username> and pasword "<Password>"
Then Home page is displayed
And cards are displayed

Examples: 
|Username 	|Password|
|debitUser	|hello123|
|creditUser	|hello987|












  