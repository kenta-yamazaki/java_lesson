package sho11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Rectangle3クラスのテスト
 */
class Rectangle3Test {
    @Test
    public void testArea() {
        Rectangle3 rectangle3 = new Rectangle3(10, 5);
        assertEquals(50, rectangle3.getArea());
        rectangle3.setSize(5, 3);
        assertEquals(15, rectangle3.getArea());
    }
}
