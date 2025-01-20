Feature: Application Login

Background:
Given setup the entries in database
When launch the browser
And Hit Home Page url of banking site

@RegressionTest
Scenario: Admin Page default login

Given User is on NetBanking landing page
When User login into application with "admin" and password "123"
Then Home Page is displayed
And Cards are displayed

@RegressionTest
#Reusable
Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with "user" and password "739"
Then Home Page is displayed
And Cards are displayed

@SmokeTest @RegressionTest
Scenario Outline: User Page default login

Given User is on NetBanking landing page
When User login into application with "<Username>" and password "<Password>"
Then Home Page is displayed
And Cards are displayed

Examples:
  | Username   |   Password  |
  | debitcard  |   hello12   |
  | creditcard |   olp21     |
  
@SmokeTest 
Scenario: User Page default Sign Up

Given User is on Practice page
When User SignUp into application
| name |
| lastname |
|emailid |
|4838239 |
Then Home Page is displayed
And Cards are displayed