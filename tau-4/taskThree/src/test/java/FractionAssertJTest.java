import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class FractionAssertJTest {

    @Test
    public void checkFractionsEqual() {
        Fraction leftFraction = new Fraction(1, 3);
        Fraction rightFraction = new Fraction(1, 3);

        assertThat(leftFraction.equals(rightFraction)).isEqualTo(true);
    }

    @Test
    public void checkFractionsOneHalfFractionOfEquals() {
        Fraction leftFraction = new Fraction(2, 1);
        assertThat(leftFraction.of(2, 1)).isEqualTo(new Fraction(1, 2));
    }

    @Test
    public void checkFractionsOneThirdFractionOfEquals() {
        Fraction leftFraction = new Fraction(3, 1);
        assertThat(leftFraction.of(3, 1)).isEqualTo(new Fraction(1, 3));
    }

    @Test
    public void checkFractionsFullOfEquals() {
        Fraction leftFraction = new Fraction(1, 1);
        assertThat(leftFraction.of(1, 1)).isEqualTo(new Fraction(1, 1));
    }

    @Test
    public void divideByZeroException() {
        assertThatThrownBy(() -> {
            Fraction.of(1, 0);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void checkFractionsSmallNumbersMultiply() {
        Fraction leftFraction = new Fraction(1, 3);
        Fraction rightFraction = new Fraction(1, 3);
        assertThat(leftFraction.multiply(leftFraction, rightFraction).toString()).isEqualTo("1/9");
    }

    @Test
    public void checkFractionsBigNumbersMultiply() {
        Fraction leftFraction = new Fraction(3721, 88);
        Fraction rightFraction = new Fraction(44, 78);
        assertThat(leftFraction.multiply(leftFraction, rightFraction).toString()).isEqualTo("3721/156");
    }

    @Test
    public void checkFractionsNegativeMultiply() {
        Fraction leftFraction = new Fraction(-3721, 88);
        Fraction rightFraction = new Fraction(44, 78);
        assertThat(leftFraction.multiply(leftFraction, rightFraction).toString()).isEqualTo("3721/-156");
    }

    @Test
    public void checkFractionsMultiplyWithZeroException() {
        Fraction leftFraction = new Fraction(1, 0);
        Fraction rightFraction = new Fraction(2, 3);
        assertThatThrownBy(() -> {
            assertThat(leftFraction.multiply(leftFraction, rightFraction));
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void checkFractionsSmallNumbersAdds() {
        Fraction leftFraction = new Fraction(1, 3);
        Fraction rightFraction = new Fraction(1, 3);
        assertThat(leftFraction.add(leftFraction, rightFraction).toString()).isEqualTo("2/3");
    }

    @Test
    public void checkFractionsBigNumbersAdds() {
        Fraction leftFraction = new Fraction(3721, 88);
        Fraction rightFraction = new Fraction(44, 78);
        assertThat(leftFraction.add(leftFraction, rightFraction).toString()).isEqualTo("147055/3432");
    }

    @Test
    public void checkFractionsNegativeAdds() {
        Fraction leftFraction = new Fraction(-3721, 88);
        Fraction rightFraction = new Fraction(44, 78);
        assertThat(leftFraction.add(leftFraction, rightFraction).toString()).isEqualTo("-143183/3432");
    }

    @Test
    public void checkFractionsAddsWithZeroException() {
        Fraction leftFraction = new Fraction(1, 0);
        Fraction rightFraction = new Fraction(2, 3);
        assertThatThrownBy(() -> {
            assertThat(leftFraction.add(leftFraction, rightFraction));
        }).isInstanceOf(IllegalArgumentException.class);
    }
}