package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



import setup.TestRule;

public class seleniumUtils {
	public static WebDriver driver;
	protected static WebDriverWait wait;
	public static String nameCurrentScenario = TestRule.nomeCenario;

	public seleniumUtils() {
		driver = TestRule.getDriver();
	}
	
	protected static Boolean waitForElement(WebElement element, long seconds) {
		WebElement webElement = null;
		try {
			@SuppressWarnings("deprecation")
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(seconds, TimeUnit.SECONDS)
					.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class).ignoring(TimeoutException.class);
			try {
				webElement = wait.until(ExpectedConditions.elementToBeClickable(element));				
			} catch (Exception e) {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		} catch (StaleElementReferenceException e) {
			return false;
		}
		return webElement != null;
	}
}
