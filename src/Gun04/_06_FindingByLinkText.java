package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/"); // sayfaya gittim

        // LinkText yoluyla eleman bulma islemi sadece a> tagindeki elementlere kullanilabilir
        WebElement siparislerimLink = driver.findElement(By.linkText("Siparişlerim"));
        // gözüken text i Siparişlerim olan a tag li webelement
        System.out.println("siparislerimLink.getText() = " + siparislerimLink.getText());

        System.out.println("siparislerimLink.getAttribute(\"href\") = " + siparislerimLink.getAttribute("href"));
        System.out.println("siparislerimLink.getAttribute(title) = " + siparislerimLink.getAttribute("title"));
        System.out.println("siparislerimLink.getAttribute(rel) = " + siparislerimLink.getAttribute("rel"));

        // partialLinkText

        WebElement link2 = driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());

        MyFunc.waitForIt(3);
        driver.quit();

    }
}
