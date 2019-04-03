import java.util.Scanner;

public class Selector {
    public static Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("-------------------");
        System.out.println("| 1. Hello World  |");
        System.out.println("| 2. FizzBuzz     |");
        System.out.println("| 3. Notes        |");
        System.out.println("| 4. Bank Account |");
        System.out.println("| 5. Exit         |");
        System.out.println("-------------------");

        String input = in.nextLine();

        switch (input) {
            case "1": Greeting.menu();
                      break;
            case "2": FizzBuzz.menu();
                      break;
            case "3": Notes.menu();
                      break;
            case "4": BankAccount account1 = new BankAccount();
                      account1.menu();
                      break;
            case "5": System.exit(0);
                      break;
            default:  System.out.println("Enter a number between 1 and 4");
                      Selector.menu();
                      break;
        }
    }
}
