Feature: Application Login

Background:
Given setup the entries in database
When launch the browser
And Hit Home Page url of banking site

@MobileTest @NetBanking
#Reusable
Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with "user" and password "739"
Then Home Page is displayed
And Cards are displayed

@SmokeTest @RegressionTest @Mortgage
Scenario Outline: User Page default login

Given User is on NetBanking landing page
When User login into application with "<Username>" and password "<Password>"
Then Home Page is displayed
And Cards are displayed

Examples:
  | Username   |   Password  |
  | debitcard  |   hello12   |
  | creditcard |   olp21     |
  