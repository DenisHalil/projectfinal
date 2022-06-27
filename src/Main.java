import java.util.*;

public class Main {
    public static void printPlayerPart(List<String> pcNumberAl, List<String> numberAl, String player){
        //Checking if a digit of player 1's number is in the first computer number
        int count = 0;
        for (int i = 0; i < numberAl.size(); i++) {
            String digit = numberAl.get(i);
            boolean digitExistence = pcNumberAl.contains(digit);
            if (digitExistence == true) {
                count++;
            }
        }
        System.out.print(player + " you have " + count + " cows ");

        //Checking positions of digits in two arrays
        int count2 = 0;
        for (int i = 0; i < pcNumberAl.size(); i++) {
            if (pcNumberAl.get(i).equals(numberAl.get(i))) {
                count2++;
            }
        }
        System.out.print("and " + count2 + " bulls.");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        //Generating first computer number4
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
            String playerNum1 = "Player 1,";
            printPlayerPart(pcNumber1Al, number1Al, playerNum1);

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
            String playerNum2 = "Player 2,";
            printPlayerPart(pcNumber2Al, number2Al, playerNum2);

            //Checking if the game is finished!
            if (number1Al.equals(pcNumber1Al) == true || number2Al.equals(pcNumber2Al) == true){
                System.out.println("***************************************");
                System.out.println("Game finished!");
                break;
            }
        }
    }
}