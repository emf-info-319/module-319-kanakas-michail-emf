import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongGame extends JPanel implements KeyListener {

    // Game Variables
    private final int WIDTH = 600, HEIGHT = 400;
    private final int PADDLE_WIDTH = 10, PADDLE_HEIGHT = 60;
    private final int BALL_SIZE = 20;
    private int paddle1Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
    private int paddle2Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
    private int ballX = WIDTH / 2 - BALL_SIZE / 2;
    private int ballY = HEIGHT / 2 - BALL_SIZE / 2;
    private int ballVelX = 4;
    private int ballVelY = 4;
    private int score1 = 0, score2 = 0;

    // Constructor
    public PongGame() {
        setFocusable(true);
        requestFocus();
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        addKeyListener(this);
        gameLoop();
    }

    // Game Loop
    private void gameLoop() {
        Timer timer = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveBall();
                checkCollisions();
                updateScore();
                repaint();
            }
        });
        timer.start();
    }

    // Move Ball
    private void moveBall() {
        ballX += ballVelX;
        ballY += ballVelY;
    }

    // Check Collisions
    private void checkCollisions() {
        // Walls
        if (ballY < 0 || ballY > HEIGHT - BALL_SIZE) {
            ballVelY *= -1;
        }
        // Paddles
        if ((ballX < PADDLE_WIDTH && ballY > paddle1Y && ballY < paddle1Y + PADDLE_HEIGHT)
                || (ballX + BALL_SIZE > WIDTH - PADDLE_WIDTH && ballY > paddle2Y && ballY < paddle2Y + PADDLE_HEIGHT)) {
            ballVelX *= -1;
        }
        // Reset Ball (Score)
        if (ballX < 0) {
            score2++;
            resetBall();
        } else if (ballX + BALL_SIZE > WIDTH) {
            score1++;
            resetBall();
        }
    }

    // Update Score (Temporary, no UI update in this basic version)
    private void updateScore() {
        System.out.println("Score - Player 1: " + score1 + " | Player 2: " + score2);
    }

    // Reset Ball
    private void resetBall() {
        ballX = WIDTH / 2 - BALL_SIZE / 2;
        ballY = HEIGHT / 2 - BALL_SIZE / 2;
        ballVelX *= -1; // Start in opposite direction after reset
    }

    // Draw Everything
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        // Paddles
        g.fillRect(0, paddle1Y, PADDLE_WIDTH, PADDLE_HEIGHT);
        g.fillRect(WIDTH - PADDLE_WIDTH, paddle2Y, PADDLE_WIDTH, PADDLE_HEIGHT);
        // Ball
        g.fillRect(ballX, ballY, BALL_SIZE, BALL_SIZE);
        // Score (Basic, directly on the game window)
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString(String.valueOf(score1), WIDTH / 4, 30);
        g.drawString(String.valueOf(score2), WIDTH - (WIDTH / 4), 30);
    }

    // KeyListener Implementations
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_Z) {
            paddle1Y -= 20;
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            paddle1Y += 20;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            paddle2Y -= 20;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            paddle2Y += 20;
        }
        
        // Boundary Check to prevent paddles from moving off-screen
        paddle1Y = Math.max(0, Math.min(paddle1Y, HEIGHT - PADDLE_HEIGHT));
        paddle2Y = Math.max(0, Math.min(paddle2Y, HEIGHT - PADDLE_HEIGHT));
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    // Main Method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Pong Game");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new PongGame());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
