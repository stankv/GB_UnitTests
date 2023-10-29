package Number;

//import java.util.List;

public class MaxNumberModule {
    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) maxNumber = array[i];
        }
        return maxNumber;
    }
}
