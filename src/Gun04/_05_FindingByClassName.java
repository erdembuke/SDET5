package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); // sayfaya gittim

        WebElement name = driver.findElement(By.className("form-textbox"));
        name.sendKeys("erdem");
        // birden fazla aynı locator a sahip eleman bulursa ilkini alır

        List<WebElement> labels = driver.findElements(By.className("form-sub-label"));
        System.out.println("eleman sayisi " + labels.size());
        for (WebElement e : labels) {
            System.out.println("e.getText() = " + e.getText());
        }
        // aranilan eleman bulunamazsa : findElement NoSuchElement hatasi verir
        // findElements is size ı 0 olan List verir , yani hata vermez

        MyFunc.waitForIt(3);
        driver.quit();
    }
}
