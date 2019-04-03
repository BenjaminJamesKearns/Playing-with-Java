import java.util.Scanner;

public class FizzBuzz {
    public static Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("------------------------");
        System.out.println("| 1. Enter a number    |");
        System.out.println("| 2. Back to main menu |");
        System.out.println("| 3. Exit              |");
        System.out.println("------------------------");

        String input = in.nextLine();

        switch (input) {
            case "1": FizzBuzz.number();
                      break;
            case "2": Selector.menu();
                      break;
            case "3": System.exit(0);
                      break;
            default:  System.out.println("Enter a number between 1 and 3");
                      break;
        }
    }

    public static void number() {
            System.out.println("Enter a number");
            while (!in.hasNextInt()) {
                System.out.println("Please enter a number");
                in.next();
            }
            int input = in.nextInt();
        if (input%3==0 && input%5==0) {System.out.println("FizzBuzz");}
        else if (input%3==0) {System.out.println("Fizz");}
        else if (input%5==0) {System.out.println("Buzz");}
        else {System.out.println(input);}
        FizzBuzz.menu();
    }
}
