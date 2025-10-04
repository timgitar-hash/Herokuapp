package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DynamicPage extends BasePage {
	public DynamicPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(css = "a[href='/dynamic_loading']")
	WebElement dynamicPage;
	public DynamicPage getDynamicPage() {
		click(dynamicPage);
		return this;
	}

	@FindBy(css = "a[href='/dynamic_loading/1']")
	WebElement example1;
	public DynamicPage selectExample1() {
		click(example1);
		return this;
	}

	@FindBy(css = "div[id='start'] button")
	WebElement startButton;
	public DynamicPage clickStartButton() {
		click(startButton);
		return this;
	}

	@FindBy(css = "div[id='finish'] h4")
	WebElement textHelloWorld;

	public BasePage verifyTextExample1(String text) {
		Assert.assertTrue(shoudHaveText(textHelloWorld,"Hello World!",5));
		return null;
	}
}
