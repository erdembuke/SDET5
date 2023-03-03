package SeleniumProjects.Project_2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Proje2 extends BaseDriver {

    @Test
    public void Test(){
        driver.navigate().to("https://demowebshop.tricentis.com/");
        Actions actions = new Actions(driver);

        WebElement registerButton = driver.findElement(By.linkText("Register"));
        Action click = actions.moveToElement(registerButton).click().build();
        click.perform();

        WebElement checkBox = driver.findElement(By.id("gender-male"));
        Action input0 = actions.moveToElement(checkBox).click().build();
        input0.perform();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        Action input = actions.moveToElement(firstName).click().sendKeys("Erdem").build();
        input.perform();

        WebElement lastName = driver.findElement(By.id("LastName"));
        Action input2 = actions.moveToElement(lastName).click().sendKeys("Buke").build();
        input2.perform();

        WebElement eMail = driver.findElement(By.id("Email"));
        Action input3 = actions.moveToElement(eMail).click().sendKeys("erdembke1@hotmail.com").build();
        input3.perform();

        WebElement passwordBox = driver.findElement(By.id("Password"));
        Action input4 = actions.moveToElement(passwordBox).click().sendKeys("123456").build();
        input4.perform();

        WebElement passwordBox2 = driver.findElement(By.id("ConfirmPassword"));
        Action input5 = actions.moveToElement(passwordBox2).click().sendKeys("123456").build();
        input5.perform();

        WebElement registerButton2 = driver.findElement(By.id("register-button"));
        Action click2 = actions.moveToElement(registerButton2).click().build();
        click2.perform();

        WebElement txtDisplay = driver.findElement(By.xpath("//div[@class='result']"));

        Assert.assertTrue(txtDisplay.getText().contains("Your registration completed"));

        waitAndQuit();
    }

    @Test
    public void Test2() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
        Actions actions = new Actions(driver);

        WebElement registerButton = driver.findElement(By.linkText("Register"));
        Action click = actions.moveToElement(registerButton).click().build();
        click.perform();

        WebElement checkBox = driver.findElement(By.id("gender-male"));
        Action input0 = actions.moveToElement(checkBox).click().build();
        input0.perform();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        Action input = actions.moveToElement(firstName).click().sendKeys("Erdem").build();
        input.perform();

        WebElement lastName = driver.findElement(By.id("LastName"));
        Action input2 = actions.moveToElement(lastName).click().sendKeys("Buke").build();
        input2.perform();

        WebElement eMail = driver.findElement(By.id("Email"));
        Action input3 = actions.moveToElement(eMail).click().sendKeys("erdembke1@hotmail.com").build();
        input3.perform();

        WebElement passwordBox = driver.findElement(By.id("Password"));
        Action input4 = actions.moveToElement(passwordBox).click().sendKeys("123456").build();
        input4.perform();

        WebElement passwordBox2 = driver.findElement(By.id("ConfirmPassword"));
        Action input5 = actions.moveToElement(passwordBox2).click().sendKeys("123456").build();
        input5.perform();

        WebElement registerButton2 = driver.findElement(By.id("register-button"));
        Action click2 = actions.moveToElement(registerButton2).click().build();
        click2.perform();

        WebElement alert = driver.findElement(By.xpath("//li[text()='The specified email already exists']"));

        Assert.assertTrue(alert.isDisplayed());

        waitAndQuit();
    }

    @Test
    public void Test3(){
        driver.navigate().to("https://demowebshop.tricentis.com/");
        Actions actions = new Actions(driver);

        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        Action click = actions.moveToElement(loginButton).click().build();
        click.perform();

        WebElement emailBox = driver.findElement(By.id("Email"));
        Action input = actions.moveToElement(emailBox).click().sendKeys("erdembke1@hotmail.com").build();
        input.perform();

        WebElement passwordBox = driver.findElement(By.id("Password"));
        Action input2 = actions.moveToElement(passwordBox).click().sendKeys("123456").build();
        input2.perform();

        WebElement loginButton2 = driver.findElement(By.xpath("//input[@value='Log in']"));
        Action click2 = actions.moveToElement(loginButton2).click().build();
        click2.perform();

        WebElement accountDisplay = driver.findElement(By.xpath("(//a[@class='account'])[1]"));

        Assert.assertEquals("erdembke1@hotmail.com", accountDisplay.getText());

        waitAndQuit();
    }

    @Test
    public void Test4(){
        driver.navigate().to("https://demowebshop.tricentis.com/");
        Actions actions = new Actions(driver);

        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        Action click = actions.moveToElement(loginButton).click().build();
        click.perform();

        WebElement emailBox = driver.findElement(By.id("Email"));
        Action input = actions.moveToElement(emailBox).click().sendKeys("erdembke@hotmail.com").build();
        input.perform();

        WebElement passwordBox = driver.findElement(By.id("Password"));
        Action input2 = actions.moveToElement(passwordBox).click().sendKeys("1234567").build();
        input2.perform();

        WebElement loginButton2 = driver.findElement(By.xpath("//input[@value='Log in']"));
        Action click2 = actions.moveToElement(loginButton2).click().build();
        click2.perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement alert2 = driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span"));

        Assert.assertTrue(alert2.isDisplayed());

        waitAndQuit();
    }

    @Test
    public void Test5(){
        driver.get("https://demowebshop.tricentis.com/");
        Actions actions = new Actions(driver);
        WebDriverWait bkl = new WebDriverWait(driver,Duration.ofSeconds(30));

        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        Action click = actions.moveToElement(loginButton).click().build();
        click.perform();

        WebElement emailBox = driver.findElement(By.id("Email"));
        Action input = actions.moveToElement(emailBox).click().sendKeys("erdembke1@hotmail.com").build();
        input.perform();

        WebElement passwordBox = driver.findElement(By.id("Password"));
        Action input2 = actions.moveToElement(passwordBox).click().sendKeys("123456").build();
        input2.perform();

        WebElement loginButton2 = driver.findElement(By.xpath("//input[@value='Log in']"));
        Action click2 = actions.moveToElement(loginButton2).click().build();
        click2.perform();

        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/computers'])[1]")));
        WebElement itemMenu = driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
        Action drag = actions.moveToElement(itemMenu).build();
        drag.perform();

        WebElement itemMenu2 = driver.findElement(By.xpath("(//a[@href='/notebooks'])[1]"));
        Action click3 = actions.moveToElement(itemMenu2).click().build();
        click3.perform();

        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-grid']//div[@class='picture']")));
        WebElement item1 = driver.findElement(By.xpath("//div[@class='product-grid']//div[@class='picture']"));
        Action click4 = actions.moveToElement(item1).click().build();
        click4.perform();

        WebElement addToCart = driver.findElement(By.id("add-to-cart-button-31"));
        Action click5 = actions.moveToElement(addToCart).click().build();
        click5.perform();

        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='The product has been added to your ']")));
        WebElement txtDisplay = driver.findElement(By.xpath("//*[text()='The product has been added to your ']"));
        Assert.assertTrue(txtDisplay.getText().contains("The product has been added to your"));

        WebElement shoppingCart = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
        Action click6 = actions.moveToElement(shoppingCart).click().build();
        click6.perform();

        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='product-name']")));
        WebElement itemName = driver.findElement(By.xpath("//a[@class='product-name']"));

        Assert.assertEquals("14.1-inch Laptop", itemName.getText());

        WebElement checkbox = driver.findElement(By.id("termsofservice"));
        Action click7 = actions.moveToElement(checkbox).click().build();
        click7.perform();

        WebElement checkout = driver.findElement(By.id("checkout"));
        Action click8 = actions.moveToElement(checkout).click().build();
        click8.perform();

        WebElement companyBox = driver.findElement(By.id("BillingNewAddress_Company"));
        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.id("BillingNewAddress_Company")));

        Action input3 = actions.moveToElement(companyBox).click().sendKeys("Techno Study").build();
        input3.perform();

        WebElement countrySelect = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select country = new Select(countrySelect);
        country.selectByVisibleText("Turkey");

        WebElement stateSelect = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        Select state = new Select(stateSelect);
        state.selectByIndex(0);

        WebElement cityBox = driver.findElement(By.id("BillingNewAddress_City"));
        Action input4 = actions.moveToElement(cityBox).click().sendKeys("Istanbul").build();
        input4.perform();

        WebElement addressBox = driver.findElement(By.id("BillingNewAddress_Address1"));
        Action input5 = actions.moveToElement(addressBox).click().sendKeys("Ornekkoy Mah").build();
        input5.perform();

        WebElement addressBox2 = driver.findElement(By.id("BillingNewAddress_Address2"));
        Action input6 = actions.moveToElement(addressBox2).click().sendKeys("23 Nisan Cad").build();
        input6.perform();

        WebElement zipCodeBox = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        Action input7 = actions.moveToElement(zipCodeBox).click().sendKeys("34805").build();
        input7.perform();

        WebElement phoneNumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        Action input8 = actions.moveToElement(phoneNumber).click().sendKeys("05378842517").build();
        input8.perform();

        WebElement button = driver.findElement(By.xpath("(//input[@value='Continue'])[1]"));
        Action click9 = actions.moveToElement(button).click().build();
        click9.perform();

        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='Shipping.save()']")));
        WebElement button2 = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        Action click10 = actions.moveToElement(button2).click().build();
        click10.perform();

        WebElement checkbox2 = driver.findElement(By.id("shippingoption_1"));
        Action click11 = actions.moveToElement(checkbox2).click().build();
        click11.perform();

        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ShippingMethod.save()']")));
        WebElement button3 = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
        Action click12 = actions.moveToElement(button3).click().build();
        click12.perform();

        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentMethod.save()']")));
        WebElement button4 = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
        Action click13 = actions.moveToElement(button4).click().build();
        click13.perform();

        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentInfo.save()']")));
        WebElement button5 = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
        Action click14 = actions.moveToElement(button5).click().build();
        click14.perform();

        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ConfirmOrder.save()']")));
        WebElement button6 = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
        Action click15 = actions.moveToElement(button6).click().build();
        click15.perform();

        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Your order has been successfully processed!']")));
        WebElement txtDisplay2 = driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));
        Assert.assertTrue(txtDisplay2.isDisplayed());


        waitAndQuit();
    }
}
