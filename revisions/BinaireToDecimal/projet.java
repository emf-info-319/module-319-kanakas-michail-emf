package revisions.BinaireToDecimal;

import java.util.Scanner;

public class projet {
    public static void main(String[] args) {
        System.out.print("Veuillez entrez le nombre que vous voulez convertir : ");
        Scanner newSc = new Scanner(System.in);
        int nombreChoisi = newSc.nextInt();
        System.out.print("Votre nombre est binaire, décimal ou hexa (b ou d ou h) ? ");
        char typeDeNombre = newSc.next().charAt(0);
        System.out.print("En quel type voulez vous le convertir (b ou d ou h) ? ");
        char typeTransformation = newSc.next().charAt(0);

        if (typeDeNombre == 'b'&& typeTransformation == 'd') {
            String numeroEnString = String.valueOf(nombreChoisi);
            int[] tabNombre = new int[numeroEnString.length()];
            for (int i = 0; i < numeroEnString.length(); i++) {
                tabNombre[i] = Character.getNumericValue(numeroEnString.charAt(i));
            }
            int nbEnDecimal = binaireToDecimal(tabNombre);
            System.out.println("Voici votre nombre en décimal : " + nbEnDecimal);
        } else if (typeDeNombre == "h") {
            
        } else {
            String tabDecimalBinaire = decimalToBinaire(nombreChoisi);
            System.out.println("Voici votre nombre en binaire : "+tabDecimalBinaire);
        }
        newSc.close();
    }

    public static int binaireToDecimal(int[] nb) {
        int nombreFinal = 0;
        int puissance = 0;
        for (int i = nb.length - 1; i > -1; i--) {
            if (nb[i] == 1) {
                nombreFinal += Math.pow(2, puissance);
            }
            puissance++;
        }
        return nombreFinal;
    }

    public static String decimalToBinaire(int nb) {
        String result = "Error";
        for (int i = 0; i < 64; i++) {
            if (nb <= (Math.pow(2, i) - 1)) {
                int[] tabBinaire = new int[i];
                int nbTemp = nb;
                int puissance = tabBinaire.length - 1;
                for (int j = 0; j < tabBinaire.length; j++) {
                    if (nbTemp >= Math.pow(2, puissance)) {
                        tabBinaire[j] = 1;
                        nbTemp -= Math.pow(2, puissance);
                        puissance--;
                        if (nbTemp <= 0) {
                            break;
                        }
                    } else {
                        puissance--;
                    }
                }
                result = "";
                for (int j = 0; j < tabBinaire.length; j++) {
                    result+=tabBinaire[j];
                }
                break;
            }
        }
        return result;
    }
}
