package revisions.BinaireToDecimal;

import java.util.Scanner;

public class projet {
    public static void main(String[] args) {
        System.out.print("Veuillez entrez le nombre que vous voulez convertir : ");
        Scanner newSc = new Scanner(System.in);
        int nombreChoisi = newSc.nextInt();
        System.out.print("Votre nombre est binaire ou décimal (b ou d) ? ");
        char typeDeNombre = newSc.next().charAt(0);

        if (typeDeNombre == 'b') {
            String binaireEnString = String.valueOf(nombreChoisi);
            int[] tabBinaire = new int[binaireEnString.length()];
            for (int i = 0; i < binaireEnString.length(); i++) {
                tabBinaire[i] = Character.getNumericValue(binaireEnString.charAt(i));
            }
            int nbEnDecimal = binaireToDecimal(tabBinaire);
            System.out.println("Voici votre nombre en décimal : " + nbEnDecimal);

        } else if (typeDeNombre == 'd') {
            String tabDecimalBinaire = decimalToBinaire(nombreChoisi);
            System.out.println("Voici votre nombre en binaire : "+tabDecimalBinaire);

        } else {
            System.out.println("Error");
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
