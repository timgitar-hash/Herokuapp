package com.herokuapp.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v137.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
	public WebDriver driver;
	JavascriptExecutor js;

	public BasePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this );
		js = (JavascriptExecutor)driver;
	}

	public void click(WebElement element){
		element.click();
	}

	public void type(WebElement element,String text){
		if (text!=null){
			click(element);
			element.clear();
			element.sendKeys(text);
		}
	}

	public boolean shoudHaveText(WebElement element,String text , int time){
		return new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.textToBePresentInElement(element,text));

	}
}
