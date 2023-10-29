// Напишите автоматизированный тест, который выполнит следующие шаги:
// 1. Открывает главную страницу Google.
// 2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
// 3. В результатах поиска ищет ссылку на официальный сайт Selenium (https://www.selenium.dev)
//  и проверяет, что ссылка действительно присутствует среди
// результатов поиска.

package SeleniumTest;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

    @Test
    public void seleniumTest1() {
        System.setProperty("webdriver.chrome.driver","E:/HOMEWORK/TMP/Selenium/chromedriver.exe");  //подключаем WebDriver
        WebDriver driver = new ChromeDriver();    //создаем экземпляр хромдрайвера
        driver.get("http://www.google.com/");    // обращаемся к конкретной странице сайта
        WebElement searchBox = driver.findElement(By.name("q"));    //ищем поле для поискового запроса
        searchBox.sendKeys("Selenium");    // вводим текст в поле запроса
        searchBox.submit();    //отправляем форму
        List<WebElement> searchResult = driver.findElements(By.cssSelector("div"));
        boolean isFindresult = false;
        for (WebElement webElement : searchResult) {
            if(webElement.getText().contains("https://www.selenium.dev")) {
                isFindresult = true;
                break;
            }
        }
        assertTrue(isFindresult);
        driver.quit();                 //закрываем окно браузера
    }   

}
