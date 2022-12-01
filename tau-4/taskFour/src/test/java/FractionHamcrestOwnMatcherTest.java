import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class FractionHamcrestOwnMatcherTest {

    @Test
    public void checkPartOfFractionGreaterThanHundred() {
        Fraction leftFraction = new Fraction(1, 3);

        assertThat(leftFraction.getDenominator(), is(FractionHamcrestMatcher.partOfFractionMoreThanHundred()));
    }

    @Test
    public void checkPartOfFractionDividableByTen() {
        Fraction leftFraction = new Fraction(1, 10);

        assertThat(leftFraction.getDenominator(), is(FractionHamcrestMatcherTwo.partOfFractionDividableByTen()));
    }

}