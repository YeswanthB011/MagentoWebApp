package TestSteps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Utility.BaseWebDriverMethods;
import Utility.baseWebDriver;
import pageElements.RegistrationPOM;

public class RegistrationTestSteps extends BaseWebDriverMethods {
	WebDriver driver = baseWebDriver.getDriver();
	RegistrationPOM pom = new RegistrationPOM();

	@Test(priority = 2)
	public void submitWithoutData() {
		driver.get("https://magento.softwaretestingboard.com/");
		click(pom.getWebElements("signUp"));
		click(pom.getWebElements("submit"));
		String error = pom.getWebElements("firstnameError").getText();
		System.out.println(error);
	}

	@Test(priority = 3)
	public void createNewAccount() {
		sendkeys(pom.getWebElements("firstName"), "demo");
		sendkeys(pom.getWebElements("lastName"), "1");
		sendkeys(pom.getWebElements("emailAddress"), "demo2@gmail.com");
		sendkeys(pom.getWebElements("password"), "qwerty@123");
		sendkeys(pom.getWebElements("passwordConfirmation"), "qwerty@123");
		click(pom.getWebElements("submit"));
	}

	@Test(priority = 4)
	public void signout() {
		List<WebElement> path = pom.getWebElementsList("cutomer");
		path.get(0).click();
		click(pom.getWebElements("signOutbutton"));
	}

	@Test(priority = 5)
	public void login() {
		click(pom.signIn);
		sendkeys(pom.getWebElements("email"), "demo1@gmail.com");
		sendkeys(pom.getWebElements("pass"), "qwerty@123");
		click(pom.getWebElements("SignInButton"));
	}

	@Test(priority = 6)
	public void verifyEmail() {
		click(pom.getWebElements("signUp"));
		sendkeys(pom.getWebElements("firstName"), "demo");
		sendkeys(pom.getWebElements("lastName"), "1");
		sendkeys(pom.getWebElements("password"), "qwerty@123");
		sendkeys(pom.getWebElements("passwordConfirmation"), "qwerty@123");
		click(pom.getWebElements("submit"));
		String error = pom.getWebElements("emailAddressError").getText();
		System.out.println(error);
	}

	@AfterClass
	public void quit() {
		try {
			Thread.sleep(3000);
			driver.quit();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}
