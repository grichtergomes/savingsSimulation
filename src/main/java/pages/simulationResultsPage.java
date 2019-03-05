/**
 * @author gabriel.gomes
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import elements.simulationResultsPageElements;
import setup.TestRule;

public class simulationResultsPage extends simulationResultsPageElements {

	public simulationResultsPage() {
		driver = TestRule.getDriver();
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public boolean validate_SimulatedPageDisplayed(String howLongToSave, String periodType) {
		waitForElement(TEXT_RESULTADO_SIMULACAO, 3);
		int timeInMonths = Integer.parseInt(howLongToSave);				
		if (periodType.equalsIgnoreCase("Anos")) {
			timeInMonths = Integer.parseInt(howLongToSave) * 12;
		}
		
		if (!TEXT_RESULTADO_SIMULACAO.getText().equalsIgnoreCase("Em " + timeInMonths +" meses você terá guardado")) {
			return false;
		}
		
		if (TEXT_VALOR_SIMULACAO.equals("")) {
			return false;
		}		
		 
		for (WebElement option : LIST_OUTRAS_OPCOES) {
			timeInMonths += 12;			
			if (!option.getText().equalsIgnoreCase(Integer.toString(timeInMonths))) {
				return false;
			}
		}
		return true;
	}

}
