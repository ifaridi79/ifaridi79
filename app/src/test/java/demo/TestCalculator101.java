package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class ReflexiveTests {
    private final Calculator calculator = new Calculator();

    @Test
    void BlankIsBlank() {
        assertEquals("", calculator.eval(""));
    }

    @Test
    void ZeroIsZero() {
        assertEquals("0", calculator.eval("0"));
    }

    @Test
    void TwoIsTwo() {
        assertEquals("2", calculator.eval("2"));
    }

    @Test
    void WhitespaceOneIsOne() {
        assertEquals("2", calculator.eval(" 2"));
    }

    @Test
    void NegativeFiveIsReflexive() {
        assertEquals("-5", calculator.eval("-5"));
    }
}


class BasicAdditionTests {

// Hint: Use the Spaces
// e.g. the test is "1 + 1" not "1+1"

    private final Calculator calculator = new Calculator();

    @Test
    void ZeroPlusZeroIsZero() {
        assertEquals("0", calculator.eval("0 + 0"));
    }

    @Test
    void TwoPlusTwoIsFour() {
        assertEquals("4", calculator.eval("2 + 2"));
    }
}


class BasicMultiplicationTests {
    private final Calculator calculator = new Calculator();

    @Test
    void TwoTimesZeroIsZero() {
        assertEquals("0", calculator.eval("2 * 0"));
    }

    @Test
    void TwoTimesOneIsTwo() {
        assertEquals("2", calculator.eval("2 * 1"));
    }

}

@Disabled
class BasicDivisionTests {
    private final Calculator calculator = new Calculator();

    @Test
    void OneDividedByZero() {
        assertThrows(ArithmeticException.class, () -> {
          calculator.eval("1 / 0");
      });
    }
}
