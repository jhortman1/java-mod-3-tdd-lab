import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzArrayTest {

    String [] fizzBuzzTestArray = {"frank"};
    FizzBuzzArrayService fbArray;

    @BeforeEach
    void setUp() {
        fbArray = new FizzBuzzArray();
    }

    @Test
    void fizzBuzzArray() {
        String [] fbArrayResult  = fbArray.fizzBuzzArray(fizzBuzzTestArray);
        String [] expected = {"Fizz"};
        assertArrayEquals(expected,fbArrayResult);
    }
}