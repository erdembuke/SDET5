package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitSoru extends BaseDriver {
    /*
    1-  https://www.demoblaze.com/index.html  siteyi açınız.
    2- Samsung galaxy s6  linkine tıklayınız.
    3- Sepete ekleyiniz.
    4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
    */
    @Test
    public void Test1(){
        driver.navigate().to("https://www.demoblaze.com/index.html");

        WebDriverWait bkl = new WebDriverWait(driver, Duration.ofSeconds(10));
        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Samsung galaxy s6")));

        WebElement samsungS6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        samsungS6.click();

        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add to cart")));
        WebElement addToCart = driver.findElement(By.linkText("Add to cart"));
        addToCart.click();

        bkl.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement backToMenu = driver.findElement(By.xpath("//a[@id='nava']"));
        backToMenu.click();

        Assert.assertEquals("https://www.demoblaze.com/index.html", driver.getCurrentUrl());

        waitAndQuit();
    }
}
