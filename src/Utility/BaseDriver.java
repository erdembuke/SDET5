package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;

    static{
        closeUnusedChromes();

        Logger logger = Logger.getLogger(""); // output'a ait(konsolda) ait bütün logları üreten objeye/servise ulastim ""
        logger.setLevel(Level.SEVERE); // sadece errorlari goster

        // output ' daki gerekmeyen loglari kaldiracagiz
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY , "true");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        // Sadece tüm sayfanin kodlarinin bilgisayariniza inmesi süresiyle ilgili
        // bu eklenmezse Selenium sayfa yuklenene kadar (Sonsuza) bekler.
        // 30sn süresince sayfanin yüklenmesini bekle yüklenmezse hata ver
        // eger 2sn yüklerse 30sn beklemez

        driver.manage().timeouts().implicitlyWait(dr); // bütün WebElement lerin element bazında, elemente özel işlem
        // yapilmadan once hazir hale gelmesi icin verilen zaman
        // eger 2sn yüklerse 30sn beklemez.
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        actions = new Actions(driver);

    }

    public static void waitAndQuit() {
        MyFunc.waitForIt(3);
        driver.quit();
    }

    public static void closeUnusedChromes() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {
        }
    }


}
