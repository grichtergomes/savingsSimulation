Feature: Validate Correct API Response

  @APITest
  Scenario: Validate Correct GET Response
    Given I sent the GET of the Simulation API    
    Then I validate the GET response
   
   
    


