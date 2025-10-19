package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage extends BasePage{
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/dropdown']")
    WebElement dropdownPage;
    public DropDownPage getDropDown() {
        click(dropdownPage);
        return this;
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;
    public DropDownPage selectOption(String text) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
        return this;
    }

    public DropDownPage verifySelection() {
        String firstSelectedOption = new Select(dropdown).getFirstSelectedOption().getText();
        Assert.assertTrue(shoudHaveText(dropdown,"Option 1",5));
        return this;
    }
}
