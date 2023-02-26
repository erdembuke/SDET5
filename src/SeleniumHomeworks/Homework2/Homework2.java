package SeleniumHomeworks.Homework2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework2 extends BaseDriver {

    @Test
    public void Test_1() {

        driver.navigate().to("http://demoqa.com/text-box");

        WebElement usernameBox = driver.findElement(By.xpath("//input[@type='text'][@id='userName']"));
        usernameBox.sendKeys("Automation");

        WebElement emailBox = driver.findElement(By.xpath("//input[@type='email'][@id='userEmail']"));
        emailBox.sendKeys("Testing@gmail.com");

        WebElement addressBox = driver.findElement(By.xpath("//textarea[@placeholder='Current Address'][@id='currentAddress']"));
        addressBox.sendKeys("Testing Current Address");

        WebElement pAddressBox = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        pAddressBox.sendKeys("Testing Permanent Address");

        WebElement submitBox = driver.findElement(By.xpath("//button[@id='submit'][@type='button']"));
        submitBox.click();
        MyFunc.waitForIt(1);


        WebElement usernameResult = driver.findElement(By.xpath("//*[@id='name']"));
        WebElement emailResult = driver.findElement(By.xpath("//p[@id='email'][@class='mb-1']"));

        Assert.assertTrue(usernameResult.getText().contains(usernameBox.getAttribute("value")) && emailResult.getText()
                .contains(emailBox.getAttribute("value")));

        waitAndQuit();
    }

    @Test
    public void Test_2() {

        driver.navigate().to("https://demo.applitools.com/");

        WebElement usernameBox = driver.findElement
                (By.xpath("//div[@class='form-group']/input[@class='form-control'][@type='text']"));
        usernameBox.sendKeys("ttechno@gmail.com");

        WebElement passwordBox = driver.findElement(
                By.xpath("//div[@class='form-group']/input[@class='form-control'][@type='password']"));
        passwordBox.sendKeys("techno123.");

        WebElement button1 = driver.findElement(
                By.xpath("//div[@class='buttons-w']/a[@href='/app.html']"));
        button1.click();

        WebElement displayBox = driver.findElement(
                By.xpath("//div[@class='element-actions']//following::h6[1]"));

        Assert.assertEquals("test2 has failed", "Your nearest branch closes in: 30m 5s", displayBox.getText());
        waitAndQuit();
    }

    @Test
    public void Test_3() {

        driver.navigate().to("https://www.snapdeal.com/");

        WebElement searchBox = driver.findElement
                (By.xpath("//div[@class='col-xs-14 search-box-wrapper']/input[@type='text']"));
        searchBox.sendKeys("teddy bear");
        MyFunc.waitForIt(2);

        WebElement button1 = driver.findElement
                (By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']/span[@class='searchTextSpan']"));
        button1.click();
        MyFunc.waitForIt(2);

        WebElement display = driver.findElement(
                By.xpath("//*[@class='seach-msg-sec clearfix']/div/div/span[@class='nnn']"));

        Assert.assertEquals("We've got 318 results for teddy bear", display.getText());
        waitAndQuit();
    }

    @Test
    public void Test_4() {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement button1 = driver.findElement(By.xpath("//div[@class='explanation'][3]//following::ul/li[7]/a"));
        button1.click();
        MyFunc.waitForIt(2);

        WebElement input1 = driver.findElement(
                By.xpath("//*[@action='calculate.php']/input"));
        input1.sendKeys("55");
        MyFunc.waitForIt(2);

        WebElement input2 = driver.findElement(By.xpath("//input[2]"));
        input2.sendKeys("32");
        MyFunc.waitForIt(2);

        WebElement button2 = driver.findElement(By.xpath("//input[3]"));
        button2.click();
        MyFunc.waitForIt(2);

        WebElement display = driver.findElement(By.xpath(
                "//span[@id='answer']"));

        System.out.println(display.getText());

        waitAndQuit();
    }

    @Test
    public void Test_5() {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement option1 = driver.findElement(By.xpath
                ("//div[@class='explanation']//following::ul[1]/li[5]/ul/li[2]/a[@href='alerts/fake-alert-test.html']"));
        option1.click();
        MyFunc.waitForIt(2);

        WebElement button1 = driver.findElement(By.xpath("//div[@class='centered']/input[@value='Show alert box']"));
        button1.click();
        MyFunc.waitForIt(2);

        WebElement button2 = driver.findElement(By.xpath("//div[@class='dialog-actions']/button[@class='dialog-button']"));
        button2.click();
        MyFunc.waitForIt(2);

    }

    @Test
    public void Test_6() {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement option1 = driver.findElement(By.xpath
                ("//div[@class='explanation']//following::ul[1]/li[5]/ul/li[2]/a[@href='alerts/fake-alert-test.html']"));
        option1.click();
        MyFunc.waitForIt(2);

        WebElement button1 = driver.findElement(By.xpath("//div[@class='centered'][2]/input[@value='Show modal dialog']"));
        button1.click();
        MyFunc.waitForIt(2);

        WebElement button2 = driver.findElement(By.xpath("//div[@class='dialog-actions']/button[1]"));
        button2.click();
        MyFunc.waitForIt(2);

        waitAndQuit();
    }
}
