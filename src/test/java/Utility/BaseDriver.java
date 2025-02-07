package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
	private final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private final ThreadLocal<String> browser = new ThreadLocal<>();

	private BaseDriver() {
	}
	@BeforeClass
	public WebDriver getDriver() {
		if (browser.get() == null) {
			browser.set("chrome");
		}

		if (driver.get() == null) {
			switch(browser.get()){
				case "edge":
					driver.set(new EdgeDriver());
				case "firefox":
					driver.set(new FirefoxDriver());
				default:
					driver.set(new ChromeDriver());
			}

			driver.get().manage().window().maximize();
			driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		}
		return null;
	}

	@AfterClass
	public void driverQuit(){
		if(driver.get()!=null) driver.get().quit;
	}

	public static void main(String args[]){
		getDriver;
	}

}
