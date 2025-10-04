package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage{
	public AlertsPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(css ="a[href='/javascript_alerts']")
	WebElement alertsPage;
	public BasePage getAlertPage() {
		click(alertsPage);
		return this;
	}

	@FindBy(css = "button[onclick='jsAlert()']")
	WebElement selectJsAlert;
	public AlertsPage clickJsAlert() {
		click(selectJsAlert);
		return this;
	}

	@FindBy(css = "button[onclick='jsConfirm()']")
	WebElement jsConfirmButton;
	public AlertsPage clickJsConfirm() {
		click(jsConfirmButton);
		return this;
	}

	public AlertsPage verifyOkClick() {
		String result = driver.findElement(By.id("result")).getText();
		assert result.equals("You clicked: Ok");
		return this;
	}
}
