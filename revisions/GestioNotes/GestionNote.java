package revisions.GestioNotes;
import java.util.Scanner;

public class GestionNote {
    public static void main(String[] args) {
        System.out.print("Quelle opération voulez-vous exécuter : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
    }
}
