package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseDriver {
    // interview sorusu :
    // Alertleri nasil kullanirsin ?
    // driver.switchTo().alert()    -> alerte gecerim
    // komutları : accept(); ok,tamam / dismiss(); cancel / sendKeys(); harf input eder.
    @Test
    public void Test1() {
        driver.navigate().to("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        clickMe1.click();
        MyFunc.waitForIt(1);
        // alert açılıyor

        driver.switchTo().alert().accept(); // alert kutusunda ok a bas , boylece kapansin

        waitAndQuit();

    }
}
