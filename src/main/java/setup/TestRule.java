/**
 * @author gabriel.gomes
 */
package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utils.seleniumUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestRule {

	protected static WebDriver driver;
	public static String nomeCenario;
	
	seleniumUtils seleniumutils = new seleniumUtils();
	
	@SuppressWarnings("static-access")
	@Before
	public void beforeScenario(Scenario scenario) {
		
		if (!scenario.getSourceTagNames().contains("@APITest")) {
			String pathProjeto = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", pathProjeto + "/drivers/chromedriver.exe");
				
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-infobars");
			driver = new ChromeDriver(options);		
			driver.manage().window().maximize();
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static String getNomeCenario() {
		return nomeCenario;
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if (!scenario.getSourceTagNames().contains("@APITest")) {
			driver.quit();
		}		
	}
}
