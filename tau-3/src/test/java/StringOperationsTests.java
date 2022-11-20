import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StringOperationsTests {

    @Test
    public void checkReverseShortString() {
        StringOperations checker = new StringOperations();
        assertEquals("tok", checker.reverse("kot"));
    }

    @Test
    public void checkConcatShortString() {
        StringOperations checker = new StringOperations();
        assertEquals("kotala", checker.concat("kot", "ala"));
    }

    @Test
    public void checkIsPalindromeShortString() {
        StringOperations checker = new StringOperations();
        assertEquals(true, checker.isPalindrome("dad"));
    }
}

