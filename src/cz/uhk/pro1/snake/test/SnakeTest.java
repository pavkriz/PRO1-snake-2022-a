package cz.uhk.pro1.snake.test;

import cz.uhk.pro1.snake.model.Snake;
import cz.uhk.pro1.snake.model.SnakeDirection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SnakeTest {
    @Test
    public void testMoveForward() {
        Snake snake = new Snake(10, 10, SnakeDirection.NORTH);
        snake.moveForward();
        assertEquals(1, snake.getPieces().size());
        assertEquals(9, snake.getPieces().getFirst().getI());
        assertEquals(10, snake.getPieces().getFirst().getJ());
    }
}
