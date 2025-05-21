package pageElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.baseWebDriver;

public class RegistrationPOM extends baseWebDriver {

	public RegistrationPOM() {
		PageFactory.initElements(baseWebDriver.getDriver(), this);
	}

	@FindBy(xpath = "//div[@class='panel wrapper']//div[@class='panel header']//ul[@class='header links']//li[3]/a")
	public WebElement signUp;
	@FindBy(id = "firstname")
	public WebElement firstName;
	@FindBy(id = "lastname")
	public WebElement lastName;
	@FindBy(id = "email_address")
	public WebElement emailAddress;
	@FindBy(id = "password")
	public WebElement password;
	@FindBy(id = "password-confirmation")
	public WebElement passwordConfirmation;
	@FindBy(css = "button.primary")
	public WebElement submit;
	@FindBy(id = "firstname-error")
	public WebElement firstnameError;
	@FindBy(id = "email_address-error")
	public WebElement emailAddressError;
	@FindBy(css = "div.success")
	public WebElement successMessage;
	@FindBy(xpath = "//div[@class='panel wrapper']//div[@class='panel header']//ul[@class='header links']/li[2]")
	public WebElement signIn;
	@FindBy(id = "email")
	public WebElement email;
	@FindBy(id = "pass")
	public WebElement pass;
	@FindBy(id = "send2")
	public WebElement SignInButton;
	@FindBy(xpath = "//div[@id='store.links']/ul[@class='header links']//span[@class='customer-name']")
	public WebElement signOutdrop;
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	public WebElement signOutbutton;
	@FindBy(xpath = "//span[@data-bind=\"scope: 'customer'\"]")
	public List<WebElement> customer;

	public List<WebElement> getWebElementsList(String path) {
		switch (path) {
		case "customer":
			return customer;
		}
		return null;

	}

	public WebElement getWebElements(String path) {
		switch (path) {
		case "signUp":
			return signUp;
		case "firstName":
			return firstName;
		case "lastName":
			return lastName;
		case "emailAddress":
			return emailAddress;
		case "password":
			return password;
		case "passwordConfirmation":
			return passwordConfirmation;
		case "submit":
			return submit;
		case "successMessage":
			return successMessage;
		case "signIn":
			return signIn;
		case "email":
			return email;
		case "pass":
			return pass;
		case "SignInButton":
			return SignInButton;
		case "signOutdrop":
			return signOutdrop;
		case "signOutbutton":
			return signOutbutton;
		case "firstnameError":
			return firstnameError;
		case "emailAddressError":
			return emailAddressError;

		}
		return null;

	}
}
