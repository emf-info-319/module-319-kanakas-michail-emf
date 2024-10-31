package exercice10;

public class ExercicesMethodesTableau {
    public static void main(String[] args) {
        int size = 3;
        System.out.println("Le tableau a une taille de "+size+" cellules\n");
        int[] nomDuTab = tabSelonTaille(size);

        int valeurARemplir = 56;
        int[] tab = new int[6];
        tab = tabAvecValeur(valeurARemplir, tab);

        int[] tableauAleatoire = new int[5];
        tableauAleatoire = tabAleatoire(tableauAleatoire);
        for (int i = 0; i < tableauAleatoire.length; i++) {
            System.out.println("tableauAleatoire["+i+"]="+tableauAleatoire[i]);
        }

        int[] tableauTaille = new int[34];
        int tailleTab = tailleDuTab(tableauTaille);
        System.out.println(tailleTab);

        int[] tableauValeurAAfficher = {12,23};
        afficherTab(tableauValeurAAfficher);

        int[] tableauValeurMin = {12,23, 8, 78};
        System.out.println(minTab(tableauValeurMin));

        int[] tableauValeurMax = {12,23, 8, 78};
        System.out.println(maxTab(tableauValeurMax));
    }

    public static int[] tabSelonTaille(int taille){
        int[] tab = new int[taille];
        return tab;
    }

    public static int[] tabAvecValeur(int valeur, int[] tabExemple){
        for (int i = 0; i < tabExemple.length; i++) {
            tabExemple[i] = valeur;
        }
        return tabExemple;
    }

    public static int[] tabAleatoire(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = ( int ) ( Math.random() * ( 99 - 1 + 1 ) ) + 99;
        }
        return tab;
    }

    public static int tailleDuTab(int[] tab) {
        return tab.length;
    }

    public static void afficherTab(int [] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int minTab(int[] tab) {
        int minTemp = tab[0];
        for (int i = 0; i < tab.length; i++) {
            minTemp = Math.min(minTemp, tab[i]);
        }
        return minTemp;
    }

    public static int maxTab(int[] tab) {
        int maxTemp = tab[0];
        for (int i = 0; i < tab.length; i++) {
            maxTemp = Math.max(maxTemp, tab[i]);
        }
        return maxTemp;
    }


}
