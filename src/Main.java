import java.util.*;

public class Main {
    public static void printFirstPlayerPart(List<String> pcNumber1Al, List<String> number1Al, int number1){
        //Checking if a digit of player 1's number is in the first computer number
        int count = 0;
        for (int i = 0; i < number1Al.size(); i++) {
            String digit1 = number1Al.get(i);
            boolean digit1Existence = pcNumber1Al.contains(digit1);
            if (digit1Existence == true) {
                count++;
            }
        }
        System.out.print("Player 1, you have " + count + " cows ");

        //Checking positions of digits in two arrays
        int count2 = 0;
        for (int i = 0; i < pcNumber1Al.size(); i++) {
            if (pcNumber1Al.get(i).equals(number1Al.get(i))) {
                count2++;
            }
        }
        System.out.print("and " + count2 + " bulls.");
        System.out.println();
        System.out.println();
    }
    public static void printSecondPlayerPart(List<String> pcNumber2Al, List<String> number2Al, int number2){
        //Checking if a digit of the player 2's number is in the second computer number
        int countSecond = 0;
        for (int i = 0; i < number2Al.size(); i++) {
            String digit2 = number2Al.get(i);
            boolean digit2Existence = pcNumber2Al.contains(digit2);
            if (digit2Existence == true) {
                countSecond++;
            }
        }
        System.out.print("Player 2, you have " + countSecond + " cows ");

        //Checking positions of digits in two arrays
        int countSecond2 = 0;
        for (int i = 0; i < pcNumber2Al.size(); i++) {
            if (pcNumber2Al.get(i).equals(number2Al.get(i))) {
                countSecond2++;
            }
        }
        System.out.print("and " + countSecond2 + " bulls.");
        System.out.println();
    }

    public static void main(String[] args) {
        //Generating first computer number1
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        String pcNumber1 = "";
        for (int i = 0; i < 4; i++) {
            pcNumber1 += numbers.get(i).toString();
        }

        //Generating second computer number
        List<Integer> numbers2 = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            numbers2.add(i);
        }
        Collections.shuffle(numbers2);
        String pcNumber2 = "";
        for (int i = 0; i < 4; i++) {
            pcNumber2 += numbers2.get(i).toString();
        }

        Scanner sc = new Scanner(System.in);
        while(true) {
            //Player 1's part!
            String[] pcNumber1Str = pcNumber1.split("");
            List<String> pcNumber1Al = new ArrayList<String>();
            pcNumber1Al = Arrays.asList(pcNumber1Str);//Converting first computer number to ArrayList

            System.out.println("PLayer 1, enter a four-digit number: ");
            int number1 = sc.nextInt();
            String number1ToString = String.valueOf(number1);
            String[] number1Str = number1ToString.split("");
            List<String> number1Al = new ArrayList<>();
            number1Al = Arrays.asList(number1Str);//Converting first player's number to ArrayList
            printFirstPlayerPart(pcNumber1Al, number1Al, number1);

            //PLayer 2's part!
            String[] pcNumber2Str = pcNumber2.split("");
            List<String> pcNumber2Al = new ArrayList<String>();
            pcNumber2Al = Arrays.asList(pcNumber2Str); //Converting second computer number to ArrayList
            System.out.println("PLayer 2, enter a four-digit number: ");
            int number2 = sc.nextInt();

            String number2ToString = String.valueOf(number2);
            String[] number2Str = number2ToString.split("");
            List<String> number2Al = new ArrayList<>();
            number2Al = Arrays.asList(number2Str);//Converting player 2's number to ArrayList
            printSecondPlayerPart(pcNumber2Al, number2Al, number2);

            //Checking if the game is finished!
            if (number1Al.equals(pcNumber1Al) == true || number2Al.equals(pcNumber2Al) == true){
                System.out.println("***************************************");
                System.out.println("Game finished!");
                break;
            }
        }
    }
}