package java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class PalindromeTest {

    @Test
    public void checkTrue() {
        taskTwo checker = new taskTwo();
        Assertions.assertTrue(checker.check("A quick brown fox jumps over the lazy dog"));
    }


    @Test
    public void checkFalse() {
        taskTwo checker = new taskTwo();
        Assertions.assertFalse(checker.check("A quick brown"));

    }
    @Test
    public void checkInput() {
        taskOne checker = new taskOne();
        Assertions.assertThrows(RuntimeException.class,
                ()->{
                    checker.check("A 5 quick brown fox ");
                });
    }

    @Test
    public void checkList() {
        taskTwo checker = new taskTwo();
        List<String> check = Arrays.asList("A quick brown fox jumps over the lazy dog", "Mumbai", "Kolkata", "Chennai");
        List<Boolean> result = Arrays.asList(true, false, false, false);

        Assertions.assertIterableEquals(checker.checkList(check), result);

    }
}
