package entrata.functionality.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import entrata.base.pages.EntrataPages;

public class BaseTest {
	private WebDriver driver;
	protected Properties prop;

	protected EntrataPages entrataPages;

	@BeforeTest(alwaysRun = true)
	public void setup() throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Shubham Tilkar\\eclipse-workspace\\"
				+ "Entrata_Project\\src\\main\\resources\\entrata.properties");
		prop = new Properties();
		prop.load(fis);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shubham Tilkar\\" + "eclipse-workspace\\Entrata_Project\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		entrataPages = new EntrataPages(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@BeforeMethod
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	@AfterTest(alwaysRun = true)
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
