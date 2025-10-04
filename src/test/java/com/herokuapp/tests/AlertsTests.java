package com.herokuapp.tests;

import com.herokuapp.pages.AlertsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsTests extends TestBase{

	@BeforeMethod
	public void precondition (){
		new AlertsPage(driver).getAlertPage();
	}

	@Test
	public void jsAlert(){
		new AlertsPage(driver).clickJsAlert();
		new WebDriverWait(driver , Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent()).accept();
	}

	@Test
	public void jsConfirm(){
		new AlertsPage(driver).clickJsConfirm();
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent()).accept();
		new AlertsPage(driver).verifyOkClick();
	}

}
