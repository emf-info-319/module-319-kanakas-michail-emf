package exercice10;

public class Methode {
    public static void main(String[] args) {
        direBonjour();
        dire("Je sais pas j'ai pas d'idée");
        int a = 213;
        int b = 12523;
        int c = -6;
        int e = 2;
        int f = 12;
        int lePlusPetit = Math.min(a, b);
        System.out.println(lePlusPetit);
        //Math.min retourne la plus petit valeur entre deux variable (deux et pas plus) ne pas oublié de la stocker dans une variable
        int lePlusGrand = Math.max(a, b);
        System.out.println(lePlusGrand);
        //Math.min retourne la plus grande valeur entre deux variable (deux et pas plus) ne pas oublié de la stocker dans une variable
        int abs = Math.abs(c); //c est négatif
        System.out.println(abs);
        int abs2 = Math.abs(a);//a est positif
        System.out.println(abs2);
        //Math.abs retourne la version positive d'une valeur négative, si la valeur est positive elle la retourne sans changement (ne pas oublié de la stocker dans une variable)
        double racineCarre = Math.sqrt(a);
        System.out.println(racineCarre);
        double racineCarreNegative = Math.sqrt(c); //les valeur négatives retournent Nan
        System.out.println(racineCarreNegative);
        //Math.sqrt retourne la racine carré d'une valeur mais la variable dans laquelle elle est stocké doit etre un double (pour pouvoir accepter les nombres a virgule)
        double puissance = Math.pow(e, f);
        System.out.println(puissance);
        double puissance2 = Math.pow(e, c);
        System.out.println(puissance2);
        //Math.pow retourne le premier nombre a la puissance du deuxieme la variable dans laquelle elle est stocké doit etre un double et les négatif sont accepté
    }
    public static void direBonjour(){
        System.out.println("Bonjour");
    }
    public static void dire(String jeSaisPas){
        System.out.println(jeSaisPas);
    }
}

