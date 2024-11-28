package revisions.E2form;
import Scanner;

public class src {
    public static final int NOMBRE_BATONNETS = 21;
    public static final int MIN = 1;
    public static final int MAX = 3;
    public static void main(String[] args) {
        int[] batonnets = new int[NOMBRE_BATONNETS];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < batonnets.length; i++) {
            batonnets[i] = 1;
        }
        System.out.println("Bienvenue dans le jeu de Nim !");
        System.out.println("Règles : Vous et l’IA retirez tour à tour entre 1 et 3 bâtonnets.");
        System.out.println("Le joueur qui retire le dernier bâtonnet perd.");
        boolean tourJoueur = true;
        while (nbBatonnetRestants(batonnets) > 0) {
            afficherBatonnets(batonnets);
            tourJoueur = !tourJoueur;
            if (tourJoueur) {
                int nbEnleve = demanderNombre(scanner);
                batonnets = enleverBatonnets(batonnets, nbEnleve);
            } else {
                int nbEnleveIA = ( int ) ( Math.random() * ( MAX - MIN + 1 ) ) + MIN;
                System.out.println("L'IA veut enlever "+nbEnleveIA+" batons");
                batonnets = enleverBatonnets(batonnets, nbEnleveIA);
            }
        }
        if (tourJoueur) {
            System.out.println("Vous avez retiré le dernier bâtonnet. L’IA gagne !");
        } else {
            System.out.println("L’IA a retiré le dernier bâtonnet. Vous gagnez ! ");
        }
        scanner.close();
    }

    public static void  afficherBatonnets(int[] batonnets) {
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
        System.out.println("\n");
    }

    public static int[] enleverBatonnets(int[] batonnets, int nbEnleve) {
        int nbRestants = nbBatonnetRestants(batonnets);
        int nbEnleveMax = Math.min(nbEnleve, nbRestants);
        for (int i = batonnets.length - 1; i > -1 && nbEnleveMax > 0; i--) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0;
                nbEnleveMax--;
            }
        }
        return batonnets;
    }

    public static int demanderNombre(Scanner scanner) {
        int nombre = 0;
        while ((nombre>=1) && (nombre <= 3)) {
            System.out.print("Entrez un nombre entre 1 et 3 : ");
            nombre = scanner.nextInt();
        }
        return nombre;
    }

    public static int nbBatonnetRestants(int[] batonnets) {
        int nbBatonnetRestants = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                nbBatonnetRestants++;
            }
        }
        return nbBatonnetRestants;
    }
}
