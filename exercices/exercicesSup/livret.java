package exercicesSup;
public class livret {
    public static final int MIN=5;
    public static final int MAX=20;
    public static void main(String[] args) {
        int a = choisirUnNombre();
        int b = choisirUnNombre();
        System.out.println("Les chiffres sont : "+a+" "+b);
        String[] tableMultiplication = construireTableMultiplication(a, b);
        for (int i = 0; i < tableMultiplication.length; i++) {
            System.out.println(tableMultiplication[i]);
        }
    }
    public static int choisirUnNombre() {
        int nombre = ( int ) ( Math.random() * ( MAX - MIN + 1 ) ) + MIN;
        return nombre;
    }
    public static String[] construireTableMultiplication(int a, int b) {
        String[] tab = new String[a*b];
        int tempA = 1;
        int tempB = 1;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = ""+tempA+" x "+tempB+" = "+tempA*tempB;
            if (tempB == b) { //si le deuxieme nombre de la table correspond a son maximum on le remet a 1 et le premier nombre de la table augmente
                tempB = 1;
                tempA++;
            } else {
                tempB++;
            }
        }
        return tab;
    }
}
