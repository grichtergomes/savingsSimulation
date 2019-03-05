/**
 * @author gabriel.gomes
 */
package elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.seleniumUtils;

public class simulationResultsPageElements extends seleniumUtils {
				
	@FindBy(css=".blocoResultadoSimulacao .texto")
	protected WebElement TEXT_RESULTADO_SIMULACAO;
	
	@FindBy(css=".blocoResultadoSimulacao .valor")
	protected WebElement TEXT_VALOR_SIMULACAO;
	
	@FindBy(css=".blocoResultadoSimulacao .maisOpcoes table tbody tr td:first-child")
	protected List<WebElement> LIST_OUTRAS_OPCOES;	
}
