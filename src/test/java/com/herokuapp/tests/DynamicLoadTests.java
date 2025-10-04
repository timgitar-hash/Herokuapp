package com.herokuapp.tests;

import com.herokuapp.pages.DynamicPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicLoadTests extends TestBase{

	@BeforeMethod
	public void precondition (){
		new DynamicPage(driver).getDynamicPage();
		new DynamicPage(driver).selectExample1();

	}
	@Test
	public void DynamicExample1 (){
		new DynamicPage(driver).clickStartButton().verifyTextExample1("Hello World!");




	}

}
