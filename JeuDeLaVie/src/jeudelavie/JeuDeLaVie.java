package jeudelavie;

public class JeuDeLaVie {

    //
    // Les 4 constantes demandées
    //
    public final static int LARGEUR = 128;
    public final static int HAUTEUR = 128;
    public final static int TAILLE_POINT_EN_PIXELS = 5;
    public final static int FPS = 25;

    //
    // La méthode demandée pour créer notre plateau du "jeu de la vie"
    //
    public static boolean[][] plateauDuJeuDeLaVie_creer() {
        boolean[][] tab = new boolean[128][128];
        return tab;
        // \ \ / / _ \_ _| _ \ __| / __/ _ \| \| __| |_ _/ __|_ _| | |
        // \ V / (_) || | | / _| | (_| (_) | |) | _| | | (__ | | |_|
        // \_/ \___/ |_| |_|_\___| \___\___/|___/|___| |___\___|___| (_)
    }

    //
    // La méthode demandée pour mettre un contenu aléatoire dans les cellules
    //
    public static void plateauDuJeuDeLaVie_contenuAleatoire(boolean[][] cells) {
        for (int casegrand = 0; casegrand < cells.length; casegrand++) {
            for (int casepetit = 0; casepetit < cells[casegrand].length; casepetit++) {
                int nombre = (int) (Math.random() * (1 - 0 + 1)) + 0;
                if (nombre == 0) {
                    cells[casegrand][casepetit] = false;
                } else {
                    cells[casegrand][casepetit] = true;
                }
            }
        }

        // __ _____ _____ ___ ___ ___ ___ ___ ___ ___ ___ ___ _
        // \ \ / / _ \_ _| _ \ __| / __/ _ \| \| __| |_ _/ __|_ _| | |
        // \ V / (_) || | | / _| | (_| (_) | |) | _| | | (__ | | |_|
        // \_/ \___/ |_| |_|_\___| \___\___/|___/|___| |___\___|___| (_)
    }

    //
    // La méthode demandée pour compter le nombre de voisins vivants de l'une de nos
    // cellules
    //
    public static int nbreDeVoisins(boolean[][] cells, int casegrand, int casepetit) {
                int nbreVoisins = 0;
                if (casegrand>LARGEUR-1) {//gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg
                    
                }
                if (casegrand>HAUTEUR-1) {
                    
                }
                if (cells[casegrand][casepetit + 1] == true) {
                    nbreVoisins++;
                }
                if (cells[casegrand][casepetit - 1] == true) {
                    nbreVoisins++;
                }
                if (cells[casegrand + 1][casepetit] == true) {
                    nbreVoisins++;
                }
                if (cells[casegrand - 1][casepetit] == true) {
                    nbreVoisins++;
                }
                if (cells[casegrand + 1][casepetit + 1] == true) {
                    nbreVoisins++;
                }
                if (cells[casegrand - 1][casepetit - 1] == true) {
                    nbreVoisins++;
                }
                if (cells[casegrand + 1][casepetit - 1] == true) {
                    nbreVoisins++;
                }
                if (cells[casegrand - 1][casepetit + 1] == true) {
                    nbreVoisins++;
                }
                return nbreVoisins;
        // __ _____ _____ ___ ___ ___ ___ ___ ___ ___ ___ ___ _
        // \ \ / / _ \_ _| _ \ __| / __/ _ \| \| __| |_ _/ __|_ _| | |
        // \ V / (_) || | | / _| | (_| (_) | |) | _| | | (__ | | |_|
        // \_/ \___/ |_| |_|_\___| \___\___/|___/|___| |___\___|___| (_)
    }

    //
    // La méthode demandée pour calculer le nouvel état du jeu d'après l'ancien
    //
    public static boolean[][] plateauDuJeuDeLaVie_calculerProchainEtat(boolean[][] cells) {

        for (int casegrand = 0; casegrand < cells.length; casegrand++) {
            for (int casepetit = 0; casepetit < cells[casegrand].length; casepetit++) {
                int nbreVoisins = nbreDeVoisins(cells, casegrand, casepetit);
                if (nbreVoisins < 2 || nbreVoisins > 3) {
                    cells[casegrand][casepetit] = false;
                } else {
                    cells[casegrand][casepetit] = true;
                }
            }
        }
        return cells;
        // __ _____ _____ ___ ___ ___ ___ ___ ___ ___ ___ ___ _
        // \ \ / / _ \_ _| _ \ __| / __/ _ \| \| __| |_ _/ __|_ _| | |
        // \ V / (_) || | | / _| | (_| (_) | |) | _| | | (__ | | |_|
        // \_/ \___/ |_| |_|_\___| \___\___/|___/|___| |___\___|___| (_)
    }

    public static void main(String[] args) {
        // Démarrer le jeu de la vie
        go(); // Cette méthode est dans la zone de code cachée, il ne faut rien toucher !!!
    }

    // <editor-fold defaultstate="collapsed" desc="NE RIEN TOUCHER AU CODE CACHÉ ICI
    // !!!">
    public static void go() {
        // Définir le look&feel visuel des fenêtres Swing
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);

        // Créer une instance du jeu et le démarrer
        JeuDeLaVie jeuDeLaVie = new JeuDeLaVie();
        jeuDeLaVie.start();
    }

    public void start() {
        // On crée une tâche qui va créer une fenêtre (notre LifeFrame) et le rendre
        // visible à l'écran
        // Ce LifeFrame contient le jPanel modifié qui affichera l'évolution du "jeu de
        // la vie"
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LifeFrame().setVisible(true);
            }
        });

    }

    public class LifePanel extends javax.swing.JPanel {

        // Le contenu des cellules du jeu
        private boolean[][] etat;

        public LifePanel() {
            // Création des cellules du jeu de la vie
            this.etat = plateauDuJeuDeLaVie_creer();

            java.awt.Dimension dimensions = new java.awt.Dimension(LARGEUR * TAILLE_POINT_EN_PIXELS,
                    HAUTEUR * TAILLE_POINT_EN_PIXELS);
            setPreferredSize(dimensions);
            setMinimumSize(dimensions);
            setMaximumSize(dimensions);

            // Initialisation avec des valeurs aléatoires
            plateauDuJeuDeLaVie_contenuAleatoire(etat);

            // L'ensemble du fond est noir
            setBackground(java.awt.Color.BLACK);

            // Créer un timer qui se chargera de calculer le prochain état et de l'afficher
            // à la fréquence demandée
            // Si FPS = 2 c'est-à-dire 2x par seconde => 1000/2 = 500ms d'attente entre deux
            // affichages
            javax.swing.Timer animation = new javax.swing.Timer(1000 / FPS, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    // Cycle du jeu de la vie
                    etat = plateauDuJeuDeLaVie_calculerProchainEtat(etat);
                    // Redessiner le contenu
                    repaint();
                }
            });

            // Ajouter un écouteur pour les clicks dans la fenêtre pour arrêter/démarrer
            // l'animation
            addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent e) {
                    if (animation.isRunning()) {
                        animation.stop();
                    } else {
                        animation.start();
                    }
                }

                @Override
                public void mouseReleased(java.awt.event.MouseEvent e) {

                }
            });

            // Par défaut l'animation est dans l'état démarrée
            animation.start();
        }

        @Override
        public void paintComponent(java.awt.Graphics g) {
            // On demande au parent de se redessiner
            super.paintComponent(g);
            // Cellule par cellule, les dessiner selon leur états
            for (int i = 0; i < etat.length; i++) {
                for (int j = 0; j < etat[0].length; j++) {
                    g.setColor(etat[i][j] ? java.awt.Color.GREEN : java.awt.Color.DARK_GRAY);
                    g.fillRect(j * TAILLE_POINT_EN_PIXELS, i * TAILLE_POINT_EN_PIXELS, TAILLE_POINT_EN_PIXELS - 1,
                            TAILLE_POINT_EN_PIXELS - 1);
                }
            }
        }

    }

    public class LifeFrame extends javax.swing.JFrame {

        /**
         * Creates new form NewJFrame
         */
        public LifeFrame() {
            jLifePanel = new LifePanel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Jeu de la vie - Module 403 - Paul Friedli 2017/2018");

            setResizable(false);
            setLayout(new java.awt.BorderLayout());
            add(jLifePanel, java.awt.BorderLayout.CENTER);
            pack();
            setLocationRelativeTo(null); // Screen center
            setVisible(true);
        }

        private LifePanel jLifePanel;
    }

    // </editor-fold>
}
