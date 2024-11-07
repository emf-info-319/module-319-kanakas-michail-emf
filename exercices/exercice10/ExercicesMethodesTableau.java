package exercice10;

public class ExercicesMethodesTableau {
    public static void main(String[] args) {

        int size = 12;
        System.out.println("Le tableau a une taille de " + size + " cellules\n");
        int[] tab = tabSelonTaille(size);
        // 1

        int valeurARemplir = 56;
        tab = tabAvecValeur(valeurARemplir, tab);
        // 2

        System.out.println("Contenu du tableau aléatoire :");

        tab = tabAleatoire(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "]=" + tab[i]);
        }
        // 3

        int[] tableauTaille = new int[34];
        int tailleTab = tailleDuTab(tableauTaille);
        // 4

        int[] tableauValeurAAfficher = { 12, 23 };
        afficherTab(tableauValeurAAfficher);
        // 5

        System.out.println("La valeur min trouvée = " + minTab(tab));
        // 6

        System.out.println("La valeur max trouvée = " + maxTab(tab));
        // 7

        int valeurAConter = 8;
        int nbFoisValeur = (contageValeur(tab, valeurAConter));
        // 8

        System.out.println("\nLa somme des cellules du tableau = " + sommeTab(tab));
        // 9

        double[] tableauMoyenne = new double[tab.length];
        for (int i = 0; i < tableauMoyenne.length; i++) {
            tableauMoyenne[i] = tab[i];
        }
        System.out.println("La moyenne des cellules du tableau = " + moyenneTab(tableauMoyenne));
        // 10

        int recherche = 9;
        int remplacement = 56;
        int[] tabRemplacementEffectuer = remplacementTab(tab, recherche, remplacement);
        System.out.println("\nAprès remplacement de la valeur " + recherche + " par la valeur " + remplacement
                + " voici le contenu du tableau :");
        for (int i = 0; i < tabRemplacementEffectuer.length; i++) {
            System.out.println("tabRemplacement[" + i + "]=" + tabRemplacementEffectuer[i]);
        }
        // 11

        int recherchePremiereOccurence = 3;
        System.out
                .println("\nLa valeur " + recherchePremiereOccurence + " a été trouvée la premiere fois en position N°"
                        + premierOccurenceTab(tab, recherchePremiereOccurence));
        // 12

        int rechercheDerniereOccurence = 2;
        System.out.println("La valeur " + rechercheDerniereOccurence + " a été trouvée la dernière fois en position N°"
                + derniereOccurenceTab(tab, rechercheDerniereOccurence));
        // 13
    }

    public static int[] tabSelonTaille(int taille) {
        int[] tab = new int[taille];
        return tab;
    }
    // 1

    public static int[] tabAvecValeur(int valeur, int[] tabExemple) {
        for (int i = 0; i < tabExemple.length; i++) {
            tabExemple[i] = valeur;
        }
        return tabExemple;
    }
    // 2

    public static int[] tabAleatoire(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (10 - 1 + 1)) + 1;
        }
        return tab;
    }
    // 3

    public static int tailleDuTab(int[] tab) {
        return tab.length;
    }
    // 4

    public static void afficherTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            // System.out.println(tab[i]);
        }
    }
    // 5

    public static int minTab(int[] tab) {
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            min = Math.min(min, tab[i]);
        }
        return min;
    }
    // 6

    public static int maxTab(int[] tab) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            max = Math.max(max, tab[i]);
        }
        return max;
    }
    // 7

    public static int contageValeur(int[] tab, int valeur) {
        int nombreDeFois = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) {
                nombreDeFois++;
            }
        }
        return nombreDeFois;
    }
    // 8

    public static int sommeTab(int[] tab) {
        int tabTotal = 0;
        for (int i = 0; i < tab.length; i++) {
            tabTotal += tab[i];
        }
        return tabTotal;
    }
    // 9

    public static double moyenneTab(double[] tab) {
        double tabMoyenne = 0;
        for (int i = 0; i < tab.length; i++) {
            tabMoyenne += tab[i];
        }
        tabMoyenne = tabMoyenne / tab.length;
        return tabMoyenne;
    }
    // 10

    public static int[] remplacementTab(int[] tab, int recherche, int remplacement) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == recherche) {
                tab[i] = remplacement;
            }
        }
        return tab;
    }
    // 11

    public static int premierOccurenceTab(int[] tab, int recherche) {
        int occurence = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == recherche) {
                occurence = i;
                break;
            }
        }
        return occurence;
    }
    // 12

    public static int derniereOccurenceTab(int[] tab, int recherche) {
        int derniereOccurence = -1;
        for (int i = tab.length - 1; i > -1; i--) {
            if (tab[i] == recherche) {
                derniereOccurence = i;
                break;
            }
        }
        return derniereOccurence;
    }
    // 13

}
