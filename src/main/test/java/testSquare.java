import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSquare {
    @Test
    void additionSqrt() {
        assertEquals(Math.sqrt(4), squarePayment.sqrtPayment(4));
    }
    @Test
    void additionSqrtZero() {
        assertEquals(Math.sqrt(0), squarePayment.sqrtPayment(0));
    }
    @Test
    void additionSqrtUnderZero() {
        assertEquals(Math.sqrt(-10), squarePayment.sqrtPayment(-10));
    }
    @Test
    void additionSqrtMaxDoubleValue() {
        assertEquals(Math.sqrt(Double.MAX_VALUE), squarePayment.sqrtPayment(Double.MAX_VALUE));
    }

}
