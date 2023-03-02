package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionRightClickTest extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.id("rightClickBtn"));
        MyFunc.waitForIt(2);

        Actions aksiyonlar = new Actions(driver);
        Action rightClick = aksiyonlar.moveToElement(element).contextClick().build();
        rightClick.perform();
        MyFunc.waitForIt(1);

        // aksiyonlar.moveToElement(element).contextClick().build().perform();
        // new Actions(driver).contextClick(element).build().perform();

        waitAndQuit();
    }

}
