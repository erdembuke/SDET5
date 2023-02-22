package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        // WebElement alertTest2 = driver.findElement(By.linkText("Alerts (JavaScript)"));
        WebElement alertTest = driver.findElement(By.id("alerttest"));
        alertTest.click();
        MyFunc.waitForIt(2);
        System.out.println(driver.getCurrentUrl()); // bulundugumuz sayfanin url sini yazdirdik

        driver.navigate().back(); // geri geldi
        MyFunc.waitForIt(2);
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward(); // ileri geldi
        System.out.println(driver.getCurrentUrl());




        waitAndQuit();
    }
}
