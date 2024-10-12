package entrata.base.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private WebDriver driver;
	private Actions action;
	private WebDriverWait waitForLoaderInvisibility;

	public BasePage(WebDriver driver) {
		action = new Actions(driver);
		this.driver = driver;
		waitForLoaderInvisibility = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	// Find element by locator
	protected WebElement find(By locator) {
		return driver.findElement(locator);
	}

	// Mouse-hover/moveToElement element
	protected void moveToElement(By locator) {
		action.moveToElement(find(locator)).build().perform();
	}

	// Click on an element
	protected void click(WebElement element) {
		waitForMillis(1000);
		element.click();
	}

	// Click on element with given locator when it becomes visible
	protected void click(By locator) {
		waitForMillis(1000);
		find(locator).click();
	}

	// Wait for given amount of time
	protected void waitForMillis(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Type given text into element with given locator
	protected void type(By locator, String text) {
		waitForMillis(1000);
		find(locator).sendKeys(text);
	}

	// Select given option from drop-down
	protected void selectByVisibleText(By locator, String option) {
		waitForMillis(1000);
		Select ddl = new Select(find(locator));
		ddl.selectByVisibleText(option);
	}

	// Is element located by locator displayed
	protected boolean isDisplayed(By locator) {
		try {
			return find(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// Open URL
	protected void navigateTo(String url) {
		driver.get(url);
	}

	// Get page title
	protected String getTitle() {
		return driver.getTitle();
	}

	// Is Message displayed by locator
	protected boolean isMessageDisplayed(By locator) {

		waitForLoaderInvisibility.withTimeout(Duration.ofSeconds(6));
		try {
			return find(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// Wait until page is loaded
	protected void waitUntilPageIsLoaded() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(
				driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
	}

	// Find elements by locator
	protected List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}

	// Capitalized text with only alphabetical characters
	public static String getRandomStringOfLength(int length) {
		String CHARS = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder str = new StringBuilder();
		Random random = new Random();

		while (str.length() < length) {
			int index = (int) (random.nextFloat() * CHARS.length());
			str.append(CHARS.charAt(index));
		}

		String randomStr = str.toString();
		return randomStr;
	}

	// Get options in drop-down
	protected List<String> getOptionsInDropdown(By dropdown) {
		Select select = new Select(find(dropdown));

		List<WebElement> optionsWE = select.getOptions();

		List<String> options = new ArrayList<>();

		for (WebElement we : optionsWE) {
			options.add(readText(we).trim());
		}

		return options;
	}

	// Read text from an element
	protected String readText(WebElement element) {
		waitForMillis(1000);
		return element.getText();
	}

	// Mouseover on element 1 and select submenu
	protected void mouseoverAndClick(By l1) {
		waitForMillis(1500);
		action.moveToElement(find(l1)).perform();
		waitForMillis(1500);
		action.moveToElement(find(l1)).click().perform();
	}
}
