import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 10; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        String pcNumber1 = "";
        for (int i = 0; i < 4; i++){
            pcNumber1 += numbers.get(i).toString();
        }

        //converting pcNumber1 to ArrayList
        String[] pcNumber1Str =pcNumber1.split("");
        List<String> pcNumber1Al = new ArrayList<String>();
        pcNumber1Al = Arrays.asList(pcNumber1Str);
       Scanner sc = new Scanner(System.in);

       System.out.println("PLayer1, enter a four-digit number: ");
       int number1 = sc.nextInt();
       String number1ToString = String.valueOf(number1);

       //Converting first player's number to ArrayList
       String[] number1Str = number1ToString.split("");
       List<String> number1Al = new ArrayList<String>();
       number1Al = Arrays.asList(number1Str);





    }
}