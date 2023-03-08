package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;


public class _04_RobotClass extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.navigate().to("http://demo.guru99.com/test/upload/");
        MyFunc.waitForIt(1);

        Robot rbt = new Robot();

        for (int i = 0; i < 21; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        // windows dosya bul acildi.
        // asagidaki 35-36. satirdaki kod satirlari dosyanin yolunu hafizaya kopyaliyor
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\Monster\\Desktop\\Yeni Metin Belgesi.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu , null);

        MyFunc.waitForIt(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        MyFunc.waitForIt(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.waitForIt(1);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebDriverWait bkl = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement display = bkl.until(ExpectedConditions.visibilityOfElementLocated(By.id("res"))); // ÇOK ÖNEMLİ
        //until i WebElement e esitleyebiliyoruz.  sadece bunda var
        
        Assert.assertTrue(display.getText().contains("successfully"));

        waitAndQuit();
    }
}
