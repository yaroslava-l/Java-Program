import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
    // The Constants
    public static final  int MIN_VALUE = 0;
    public static final  int MAX_VALUE = 100;

    private int minNumber;
    private int maxNumber;
    private int number;
    private List<Integer> userNumbers = new ArrayList<>();

    public Model() {
        minNumber = MIN_VALUE;
        maxNumber = MAX_VALUE ;
        this.number = rand(minNumber, maxNumber);
    }

    public static int rand(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min - 1) + min;
    }

    public static int rand() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE);
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getNumber() {
        return number;
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void addUserNumbers(int number) {
        userNumbers.add(number);
    }


}
