/**
 * @author gabriel.gomes
 */		
package runner.Test.SavingsSimulator;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/SavingsSimulatorUI/SavingsSimulator_InvalidInputs.feature",
glue = { "" }, monochrome = true, dryRun = false)

public class SavingsSimulator_InvalidInputTest extends AbstractTestNGCucumberTests{

}
