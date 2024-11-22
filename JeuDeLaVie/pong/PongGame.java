import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongGame extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private Ball ball;
    private Paddle paddle1, paddle2;

    public PongGame() {
        this.setTitle("Pong Game");
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new GamePanel());
        this.setVisible(true);
    }

    private class GamePanel extends JPanel implements KeyListener, Runnable {
        public GamePanel() {
            this.setBackground(Color.BLACK);
            ball = new Ball(WIDTH / 2, HEIGHT / 2);
            paddle1 = new Paddle(50, HEIGHT / 2 - 50);
            paddle2 = new Paddle(WIDTH - 70, HEIGHT / 2 - 50);
            this.setFocusable(true);
            this.addKeyListener(this);
            Thread gameThread = new Thread(this);
            gameThread.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Draw paddles
            g.setColor(Color.WHITE);
            g.fillRect(paddle1.x, paddle1.y, paddle1.WIDTH, paddle1.HEIGHT);
            g.fillRect(paddle2.x, paddle2.y, paddle2.WIDTH, paddle2.HEIGHT);

            // Draw ball
            g.fillOval(ball.x, ball.y, ball.DIAMETER, ball.DIAMETER);
        }

        @Override
        public void run() {
            while (true) {
                ball.move();
                ball.checkCollision(paddle1, paddle2);
                paddle1.move();
                paddle2.move();
                repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_W -> paddle1.setUp(true);
                case KeyEvent.VK_S -> paddle1.setDown(true);
                case KeyEvent.VK_UP -> paddle2.setUp(true);
                case KeyEvent.VK_DOWN -> paddle2.setDown(true);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_W -> paddle1.setUp(false);
                case KeyEvent.VK_S -> paddle1.setDown(false);
                case KeyEvent.VK_UP -> paddle2.setUp(false);
                case KeyEvent.VK_DOWN -> paddle2.setDown(false);
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }
    }

    private class Ball {
        int x, y, xSpeed = 3, ySpeed = 3;
        final int DIAMETER = 20;

        public Ball(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void move() {
            x += xSpeed;
            y += ySpeed;

            if (y <= 0 || y >= HEIGHT - DIAMETER) {
                ySpeed = -ySpeed;
            }
        }

        public void checkCollision(Paddle p1, Paddle p2) {
            if (x <= p1.x + p1.WIDTH && y >= p1.y && y <= p1.y + p1.HEIGHT) {
                xSpeed = -xSpeed;
            }
            if (x + DIAMETER >= p2.x && y >= p2.y && y <= p2.y + p2.HEIGHT) {
                xSpeed = -xSpeed;
            }
        }
    }

    private class Paddle {
        int x, y, ySpeed = 0;
        final int WIDTH = 20, HEIGHT = 100, SPEED = 5;
        private boolean up, down;

        public Paddle(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setUp(boolean up) {
            this.up = up;
        }

        public void setDown(boolean down) {
            this.down = down;
        }

        public void move() {
            if (up && y > 0) {
                y -= SPEED;
            }
            if (down && y < HEIGHT - HEIGHT) {
                y += SPEED;
            }
        }
    }

    public static void main(String[] args) {
        new PongGame();
    }
}
