package recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTest {

    @Test
    public void run() {
        assertEquals(1, Recursion.factorial(1));
        assertEquals(2, Recursion.factorial(2));
        assertEquals(720, Recursion.factorial(6));
        assertEquals(479001600, Recursion.factorial(12));
    }
}