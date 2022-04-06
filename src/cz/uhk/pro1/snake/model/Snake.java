package cz.uhk.pro1.snake.model;

import java.awt.*;
import java.util.Deque;
import java.util.LinkedList;

public class Snake {
    private final Deque<SnakePiece> pieces = new LinkedList<>();
    private SnakeDirection direction;

    public Snake(int initialI, int initialJ, SnakeDirection direction) {
        SnakePiece p = new SnakePiece(initialI, initialJ);
        this.direction = direction;
        pieces.add(p);
    }

    public void paint(Graphics g){
        for (SnakePiece sp: pieces){
            sp.paint(g);
        }
    }
    // TODO setDirection(...)

    public void moveForward() {

    }

    public Deque<SnakePiece> getPieces(){
        return pieces;
    }
}
