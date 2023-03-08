package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {
    @Test
    public void Test1() {
        driver.navigate().to("https://chercher.tech/practice/frames");

        // id = frame1 , name = iamframe , index = bulundugu sayfadaki kod sayısı
        driver.switchTo().frame(0); // name ve id oldukca yavas calisiyor , index hizli calisiyor

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("New Jersey");

        driver.switchTo().parentFrame();

        // iframe icindeki bir locator da islem yapilacaksa once o iframe gecmem lazim
        // driver.switchTo().frame();
        // sonrasında o frame dısında bi onceki frameye gecmek icin
        // driver.switchTo().parentFrame();
        // driver.switchTo().defaultContent(); ana sayfaya , en başa gider

        waitAndQuit();
    }
}
