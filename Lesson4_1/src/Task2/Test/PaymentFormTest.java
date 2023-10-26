package Task2.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import Task2.Card.CreditCard;
import Task2.Card.PaymentForm;

public class PaymentFormTest {
    /**
     * Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */

    @Test
    void paymentFormTest() {
        //формируем мок для кредитной карты
        CreditCard creditCard = mock(CreditCard.class);
        when(creditCard.getCardNumber()).thenReturn("12345");
        when(creditCard.getCardHolder()).thenReturn("Petr Petrov");
        when(creditCard.getExpiryDate()).thenReturn("01/25");
        when(creditCard.getCvv()).thenReturn("123");

        PaymentForm paymentForm = new PaymentForm(creditCard);    //передаем аргументом мок-объект
        paymentForm.pay(100);    //оплата, ушло 100руб.
        verify(creditCard, times(1)).charge(100);    //пришло 100р., оплата была проведена 1 раз
    }
}
