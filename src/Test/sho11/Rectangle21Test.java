package sho11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Rectangle21クラスのテスト
 */
class Rectangle21Test {
    @Test
    public void testEquals() {
        Rectangle21 rectangle21 = new Rectangle21(50, 10);
        Rectangle21 rectangle211 = new Rectangle21(50, 10);
        assertTrue(rectangle21.equals(rectangle211));
    }
}
