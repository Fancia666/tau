package org.example;

import java.util.*;

public class Friendships {
    Map<String, List<String>> friendships = new HashMap<>();

    //Dodanie przyjaciół - wykorzystuje funkcje addFriend!
    public void makeFriends(String person1, String person2) {
        addFriend(person1, person2);
	addFriend(person2, person1);
    }

    //Pobranie listy przyjaciol
    public List<String> getFriendsList(String person) {
        System.out.println(friendships.get(person));
        return friendships.get(person);
    }

    //Sprawdzenie czy przyjaciele
    public boolean areFriends(String person1, String person2) {
        return getFriendsList(person1).contains(person2);
    }
    //Dodanie do listy przyjaciol do danej osoby
    public void addFriend(String person, String friend) {
        if (friendships.containsKey(person)){
            friendships.get(person).add(friend);

        }
        else {
            List<String> personsFriends = new ArrayList<>();
            personsFriends.add(friend);

            friendships.put(person, personsFriends);
        }
    }
}

