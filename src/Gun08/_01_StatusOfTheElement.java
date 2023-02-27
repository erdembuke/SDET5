package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_StatusOfTheElement extends BaseDriver {

    @Test
    public void TestMethod1() {
        driver.navigate().to("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement checkbox = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        checkbox.click();
        MyFunc.waitForIt(1);

        System.out.println("checkbox 1 is displayed ? -> " + checkbox.isDisplayed());
        System.out.println("checkbox 1 is enabled ? ->" +checkbox.isEnabled());
        System.out.println("checkbox 1 is selected ? ->" + checkbox.isSelected());
        System.out.println();

        WebElement checkbox2 = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        checkbox2.click();
        MyFunc.waitForIt(1);

        System.out.println("checkbox 2 is displayed ? ->" +checkbox2.isDisplayed());
        System.out.println("checkbox 2 is selected ? ->" + checkbox2.isSelected());
        System.out.println("checkbox 2 is enabled ? ->" + checkbox2.isEnabled());
    }
}
