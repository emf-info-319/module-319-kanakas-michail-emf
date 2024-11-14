package revisions.gamePendu;

import java.util.Scanner;

public class jeuDuPendu {
    public static void main(String[] args) {
        String[] mots = { "programmation", "java", "ordinateur", "développement", "algorithmique", "informatique",
                "module", "ingénieur", "graphique", "html", "réseau", "vscode", "boucles", "instructions", "conditions",
                "diagramme" };
        int tentativesRestantes = 7;
        int motSecretNombre = (int) (Math.random() * (mots.length - 1 - 0 + 1)) + 0;
        String motSecret = mots[motSecretNombre];
        char[] tabMotSecret = new char[motSecret.length()];
        for (int i = 0; i < motSecret.length(); i++) {
            if (motSecret.charAt(i) == 'é' || motSecret.charAt(i) == 'è') {
                tabMotSecret[i] = 'e';
            } else {
                tabMotSecret[i] = motSecret.charAt(i);
            }
        }
        char[] tabGuess = new char[motSecret.length()];
        for (int i = 0; i < tabGuess.length; i++) {
            tabGuess[i] = '_';
        }
        System.out.println(
                "Bienvenue dans le jeu du Pendu !\nEssayez de deviner le mot secret.");
        for (int i = 0; i < tabGuess.length; i++) {
            System.out.print(tabGuess[i]+" ");
        }
        System.out.print("\n");
        Scanner scanner = new Scanner(System.in);
        while (tentativesRestantes > 0) {
            boolean charEstJuste = false;
            int estToutCorrect = 0;
            System.out.print("Tentatives restantes : " + tentativesRestantes + "\nEntrez une lettre : ");
            char guess = scanner.next().charAt(0);
            for (int i = 0; i < tabMotSecret.length; i++) {
                if (tabMotSecret[i] == guess) {
                    tabGuess[i] = tabMotSecret[i];
                    charEstJuste = true;
                }
            charEstJuste = estMotDevine(tabGuess, tabMotSecret, guess);
            }
            if (charEstJuste == false) {
                tentativesRestantes--;
            }
            afficherTabGuess(tabGuess);
            for (int i = 0; i < tabGuess.length; i++) {
                if (tabGuess[i] == tabMotSecret[i]) {
                    estToutCorrect++;
                }
            }
            if (estToutCorrect == tabMotSecret.length) {
                System.out.println("\nFélicitations ! Vous avez deviné le mot : "+motSecret);
                break;
            }
        }
        scanner.close();
    }

    public static void afficherTabGuess(char[] tabGuess) {
        for (int i = 0; i < tabGuess.length; i++) {
            System.out.print(tabGuess[i] + " ");
        }
        System.out.print("\n");
    }

    public static boolean estMotDevine(char[] tabGuess, char[] tabMotSecret, char guess) {
        boolean charEstJuste = false;
        for (int i = 0; i < tabMotSecret.length; i++) {
            if (tabMotSecret[i] == guess) {
                tabGuess[i] = tabMotSecret[i];
                charEstJuste = true;
            }
        }
        return charEstJuste;
    }
}
