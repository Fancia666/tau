import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PalindromeHamcrestTest {

    Palindrome checker = new Palindrome();

    @Test
    public void checkTrue() {
        assertThat(checker.check("A quick brown fox jumps over the lazy dog"), equalTo(true));
    }

    @Test
    public void checkFalse() {
        assertThat(checker.check("cat"), not(true));
    }

    @Test( )
    public void CheckFalseAndTrue() throws Exception{
        List<String> check = Arrays.asList("A quick brown fox jumps over the lazy dog", "Mumbai");
        check = checker.checkList(check);

        assertThat(check, containsInAnyOrder(true, false));
    }

    @Test
    public void checkListSize() {
        List<String> check = Arrays.asList("A quick brown fox jumps over the lazy dog", "Mumbai");
        check = checker.checkList(check);
        assertThat(check, hasSize(2));
    }

    @Test
    public void checkListEquals() {
        List<String> check = Arrays.asList("A quick brown fox jumps over the lazy dog", "Mumbai", "Kolkata", "Chennai");
        List<Boolean> result = Arrays.asList(true, false, false, false);
        check = checker.checkList(check);
        assertThat(check, equalTo(result));
    }
}
