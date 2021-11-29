import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class OurFirstTest {

   @Test
    public void test() {
       System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://rozetka.com.ua/");

       WebElement searchInput = driver.findElement(By.cssSelector(".search-form__input[_ngcontent-rz-client-c7"));

       driver.close();
   }




}
