package exercices.exercice05;

public class ExerciceCondition4 {
    public static void main(String[] args) {
        int temperature;
        temperature = 36;
        if (temperature < -10) {
            System.out.println("Il fait très froid");
        } else if (temperature >= -10) {
            if (temperature < 0) {
                System.out.println("Il fait froid");
            } else if (temperature < 25) {
                System.out.println("Il fait normal");
            } else if (temperature <= 35) {
                System.out.println("Il fait chaud");
            } else if (temperature > 35) {
                System.out.println("Il fait très chaud");
            }
        }









    }
}
