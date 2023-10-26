package Task4.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


import org.junit.jupiter.api.Test;

import Task4.Message.MessageService;
import Task4.Message.NotificationService;

class NotificationServiceTest {
    /*
     * Вам нужно написать тест с использованием моков для сервиса отправки сообщений.
     * Условие: У вас есть класс MessageService с методом public void sendMessage(String message, String
     * recipient), который отправляет сообщение получателю.
     * Вам необходимо проверить правильность работы класса NotificationService, который использует
     * MessageService для отправки уведомлений.
     */

    @Test
    void notificationServiceTest() {
        MessageService messageService = mock(MessageService.class);
        //when(messageService.sendMessage("Oleg", "oleg@mail.ru")).thenReturn()

        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("Oleg", "oleg@mail.ru");
        verify(messageService, times(1)).sendMessage("Oleg", "oleg@mail.ru");
    }
}