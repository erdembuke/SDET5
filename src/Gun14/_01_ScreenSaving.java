package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_ScreenSaving extends BaseDriver {

    @Test
    public void Test1() throws IOException {

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        WebElement usernameBox = driver.findElement(By.name("username"));
        usernameBox.sendKeys("erdembuke");

        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.sendKeys("123456789");

        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitButton.click();

        // hata var ise cikan element
        List<WebElement> hataMesaji = driver.findElements(By.cssSelector("div[role='alert']"));

        if (hataMesaji.size() > 0) {
            System.out.println("Hata olustu");
            // hata varsa ekran kaydet
            TakesScreenshot ts = (TakesScreenshot) driver; // 1. asama ekran goruntusu alma degiskeni tanimladim
            File ss1 = ts.getScreenshotAs(OutputType.FILE); // 2. asama ekran goruntusu alindi , hafizada. henuz kayit islemi olmadı
            // hafizadaki bilgiyi dosya olarak kaydedecegim
            FileUtils.copyFile(ss1, new File("screenshots\\screenshot.png"));
        }
        // TODO : burada her hatada ayni dosyayi yeniliyor ve uzerine yaziyor
        // biz istiyoruz ki her dosya ayri olsun yani her kayit ayri olsun
        // bunu nasil yaparsiniz
        // LocalDateTime alicaksin bilgileri
        // YilAyGunSaatDakikaSan -> 2022_10_07_1319_20.png

        MyFunc.waitForIt(2);


        waitAndQuit();
    }
}
