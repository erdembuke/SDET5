package SeleniumProjects.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;

public class Run {
    public static WebDriver browser;

    static{
        closeAllChromes();
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        browser = new ChromeDriver();
        Duration dr=Duration.ofSeconds(30);
        browser.manage().timeouts().pageLoadTimeout(dr);
        browser.manage().timeouts().implicitlyWait(dr);
        browser.manage().window().maximize();
    }

    public static void quitBrowser() {
        Function.Wait(3);
        browser.quit();
    }

    public static void closeAllChromes() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {
        }
    }

}