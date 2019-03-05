/**
 * @author gabriel.gomes
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;

import elements.savingSimulatorPageElements;
import setup.TestRule;

public class savingSimulatorPage extends savingSimulatorPageElements {

	public savingSimulatorPage() {
		driver = TestRule.getDriver();
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public boolean accessSavingsSimulationPage() {
		driver.navigate().to("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
		return waitForElement(PAGE_TITLE, 3);
	}

	public boolean fillInitialValueToSave(String initialValue) {
		
		INPUT_VALOR_APLICAR.sendKeys(initialValue);
		return true;
	}

	public boolean fillMonthlyValueToSave(String monthlyValue) {
		INPUT_VALOR_INVESTIR.sendKeys(monthlyValue);
		return true;
	}
	public boolean fillHowLongToSave(String howLongToSave) {
		INPUT_TEMPO.sendKeys(howLongToSave);
		return true;
	}
	public boolean clickSimulateButton() {
		BUTTON_SIMULAR.click();
		return true;
	}
	public boolean selectedPeriodType(String periodType) {
		SELECT_PERIODO.click();
		
		for (WebElement periodo : OPTION_PERIODO) {
			waitForElement(periodo, 3);
			if (periodo.getText().equalsIgnoreCase(periodType)) {				
				periodo.click();
				return true;
			}
		}
		return false;
	}

	public boolean validate_messageErrorInitialValue() {
		try {
			waitForElement(TEXT_VALOR_APLICAR_ERRO, 3);
			return TEXT_VALOR_APLICAR_ERRO.getText().equals("Valor mínimo de 20.00");
		} catch (Exception e) {
			return false;
		}		
	}

	public boolean validate_messageErrorMonthlyValue() {
		try {
			waitForElement(TEXT_VALOR_INVESTIR_ERRO, 3);
			return TEXT_VALOR_INVESTIR_ERRO.getText().equals("Valor mínimo de 20.00");
		} catch (Exception e) {
			return false;
		}	
	}

	public boolean validate_messageErrorTimeToInvest() {
		try {
			waitForElement(TEXT_TEMPO_ERRO, 3);
			return TEXT_TEMPO_ERRO.getText().equals("Valor esperado não confere");
		} catch (Exception e) {
			return false;
		}	
	}
}
