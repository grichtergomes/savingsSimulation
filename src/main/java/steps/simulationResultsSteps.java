/**
 * @author gabriel.gomes
 */
package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.savingSimulatorPage;
import pages.simulationResultsPage;

public class simulationResultsSteps {
	
	simulationResultsPage simulationResultsPage = new simulationResultsPage();
	
	@Then("simulated page should be displayed (.*) (.*)")
	public void validate_simulatedPageDisplayed(String howLongToSave, String periodType) {
		Assert.assertTrue(simulationResultsPage.validate_SimulatedPageDisplayed(howLongToSave, periodType),
				"Página com resultado da simulação não foi exibida corretamente!!!");
	}
}
