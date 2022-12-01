import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class FractionHamcrestMatcher extends TypeSafeMatcher<Integer> {
     @Override
     public boolean matchesSafely(Integer nominator) {
         return (nominator > 100);
     }

     public void describeTo(Description description) {
         description.appendText("a part of fraction greater than 100");
     }

     public static Matcher partOfFractionMoreThanHundred() {
         return new FractionHamcrestMatcher();
     }
}

