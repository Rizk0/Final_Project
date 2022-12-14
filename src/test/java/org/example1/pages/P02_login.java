package org.example1.pages;

import org.example1.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {


    public WebElement loginBtn() {
        WebElement loginBtn = Hooks.driver.findElement(By.className("ico-login"));
        return loginBtn;
    }

    public WebElement loginEmail() {
        WebElement loginEmail = Hooks.driver.findElement(By.className("email"));
        return loginEmail;
    }

    public WebElement loginPass() {
        WebElement loginPass = Hooks.driver.findElement(By.className("password"));
        return loginPass;
    }

    public WebElement login() {
        WebElement login = Hooks.driver.findElement(By.className("login-button"));
        return login;
    }

    public WebElement loginSuccess() {
        WebElement loginSuccess = Hooks.driver.findElement(By.className("ico-account"));
        return loginSuccess;
    }
    public WebElement loginfailed() {
        WebElement loginfailed = Hooks.driver.findElement(By.className("message-error"));
        return loginfailed;
    }

    public WebElement loginfailedColor () {
        WebElement loginfailedColor = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
       return loginfailedColor;}




}