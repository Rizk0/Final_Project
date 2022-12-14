package org.example1.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example1.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {
    P01_register register = new P01_register();

    @Given("user go to register page")
    public void Step1() {
        register.registerBtn().click();
    }

    @When("User Select Gender Type")
    public void Step2() {
        register.genderBtn().click();
    }

    @And("user enter first name \"automation\"")
    public void Step3() {
        register.firstname().sendKeys("automation");
    }

    @And("user enter last name \"tester\"")
    public void Step4() {
        register.lastname().sendKeys("automation");
    }

    @And("user enter email \"test@example.com\" field")
    public void Step6() {
        register.Email().sendKeys("test2@example.com");
    }

    @And("user enter date of birth")
    public void Step7() {
        WebElement dropdown = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
        WebElement monthdropdown = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        select = new Select(monthdropdown);
        select.selectByIndex(7);
        WebElement yeardropdown = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        select = new Select(yeardropdown);
        select.selectByValue("1997");
    }

    @And("user fills Password field \"P@ssw0rd\"")
    public void Step8() {
        register.Password().sendKeys("P@ssw0rd");
    }

    @And("user fills Confirm Password field \"P@ssw0rd\"")
    public void Step9() {
        register.ConfirmPassword().sendKeys("P@ssw0rd");
    }

    @And("user clicks on register button")
    public void Step10() {
        register.RegisterBtn().click();
    }

    @Then("success message is displayed")
    public void Step11() {
        String actualText = Hooks.driver.findElement(By.className("result")).getText();
        SoftAssert Test = new SoftAssert();
        Test.assertTrue(actualText.contains("Your registration completed"));

        String actualColor = Hooks.driver.findElement(By.className("result")).getCssValue("color");
        SoftAssert Color = new SoftAssert();
        Color.assertEquals(actualColor, "rgba(76, 177, 124, 1)");
        Color.assertAll();

    }


}
