package exercices.exercice04;

public class EchangeValeurs { 
    public static void main(String[] args) {
    
    int variable1 = 1;
    int variable2 = 2;

    System.out.println("Le contenu de la variable1 est : "+variable1);
    System.out.println("Le contenu de la variable2 est : "+variable2);
    System.out.println(".... Traitement ....");

    int variable3;
    variable3 = variable1; //"variable 3" prend la valeur de "variable 1". "variable 3" = 1
    variable1 = variable2; //"variable 1" prend la valeur de "variable 2". "variable 1" = 2
    variable2 = variable3; //"variable 2" prend la valeur de "variable 3". "variable 2" = 1
    //si "variable 2" prend la valeur de "variable 1". "variable 2" serait 2 car on a defini "variable 1" a 2.
    
    System.out.println("Le contenu de la variable1 est : "+variable1);
    System.out.println("Le contenu de la variable2 est : "+variable2);
}
    
}
