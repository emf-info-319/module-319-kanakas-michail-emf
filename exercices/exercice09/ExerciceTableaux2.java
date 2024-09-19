public class ExerciceTableaux2 {
    public final static int valeurMin = 1;
    public final static int valeurMax = 6;

    public static void main(String[] args) {
        
        int[] tab = new int[10];
        for(int i=0; i<tab.length; i++) {
            int nombre = ( int ) ( Math.random() * ( valeurMax - valeurMin + 1 ) ) + valeurMin;
            tab[i]= nombre;
            System.out.println("Cellule "+i+" : "+tab[i]);
        }
    }
}
