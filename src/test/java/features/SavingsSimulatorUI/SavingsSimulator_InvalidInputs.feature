Feature: Validate Fields Alert with Invalid Inputs

  @negativeTest
  Scenario: Validate Invalid Initial Value Input
    Given I access savings simulation page
    When I inform the initial value to save 19,99
    And click the Simulate Button
    Then minimum initial value alert must be displayed

  @negativeTest
  Scenario: Validate Invalid Monthly Value Input
    Given I access savings simulation page
    When inform the monthly value to save 19,99
    And click the Simulate Button
    Then minimum monthly value alert must be displayed

  @negativeTest
  Scenario: Validate Invalid Time Value Input
    Given I access savings simulation page
    When inform for how long to save 0
    And click the Simulate Button
    Then invalid time alert must be displayed
