package org.example1.stepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example1.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_SearchStepDefs {

    P03_homePage Search = new P03_homePage();

    @Given("user enter product {string} in search bar and click search button")
    public void ProductName(String name)
    {
        Search.SearchBtN().sendKeys(name);
        Search.SearchBtN().sendKeys(Keys.ENTER);
    }

    @Then("{string} products are displayed on webpage")
    public void Verifecationn(String name)
    {
        String Url = Hooks.driver.getCurrentUrl();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(Url.contains("https://demo.nopcommerce.com/search?q="));
        int count = Search.Verifecationn().size();
        System.out.println(count);
        List<WebElement> Verifecationn = Search.Verifecationn();
        for (int i=0; i<Verifecationn.size(); i++)
        {
            String result = Verifecationn.get(i).getText();
            sa.assertTrue(result.contains(name));
        }

    }


    @Given("user enter product <sku> in search bar and click search button")
    public void ProductSku(String sku) {

        Search.SearchBtN().sendKeys(sku);
        Search.SearchBtN().sendKeys(Keys.ENTER);
    }

    @Then("{string} products are displayed on webpages")
    public void SkuVerification(String sku)
    {
        WebElement product = Hooks.driver.findElement(By.className("product-item"));
        product.click();
        WebElement SKU = Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"] span[class=\"value\"]"));
        Assert.assertEquals(SKU.getText(),sku);
    }
}
