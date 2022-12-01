import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FractionAssertJOwnMatcherTest {

    @Test
    public void checkFractionsEqual() {
        Fraction leftFraction = new Fraction(1, 3);
        Fraction rightFraction = new Fraction(1, 3);
        FractionAssertJMatcher.assertThat(leftFraction).nominatorEqualDenominator().withFailMessage("Denominator not equal nominator");
    }


}