package exercice10;

public class ExercicesMethodesTableau {
    public static void main(String[] args) {
        int size = 3;
        System.out.println("Le tableau a une taille de "+size+" cellules\n");
        int[] nomDuTab = tabSelonTaille(size);
        //1

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

        int[] tableauContage = {12,23, 8, 78};
        int valeurAConter = 8;
        System.out.println(contageValeur(tableauContage, valeurAConter));

        int[] tableauSomme = {12,23, 8, 78};
        System.out.println(sommeTab(tableauSomme));

        double[] tableauMoyenne = {12,23, 8, 78};
        System.out.println(moyenneTab(tableauMoyenne));

        int[] tableauRemplacement = {12,23, 8, 78};
        int recherche = 9;
        int remplacement = 56;
        int []tableauRemplacementEffectuer = remplacementTab(tableauRemplacement, recherche, remplacement);
        for (int i = 0; i < tableauRemplacement.length; i++) {
            System.out.println(tableauRemplacementEffectuer[i]);
        }
        
        int[] tableauPremiereOccurence = {12,23, 8, 78, 23};
        int recherchePremiereOccurence = 23;
        System.out.println(premierOccurenceTab(tableauPremiereOccurence, recherchePremiereOccurence));

        int[] tableauDerniereOccurence = {12,23, 8, 78, 23, 45, 65, 23};
        int rechercheDerniereOccurence = 23;
        System.out.println(derniereOccurenceTab(tableauDerniereOccurence, rechercheDerniereOccurence));

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

    public static int contageValeur(int[] tab, int valeur) {
        int nombreDeFois = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]==valeur) {
                nombreDeFois++;
            }
        }
        return nombreDeFois;
    }

    public static int sommeTab(int[] tab) {
        int tabTotal = 0;
        for (int i = 0; i < tab.length; i++) {
        tabTotal+=tab[i];
        }
        return tabTotal;
    }

    public static double moyenneTab(double[] tab) {
        double tabMoyenne= 0;
        for (int i = 0; i < tab.length; i++) {
        tabMoyenne+=tab[i];
        }
        tabMoyenne=tabMoyenne/tab.length;
        return tabMoyenne;
    }

    public static int[] remplacementTab(int[] tab, int recherche, int remplacement) {
        for (int i = 0; i < tab.length; i++) {
        if (tab[i]==recherche) {
            tab[i]=remplacement;
        }
        }
        return tab;
    }

    public static int premierOccurenceTab(int[] tab, int recherche) {
        int occurence = -1;
        for (int i = 0; i < tab.length; i++) {
           if (tab[i]==recherche) {
            occurence=i;
            break;
           } 
        }
        return occurence;
    }

    public static int derniereOccurenceTab(int[] tab, int recherche) {
        int[] occurences = new int[tab.length];
        int nbOccurence = 0;
        for (int i = 0; i < tab.length; i++) {
           if (tab[i]==recherche) {
            occurences[nbOccurence] = i;
            nbOccurence++;
           } 
        }
        int derniereOccurence = -1;
        int derniereOccurenceTemp = 0;
        if (nbOccurence!=0) {
            for (int i = 0; i < occurences.length; i++) {
                derniereOccurence = Math.max(occurences[i], derniereOccurenceTemp);
                derniereOccurenceTemp = derniereOccurence;
            }
        }
        return derniereOccurence;
    }
}
