Feature: Login Test
  Scenario: Go to Amazon website and test login page
    Given Go to Amazon website
    And click login button
    And type your name
    And type your password
    When click to submit button
    Then verify success messages