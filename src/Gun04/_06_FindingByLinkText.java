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

        WebElement siparislerimLink = driver.findElement(By.linkText("Siparişlerim"));
        // gözüken text i Siparişlerim olan a tag li webelement
        System.out.println("siparislerimLink.getText() = " + siparislerimLink.getText());

        MyFunc.waitForIt(3);
        driver.quit();

    }
}
