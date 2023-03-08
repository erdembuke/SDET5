package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriver {

    @Test
    public void Test1() {
        driver.navigate().to("https://www.selenium.dev/");

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));
        // ana sayfadayim su an.
       String mainPageID = driver.getWindowHandle();


        for (WebElement pages : links) {
            if(!pages.getAttribute("href").contains("mail"))
                pages.click();
        }
        // tum sayfalar acildi
        Set<String> windowIds = driver.getWindowHandles();
        for (String ab : windowIds) {
            System.out.println("id = " + ab);
        }

        // ana sayfaya gecmek icin ;
        // driver.switchTo().window(mainPageID);

        // alt kısımı ekstra yazdim kendim
        for (String abc : windowIds) {
            if(!abc.equals(mainPageID)) {
                driver.switchTo().window(abc);
                driver.close();
                MyFunc.waitForIt(1);
            }
        }



        waitAndQuit();
    }
}
