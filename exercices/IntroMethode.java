package exercices;
import java.util.Scanner;
public class IntroMethode {
    public static void main(String[] args) {
        debut();
        int nb1 = demandeNombre();
        int nb2 = demandeNombre();
        int nb3 = demandeNombre();
        additionneNombre(nb1, nb2, nb3);
        fin();
    }
    public static void debut(){
        System.out.println("Bonjour et bienvenue sur ce premier programme.\nOn va voir les méthodes dans ce cours.\n");
    }
    public static void fin(){
        System.out.println("\nProgramme terminé");
    }
    public static int additionneNombre(int nb1, int nb2, int nb3){
        int total = nb1 + nb2 + nb3;
        System.out.println("\nLa somme est : "+total);
        return total;
    }
    public static int demandeNombre(){
        int nbChoisi;
        System.out.print("Entrez un nombre : > ");
        Scanner nb = new Scanner(System.in);
        nbChoisi = nb.nextInt();
        System.out.println("Merci, j'enregistre "+nbChoisi+" !");
        return nbChoisi;
    }
}
