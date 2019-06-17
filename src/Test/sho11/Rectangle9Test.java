package sho11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Rectangle9クラスのテスト
 */
class Rectangle9Test {
    @Test
    public void testNumber() {
        Rectangle9 rectangle9 = new Rectangle9();
        Rectangle9 rectangle91 = new Rectangle9();
        assertEquals(0, rectangle9.number);
        assertEquals(1, rectangle91.number);
    }

    @Test
    public void testSize() {
        Rectangle9 rectangle9 = new Rectangle9();
        assertEquals(10, rectangle9.width);
        assertEquals(20, rectangle9.height);
    }
}