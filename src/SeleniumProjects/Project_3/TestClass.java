package SeleniumProjects.Project_3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestClass extends BaseDriver {

    @Test
    public void Test1() {
        driver.navigate().to("https://shopdemo.e-junkie.com/");



        waitAndQuit();
    }
}
