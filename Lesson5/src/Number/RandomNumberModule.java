package Number;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Random;
//import java.util.stream.Collectors;

public class RandomNumberModule {
    public int[] generateNumbers(int count) {
        int[] numbers = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println(numbers);
        return numbers;
    }
    
}
