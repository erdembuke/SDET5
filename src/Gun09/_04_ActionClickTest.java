package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriver {

    @Test
    public void Test() {

        driver.navigate().to("https://demoqa.com/buttons");
        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        // element.click();

        Actions aksiyonlar = new Actions(driver); // web sayfasi aksiyonlara acildi

        Action aksiyon = aksiyonlar.moveToElement(element).click().build();
        // elementin üzerine click icin git ve orda bekle
        MyFunc.waitForIt(4);
        aksiyon.perform(); // aksiyonu gerceklestir , isleme al , uygula , icra et

        waitAndQuit();
    }

}
