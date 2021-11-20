#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login
Feature: Login 
   Login with scenario outline

  @valid
  Scenario Outline: Login with scenario outline
    Given I navigate  to the  login page
    When  I login with email "<email>" and password "<password>"
    Then I should arrive at the my Account Page

    Examples: 
      | email                     | password |
      | carballouriel.j@gmail.com | Root123# |
      | jctester@test.com         | Root123# |