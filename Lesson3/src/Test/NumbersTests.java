package Test;

import Numbers.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class NumbersTests {
    
    private Numbers numbers;

    @BeforeEach
    public void createNumbersClass(){
        numbers = new Numbers();
    }

    @ParamereterizedTest
    @ValueSource (ints = {2, 10, 100})
    void isTrueEvenOddNumber(int number) {
        assertTrue(numbers.evenOddNumber(number));
    }

    @ParameterizedTest
    @ValueSource (ints = {1, 11, 101})
    void isFalseEvenOddNumber(int number) {
        assertFalse(numbers.evenOddNumber(number));
    }


    @ParameterizedTest
    @ValueSource(ints = {26, 50, 99})
    void isTrueNumberInInterval(int number) {
        assertTrue(numbers.numberInInterval(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 25, 100})
    void isFalseNumberInInterval(int number) {
        assertFalse(numbers.numberInInterval(number));
    }

}
