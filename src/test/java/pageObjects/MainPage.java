package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium.Init;

public class MainPage {

	WebDriver driver;

	@FindBy(linkText = "CONTACT")
	WebElement contactLink;
	
	@FindBy(linkText = "SUPPORT")
	WebElement supportLink;
	
	@FindBy(linkText = "REGISTER")
	WebElement registerLink;
	
	@FindBy(linkText = "SIGN-ON")
	WebElement signonLink;

	public MainPage() {
		// mechanizm inicjalizujący guziki na stronie, którą przedstawia klasa
		System.out.println("wewnątrz konstruktora mp");
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void contactLinkClick() {
		contactLink.click();
	}
	public void supportLinkClick() {
		supportLink.click();
	}
	public void registerLinkClick() {
		registerLink.click();
	}
	public void signonLinkClick() {
		signonLink.click();
	}
}
