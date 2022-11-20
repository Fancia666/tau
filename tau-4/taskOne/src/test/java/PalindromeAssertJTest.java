import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class PalindromeAssertJTest {

    Palindrome checker = new Palindrome();

    @Test
    public void checkTrue() {
        assertThat(checker.check("A quick brown fox jumps over the lazy dog")).isEqualTo(true);
    }

    @Test
    public void checkFalse() {
        assertThat(checker.check("cat")).isNotEqualTo(true);

    }

    @Test
    public void checkInput() {
        assertThatThrownBy(() -> {
            checker.check("A 5 quick brown fox");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void checkListSize() {
        List<String> check = Arrays.asList("A quick brown fox jumps over the lazy dog", "Mumbai");
        assertThat(checker.checkList(check)).hasSize(2);
    }

        @Test
    public void checkListEquals() {
        List<String> check = Arrays.asList("A quick brown fox jumps over the lazy dog", "Mumbai", "Kolkata", "Chennai");
        List<Boolean> result = Arrays.asList(true, false, false, false);
        assertThat(checker.checkList(check)).hasSameElementsAs(result);
    }
}
