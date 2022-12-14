package org.example1.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example1.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



import java.util.Random;

public class D05_hoverCategoriesStepDefs {

    P03_homePage Hover = new P03_homePage();

    @Given("user select a random web element and hover over it")
    public void step1()
    {
        int numofElements = Hover.Hovers().size();
        Random random = new Random();
        int rand = random.nextInt(numofElements);
        WebElement randomelement = Hover.Hovers().get(rand);

        Actions action = new Actions(Hooks.driver);
        action.moveToElement(randomelement).perform();
    }
    @And("user select a random sub web element and clicks on it")
    public void step2()
    {
        int numofsub = Hover.Hovers().size();
        Random random = new Random();
        int rando = random.nextInt(numofsub);
        WebElement randomsubelement = Hover.Hovers().get(rando);
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(randomsubelement).click();

    }

}
