import java.util.Scanner;
public class Note {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nLynex note saver");
        while (true) {
            System.out.println("choose your operation:\n1. Add note\n2. Delete note\n3. View notes\n4. exit");
            try {
                int operation = scanner.nextInt();
                scanner.nextLine();
                switch (operation) {
                    case 1:
                        System.out.println("Type your note");
                        String note2 = scanner.nextLine();
                        Notes2.addNotes(note2);
                        break;
                    case 2:
                        System.out.println("Choose number of note to get rid of");
                        int delete2 = scanner.nextInt();
                        Notes2.deleteNotes(delete2);
                        break;
                    case 3:
                        Notes2.readNotes();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Invalid number");
                        break;

                }

                if (operation == 4) {
                    System.out.println("Exiting...");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }

    }
}

//this code should add,remove and read lines of notes

