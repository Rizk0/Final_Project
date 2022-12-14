package org.example1.pages;

import org.example1.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {

    public WebElement registerBtn() {
        WebElement registerBtn = Hooks.driver.findElement(By.className("ico-register"));
        return registerBtn;
    }
    public WebElement genderBtn() {
        WebElement genderBtn = Hooks.driver.findElement(By.id("gender-male"));
        return genderBtn;
    }
    public WebElement firstname() {
        WebElement firstname = Hooks.driver.findElement(By.id("FirstName"));
        return firstname;
    }
    public WebElement lastname() {
        WebElement lastname = Hooks.driver.findElement(By.id("LastName"));
        return lastname;
    }
    public WebElement DateofBirth() {
        WebElement DateofBirth = Hooks.driver.findElement(By.id("LastName"));
        return DateofBirth;
    }
    public WebElement Email() {
        WebElement Email = Hooks.driver.findElement(By.id("Email"));
        return Email;
    }
    public WebElement Password() {
        WebElement Password = Hooks.driver.findElement(By.id("Password"));
        return Password;
    }
    public WebElement ConfirmPassword() {
        WebElement ConfirmPassword = Hooks.driver.findElement(By.id("ConfirmPassword"));
        return ConfirmPassword;
    }
    public WebElement RegisterBtn() {
        WebElement RegisterBtn = Hooks.driver.findElement(By.id("register-button"));
        return RegisterBtn;
    }
    public WebElement SuccessText() {
        WebElement SuccessText = Hooks.driver.findElement(By.className("result"));
        return SuccessText;
    }








}
