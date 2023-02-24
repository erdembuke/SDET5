package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Homework extends BaseDriver {
    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini acin
    // 2- Business i checkleyin
    // 3- discover XYZ ye tiklatin ve online Advertising i secin
    // 4- Every day i secin
    // 5- Good u secin
    // 6- using XYZ yi tiklatin ve 3. secenegi secin
    // hepsi css selector ile yapilacak

    @Test
    public void Test1() {
        driver.navigate().to("https://formsmarts.com/form/yu?mode=h5");

        WebElement checkBox = driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        WebElement optionBox = driver.findElement(By.cssSelector("select[id$='4588']"));
        WebElement optionSelect = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        WebElement checkBox2 = driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        WebElement checkBox3 = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        WebElement optionBox2 = driver.findElement(By.cssSelector("select[id$='4597']"));
        WebElement optionSelect2 = driver.findElement(By.cssSelector("select[id$='4597'] > :nth-child(4)"));


        checkBox.click();
        MyFunc.waitForIt(1);

        optionBox.click();
        MyFunc.waitForIt(1);

        optionSelect.click();
        MyFunc.waitForIt(1);

        checkBox2.click();
        MyFunc.waitForIt(1);

        checkBox3.click();
        MyFunc.waitForIt(1);

        optionBox2.click();
        MyFunc.waitForIt(1);

        optionSelect2.click();
        MyFunc.waitForIt(1);

        MyFunc.waitForIt(10);
    }
}

