package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import com.beust.ah.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionHoverTest extends BaseDriver {

    @Test
    public void Test() {
        driver.navigate().to("https://www.hepsiburada.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.waitForIt(1);

        Actions actions = new Actions(driver);

        Action action1 = actions.moveToElement(element).build();
        action1.perform();
        MyFunc.waitForIt(1);

        waitAndQuit();
    }
}
