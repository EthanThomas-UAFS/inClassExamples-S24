import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends GameObject implements KeyListener {
    GamePanel gamePanel;
    public Player(GamePanel gamePanel){
        this.gamePanel=gamePanel;
       this.setColor(Color.BLUE);
       this.setWidth(50);
       this.setHeight(70);
       this.setSpeed(0);
       this.setX((800-this.getWidth())/2);
       this.setY(600 - this.getHeight());
    }


    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key released: " + e.getKeyCode());
        if(e.getKeyCode() == 32){
            gamePanel.missle.setX((800-this.getWidth())/2);
            gamePanel.missle.setY(600 - this.getHeight());
        }
    }
}
