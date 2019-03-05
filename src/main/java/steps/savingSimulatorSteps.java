/**
 * @author gabriel.gomes
 */
package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.savingSimulatorPage;

public class savingSimulatorSteps {
	
	savingSimulatorPage savingSimulatorPage = new savingSimulatorPage();
	
	@Given("I access savings simulation page")
	public void accessSavingsSimulationPage() {	
		Assert.assertTrue(savingSimulatorPage.accessSavingsSimulationPage(),
				"Ops! Não foi possível acessar a página de simulação de investimento poupança!!!");
	}
	
	@When("I inform the initial value to save (.*)")
	public void informInitialValueToSave(String initialValue) {
		Assert.assertTrue(savingSimulatorPage.fillInitialValueToSave(initialValue),
				"Ops! Houve um problema ao preencher campo de Valor Initial!!!");
	}
	
	@When("inform the monthly value to save (.*)")
	public void informMonthlyValueToSave(String monthlyValue) {
		Assert.assertTrue(savingSimulatorPage.fillMonthlyValueToSave(monthlyValue),
				"Ops! Houve um problema ao preencher campo de Valor Mensal!!!");
	}
    
	@When("selected the period type (.*)")
	public void selectedPeriodType(String periodType) {
		Assert.assertTrue(savingSimulatorPage.selectedPeriodType(periodType),
				"Ops! Houve um problema ao selecionar o período do investimento!!!");
	}
	
	@When("inform for how long to save (.*)")
	public void informHowLongToSave(String howLongToSave) {
		Assert.assertTrue(savingSimulatorPage.fillHowLongToSave(howLongToSave),
				"Ops! Houve um problema ao preencher campo de duracao do investimento!!!");
	}
    
	@When("click the Simulate Button")
	public void clickSimulateButton() {
		Assert.assertTrue(savingSimulatorPage.clickSimulateButton(),
				"Ops! Houve um problema ao clicar no botão Simular!!!");
	}
	
	@Then("minimum initial value alert must be displayed")
	public void validate_messageErrorInitialValue() {
		Assert.assertTrue(savingSimulatorPage.validate_messageErrorInitialValue(),
				"Ops! Nao exibiu corretamente mensagem de Valor Minimo a ser aplicado!!!");
	}
	
	@Then("minimum monthly value alert must be displayed")
	public void validate_messageErrorMonthlyValue() {
		Assert.assertTrue(savingSimulatorPage.validate_messageErrorMonthlyValue(),
				"Ops! Nao exibiu corretamente mensagem de Valor Minimo a ser investido!!!");
	}
	
	@Then("invalid time alert must be displayed")
	public void validate_messageErrorTimeToInvest() {
		Assert.assertTrue(savingSimulatorPage.validate_messageErrorTimeToInvest(),
				"Ops! Nao exibiu corretamente mensagem de Duracao Invalida!!!");
	}
}
