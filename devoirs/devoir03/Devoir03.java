package devoirs.devoir03;
import java.util.Scanner;


public class Devoir03 {
    public static void main(String[] args) { // j'ai fais l'exercice pour qu'on puisse nous meme entrer une date
        int anneeChoisi = 2000; // j'ai mis des valeurs par défaut parce que sinon il voulait pas
        int moisChoisi = 1;
        int jourChoisi = 1;
        Scanner annee = new Scanner(System.in);
        System.out.println("Veuillez entrer une année");
        anneeChoisi = annee.nextInt();
        while (anneeChoisi > 9999 || anneeChoisi < 0) {
            if (anneeChoisi > 9999) {
                System.out.println("Année trop grande");
                System.out.println("Veuillez entrer une année plus petite");
                anneeChoisi = annee.nextInt();
            } else {
                System.out.println("Année trop petite");
                System.out.println("Veuillez entrer une année plus grande");
                anneeChoisi = annee.nextInt();
            }
        }
        Scanner mois = new Scanner(System.in);
        System.out.println("Veuillez entrer un mois sous forme de nombre");
        moisChoisi = mois.nextInt();
        while (moisChoisi > 12 || moisChoisi <= 0) {
            System.out.println("Mois non valide");
            System.out.println("Veuillez entrer un mois valide");
            moisChoisi = mois.nextInt();
        }

        Scanner jour = new Scanner(System.in);
        System.out.println("Veuillez entrer un jour sous forme de nombre");
        jourChoisi = jour.nextInt();
        while (jourChoisi > 31 || jourChoisi <= 0) {
            System.out.println("Jour non valide");
            System.out.println("Veuillez entrer un jour valide");
            jourChoisi = jour.nextInt();
        }
        while (jourChoisi == 31) {
            if (moisChoisi == 1 || moisChoisi == 3 || moisChoisi == 5 || moisChoisi == 7 || moisChoisi == 8
                    || moisChoisi == 10 || moisChoisi == 12) {
                break;
            } else {
                System.out.println("Ce mois ne contient pas 31 jours");
                System.out.println("Veuillez entrer un jour valide");
                jourChoisi = jour.nextInt();
            }
        }
        while (jourChoisi > 28 && moisChoisi == 2) {
            if (anneeChoisi % 4 == 0) {
                break;
            } else {
                System.out.println("Ce mois ne contient que 28 jours");
                System.out.println("Veuillez entrer un jour valide");
                jourChoisi = jour.nextInt();
            }
        }

        int jourDeAnnee = 0;
        int[] tabJoursDesMois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (anneeChoisi % 4 == 0) {
            tabJoursDesMois[1] = 29;
        }
        for (int i = 0; i < moisChoisi - 1; i++) {
            jourDeAnnee += tabJoursDesMois[i];
        }
        jourDeAnnee += jourChoisi;
        System.out.println("Le " + jourChoisi + "/" + moisChoisi + "/" + anneeChoisi + " est le jour " + jourDeAnnee
                + " de l'an " + anneeChoisi);
    }

}
