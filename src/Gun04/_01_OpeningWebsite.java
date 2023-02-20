package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {
        // 1- Hepsiburada.com sayfasina git
        // 2- arama kutusna usb yaz
        // 3- ara butonuna bas
        // 4- çıkan ürünlerin açıklamasında usb kelimesini kontrol et

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study"); // sayfaya gittim
        // driverdan isteyecegiz asagidaki kodlari
        // eleman aramakutusu = aramakuıtusunu bul
        // elemanlar = urunListesiniAl;
        // for dongusu ile kontrol et

        MyFunc.waitForIt(3);
        driver.quit();
    }
}
