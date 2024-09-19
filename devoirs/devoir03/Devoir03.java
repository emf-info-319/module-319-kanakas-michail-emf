import java.util.Scanner;

public class Devoir03 {
    public static void main(String[] args) {
        int anneeChoisi = 2000;
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
        while (moisChoisi > 12 || moisChoisi < 0) {
            System.out.println("Mois non valide");
            System.out.println("Veuillez entrer un mois valide");
            moisChoisi = mois.nextInt();
        }

        Scanner jour = new Scanner(System.in);
        System.out.println("Veuillez entrer un jour sous forme de nombre");
        jourChoisi = jour.nextInt();
        while (jourChoisi > 31 || jourChoisi < 0) {
            System.out.println("Jour non valide");
            System.out.println("Veuillez entrer un jour valide");
            jourChoisi = jour.nextInt(); }
        while (jourChoisi == 31) {
            if (moisChoisi == 1 || 3 || 5 || 7 || 8 || 10 || 12) {
                break;
            } else {
                System.out.println("Ce mois ne contient pas 31 jours");
                System.out.println("Veuillez entrer un jour valide");
                jourChoisi = jour.nextInt();
            }}
        while (jourChoisi>28 && moisChoisi == 2) {
            if (moisChoisi % 4 == 0) {
                break;
            } else {
                
            }
            
        }
        }

    }

