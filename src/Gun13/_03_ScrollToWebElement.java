package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {

    @Test
    public void Test1() {
        driver.manage().deleteAllCookies(); // cookie leri sildir.
        driver.get("https://www.copado.com/robotic-testing");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true);" , element); // elemente kadar kaydir
        // true ise üste getirir false ise alta getirir

        // element.click(); herhangi bir bar in , elemanın altinda oldugunda tiklanamaz
        js.executeScript("arguments[0].click();" , element); // html icinden elemente ulasir ve tiklatir

        MyFunc.waitForIt(5);

        waitAndQuit();

    }
}
