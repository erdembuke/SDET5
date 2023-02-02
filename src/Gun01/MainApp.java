package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MainApp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");
        // WebDriver driver2 = new EdgeDriver();
        // driver2.get("https://campus.techno.study/");
    }
}
