import java.util.Scanner;

public class Greeting {
    public static Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("------------------------");
        System.out.println("| 1. Hello World       |");
        System.out.println("| 2. Custom greeting   |");
        System.out.println("| 3. Back to main menu |");
        System.out.println("| 4. Exit              |");
        System.out.println("------------------------");

        String input = in.nextLine();

        switch (input) {
            case "1": Greeting.helloWorld();
                      break;
            case "2": Greeting.customGreeting();
                      break;
            case "3": Selector.menu();
                      break;
            case "4": System.exit(0);
                      break;
            default:  System.out.println("Please enter a number between 1 and 4");
                      Greeting.menu();
                      break;
        }
    }

    public static void helloWorld() {
        System.out.println("Hello World");
        Greeting.menu();
    }

    public static void customGreeting() {
        System.out.println("Enter a name");
        String name = in.nextLine();
        System.out.println("Hello " + name);
        Greeting.menu();
    }
}
