package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseDriver {

    @Test
    public void Test1() {

        driver.navigate().to("https://p-del.co/");
        MyFunc.waitForIt(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        // sayfanin sonuna kaydirir
        MyFunc.waitForIt(2);

        js.executeScript("window.scrollTo(0,0);"); // en basa gider 0 noktasina

        // js.executeScript("window.scrollBy(0,0);"); // bulundugu yerden 0 kadar gider

        waitAndQuit();
    }
}
