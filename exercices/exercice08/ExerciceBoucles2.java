public class ExerciceBoucles2 {
    
    public static void main(String[] args) {

        System.out.println("Boucle for");
        for(int x=5; x>=1; --x) { //tant que x est plus petit ou égale a 1 on le décremete.
            System.out.println(x);
        } System.out.println("Décollage !!");

        int y = 5;
        System.out.println("Boucle while");
        while (y>=1) { //tant que y est plus petit ou égal a 1 on effectue
            System.out.println(y);
            y--;
        } System.out.println("Décollage !!");

        int z=5;
        System.out.println("Boucle do-while");
        do {
            System.out.println(z);
            z--;
        } while(z>=1); 
        System.out.println("Décollage !!");

        
        System.out.print(z);
        System.out.println("Je suis un exemple "+z+" voila voila");
    }       /*Affichera :
            0
            Je suis un exemple 0 voila voila
    
  eeeerhw4hg4h
     eee
  eeerht
 eee
ddee
     */

}

