package SeleniumHomeworks.Homework1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework1 extends BaseDriver {

    @Test
    public void Task1() {
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

        Assert.assertTrue("Test1 has failed" , nameDisplay.getText().contains("Automation") &&
                emailDisplay.getText().contains("Testing@gmail.com") &&
                addressDisplay.getText().contains("Testing Current Address") &&
                pAddressDisplay.getText().contains("Testing Permanent Address"));

        waitAndQuit();

    }

    @Test
    public void Task2() {

        driver.navigate().to("https://demo.applitools.com/");

        WebElement usernameBox = driver.findElement(By.cssSelector("input[placeholder='Enter your username']" +
                "[type='text']"));
        usernameBox.sendKeys("ttechno@gmail.com");

        WebElement passwordBox = driver.findElement(By.cssSelector("input[class='form-control']" +
                "[placeholder='Enter your password']"));
        passwordBox.sendKeys("techno123.");

        WebElement signBox = driver.findElement(By.cssSelector("div[class='buttons-w'] > a[href='/app.html']"));
        signBox.click();

        WebElement timeDisplay = driver.findElement(By.cssSelector("div[class='element-actions'] + " +
                "h6[style='text-align: center;font-size: x-large;color:red']"));

        Assert.assertTrue("Task2 has failed" , timeDisplay.getText().equals("Your nearest branch closes in: 30m 5s"));
        waitAndQuit();
    }

    @Test
    public void Task3() {

        driver.navigate().to("https://www.snapdeal.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Search products & brands']" +
                "[type='text']"));
        searchBox.sendKeys("teddy bear");

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']" +
                " > span"));
        searchButton.click();

        WebElement amountText = driver.findElement(By.cssSelector("div[id='searchMessageContainer'] > div > span"));

        Assert.assertTrue("Task3 Has Failed !" , amountText.getText().equals("We've got 317 results for teddy bear"));

    }

    @Test
    public void Task4() {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement button1 = driver.findElement(By.cssSelector("div[class='explanation'] + ul :nth-child(7) [href='/calculate.php']"));
        button1.click();
        MyFunc.waitForIt(1);

        WebElement box1 = driver.findElement(By.cssSelector("form[action='calculate.php'] > input"));
        box1.sendKeys("52");
        MyFunc.waitForIt(1);

        WebElement box2 = driver.findElement(By.cssSelector("form[action='calculate.php'] > select + input[type='text']"));
        box2.sendKeys("5");
        MyFunc.waitForIt(1);

        WebElement button2 = driver.findElement(By.cssSelector("form[action='calculate.php'] > select + input + input"));
        button2.click();
        MyFunc.waitForIt(1);

        WebElement result = driver.findElement(By.cssSelector("form[action='calculate.php'] + span"));
        MyFunc.waitForIt(1);

        System.out.println("Result is -> " + result.getText());

        waitAndQuit();
    }

    @Test
    public void Task5() {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement button1 = driver.findElement
                (By.cssSelector("[class='inline-explanation'] + ul :nth-child(5) > ul :nth-child(2) > a"));
        button1.click();
        MyFunc.waitForIt(1);

        WebElement button2 = driver.findElement
                (By.cssSelector("div[class='centered'] > input[type='button'][onclick='show_alert()']"));
        button2.click();
        MyFunc.waitForIt(1);

        WebElement button3 = driver.findElement(By.cssSelector("div[class='dialog-actions'] > button"));
        button3.click();
        MyFunc.waitForIt(1);
    }

    @Test
    public void Task6() {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement button1 = driver.findElement
                (By.cssSelector("[class='inline-explanation'] + ul :nth-child(5) > ul :nth-child(2) > a"));
        button1.click();
        MyFunc.waitForIt(1);

        WebElement button2 = driver.findElement(
                By.cssSelector("div[class='centered'] > input[type='button'][onclick='show_modal()']"));
        button2.click();
        MyFunc.waitForIt(1);

        WebElement button3 = driver.findElement(By.cssSelector("div[class='dialog-actions'] > button"));
        button3.click();
        MyFunc.waitForIt(1);

        waitAndQuit();

    }



}
