package revisions;

public class tournoiMichailKanakas {
    public static final String[] EQUIPE = { "FC Richemont", "FC Central", "FC Schoenberg",
            "FC Beauregard", "Team AFF", "Etoile Sport" };
    public static final int MAXGOAL = 10;
    static int[] pointsEquipes = new int[EQUIPE.length];

    public static void main(String[] args) {
        for (int i = 0; i < EQUIPE.length; i++) {
            if (i == EQUIPE.length - 1) {
                simuleMatch(i, 0);
            } else {
                simuleMatch(i, i + 1);
            }
        }
        System.out.println("---------------------------");
        for (int i = 0; i < EQUIPE.length; i++) {
            System.out.println("L'équipe " + EQUIPE[i] + " a " + pointsEquipes[i] + " points");
        }
        System.out.println("---------------------------");
        int[] gagnants = trouveGagnants();
        for (int i = 0; i < gagnants.length; i++) {
            int indexGagnant = gagnants[i];
            System.out.println("L’équipe "+EQUIPE[indexGagnant]+" a gagné");
        }
    }

    public static void simuleMatch(int index, int suivante) {
        int scoreEquipe1 = (int) (Math.random() * (MAXGOAL - 0 + 1)) + 0;
        int scoreEquipe2 = (int) (Math.random() * (MAXGOAL - 0 + 1)) + 0;
        if (scoreEquipe1 == scoreEquipe2) {
            pointsEquipes[index] += 1;
            pointsEquipes[suivante] += 1;
            System.out.println("Match nul entre " + EQUIPE[index] + " et " + EQUIPE[suivante]);
        } else if (scoreEquipe1 > scoreEquipe2) {
            pointsEquipes[index] += 3;
            System.out.println("L’équipe " + EQUIPE[index] + " a gagné contre l’équipe " + EQUIPE[suivante]);
        } else {
            pointsEquipes[suivante] += 3;
            System.out.println("L’équipe " + EQUIPE[suivante] + " a gagné contre l’équipe " + EQUIPE[index]);
        }
    }

    public static int[] trouveGagnants() {
        int maxPts = rechercheMaxPts();
        int compteurDesGagnants = 0;
        for (int i = 0; i < pointsEquipes.length; i++) {
            if (pointsEquipes[i] == maxPts) {
                compteurDesGagnants++;
            }
        }
        int[] equipeGagnante = new int[compteurDesGagnants];
        int indexEquipeGagante = 0;
        for (int i = 0; i < pointsEquipes.length; i++) {
            if (pointsEquipes[i] == maxPts) {
                equipeGagnante[indexEquipeGagante] = i;
                indexEquipeGagante++;
            }
        }
        return equipeGagnante;
    }

    public static int rechercheMaxPts() {
        int valMax = pointsEquipes[0];
        for (int j = 0; j < pointsEquipes.length; j++) {
            if (pointsEquipes[j] > valMax) {
                valMax = pointsEquipes[j];
            }

        }
        return valMax;
    }
}
