/**
 * @author gabriel.gomes
 */
package steps;

import java.io.IOException;

import org.codehaus.jettison.json.JSONException;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import definitions.simulationAPIDefinitions;

public class simulationAPI_Steps {
	
	simulationAPIDefinitions simulationAPIDefinitions = new simulationAPIDefinitions();
	
	@Given("I sent the GET of the Simulation API")
	public void sendSimulationApiGet() throws IOException {	
		Assert.assertTrue(simulationAPIDefinitions.sendSimulationApiGet(),
				"Ops! Houve um problema ao enviar o GET!!!");
	}
	
	@Then("I validate the GET response")
	public void validateGETResponse() throws JSONException {	
		Assert.assertTrue(simulationAPIDefinitions.validateGETResponse(),
				"Ops! Response nao esta de acordo o esperado!!!");
	}
}
