package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWidnowPage extends BasePage {
    public MultipleWidnowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/windows']")
    WebElement window;
    public MultipleWidnowPage selectMultipleWindow() {
        click(window);
        return this;
    }

    @FindBy(css = "a[href='/windows/new']")
    WebElement newTabclick;
    public MultipleWidnowPage openNewWindow( int index) {
        click(newTabclick);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }

    @FindBy(css = "div[class='example'] h3")
    WebElement newWindow;
    public MultipleWidnowPage verifyText(String text) {
        Assert.assertTrue(shoudHaveText(newWindow,text,5));
        return this;
    }
}

