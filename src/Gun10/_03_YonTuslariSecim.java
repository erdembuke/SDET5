package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_YonTuslariSecim extends BaseDriver {

    @Test
    public void Test() {
        driver.navigate().to("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions actions = new Actions(driver);
        // elemente git , icine tiklat , b tusuna bas

        Action action = actions.moveToElement(txtBox).click().sendKeys("b").build();
        action.perform();

        MyFunc.waitForIt(1); // aksiyonu 2 ye böldük çünkü çok hızlı calıstı ve yetisemedi.

        Action action2 = actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        action2.perform();

        // aksiyonlar.moveToElement(txtBox).click().sendKeys("b").build().perform();

        waitAndQuit();



    }
}
