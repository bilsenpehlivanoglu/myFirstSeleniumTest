package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBox {

    // Go to the given web page. https://the-internet.herokuapp.com/checkboxes
    // Locate checkbox1 and checkbox2 elements.
    // If Checkbox1 is not selected, click the checkbox
    // If Checkbox2 is not selected, click the checkbox
    // Close the page

    @Test
    void test03() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Verilen web sayfasına gidin. https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        // Checkbox1 ve checkbox2 elementlerini locate edin.
       WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type = 'checkbox'])[1]"));
       WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type = 'checkbox'])[2]"));
       Thread.sleep(3000);

        // Checkbox1 seçili değilse onay kutusunu tıklayın
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        Thread.sleep(3000);

        // Checkbox2 seçili değilse onay kutusunu tıklayın
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }
        Thread.sleep(3000);

        // Sayfayi kapatin
        driver.quit();

    }


}
