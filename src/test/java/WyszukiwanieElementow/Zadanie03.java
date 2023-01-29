package WyszukiwanieElementow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie03 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe"); //Chrome

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signInLink = driver.findElement(By.className("user_login"));
        signInLink.click();
        WebElement emailInput = driver.findElement(By.className("account_input"));
        emailInput.sendKeys("random@randommail.com");
        WebElement createAccountButton =  driver.findElement(By.id("SubmitCreate"));
        createAccountButton.submit();




        driver.quit();
    }
}