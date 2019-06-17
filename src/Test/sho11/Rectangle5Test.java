package sho11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Rectangle5クラスのテスト
 */
class Rectangle5Test {
    @Test
    public void testArea() {
        Rectangle5 rectangle5 = new Rectangle5();
        assertEquals(200, rectangle5.getArea());
        Rectangle5 rectangle6 = new Rectangle5(10, 5);
        assertEquals(50, rectangle6.getArea());
    }
}
