package cz.uhk.pro1.snake.model;

import java.awt.*;

public class GameBoard {
    Snake s = new Snake(10,10, SnakeDirection.NORTH);

    public void paint(Graphics g){
        s.paint(g);
    }
}
