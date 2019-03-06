Feature: Validate Successful Savings Simulation

  @successTest
  Scenario Outline: Validate Successful Savings Simulation
    Given I access savings simulation page
    When I inform the initial value to save <initialValue>
    And inform the monthly value to save <monthlyValue>
    And inform for how long to save <savingTime>
    And selected the period type <periodType>
    And click the Simulate Button
    Then simulated page should be displayed <savingTime> <periodType>

    Examples: 
      | initialValue | monthlyValue | savingTime | periodType |
      |        20,00 |        30,00 |         10 | Meses      |
      |        30,00 |        20,00 |         15 | Anos       |
