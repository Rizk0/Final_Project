package org.example1.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example1.pages.P02_login;

public class D02_loginStepDef {
    P02_login login = new P02_login();

    //Test Case 2
    @Given("user go to login page")
    public void Step1() {
        login.loginBtn().click();
    }

    @When("user login with valid Email and Password")
    public void Step2() {
        login.loginEmail().sendKeys("test2@example.com");
        login.loginPass().sendKeys("P@ssw0rd");
    }

    @Then("user press on login button")
    public void Step3() {
        login.login().click();
    }

    @And("user login to the system successfully")
    public void Step4() {
        login.loginSuccess().isDisplayed();
    }

    //Test Case 3
    @Given("User go to login page")
    public void Step5() {
        login.loginBtn().click();
    }

    @When("user login with invalid Email and Password")
    public void Step6() {
        login.loginEmail().sendKeys("test55@example.com");
        login.loginPass().sendKeys("P@ssw0rd");
    }

    @And("User press on login button")
    public void Step7() {
        login.login().click();
    }

    @Then("user login to the system unsuccessfully")
    public void Step8() {
        login.loginfailed().isDisplayed();
        login.loginfailedColor().getCssValue("#e443");;
    }

}
