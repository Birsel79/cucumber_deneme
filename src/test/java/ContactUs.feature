Feature: Contact Us Test
  Scenario: Go to website and test Contact us Page
    Given navigate to Website
    And click on contact us button
    And type Name
    And type Email
    And type Message
    When click on submit button
    Then continue home page