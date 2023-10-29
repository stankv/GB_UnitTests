// Нужно написать сквозной тест с использованием Selenium, который авторизует пользователя на
// сайте https://www.saucedemo.com/.
// Данные для входа - логин: "standard_user", пароль: "secret_sauce".
// Проверить, что авторизация прошла успешно и отображаются товары.
// Вам необходимо использовать WebDriver для открытия страницы и методы sendKeys() для ввода
// данных в поля формы, и submit() для отправки формы. После этого, проверьте, что на странице
// отображаются продукты (productsLabel.getText() = "Products").

package SeleniumTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {
    
    @Test
    public void seleniumTest2() {
        System.setProperty("webdriver.chrome.driver","E:/HOMEWORK/TMP/Selenium/chromedriver.exe");  //подключаем WebDriver
        WebDriver driver = new ChromeDriver();    //создаем экземпляр хромдрайвера
        driver.get("https://www.saucedemo.com/");    // обращаемся к конкретной странице сайта
        WebElement userNameField = driver.findElement(By.id("user-name"));
        WebElement userPasswordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("login-button"));
        userNameField.sendKeys("standard_user");
        userPasswordField.sendKeys("secret_sauce");
        submitButton.click();
        WebElement title = driver.findElement(By.className("title"));
        assertEquals("Products", title.getText());
        driver.quit();
    }
}
