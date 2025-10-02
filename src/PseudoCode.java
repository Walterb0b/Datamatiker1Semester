import java.util.Arrays;
import java.util.Random;

public class PseudoCode {
    private int[] numbers;

    public PseudoCode(int size, int maxValue){
        numbers = new int[size];
        Random rand = new Random();
        for(int i = 0; i < size; i++){
            numbers[i] = rand.nextInt(maxValue + 1);
        }

    }
}
