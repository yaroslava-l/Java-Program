import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
    // Data
    private int minBarrier;
    private int maxBarrier;

    private int number;

    private List<Integer> userNumbers = new ArrayList<>();

    public void generateNumber() {
        number = (int)Math.ceil(Math.random()*
                (maxBarrier - minBarrier - 1) + minBarrier);
    }

    public void setPrimaryBarrier(int minBarrier, int maxBarrier){
        this.minBarrier = minBarrier;
        this.maxBarrier = maxBarrier;
    }

    public boolean checkValue (int value){
        userNumbers.add(value);
        if (value == number){
            return false;
        } else if (value > number){
            maxBarrier = value;
        } else {
            minBarrier = value;
        }
        return true;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(List<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }
}
