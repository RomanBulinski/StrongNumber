import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStrongNumber {

    private static String STRONG = "STRONG!!!!";
    private static String NOT_STRONG = "Not Strong !!";

    @Test
    public void testSomething1() {
        assertEquals(STRONG, StrongNumber.isStrongNumber(1));

    }

    @Test
    public void testSomething2() {

        assertEquals(STRONG, StrongNumber.isStrongNumber(2));
        assertEquals(STRONG, StrongNumber.isStrongNumber(145));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(7));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(93));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(185));
    }

}
