package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_FindingByCssSelector extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement messageBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        messageBox.sendKeys("Erdem Buke");

        WebElement button = driver.findElement(By.cssSelector("button[type='button'][class='btn btn-default']"));
        button.click();

        WebElement respond = driver.findElement(By.cssSelector("span[id='display']"));


        if (respond.getText().equals("Erdem Buke")) {
            System.out.println("Test 1 has Passed");
        }else System.out.println("Test 1 has Failed");


        waitAndQuit();
    }
}
