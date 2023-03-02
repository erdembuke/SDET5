package Gun10;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1() {
        driver.navigate().to("https://demoqa.com/auto-complete");
        Actions actions = new Actions(driver);

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));
        // element.sendKeys("Ahmet");
        // shift a , shift i bırak hmet. -> Ahmet

        Action typing = actions.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT)
                        .sendKeys("qua").build(); // hazirlandi.
        typing.perform();                         // gerceklestirildi.



        waitAndQuit();
    }
}
