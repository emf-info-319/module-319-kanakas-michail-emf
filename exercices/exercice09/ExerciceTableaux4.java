import java.util.Scanner;

public class ExerciceTableaux4 {
    public static void main(String[] args) {
        Scanner tz = new Scanner(System.in); //tz est le nom du Scanner
        System.out.println("Veuillez entrer une valeur de départ");
        int nbDepart=tz.nextInt();
        int[] tab= new int[5];
        for(int i=0; i<tab.length; i++) {
            tab[i]=nbDepart+1+i;
            System.out.println("Cellule "+i+" : "+tab[i]);
        }
    }
}
