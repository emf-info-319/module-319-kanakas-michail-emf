package exercice11;

public class ExercicesInversionTableau {
    public static final int MIN=0;
    public static final int MAX=100;
    public static void main(String[] args) {
        int[] tabInitial = new int[4];
        for (int i = 0; i < tabInitial.length; i++) {
            tabInitial[i]=( int ) ( Math.random() * ( MAX - MIN + 1 ) ) + MIN;
        }
        System.out.println("Contenu du tableau initial :");
        for (int i = 0; i < tabInitial.length; i++) {
            System.out.println("Tableau initial ["+i+"] = "+tabInitial[i]);
        }

        int[] tabFinal;
        tabFinal = inverseLeTableau(tabInitial);
        System.out.println("\nContenu du tableau final :");
        for (int i = 0; i < tabFinal.length; i++) {
            System.out.println("Tableau final ["+i+"] = "+tabFinal[i]);
        }
    }
    public static int[] inverseLeTableau(int[] tab) {
        int[] tabInverse = new int[tab.length];
        int z = tab.length-1;
        for (int i = 0; i < tab.length; i++) {
            tabInverse[z] = tab[i];
            z--;
        }
        return tabInverse;
    }
}
