/**
 * @author gabriel.gomes
 */		
package runner.Test.SavingsSimulatorAPI;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/SavingsSimulatorAPI/SimulationAPI.feature",
glue = { "" }, monochrome = true, dryRun = false)

public class SavingsSimulator_API_Test extends AbstractTestNGCucumberTests{

}
