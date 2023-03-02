package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Soru extends BaseDriver {

    @Test
    public void Test1() {
        /*
          Test Senaryosu
       1- https://www.facebook.com/  sayfasına gidiniz
       2- CreateNewAccount a tıklatınız.
       3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
       4- Doğum tarihinizi Select sınıfı ile seçiniz
       5- Email i tekrar girmenizi isteyen bir input daha açıldığını öncesinde de görünmediğini,
       sonrasında da göründüğünü  assert ile doğrulayınız.
         */

        driver.navigate().to("https://www.facebook.com/");
        MyFunc.waitForIt(1);

        WebElement registerB = driver.findElement(By.xpath("//a[@role='button'][@data-testid='open-registration-form-button']"));
        registerB.click();
        MyFunc.waitForIt(1);

        WebElement inputMail2 = driver.findElement(By.name("reg_email_confirmation__"));
        System.out.println("confirmation email box is displayed ? -> " + inputMail2.isDisplayed());
        System.out.println("confirmation email box is enabled ? -> " + inputMail2.isEnabled());
        Assert.assertFalse(inputMail2.isDisplayed());

        WebElement inputName = driver.findElement(By.name("firstname"));
        inputName.sendKeys("Erdem");
        MyFunc.waitForIt(1);

        WebElement inputLast = driver.findElement(By.name("lastname"));
        inputLast.sendKeys("Buke");
        MyFunc.waitForIt(1);

        WebElement inputMail = driver.findElement(By.name("reg_email__"));
        inputMail.sendKeys("erdembke52@hotmail.com");
        MyFunc.waitForIt(1);
        System.out.println("after confirmation email box is displayed ? -> " + inputMail2.isDisplayed());
        System.out.println("after confirmation email box is enabled ? -> " + inputMail2.isEnabled());
        Assert.assertTrue(inputMail2.isDisplayed());
        inputMail2.sendKeys("erdembke52@hotmail.com");
        MyFunc.waitForIt(1);

        WebElement inputPw = driver.findElement(By.name("reg_passwd__"));
        inputPw.sendKeys("123456789");

        WebElement bDay = driver.findElement(By.name("birthday_day"));
        WebElement bMonth = driver.findElement(By.name("birthday_month"));
        WebElement bYear = driver.findElement(By.name("birthday_year"));

        Select dayOfBirth = new Select(bDay);
        Select monthOfBirth = new Select(bMonth);
        Select yearOfBirth = new Select(bYear);

        dayOfBirth.selectByVisibleText("16");
        MyFunc.waitForIt(1);
        monthOfBirth.selectByValue("11");
        MyFunc.waitForIt(1);
        yearOfBirth.selectByVisibleText("1999");

        waitAndQuit();


    }
}
