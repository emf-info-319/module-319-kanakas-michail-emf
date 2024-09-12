package exercices.exercice08;

public class ExerciceBoucles1 {
    public static void main(String[] args) {
        // déclarer la variable dans la condition du for sinon ça ne marche pas
        for (int nombre = 1; nombre <= 5; nombre++) { // tant que 5, est plus grand que nombre ou égal a nombre, on
                                                      // continue a faire ++nombre
            System.out.println("Boucle for, intération : " + nombre);
        }
        int nombre = 0;
        while (nombre < 5) { // tant que 5 est plus grand que nombre on effectue
            nombre++; // quand nombre = 4, il sera a la fin de la boucle = 5 donc a pas besoin d'effectuer la boucle quand nombre = 5
            System.out.println("Boucle while, itération " + nombre);
        }
        nombre = 0;
        do {
            ++nombre;
            System.out.println("Boucle do-while, itération " + nombre);
        } while (nombre < 5); // la boucle se stop quand nombre n'est plus inférieur a 5 mais comme on
                              // l'incrémente avant le sout "nombre<=5" n'est pas utile

        for (int x = 1; x <= 5; ++x) { 
                                    
            if (x == 3) {
                continue;
            }
            System.out.println("Boucle for, intération : " + x);
        }

        int y = 0;
        while (y < 5) {
            ++y; 
            if (y>3) {
                break;
            }         
            System.out.println("Boucle while, itération "+y);
    }
}
}
