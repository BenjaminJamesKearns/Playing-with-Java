import java.util.Scanner;

public class BankAccount {
    public static Scanner in = new Scanner(System.in);
    private Integer balance = 0;

    public void menu() {
        System.out.println("------------------------");
        System.out.println("| 1. View balance      |");
        System.out.println("| 2. Deposit money     |");
        System.out.println("| 3. Withdraw money    |");
        System.out.println("| 4. Back to main menu |");
        System.out.println("| 5. Exit              |");
        System.out.println("------------------------");
        String input = in.nextLine();

        switch (input) {
            case "1": this.viewBalance();
                      break;
            case "2": this.deposit();
                      break;
            case "3": this.withdraw();
                      break;
            case "4": Selector.menu();
                      break;
            case "5": System.exit(0);
                      break;
            default:  System.out.println("Enter a number between 1 and 4");
                      break;
        }
        this.menu();
    }

    private void viewBalance() {
        System.out.println("Your balance is £" + this.balance);
    }

    private void deposit() {
        System.out.println("How much do you want to deposit?");
        while (!in.hasNextInt()) {
            System.out.println("Please enter a number");
            in.next();
        }
        int amount = in.nextInt();
        this.balance += amount;
    }

    private void withdraw() {
        System.out.println("Your balance is " + this.balance);
        System.out.println("How much do you wish to withdraw?");
        while (!in.hasNextInt()) {
            System.out.println("Please enter a number");
            in.next();
        }
        int amount= in.nextInt();
        if (this.balance-amount<0) {
            System.out.println("You do not have enough money in your account to withdraw £" + amount);
        }
        this.balance-=amount;
    }
}
