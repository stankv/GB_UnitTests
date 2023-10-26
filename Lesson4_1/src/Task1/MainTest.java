package Task1;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class MainTest {

    /**
     * Проверка работы Mockito
     */
     @Test
    public void simpleTest() {
        // Создаем мок
        List<String> mockedList = mock(List.class);

        // Используем мок
        mockedList.add("one");
        mockedList.clear();

        // Проверяем, что методы были вызваны
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    /**
     * Создать мок-объект Iterator, настроить поведение так,
     * чтобы за два вызова next() Iterator вернул два слова  “Hello World”,
     * и проверить это поведение с помощью утверждений
     */
    @Test
    public void iteratorWillReturnHelloWorld() {
        // Arrange
        Iterator iteratorMock = mock(Iterator.class);
        when(iteratorMock.next()).thenReturn("Hello").thenReturn("World");
        // Act
        String result = iteratorMock.next() + " " + iteratorMock.next();
        assertThat(result).isEqualTo("Hello World");
      }

}
