package com.herokuapp.tests;

import com.herokuapp.pages.DropDownPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest extends TestBase{

    @BeforeMethod
    public void precondition (){
        new DropDownPage(driver).getDropDown();
    }

    @Test
    public void selectDropDownMenuTest(){
        new DropDownPage(driver).selectOption("Option 1").verifySelection();

    }
}
