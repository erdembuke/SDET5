package SeleniumHomeworks.Homework4;

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
import java.util.List;

public class TestClass extends BaseDriver {

    @Test
    public void Test1() {
        /*
        http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
        buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.
         */

        driver.navigate().to("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        WebDriverWait bkl = new WebDriverWait(driver, Duration.ofSeconds(30));
        List<WebElement> options = driver.findElements(By.xpath("//div[contains(@id,'a') and @class='dragDropSmallBox']"));
        List<WebElement> boxes = driver.findElements(By.xpath("//div[@class='dragDropSmallBox' and contains(@id,'q')]"));
        Actions actions = new Actions(driver);
        bkl.until(ExpectedConditions.visibilityOfAllElements(options));
        bkl.until(ExpectedConditions.visibilityOfAllElements(boxes));
        int correctanswers = 0;

        for (WebElement opt : options) {
            for (WebElement box : boxes) {
                if (box.getAttribute("id").substring(1).equals(opt.getAttribute("id").substring(1))) {
                    actions.clickAndHold(opt).moveToElement(box).build().perform();
                    actions.moveToElement(box).release().build().perform();
                    correctanswers++;
                }
            }
        }
        Assert.assertEquals("test has failed", options.size(), correctanswers);



        waitAndQuit();
    }

    @Test
    public void Test2() {
        /*
        http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
        buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.
         */

        driver.navigate().to("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        Actions actions = new Actions(driver);
        WebDriverWait bkl = new WebDriverWait(driver,Duration.ofSeconds(30));
        List<WebElement> studentsList = driver.findElements(By.xpath("//li[contains(@id,'node')]"));
        List<WebElement> boxesList = driver.findElements(By.xpath("//ul[contains(@id,'box')]"));
        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@id,'node')]")));
        bkl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[contains(@id,'box')]")));
        int correctPuts = 0;

        for (WebElement student : studentsList) {
            for (WebElement box : boxesList) {
                actions.moveToElement(student).clickAndHold().build().perform();
                MyFunc.waitForIt(1); // yerine ne koyulabilir
                actions.moveToElement(box).release().build().perform();
                correctPuts++;
            }
        }


        waitAndQuit();
    }

    @Test
    public void Test3() {
        /*
        http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
        buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.
         */

        driver.navigate().to("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        Actions actions = new Actions(driver);
        List<WebElement> cities = driver.findElements(By.xpath("//li[contains(@id,'node')]"));
        List<WebElement> countries = driver.findElements(By.xpath("//ul[contains(@id,'box')]"));
        int correctPuts = 0;

        for (WebElement city : cities) {
            for (WebElement country : countries) {
                if (city.getAttribute("groupid").equals(country.getAttribute("id"))) {
                    actions.moveToElement(city).clickAndHold().build().perform();
                    MyFunc.waitForIt(1);
                    actions.moveToElement(country).release().build().perform();
                    correctPuts++;
                    if (correctPuts == cities.size()) {
                        MyFunc.waitForIt(2);
                        break;
                    }
                }
            }
        }
        driver.switchTo().alert().accept();
        waitAndQuit();
    }

}
