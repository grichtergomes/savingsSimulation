/**
 * @author gabriel.gomes
 */		
package runner.Test.SavingsSimulator;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/SavingsSimulatorUI/SavingSimulator_Successful.feature",
glue = { "" }, monochrome = true, dryRun = false)

public class SavingSimulator_SuccessfulTest extends AbstractTestNGCucumberTests{

}
