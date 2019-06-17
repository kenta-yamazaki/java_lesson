package sho11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Rectangle15クラスのテスト
 */
class Rectangle15Test {
    @Test
    public void testSize() {
        Rectangle15 rectangle15 = new Rectangle15();
        assertEquals(10, rectangle15.width);
        assertEquals(20, rectangle15.height);
    }
}
