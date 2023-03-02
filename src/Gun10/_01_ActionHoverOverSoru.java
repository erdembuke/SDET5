package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionHoverOverSoru extends BaseDriver {

    @Test
    public void Test1() {

        // www.etsy.com sayfasina git
        // Jewellery -> Neckless -> Bib Neckless click
        // tiklatma isleminden sonra URL de
        // bib-necklaces kelimesinin gectigini dogrulayin

        driver.navigate().to("https://www.etsy.com/");
        Actions actions = new Actions(driver);

        WebElement menuElement = driver.findElement(By.id("catnav-primary-link-10855"));
        Action drag = actions.moveToElement(menuElement).build();
        drag.perform();
        MyFunc.waitForIt(2);

        WebElement menuElement2 = driver.findElement(By.id("side-nav-category-link-10873"));
        Action dragAndClick = actions.moveToElement(menuElement2).click().build();
        dragAndClick.perform();
        MyFunc.waitForIt(2);

        WebElement menuElement3 = driver.findElement(By.id("catnav-l3-10881"));
        Action clickElement = actions.moveToElement(menuElement3).click().build();
        clickElement.perform();
        MyFunc.waitForIt(2);

        Assert.assertTrue("test 1 failed" , driver.getCurrentUrl().contains("bib-necklaces"));

        waitAndQuit();

    }
}
