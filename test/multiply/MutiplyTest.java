package multiply;

import java.Dollar;

public class MultiplyTest {
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amout);
    }
}