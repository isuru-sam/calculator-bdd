@tag
Feature: Calculator
  I want to Add,Substract,Devide,Multiply numbers

  @tag1
  Scenario: Add 2 numbers
    Given I input 10 and 20 numbers
    When I perform add operation
    Then I should get 30 as answer
   

 Scenario: Add 2 numbers
    Given I input 100 and 20 numbers
    When I perform add operation
    Then I should get 120 as answer