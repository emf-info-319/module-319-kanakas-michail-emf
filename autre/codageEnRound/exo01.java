package codageEnRound;

public class exo01 {
    public static final double PI=3.14;
    public static void main(String[] args) {
        int[] rayons = new int[10];
        for (int i = 0; i < rayons.length; i++) {
            rayons[i] = genereNombre(1, 10);
        }
        for (int i = rayons.length-1; i > -1; i--) {
            if (rayons[i]>50) {
                System.out.println(Math.pow(rayons[i], 2)*PI);
            } else {
                System.out.println(PI*2*rayons[i]);
            }
        }
        
    }

    public static int genereNombre(int min, int max) {
        int nombre = ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
        return nombre;
    }
}
