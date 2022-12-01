import org.assertj.core.api.AbstractAssert;

public class FractionAssertJMatcher extends AbstractAssert<FractionAssertJMatcher, Fraction> {

    public FractionAssertJMatcher(Fraction actual) {
        super(actual, Fraction.class);
    }

    public static FractionAssertJMatcher assertThat(Fraction actual) {
        return new FractionAssertJMatcher(actual);
    }

    public FractionAssertJMatcher nominatorEqualDenominator() {
        isNotNull();

        if (actual.getNominator() != actual.getDenominator()) {
            failWithMessage("Denominator not equal nominator");
        }

        return this;
    }




}