package SeleniumHomeworks.Homework3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestClass extends BaseDriver {

    @Test
    public void Test1() {
        /*
        1- https://www.saucedemo.com/
        2- login islemini yapiniz
        3- 3 adet random ürün seçiniz
        7- CheckOut a tiklatin
        8- kullanici bilgilerini doldurup Continue ya tiklatin
        9- Burada her bir esyaninin ucretlerinin toplaminin asagidaki ..-
        item total e esit olup olmadigini Assert ile test ediniz.
         */

        driver.navigate().to("https://www.saucedemo.com/");

        WebElement loginUsername = driver.findElement(By.id("user-name"));
        loginUsername.sendKeys("standard_user");
        MyFunc.waitForIt(1);

        WebElement loginPassword = driver.findElement(By.id("password"));
        loginPassword.sendKeys("secret_sauce");
        MyFunc.waitForIt(1);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        MyFunc.waitForIt(2);

        List<WebElement> addToCarts = driver.findElements(By.xpath("//*[contains(@class,'btn_small btn_inventory')]"));

        for (int i = 0; i < 3; i++) {
            int randomSayi = (int) (Math.random()*6);
            System.out.println("uretilen sayi -> " + randomSayi);
            MyFunc.waitForIt(1);
            if (addToCarts.get(randomSayi).getText().contains("Add")){
                addToCarts.get(randomSayi).click();
            }else System.out.println("urun zaten sepete eklenmis");
        }

        waitAndQuit();
    }
}
