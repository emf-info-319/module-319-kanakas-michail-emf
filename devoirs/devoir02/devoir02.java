package devoirs.devoir02;

public class devoir02 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {
        int reservoirA=0;
        int reservoirB=0;
        int remplissage;

        remplissage = ( int ) ( Math.random() * ( 5 - 3 + 1 ) ) + 3; 

        System.out.println("Il y a "+remplissage+" litres à remplir.");

        while (remplissage!=0) {
            if (reservoirA<3) {
            reservoirA++;
            System.out.println("Remplissage du réservoir A...");
        } else {
            reservoirB++;
            System.out.println("Remplissage du réservoir B...");
        }
    remplissage--;
    System.out.println("Le réservoir A : "+reservoirA+", le réservoir B : "+reservoirB);
    }
        
        System.out.println("Remplissage terminé!");
    }
}
