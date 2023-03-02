package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseDriver {

    @Test
    public void Test1() {

        driver.navigate().to("https://www.amazon.com.tr/");
        MyFunc.waitForIt(2);

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        // bu element select tag i ile basliyorsa , bunu SELECT e cast yap ve öyle kullan

        Select ddmenu = new Select(webMenu); // elementi daha rahat kulanilabilir SELECT nesnesi haline dönüştürdük
        // ddmenu.selectByIndex(4);  // ister bu sekilde secebilirsin
        // ddmenu.selectByValue("value degeri"); // ister value ile
        ddmenu.selectByVisibleText("Elektronik"); // ister ekranda görünen text i ile

        System.out.println("ddmenu size -> there is " + ddmenu.getOptions().size() + " options in the menu");
    }
}
