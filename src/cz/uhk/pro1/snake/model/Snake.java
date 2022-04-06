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
    // TODO setDirection(...) dodelame pozdeji spolecne

    public void moveForward() {
        SnakePiece head = pieces.getFirst();
        // TODO pozdeji spolecne dodelame implementaci rizeni a zohledneni direction (smeru), zatim pohybujeme nahoru
        SnakePiece newHead = new SnakePiece(head.getI() - 1, head.getJ());
        pieces.addFirst(newHead); // pridat "novou hlavu" na zacatek
        pieces.removeLast();       // odstranit "starou hlavu" z konce
    }

    public Deque<SnakePiece> getPieces(){
        return pieces;
    }
}
