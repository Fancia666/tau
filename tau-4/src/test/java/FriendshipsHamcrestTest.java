import org.assertj.core.api.Assertions;
import org.example.Friendships;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class FriendshipsHamcrestTest {
    Friendships zoo = new Friendships();

    @Test
    public void checkSimpleFriendshipTrue() {
        zoo.addFriend("cat", "dog");

        assertThat(zoo.areFriends("cat", "dog"), equalTo(true));
    }

    @Test
    public void checkSimpleFriendshipFalse() {
        zoo.addFriend("cat", "dog");

        assertThat(zoo.areFriends("cat", "snake"), not(true));
    }

    @Test
    public void checkSpecificFriend() {
        zoo.addFriend("cat", "turkey");

        assertThat(zoo.getFriendsList("cat"), hasItem("turkey"));
    }

    @Test
    public void checkFriendsNumber() {
        zoo.addFriend("cat", "turkey");
        zoo.addFriend("cat", "dog");

        assertThat(zoo.getFriendsList("cat"), hasSize(2));
    }

    @Test
    public void checkMakeFriends() {
        zoo.makeFriends("cat", "turkey");
        zoo.makeFriends("cat", "elephant");

        assertThat(zoo.getFriendsList("cat"), hasItems("turkey", "elephant"));
    }

    @Test
    public void checkAddTheSameFriend() {
        zoo.addFriend("cat", "turkey");
        zoo.addFriend("cat", "turkey");

        assertThat(zoo.getFriendsList("cat"), hasSize(2));
    }

    @Test
    public void checkDuplicateFriendsNameWorks() {
        zoo.makeFriends("cat", "turkey");
        zoo.makeFriends("turkey", "cat");
        List<String> expected = new ArrayList<>();
        expected.add("turkey");
        expected.add("turkey");

        assertThat(zoo.getFriendsList("cat"), equalTo(expected));
    }

    @Test
    public void checkMakeFriendsFalse() {
        zoo.makeFriends("cat", "turkey");
        
        assertThat(zoo.areFriends("cat", "snake"), not("elephand"));
    }
}