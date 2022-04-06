package cz.uhk.pro1.snake;

import cz.uhk.pro1.snake.model.GameBoard;

import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {
    private GameBoard gb;

    public CanvasPanel(GameBoard gb){
        this.gb = gb;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
       // g.setColor(Color.RED);
       // g.fillRect(10, 10, 200, 100);
        gb.paint(g);
    }
}
