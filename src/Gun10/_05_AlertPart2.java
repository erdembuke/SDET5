package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertPart2 extends BaseDriver {

    @Test
    public void Test1(){

        driver.navigate().to("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        clickMe.click();
        MyFunc.waitForIt(1);
        // alert aciliyor

        driver.switchTo().alert().sendKeys("erdem");
        MyFunc.waitForIt(2);

        driver.switchTo().alert().accept();
        MyFunc.waitForIt(1);

        WebElement txtActual = driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(txtActual.getText().contains("erdem"));

        waitAndQuit();
    }
}
