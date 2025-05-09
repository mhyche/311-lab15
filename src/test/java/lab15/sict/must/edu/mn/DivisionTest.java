package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
    @Test
    void testDividePositive() {
        Division div = new Division();
        assertEquals(2.0, div.divide(6.0, 3.0));
    }

    @Test
    void testDivideByZero() {
        Division div = new Division();
        assertThrows(IllegalArgumentException.class, () -> div.divide(5.0, 0.0));
    }
}
