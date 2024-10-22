
Feature: Application Login

Background:
Given setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site

@RegressionTest
Scenario: Admin Page Default login

Given user is on NetBanking landing page
When user login into application with "admin" and pasword "1234"
Then Home page is displayed
And cards are displayed


@RegressionTest
Scenario: User Page Default login

Given user is on NetBanking landing page
When user login into application with "user" and pasword "9876"
Then Home page is displayed
And cards are displayed

@SmokeTest @RegressionTest
Scenario Outline: Mortgage Page Default login

Given user is on NetBanking landing page
When user login into application with <Username> and pasword "<Password>"
Then Home page is displayed
And cards are displayed

Examples: 
|Username 	|Password|
|debitUser	|hello123|
|creditUser	|hello987|

@SmokeTest
Scenario: User Page Default Sign up

Given user is on Practice landing page
When user Signup into application 
|Sayan|
|Mallik|
|abc@email.com|
|8176765435|
Then Home page is displayed
And cards are displayed










  