package Konfiguracja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie03 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe"); //Chrome

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(5990);
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
      driver.get("https://mystore-testlab.coderslab.pl/index.php");


        driver.quit();
    }

}