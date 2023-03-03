package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
    Selenium bekletme komutları

    pageLoadTimeout :
    driver.manage().timeouts().pageLoadTimeout(dr);
    verilen sure icinde sayfanın yuklenmesini bekler , yuklenmezse timeout'a düser hata verir

    implicitlyWait : tum sayfadaki elemanlar icin elemanın locator'ı sayfa icinde bulunabilir hale getirene kadar
    verilen bekleme suresi . eleman bulununca kalan sureyi kullanmaz. NoSuchElement hatasiyla ilgili

            Duration dr = Duration.ofSeconds(30);
            driver.manage().timeouts().implicitlyWait(time);

    Explicit Wait : Tek bir eleman ozel Kriter olarak tanimlanir sadece ilgili element
 */

public class _01_WaitsGiris extends BaseDriver {

    @Test
    public void wait1() {
        driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement button = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        button.click();

        Duration time = Duration.ofSeconds(15);
        driver.manage().timeouts().implicitlyWait(time);

        // MyFunc.waitForIt(1); , bu programi durduruyor , sayfayla ilgili degil , sürenin sonuna kadar bekler.
        // interview'larda bekletme olarak kesinlikle soylenmiyor

        WebElement txtElement = driver.findElement(By.xpath("//p[text()='WebDriver']"));

    }
}
