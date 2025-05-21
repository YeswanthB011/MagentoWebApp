package Utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @category Common Functionalities to enhance the code maintenance and
 *           reusability
 */
public class BaseWebDriverMethods {

	// Object creation
	private WebDriver driver = baseWebDriver.getDriver();
	private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	private JavascriptExecutor js = (JavascriptExecutor) driver;
	private Actions action = new Actions(driver);
	private Select select;

	// Scroll to the element using JavaScript
	public void scrollToElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	// Click on the element
	public void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		scrollToElement(element);
		element.click();
	}

	// Send keys to the element
	public void sendkeys(WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		scrollToElement(element);
		element.clear();
		element.sendKeys(text);
	}

	// Verify that the element contains the specified text
	public void verifyContainsText(WebElement element, String text) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
	}

	// Select an option from a dropdown by index
	public void DropDownByIndex(WebElement element, Integer index) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		select.selectByIndex(index);
	}

	// Select an option from a dropdown by text
	public void DropDownByText(WebElement element, String text) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		select.selectByValue(text);
	}

	// Hover over the element
	public void hoverOver(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		scrollToElement(element);
		action.moveToElement(element).build().perform();
	}

	// Wait for a specified number of seconds
	public void WaitForASecond(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
