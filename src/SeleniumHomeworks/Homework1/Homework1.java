package SeleniumHomeworks.Homework1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework1 extends BaseDriver {

    @Test
    public void Test1() {
        driver.navigate().to("http://demoqa.com/text-box");

        WebElement fullNameBox = driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
        WebElement emailBox = driver.findElement(By.cssSelector("input[type='email']"));
        WebElement addressBox = driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        WebElement pAddressBox = driver.findElement(By.cssSelector("[id='permanentAddress-wrapper'] :nth-child(2) > textarea[class='form-control']"));
        WebElement sButton = driver.findElement(By.cssSelector("button[type='button'][class='btn btn-primary']"));


        fullNameBox.sendKeys("Automation");
        MyFunc.waitForIt(1);

        emailBox.sendKeys("Testing@gmail.com");
        MyFunc.waitForIt(1);

        addressBox.sendKeys("Testing Current Address");
        MyFunc.waitForIt(1);

        pAddressBox.sendKeys("Testing Permanent Address");
        MyFunc.waitForIt(1);

        sButton.click();

        WebElement nameDisplay = driver.findElement(By.cssSelector("p[id='name']"));
        WebElement emailDisplay = driver.findElement(By.cssSelector("p[id='email']"));
        WebElement addressDisplay = driver.findElement(By.cssSelector("p[id='currentAddress']"));
        WebElement pAddressDisplay = driver.findElement(By.cssSelector("p[id='permanentAddress']"));

        Assert.assertTrue("Test1 has failed" , fullNameBox.getAttribute("value").equals("Automation") &&
                emailBox.getAttribute("value").equals("Testing@gmail.com") &&
                addressBox.getAttribute("value").equals("Testing Current Address") &&
                pAddressBox.getAttribute("value").equals("Testing Permanent Address"));

        waitAndQuit();


    }

}
