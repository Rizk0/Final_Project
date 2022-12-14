package org.example1.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example1.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {

    P03_homePage currencies = new P03_homePage();

    @Given("User Select Euro Currency")
    public void step1()
    {
        currencies.EuroSign();
        WebElement dropdown = Hooks.driver.findElement(By.id("customerCurrency"));
        Select Euro = new Select(dropdown);
        Euro.selectByVisibleText("Euro");
    }

    @Then("Verify All Products Price is in Euros")
    public void step2()
    {

        List<WebElement> Verifecation = currencies.Verifecation();

        for (int i=0; i<Verifecation.size(); i++)
        {
            String result = Verifecation.get(i).getText();
            Assert.assertTrue(result.contains("€"));
        }
    }


}
