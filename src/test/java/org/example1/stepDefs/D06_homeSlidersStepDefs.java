package org.example1.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example1.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDefs {
    P03_homePage HomePage = new P03_homePage();

    @Given("Click On First Slider")
    public void clickFirstSlider() {

        HomePage.sliders("1").click();
        Assert.assertFalse(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        System.out.println("The First Scenario the url is " + Hooks.driver.getCurrentUrl());
    }

    @Given("Click On Second Slider")
    public void clickOnSecondSlider() {
        HomePage.sliders("2").click();
        Assert.assertFalse(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"));
        System.out.println("The Second Scenario the url is " + Hooks.driver.getCurrentUrl());
    }
}



