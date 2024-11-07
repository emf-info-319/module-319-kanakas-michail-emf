package devoirs.devoir06;

public class devoir {
    public static final int TAILLE_TABLEAU=20;
    public static final int VALEUR_MIN=0;
    public static final int VALEUR_MAX=50;
    public static final int VALEUR_RECHERCHEE=7;

    public static void main(String[] args) {
       int[] tableau;
       tableau = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);
       for (int i = 0; i < tableau.length; i++) {
        System.out.println("Tableau["+i+"] = ["+tableau[i]+"]");
       }
       System.out.println("\nLa plus petite valeur trouvée est : "+rechercheMin(tableau));
       System.out.println("La plus grande valeur trouvée est : "+rechercheMax(tableau));
       System.out.println("Le nombre ["+VALEUR_RECHERCHEE+"] figure à la position ["+rechercheValeur(tableau, VALEUR_RECHERCHEE)+"] du tableau");
    }

    public static int[] genereTableau(int min, int max, int taille) {
        int[] tab = new int[taille];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
        }
        return tab;
    }

    public static int rechercheMin(int[] tab) {
        int valeurMin = tab[0];
        for (int i = 0; i < tab.length; i++) {
            valeurMin = Math.min(valeurMin, tab[i]);
        }
        return valeurMin;
    }

    public static int rechercheMax(int[] tab) {
        int valeurMax = tab[0];
        for (int i = 0; i < tab.length; i++) {
            valeurMax = Math.max(valeurMax, tab[i]);
        }
        return valeurMax;
    }

    public static int rechercheValeur(int tab[], int recherche) {
        int position = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]==recherche) {
                position = i;
                break;
            }
        }
        return position;
    }
}
