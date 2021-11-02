package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shapes.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    Square square;
    int side;

    @BeforeEach
    void setup() {
        side = 6;
        square = new Square(side);
    }

    @Test
    void testSide() {
        assertEquals(square.getSide(), side);
    }

    @Test
    void testSetSide() {
        int side = 9;
        square.setSide(side);
        assertEquals(square.getSide(), side);
    }

    @Test
    void testArea() {
        assertEquals(square.computeArea(), side * side);
    }
}
