package org.example1.pages;
import org.example1.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {

    public WebElement EuroSign()
    {
        WebElement EuroSign = Hooks.driver.findElement(By.id("customerCurrency"));
        return EuroSign;
    }

    public List<WebElement> Verifecation()
    {
        List<WebElement> Verifecation = Hooks.driver.findElements(By.className("actual-price"));
        return Verifecation;
    }

    public WebElement SearchBtN()
    {
        WebElement SearchBtN = Hooks.driver.findElement(By.id("small-searchterms"));
        return SearchBtN;
    }

    public List<WebElement> Verifecationn()
    {
        List<WebElement> Verifecationn = Hooks.driver.findElements(By.className("product-title"));
        return Verifecationn;
    }

    public WebElement sliders(String num)
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+num+")"));
    }

    public List<WebElement> Hovers()
    {
        List<WebElement> Hovers = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/child::li/child::a/following-sibling::ul/preceding-sibling::a"));
        return Hovers;
    }

    public List<WebElement> SList()
    {
        List<WebElement> SList = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/child::li/child::ul/child::li/child::a"));
        return SList;
    }

    public WebElement FaceBook()
    {
        WebElement FaceBook = Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
        return FaceBook;
    }

    public WebElement twitter()
    {
        WebElement twitter = Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
        return twitter;
    }

    public WebElement rss()
    {
        WebElement rss = Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
        return rss;
    }

    public WebElement YouTube()
    {
        WebElement YouTube = Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
        return YouTube;
    }

    public List<WebElement> WishListBTN()
    {
        List<WebElement> WishListBTN = Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
        return WishListBTN;
    }

    public WebElement WishList()
    {
        WebElement WishList = Hooks.driver.findElement(By.cssSelector("#bar-notification > div > p > a"));
        return WishList;
    }

    public WebElement SuccessMsg()
    {
        WebElement SuccessMsg = Hooks.driver.findElement(By.cssSelector("div[class=bar-notification success]"));
        return SuccessMsg;
    }

    public WebElement qty()
    {
        WebElement qty = Hooks.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
        return qty;
    }


}
