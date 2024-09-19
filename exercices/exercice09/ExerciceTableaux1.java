package exercices.exercice09;

public class ExerciceTableaux1 {
    public static void main(String[] args) {
        int[] monTableau = new int[4];
        for(int i = 0; i< monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }
        System.out.println("fini");
        String[] tab = new String[4];
        tab[2] = "CCCC";
        for(int x=0; x<tab.length; x++) {
            System.out.println(tab[x]);
        }
    }
}
