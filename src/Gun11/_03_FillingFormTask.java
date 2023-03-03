package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseDriver {

    @Test
    public void Test1() {
        /*
        Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */
        driver.navigate().to("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement box1 = driver.findElement(By.id("title"));
        box1.sendKeys("erdem");

        WebElement box2 = driver.findElement(By.id("description"));
        box2.sendKeys("buke");

        WebElement btn1 = driver.findElement(By.id("btn-submit"));
        btn1.click();

        // implicityWait elemanın locator bulması suresiyle ilgili buradaki eleman zaten hemen bulunuyor
        // ama text i degisiyor , o yuzden WebDriverWait textToBe kullanacagız.
        WebDriverWait bkl = new WebDriverWait(driver,Duration.ofSeconds(20));
        bkl.until(ExpectedConditions.textToBe(By.id("submit-control") , "Form submited Successfully!"));

        WebElement mesaj = driver.findElement(By.id("btn-submit"));
        Assert.assertEquals("Form submited Successfully!" , mesaj.getText());

    }
}
