package cz.uhk.pro1.snake.model;

import java.awt.*;

public class SnakePiece {
    private final int i;
    private final int j;

    public SnakePiece(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void paint(Graphics g){
            g.setColor(Color.GREEN);
            g.fillRect(j*10,i*10,10,10);
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
