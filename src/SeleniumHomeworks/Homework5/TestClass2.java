package SeleniumHomeworks.Homework5;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestClass2 extends BaseDriver {

    @Test
    public void Test1() {
    /*
        Bu web sitesine gidin   [https://testpages.herokuapp.com/styled/index.html]
        Alerts e tıklayınız
        URL'i yazdırınız.
    */

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html;");

        WebElement alertLink = driver.findElement(By.linkText("Alerts"));
        alertLink.click();

        System.out.println(driver.getCurrentUrl());

        waitAndQuit();
    }

    @Test
    public void Test2() {
        /*
        Bu web sitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)
        Alerts'e tıklayınız.
        URL'i yazdırınız.
        Geri gidin.
        URL'i yazıdırnız.
        Basic Ajax'a tıklayınız.
         URL'i yazdırınız.
         */

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement alertLink = driver.findElement(By.linkText("Alerts"));
        alertLink.click();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        WebElement ajaxLink = driver.findElement(By.linkText("Basic Ajax"));
        ajaxLink.click();
        System.out.println(driver.getCurrentUrl());

        waitAndQuit();
    }

    @Test
    public void Test3() {
        /*
        Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

        [Find By Playground'a tıklayınız.](https://testpages.herokuapp.com/find_by_playground.php)

         5. text'i bulunuz.
         */
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement findbyLink = driver.findElement(By.linkText("Find By Playground"));
        findbyLink.click();

        List<WebElement> paragraphs = driver.findElements(By.xpath("//p[contains(@id,'p')]"));

        System.out.println(paragraphs.get(4).getText());

        waitAndQuit();
    }

    @Test
    public void Test4() {
        /*
        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        Search'e tıklayınız.
        Başlığı yazdırınız.
        Search button'una tıklayınız.
        URL'i yazdırınız.
         */

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement searchLink = driver.findElement(By.linkText("Search"));
        searchLink.click();

        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        String link = driver.getTitle();
        Action action = actions.moveToElement(searchBox).doubleClick().sendKeys(link).build();
        action.perform();

        WebElement searchBtn = driver.findElement(By.name("btnG"));
        searchBtn.click();

        System.out.println(driver.getCurrentUrl());

    }

    @Test
    public void Test5() {
        /*
        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        Calculate'e tıklayınız.
        İlk input'a herhangi bir sayı giriniz.
        İkinci input'a herhangi bir sayı giriniz.
        Calculate button'una tıklayınız.
        Sonucu alınız.
        Sonucu yazdırınız.
         */
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculateLink = driver.findElement(By.linkText("Calculate"));
        calculateLink.click();

        WebElement firstNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("number1")));
        firstNumber.sendKeys("1864");

        WebElement secondNumber = driver.findElement(By.id("number2"));
        secondNumber.sendKeys("2000");

        WebElement calculateBtn = driver.findElement(By.id("calculate"));
        calculateBtn.click();

        WebElement displayAnswer = driver.findElement(By.id("answer"));

        System.out.println("Answer is -> " + displayAnswer.getText());
    }

    @Test
    public void Test6() {
        /*
        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        Fake Alerts' tıklayınız.
        Show Alert Box'a tıklayınız.
        Ok'a tıklayınız.
        Alert kapanmalıdır.
         */
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.linkText("Fake Alerts"));
        fakeAlerts.click();

        WebElement alertBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fakealert")));
        actions.moveToElement(alertBtn).click().build().perform();

        WebElement okBtn = driver.findElement(By.id("dialog-ok"));
        actions.moveToElement(okBtn).click().build().perform();

        Assert.assertFalse(okBtn.isDisplayed());

        waitAndQuit();
    }

    @Test
    public void Test7() {
        /*
        Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
        Fake Alerts'e tıklayınız.
        Show modal dialog buttonuna tıklayınız.
        Ok'a tıklayınız.
        Alert kapanmalıdır.
         */

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlert = driver.findElement(By.id("fakealerttest"));
        fakeAlert.click();

        WebElement button = driver.findElement(By.id("modaldialog"));
        button.click();

        WebElement okBtn = driver.findElement(By.id("dialog-ok"));
        okBtn.click();

        Assert.assertFalse(okBtn.isDisplayed());

    }

    @Test
    public void Test8() {
        /*
        Bu web sitesine gidiniz. http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html
        Normal success message'a tıklayınız.
        Açılan yeşil penceredeki x buttonuna tıklayınız.
        */
        driver.navigate().to("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");

        WebElement btn1 = driver.findElement(By.id("normal-btn-success"));
        btn1.click();

        WebElement closeBtn = driver.findElement(By.xpath("(//button[@class='close'])[1]"));
        closeBtn.click();
    }

    @Test
    public void Test9() {
        /*
            Bu web sitesine gidiniz. http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html
            Normal success message'a tıklayınız.
            Açılan penceredeki x buttonuna tıklayınız.
            Mesaj görünmemelidir.
        */
        driver.navigate().to("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");

        WebElement btn1 = driver.findElement(By.id("normal-btn-success"));
        btn1.click();

        WebElement display = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='alert alert-success alert-normal-success']")));
        WebElement closeBtn = driver.findElement(By.xpath("(//button[@class='close'])[1]"));
        closeBtn.click();

        Assert.assertFalse(display.isDisplayed());
    }

    @Test
    public void Test10() {
        /*
            Bu web sitesine gidiniz. http://demo.seleniumeasy.com/basic-checkbox-demo.html
            check all button'a tıklayınız.
            Uncheck All button'da " Uncheck All" yazısını yazdırınız
        */
        driver.navigate().to("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement btn = driver.findElement(By.id("check1"));
        btn.click();

        System.out.println(btn.getAttribute("value"));

    }

    @Test
    public void Test11() {
        /*
            Bu web sitesine gidiniz.   http://demo.seleniumeasy.com/basic-select-dropdown-demo.html
            Select a day dropdown'ından rastgele bir seçenek seçiniz.
            5 kere wednesday seçtikten sonra döngüyü durdurun.
            Kaç kere Wednesday seçtiğinizi yazdırınız.
            Sonuç 5 olmalıdır.
        */
        driver.navigate().to("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        int wednesdaySayisi = 0;
        int rndSayi;

        WebElement daySelect = driver.findElement(By.id("select-demo"));
        Select day = new Select(daySelect);

        while (wednesdaySayisi < 5) {
            rndSayi = (int)(Math.random()*8);
            if(rndSayi != 0) {
                System.out.println(rndSayi);
                day.selectByIndex(rndSayi);
            }
            if(rndSayi == 4)
                wednesdaySayisi++;
        }
        System.out.println("Wednesday sayisi -> " + wednesdaySayisi);
        waitAndQuit();
    }

    @Test
    public void Test12() {
        /*
            Bu siteye gidiniz.  http://demo.seleniumeasy.com/basic-first-form-demo.html
            Input forms'a tıklayınız.
            Ajax from Submit'e tıklayınız.
            Name giriniz.
            Comment giriniz.
            Submit'e tıklayınız.
            Form submited Successfully! yazısı görüntülenmelidir.
            Yazıyı yazdırınız.
        */
        driver.navigate().to("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement inputForms = driver.findElement(By.linkText("Input Forms"));
        inputForms.click();

        WebElement ajaxForm = driver.findElement(By.linkText("Ajax Form Submit"));
        ajaxForm.click();

        WebElement nameBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
        nameBox.sendKeys("Erdem");

        WebElement commentBox = driver.findElement(By.id("description"));
        commentBox.sendKeys("Testing tools");

        WebElement submitBtn = driver.findElement(By.id("btn-submit"));
        submitBtn.click();

        WebElement displayTxt = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[text()='Form submited Successfully!']")));

        Assert.assertTrue(displayTxt.isDisplayed());

        waitAndQuit();
    }

    @Test
    public void Test13() {
        /*
            Bu websitesine gidiniz. http://demo.seleniumeasy.com/basic-first-form-demo.html
            List box'a tıklayınız.
            Bootstrap List Box'a tıklayınız.(http://demo.seleniumeasy.com/bootstrap-dual-list-box-demo.html)
            **bootstrap-duallist**'e tıklayınız. Sonra sağ ok (>)'a tıklayınız.
            **Dapibus ac facilisis in'**e tıklayınız ve sağ ok (>)'a tıklayınız.
            Sağa gönderilen elemanların üstüne bir kere daha tıklayıp beyaz hale getiriniz.
            **Cras husto odio**'a tıklayınız ve sol ok(<)'a tıklayınız.
            **Dapibus ac facilisis in**'a tıklayınız ve sol ok(<)'a tıklayınız.
            Sol kutu bu şekilde olmalıdır.
        */

        driver.navigate().to("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement listBox = driver.findElement(By.linkText("List Box"));
        listBox.click();

        WebElement listBox2 = driver.findElement(By.linkText("Bootstrap List Box"));
        listBox2.click();

        WebElement option = driver.findElement(By.xpath("(//ul[@class='list-group'])[1]/li[1]"));
        option.click();

        WebElement rightArrow = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']"));
        rightArrow.click();
    }
}
