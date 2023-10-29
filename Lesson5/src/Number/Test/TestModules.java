package Number.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import Number.MaxNumberModule;
import Number.RandomNumberModule;

public class TestModules {
    
    @Test
    public void testRandomNumberModule() {
        RandomNumberModule generator = new RandomNumberModule();
        int[] numbers = generator.generateNumbers(10);
        assertEquals(numbers.length, 10);
    }

    @Test
    public void testMaxNumberModule() {
        MaxNumberModule finder = new MaxNumberModule();
        int[] numbers = {3,4,6,9,1};
        assertEquals(finder.findMaxNumber(numbers), 9);
    }

    @Test
    public void IntegrationTestModules() {
        RandomNumberModule generator = new RandomNumberModule();
        MaxNumberModule finder = new MaxNumberModule();

        int[] numbers = generator.generateNumbers(10);
        int max = finder.findMaxNumber(numbers);
        Arrays.sort(numbers);
        int referenceMax = numbers[numbers.length - 1];
        assertEquals(referenceMax, max);
    }
}
