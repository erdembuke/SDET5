package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByld {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); // sayfaya gittim

        WebElement nameBox = driver.findElement(By.id("first_8")); // elemani id ile bul
        nameBox.sendKeys("erdem");

        WebElement lastBox = driver.findElement(By.id("last_8"));
        lastBox.sendKeys("buke");

        MyFunc.waitForIt(2);


        // Chrome ctrl+f ye basildiginda inspect bolumunde
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID parametrelerinde arar

        WebElement labelFirstName = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());

        WebElement labelLastName = driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());

        WebElement submitButton = driver.findElement(By.id("input_2"));
        submitButton.click();

        MyFunc.waitForIt(3);
        driver.quit();

    }
}
