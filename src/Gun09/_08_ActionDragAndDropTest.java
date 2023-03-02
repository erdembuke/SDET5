package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import com.beust.ah.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionDragAndDropTest extends BaseDriver {

    @Test
    public void Test1() {

        driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions = new Actions(driver);

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));

        // 1. yontem
        // actions.dragAndDrop(oslo,norway).build().perform(); // oslo'yu al norway' e at

        // 2. yontem
        actions.clickAndHold(oslo).build().perform(); // osloyu tiklat ve al
        actions.moveToElement(norway).release().build().perform(); // norway in uzerine git ve birak

        waitAndQuit();
    }
}
