import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class FractionHamcrestMatcherTwo extends TypeSafeMatcher<Integer> {
     @Override
     public boolean matchesSafely(Integer nominator) {
        if (nominator % 10 != 0) {
            return false;
        }
        return ((nominator % 0) == 0);
     }

     public void describeTo(Description description) {
         description.appendText("a part of fraction dividable by ten 10");
     }

     public static Matcher partOfFractionDividableByTen() {
         return new FractionHamcrestMatcherTwo();
     }
}

