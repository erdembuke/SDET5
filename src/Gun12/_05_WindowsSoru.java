package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class _05_WindowsSoru extends BaseDriver {

    @Test
    public void Test1() {
        /*

    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.

         */

        driver.navigate().to("https://www.selenium.dev/");
        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));
        String mainPageID = driver.getWindowHandle();

        for (WebElement pages : links) {
            if (!pages.getAttribute("href").contains("mail")) {
                pages.click();
            }
        }

        Set<String> windowIds = driver.getWindowHandles();

        for (String abc : windowIds) {
            if(!abc.equals(mainPageID)) {
                driver.switchTo().window(abc);
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
                driver.close();
            }else {
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
            }
        }

        waitAndQuit();
    }
}
