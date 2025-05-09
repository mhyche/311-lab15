package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
    @Test
    void shouldReturnCorrectResultForPositiveDivision() {
        Division div = new Division();
        assertEquals(2.0, div.divide(6.0, 3.0), 0.0001);
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        Division div = new Division();
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> div.divide(5.0, 0.0)
        );
        assertEquals("Cannot divide by zero (b = 0.0)", thrown.getMessage());
    }

    @Test
    void shouldHandleNegativeNumbersCorrectly() {
        Division div = new Division();
        assertEquals(-2.0, div.divide(-6.0, 3.0), 0.0001);
        assertEquals(-2.0, div.divide(6.0, -3.0), 0.0001);
        assertEquals(2.0, div.divide(-6.0, -3.0), 0.0001);
    }
}
