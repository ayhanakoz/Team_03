package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String amazonTitle = driver.getTitle();
        System.out.println(amazonTitle);
        if(amazonTitle.contains("Toys")){
            System.out.println("Toys kelimesi var");
        }else{
            System.out.println("Toys kelimesi yok");
        }


    }
}
