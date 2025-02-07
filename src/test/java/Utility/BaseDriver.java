package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
	private WebDriver driver;

	public void superclass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
}
