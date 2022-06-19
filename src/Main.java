import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void generatePcNumber1(){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 10; i++){
                numbers.add(i);
        }
        Collections.shuffle(numbers);

        String noSpace = "";
        for (int i = 0; i < 4; i++){
            noSpace += numbers.get(i).toString();
        }
        System.out.println(noSpace);
    }
    public static void main(String[] args) {
       generatePcNumber1();
    }
}