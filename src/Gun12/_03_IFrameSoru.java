package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseDriver {

    @Test
    public void Test1() {
        /*
    1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
    2-Inputa ülke adı yazınız
    3-CheckBox ı çekleyiniz.
    4-Select in 4.elemanını seçiniz.
        */

        driver.navigate().to("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("New Jersey");

        driver.switchTo().frame(0);
        WebElement checkbox = driver.findElement(By.id("a"));
        checkbox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        WebElement selectElement = driver.findElement(By.xpath("//select[@id='animals']"));
        Select animals = new Select(selectElement);
        animals.selectByValue("avatar");

        driver.switchTo().defaultContent();
    }
}
