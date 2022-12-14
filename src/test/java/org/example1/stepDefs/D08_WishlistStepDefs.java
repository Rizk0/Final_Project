package org.example1.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example1.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDefs {

    P03_homePage WishList = new P03_homePage();

    @Given("user clicks on wishlist button of a product")
    public void HTCbtn()
    {
        WishList.WishListBTN().get(2).click();
    }

    @Then("verify success message appeared")
    public void success() throws InterruptedException {
        String text = Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        String actualColor = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getCssValue("background-color");
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(text.contains("The product has been added to your"));
        sa.assertEquals(actualColor,"rgba(75, 176, 122, 1)");
        sa.assertAll();

    }

    @Given("user adds product to wishlist and opens wishlist tab")
    public void wishlistclick()
    {

        WishList.WishListBTN().get(1).click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        boolean check = wait.until(ExpectedConditions.invisibilityOf(WishList.SuccessMsg()));
        Assert.assertTrue(check);
        WishList.WishList().click();

    }

    @Then("verify product is in the wishlist tab")
    public void ProductVerif()
    {
        int actualQty = Integer.parseInt(WishList.qty().getAttribute("value"));
        System.out.println(actualQty);
        Assert.assertTrue(actualQty>0);

    }

}
