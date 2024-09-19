public class ExerciceTableaux3 {
    public final static int valeurMin = 1;
    public final static int valeurMax = 6;

    public static void main(String[] args) {
        double moyenneTemp=0;
        int[] tab = new int[10];
        for(int i=0; i<tab.length; i++) {
            int nombre = ( int ) ( Math.random() * ( valeurMax - valeurMin + 1 ) ) + valeurMin;
            tab[i]= nombre;
            System.out.println("Cellule "+i+" : "+tab[i]);
            moyenneTemp += tab[i];
        }
        double moyenne = moyenneTemp/tab.length;
        System.out.println("La moyenne est de "+moyenne);
    }
}
