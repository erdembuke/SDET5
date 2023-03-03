package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
        /*

    Interview Sorusu : Implicit ve Explicit

    Implicitly : Butun elemanlar icin gecerli , bir ekre tanimlanir (HTML de verilen locator var mi?)
    Explicit  Wait  : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur
     ExpectedConditions

                          alert is present

                  .titleIs -> title bu olana kadar bekle
                  .titleContains -> title ın da bu kelime geçene kadar bekle
                  .urlToBe -> url bu olana kadar bekle
                  .urlContains -> url de bu kelime geçene kadar bekle
                  .visibilityOfElementLocated -> eleman DOM da var ve gözükür olana kadar bekle
                  .visibilityOfTheElement -> eleman gözükene kadar bekle
                  .InvisibilityOfTheElement -> eleman kaybolana kadar bekle
                  .elementToBeClickable -> eleman tıklanabilir olana kadra bekle
                  .elementToBeSelected -> eleman seçilebilir olana kadra bekle
                  .textToBe -> elemanda verilen txt gözükene kadar bekle.
                  .alertIsPresent()  -> alert çıkana kadar bekle.
                  .visibilityOfAllElementsLocatedBy -> locator ile bütün elemanlari gözükene kadar bekle
                  .visibilityOfAllElements -> Verilen elemanların listesindeki tüm elemanlar gözrünür olana kadar bekle
                  .numberOfElementsToBe  -> verilen locatora sahip elemanların sayısı bu olana kadar bekle
                  .numberOfElementsToBeLessThan -> verilen locatora sahip elemanların sayısı verilenden az olana kadar bekle
                  .numberOfElementsToBeMoreThan -> verilen locatora sahip elemanların sayısı verilenden fazla olana kadar bekle

        */

public class _02_ExplicitWait extends BaseDriver {

    @Test
    public void wait1() {
        driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement button = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        button.click();

        Duration time = Duration.ofSeconds(30);
        WebDriverWait bkl = new WebDriverWait(driver, time);
        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        // BeklenenKriterlerden -> ExpectedConditions
        // Verilen Locatordaki element gozukur hale -> visibilityOfElementLocated
        // gelene kadar bekle -> bekle.until
    }
}
