import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fb;

    @BeforeEach
    void setUp() {
        fb = new FizzBuzz();
    }

    @Test
    void returnsFizz() {
        String returnsFizz = fb.FizzBuzz("frank");
        assertEquals("Fizz", returnsFizz);
    }
    @Test
    void returnsBuzz() {
        String returnsBuzz = fb.FizzBuzz("jacob");
        assertEquals("Buzz", returnsBuzz);
    }
    @Test
    void returnsFizzBuzz() {
        String returnsFizzBuzz = fb.FizzBuzz("frankjacob");
        assertEquals("FizzBuzz", returnsFizzBuzz);
    }
    @Test
    void returnsStr() {
        String returnsStr = fb.FizzBuzz("james");
        assertEquals("james", returnsStr);
    }
    @Test
    void returnsNull() {
        String returnsNull = fb.FizzBuzz(null);
        assertNull(returnsNull);
    }
}