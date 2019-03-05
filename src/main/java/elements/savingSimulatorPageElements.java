/**
 * @author gabriel.gomes
 */
package elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.seleniumUtils;

public class savingSimulatorPageElements extends seleniumUtils {
	
	@FindBy(css=".btn.btnAmarelo.btnSimular")
	protected WebElement PAGE_TITLE;
	
	@FindBy(css=".btn.btnAmarelo.btnSimular")
	protected WebElement BUTTON_SIMULAR;
	
	@FindBy(css=".btn.btnAmarelo.btnRefazer")
	protected WebElement BUTTON_REFAZER;
	
	@FindBy(css="#valorAplicar")
	protected WebElement INPUT_VALOR_APLICAR;
	
	@FindBy(css="#valorInvestir")
	protected WebElement INPUT_VALOR_INVESTIR;
	
	@FindBy(css="#tempo")
	protected WebElement INPUT_TEMPO;
	
	@FindBy(css=".btSelect")
	protected WebElement SELECT_PERIODO;
	
	@FindBy(css=".listaSelect li")
	protected List<WebElement> OPTION_PERIODO;
	
	@FindBy(css="#valorAplicar-error")
	protected WebElement TEXT_VALOR_APLICAR_ERRO;	
	
	@FindBy(css="#valorInvestir-error")
	protected WebElement TEXT_VALOR_INVESTIR_ERRO;	
	
	@FindBy(css="#tempo-error")
	protected WebElement TEXT_TEMPO_ERRO;	
}
