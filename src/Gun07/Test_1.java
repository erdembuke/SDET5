package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Test_1 extends BaseDriver {

    @Test
    public void TestHW() {
        /*
        1- https://www.saucedemo.com/
        2- login islemini yapiniz
        3- Sauce Labs Backpack a tiklatin ve sepete ekletin
        4- Sonra geri dönün (Back to products e tiklatin)
        5- Sauce Labs Bolt T-Shirt a tiklatin ve sepete ekleyin
        6- sepete tiklatin
        7- CheckOut a tiklatin
        8- kullanici bilgilerini doldurup Continue ya tiklatin
        9- Burada her bir esyaninin ucretlerinin toplaminin asagidaki ..-
        item total e esit olup olmadigini Assert ile test ediniz.
         */
        driver.navigate().to("https://www.saucedemo.com/");

        WebElement usernameBox = driver.findElement(By.xpath("//*[@class='form_group']/input[@placeholder='Username']"));
        usernameBox.sendKeys("standard_user");
        MyFunc.waitForIt(1);

        WebElement passwordBox = driver.findElement(By.xpath("//*[@class='form_group']/input[@placeholder='Password']"));
        passwordBox.sendKeys("secret_sauce");
        MyFunc.waitForIt(1);

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login'][@type='submit']"));
        loginButton.click();
        MyFunc.waitForIt(1);

        WebElement product1 = driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
        product1.click();
        MyFunc.waitForIt(1);

        WebElement addProduct1 = driver.findElement(By.xpath("//div[@class='inventory_details_price']//following::button[1]"));
        addProduct1.click();
        MyFunc.waitForIt(1);

        WebElement goBack = driver.findElement(By.xpath("//div[@class='left_component']/button"));
        goBack.click();
        MyFunc.waitForIt(1);

        WebElement product2 = driver.findElement(By.xpath("//*[@id='item_1_title_link']/div"));
        product2.click();
        MyFunc.waitForIt(1);

        WebElement addProduct2 = driver.findElement(By.xpath("//div[@class='inventory_details_price']//following::button[1]"));
        addProduct2.click();
        MyFunc.waitForIt(1);

        WebElement sepet = driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']"));
        sepet.click();
        MyFunc.waitForIt(1);

        WebElement checkoutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkoutButton.click();
        MyFunc.waitForIt(1);

        WebElement infoBox1 = driver.findElement(By.xpath("//div[@class='form_group']/input[@placeholder='First Name']"));
        infoBox1.sendKeys("Erdem");
        MyFunc.waitForIt(1);

        WebElement infoBox2 = driver.findElement(By.xpath("//div[@class='form_group']/input[@placeholder='Last Name']"));
        infoBox2.sendKeys("Buke");
        MyFunc.waitForIt(1);

        WebElement infoBox3 = driver.findElement(By.xpath("//div[@class='form_group']/input[@placeholder='Zip/Postal Code']"));
        infoBox3.sendKeys("34800");
        MyFunc.waitForIt(1);

        WebElement continueButton = driver.findElement(By.xpath("//*[@id='continue']"));
        continueButton.click();
        MyFunc.waitForIt(2);

        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        double totalSeperate = 0;
        for (WebElement e : prices) {
            totalSeperate += Double.parseDouble(e.getText().substring(1));
        }

        WebElement displayTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        double bottomTotal = Double.parseDouble(displayTotal.getText().substring(13));

        System.out.println("seperate total is = " + totalSeperate);
        System.out.println("Total price at the bottom = " + bottomTotal);

        MyFunc.waitForIt(2);

        Assert.assertTrue("Values are not the same" , (totalSeperate == bottomTotal));

//        WebElement item1price = driver.findElement(By.xpath("//a[@id='item_4_title_link']//following::div[2]/div"));
//        WebElement item2price = driver.findElement(By.xpath("//a[@id='item_1_title_link']//following::div[2]/div"));
//        WebElement totalPrice = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
//
//        double item1PriceDouble = Double.parseDouble(item1price.getText().substring(1));
//        double item2PriceDouble = Double.parseDouble(item2price.getText().substring(1));
//        double seperateTotal = item1PriceDouble + item2PriceDouble;
//        double total = Double.parseDouble(totalPrice.getText().substring(13));
//
//        Assert.assertTrue("test has failed" , seperateTotal == total);



        waitAndQuit();

    }
}
