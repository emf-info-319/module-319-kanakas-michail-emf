package exercices.exercice05;

public class ExerciceCondition3 {
    public static void main(String[] args) {
        int valeur1;
        int valeur2;
        valeur1 = 2;
        valeur2 = 6;
        if (valeur1 > 0) {
            if (valeur2 > 0) {
                System.out.println("Le résultat est positif");
            } else if (valeur2 < 0) {
                System.out.println("Le résultat est négatif");
            }
        } else if (valeur1 < 0) {
            if (valeur2 > 0) {
                System.out.println("Le résultat est négatif");
            } else if (valeur2 < 0) {
                System.out.println("Le résultat est positif");
            }
        }










    }
}
