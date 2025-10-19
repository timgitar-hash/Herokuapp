package com.herokuapp.tests;

import com.herokuapp.pages.MultipleWidnowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowTest extends TestBase{



    @BeforeMethod
    public void precondition(){
        new MultipleWidnowPage(driver).selectMultipleWindow();

    }

    @Test
    public void openNewTab (){
        new MultipleWidnowPage(driver).openNewWindow(1)
                .verifyText("New Window");

    }

}
