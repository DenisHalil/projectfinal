import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        String pcNumber1 = "";
        for (int i = 0; i < 4; i++) {
            pcNumber1 += numbers.get(i).toString();
        }

        //Converting pcNumber1 to ArrayList
        String[] pcNumber1Str = pcNumber1.split("");
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

        //Checking if a digit of the player 1's number is in the computer number
        int count = 0;
        for (int i = 0; i < number1Al.size(); i++) {
            String digit1 = number1Al.get(i);
            boolean digit1Existence = pcNumber1Al.contains(digit1);
            if(digit1Existence == true){
                count++;
            }
        }
        System.out.print("Player 1, you have " + count + " cows ");
        int count2 = 0;
        for (int i = 0; i < pcNumber1Al.size(); i++){
            for (int j = 0; j < number1Al.size(); j++){
                if(pcNumber1Al.get(i).equals(number1Al.get(j))){
                    count++;
                }
            }
        }
        System.out.print("and " + count2 + " bulls.");
    }
}