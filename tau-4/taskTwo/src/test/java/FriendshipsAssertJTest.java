import org.example.Friendships;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class FriendshipsAssertJTest {
    Friendships zoo = new Friendships();

    @Test
    public void checkSimpleFriendshipTrue() {
        zoo.addFriend("cat", "dog");

        assertThat(zoo.areFriends("cat", "dog")).isEqualTo(true);

    }

    @Test
    public void checkSimpleFriendshipFalse() {
        zoo.addFriend("cat", "dog");

        assertThat(zoo.areFriends("cat", "snake")).isNotEqualTo(true);
    }

    @Test
    public void checkSpecificFriend() {
        zoo.addFriend("cat", "turkey");

        assertThat(zoo.getFriendsList("cat")).asList().contains("turkey");
    }

    @Test
    public void checkFriendsNumber() {
        zoo.addFriend("cat", "turkey");
        zoo.addFriend("cat", "dog");

        assertThat(zoo.getFriendsList("cat")).hasSize(2);
    }

    @Test
    public void checkMakeFriends() {
        zoo.makeFriends("cat", "turkey");
        assertThat(zoo.getFriendsList("turkey")).asList().isNotNull().contains("cat");

    }

    @Test
    public void checkAddTheSameFriend() {
        zoo.addFriend("cat", "turkey");
        zoo.addFriend("cat", "turkey");

        assertThat(zoo.getFriendsList("cat")).asList().contains("turkey").hasSize(2);
    }

    @Test
    public void checkDuplicateFriendsNameWorks() {
        zoo.makeFriends("cat", "turkey");
        zoo.makeFriends("turkey", "cat");
        List<String> expected = new ArrayList<>();
        expected.add("turkey");
        expected.add("turkey");
        assertThat(zoo.getFriendsList("cat")).hasSameElementsAs(expected);
    }

    @Test
    public void checkMakeFriendsFalse() {
        zoo.makeFriends("cat", "turkey");
        assertThat(zoo.getFriendsList("turkey")).asList().isNotNull().doesNotContain("snake");

    }
}