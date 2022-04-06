package cz.uhk.pro1.snake;

import cz.uhk.pro1.snake.model.GameBoard;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GameBoard gb = new GameBoard();
        CanvasPanel p = new CanvasPanel(gb);
        add(p);
        p.setPreferredSize(new Dimension(300, 300));
        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow w = new MainWindow();
            w.setVisible(true);
        });
    }
}
