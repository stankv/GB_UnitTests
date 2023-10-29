import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimerSeleniumTest {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:/HOMEWORK/TMP/Selenium/chromedriver.exe"); // подключаем WebDriver
        WebDriver driver = new ChromeDriver(); // создаем экземпляр хромдрайвера
        driver.get("http://www.google.com/"); // обращаемся к конкретной странице сайта
        WebElement searchBox = driver.findElement(By.name("q")); // ищем поле для поискового запроса
        searchBox.sendKeys("GeekBrains"); // вводим текст в поле запроса
        searchBox.submit(); // отправляем форму
        Thread.sleep(10000); // ждем 10сек.
        driver.quit(); // закрываем окно браузера
    }

}
