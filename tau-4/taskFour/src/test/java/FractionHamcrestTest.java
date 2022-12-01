import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FractionHamcrestTest {

    @Test
    public void checkFractionsEqual() {
        Fraction leftFraction = new Fraction(1, 3);
        Fraction rightFraction = new Fraction(1, 3);
        assertThat(leftFraction.equals(rightFraction), equalTo(true));
    }

    @Test
    public void checkFractionsOneHalfFractionOfEquals() {
        Fraction leftFraction = new Fraction(2, 1);
        assertThat(leftFraction.of(2, 1), equalTo(new Fraction(1, 2)));
    }

    @Test
    public void checkFractionsOneThirdFractionOfEquals() {
        Fraction leftFraction = new Fraction(3, 1);
        assertThat(leftFraction.of(3, 1), equalTo(new Fraction(1, 3)));
    }

    @Test
    public void checkFractionsFullOfEquals() {
        Fraction leftFraction = new Fraction(1, 1);
        assertThat(leftFraction.of(1, 1), equalTo(new Fraction(1, 1)));
    }

    @Test
    public void checkFractionsSmallNumbersMultiply() {
        Fraction leftFraction = new Fraction(1, 3);
        Fraction rightFraction = new Fraction(1, 3);
        assertThat(leftFraction.multiply(leftFraction, rightFraction).toString(), equalTo("1/9"));
    }

    @Test
    public void checkFractionsBigNumbersMultiply() {
        Fraction leftFraction = new Fraction(3721, 88);
        Fraction rightFraction = new Fraction(44, 78);
        assertThat(leftFraction.multiply(leftFraction, rightFraction).toString(), equalTo("3721/156"));
    }

    @Test
    public void checkFractionsNegativeMultiply() {
        Fraction leftFraction = new Fraction(-3721, 88);
        Fraction rightFraction = new Fraction(44, 78);
        assertThat(leftFraction.multiply(leftFraction, rightFraction).toString(), equalTo("3721/-156"));
    }

    @Test
    public void checkFractionsSmallNumbersAdds() {
        Fraction leftFraction = new Fraction(1, 3);
        Fraction rightFraction = new Fraction(1, 3);
        assertThat(leftFraction.add(leftFraction, rightFraction).toString(), equalTo("2/3"));
    }

    @Test
    public void checkFractionsBigNumbersAdds() {
        Fraction leftFraction = new Fraction(3721, 88);
        Fraction rightFraction = new Fraction(44, 78);
        assertThat(leftFraction.add(leftFraction, rightFraction).toString(), equalTo("147055/3432"));
    }

    @Test
    public void checkFractionsNegativeAdds() {
        Fraction leftFraction = new Fraction(-3721, 88);
        Fraction rightFraction = new Fraction(44, 78);
        assertThat(leftFraction.add(leftFraction, rightFraction).toString(), equalTo("-143183/3432"));
    }
}