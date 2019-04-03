import java.util.Scanner;
import java.util.HashMap;

public class Notes {
    public static HashMap<String,String> notes = new HashMap<>();
    public static Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("------------------------");
        System.out.println("| 1. Create a new note |");
        System.out.println("| 2. View notes        |");
        System.out.println("| 3. Back to main menu |");
        System.out.println("| 4. Exit              |");
        System.out.println("------------------------");

        String input = in.nextLine();

        switch (input) {
            case "1": Notes.newNote();
                      break;
            case "2": Notes.viewNotes();
                      break;
            case "3": Selector.menu();
                      break;
            case "4": System.exit(0);
                      break;
            default:  System.out.println("Enter a number between 1 and 4");
                      Notes.menu();
                      break;
        }
    }

    public static void newNote() {
        System.out.println("Enter the title of the note");
        String title = in.nextLine();

        System.out.println("Enter the body of the note");
        String body = in.nextLine();

        notes.put(title, body);
        Notes.menu();
    }

    public static void viewNotes() {
        System.out.println("Notes");
        for (String title : notes.keySet()) {
            System.out.println(title);
        }
        Notes.viewNotesMenu();
    }

    public static void viewNotesMenu() {
        System.out.println("------------------------");
        System.out.println("| 1. Open a note        |");
        System.out.println("| 2. Back to notes menu |");
        System.out.println("-------------------------");
        String input = in.nextLine();

        switch (input) {
            case "1": Notes.openNote();
                      break;
            case "2": Notes.menu();
                      break;
            default:  System.out.println("Enter a number between 1 and 2");
                      Notes.viewNotesMenu();
                      break;
        }
    }

    public static void openNote() {
        System.out.println("Which note do you want to open?");
        String input = in.nextLine();
        if (notes.get(input)==null) {System.out.println("There is no note saved with that title");}
        else {System.out.println(notes.get(input));}
        Notes.menu();
    }
}
