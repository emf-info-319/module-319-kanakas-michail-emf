import java.util.Scanner;

public class devoir04AvecScanner {

    public static void main(String[] args) {
        int year = 2024;
        int month = 10;
        int day = 3;
        Scanner annee = new Scanner(System.in);
        System.out.println("Veuillez entrer une année");
        year = annee.nextInt();
        while (year > 9999 || year < 0) {
            if (year > 9999) {
                System.out.println("L'année ["+year+"] est hors limite !");
                year = annee.nextInt();
            } else {
                System.out.println("L'année ["+year+"] est hors limite !");
                year = annee.nextInt();
            }
        }
        Scanner mois = new Scanner(System.in);
        System.out.println("Veuillez entrer un mois sous forme de nombre");
        month = mois.nextInt();
        while (month > 12 || month <= 0) {
            System.out.println("Le mois ["+month+"] est hors limite !");
            month = mois.nextInt();
        }
        String[] moisNom = { "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
                "Octobre", "Novembre", "Decembre" };
        String monthText = moisNom[month - 1];
        Scanner jour = new Scanner(System.in);
        System.out.println("Veuillez entrer un jour sous forme de nombre");
        day = jour.nextInt();
        while (day > 31 || day <= 0) {
            System.out.println("Le jour ["+day+"] est hors limite !");
            day = jour.nextInt();
        }
        while (day == 31) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                    || month == 10 || month == 12) {
                break;
            } else {
                System.out.println("Le mois de "+monthText+" ne contient pas "+day+" jours");
                day = jour.nextInt();
            }
        }
        while (day > 28 && month == 2) {
            if (year % 4 == 0) {
                break;
            } else {
                System.out.println("Le mois de "+monthText+" "+year+" ne contient pas "+day+" jours");
                day = jour.nextInt();
            }
        }
        System.out.println("date entrée est le " + day + "." + month + "." + year);
        System.out.println("La date formatée est le " + day + " " + monthText + " " + year);
    }
}