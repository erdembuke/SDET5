package SeleniumHomeworks.Homework5;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TestClass1 extends BaseDriver {

    @Test
    public void Test1() {
     /*
        Senaryo
        1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
        2- random 100 e kadar 2 sayı üretiniz.
        3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
        4- Sonuçları Assert ile kontrol ediniz.
        5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
    */
        driver.navigate().to("https://testsheepnz.github.io/BasicCalculator.html");

        int rndSayi1 = (int)(Math.random()*100);
        int rndSayi2 = (int)(Math.random()*100);
        String rnd1String = String.valueOf(rndSayi1);
        String rnd2String = String.valueOf(rndSayi2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select oprSelect = new Select(operation);

        for (int i = 0; i < 5 ; i++) {
            WebElement firstNo = driver.findElement(By.id("number1Field"));
            Action action = actions.moveToElement(firstNo).doubleClick().sendKeys(rnd1String).build();
            action.perform();

            WebElement secNo = driver.findElement(By.id("number2Field"));
            Action action1 = actions.moveToElement(secNo).doubleClick().sendKeys(rnd2String).build();
            action1.perform();

            oprSelect.selectByIndex(i);

            WebElement calcBtn = driver.findElement(By.id("calculateButton"));
            calcBtn.click();

            if(i == 0) {
                WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("integerSelect")));
                checkbox.click();
            }

            WebElement display = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));

            if (i == 0) {
                Assert.assertTrue("For add , Answer is wrong", (rndSayi1+rndSayi2) == Integer.parseInt(display.getAttribute("value")));
            }else if (i == 1) {
                Assert.assertTrue("For Substract , Answer is wrong", (rndSayi1-rndSayi2) == Integer.parseInt(display.getAttribute("value")));
            }else if (i == 2) {
                Assert.assertTrue("For Multiply , Answer is wrong", (rndSayi1*rndSayi2) == Integer.parseInt(display.getAttribute("value")));
            }else if (i == 3) {
                Assert.assertTrue("For Divide , Answer is wrong", (int)(rndSayi1/rndSayi2) == Integer.parseInt(display.getAttribute("value")));
            }else Assert.assertTrue("For Concatenate , Answer is wrong", (rnd1String+rnd2String).equals(display.getAttribute("value")));
        }
        waitAndQuit();

    }

    @Test
    public void Test2() {
        /*
            Senaryo
            1- https://www.youtube.com/ adresine gidiniz
            2- "Selenium" kelimesi ile video aratınız.
            3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
            4- Son videonun title ını yazdırınız.
        */


    }
}
