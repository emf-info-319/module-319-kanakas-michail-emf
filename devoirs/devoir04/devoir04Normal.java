public class devoir04Normal {
    public static void main(String[] args) {
        int year = 23;
        int month = 2;
        int day = 28;
        int test = 0;
        System.out.println("date entrée est le " + day + "." + month + "." + year);
        if (year > 9999 || year < 0) {
                System.out.println("L'année ["+year+"] est hors limite !");
                test++;
        }
        if (month > 12 || month <= 0) {
            System.out.println("Le mois ["+month+"] est hors limite !");
            test++;
        }
        if (day > 31 || day <= 0) {
            System.out.println("Le jour ["+day+"] est hors limite !");
            test++;
        }
        if (day == 31) {
            if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("Le jour ["+day+"] est hors limite !");
                test++;
            }
        }
        if (day == 29 && month == 2 && year % 4 != 0) {
                System.out.println("Le jour ["+day+"] est hors limite !");
                test++;
            }
            if (day > 29 && month == 2) {
                System.out.println("Le jour ["+day+"] est hors limite !");
                test++;
            } 
        if (test==0) {
            String[] moisNom = { "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
                "Octobre", "Novembre", "Decembre" };
        String monthText = moisNom[month - 1];
        System.out.println("La date formatée est le " + day + " " + monthText + " " + year);
        }
    }
}
