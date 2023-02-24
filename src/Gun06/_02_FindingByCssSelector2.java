package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _02_FindingByCssSelector2 extends BaseDriver {

    @Test
    public void Test1() {
        driver.navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement messageBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        messageBox.sendKeys("Erdem Buke");

        WebElement button = driver.findElement(By.cssSelector("button[type='button'][class='btn btn-default']"));
        button.click();

        WebElement respond = driver.findElement(By.cssSelector("span[id='display']"));


        Assert.assertTrue("aranilan mesaj bulunamadi" , respond.getText().equals("Erdem Buke"));
        // eger dogru calisirsa hicbi sey yazmaz , sadece yanlissa yazar

        // JUNIT java'nin birim test kutuphanesi.
        // JUNIT eski kaliyor bunu kullananlar uzuluyor,uzulenler bunun yerine daha gelismisini yaziyor
        // TestNG yeni nesil test unitesi (New Generation)




        MyFunc.waitForIt(5);

    }
}
