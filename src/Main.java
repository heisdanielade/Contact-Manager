import models.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        Person f1 = new Person("Robert L.", 22, "male");
        Person f2 = new Person("Julia N.", 23, "female");
        people.add(f1);
        people.add(f2);

        // sort by name length
        people.sort((a,b) -> {
            return a.getFullName().length() - b.getFullName().length();
        });
        // sort by age
//        myFriends.sort((a,b) -> {
//            return Integer.compare(a.getAge(),b.getAge());
//        });
        System.out.printf("Number of Friends: %d\n", people.size());
        System.out.println("FRIENDS:");

        // print list of friends with an index
        for (int i = 0; i < people.size(); i++) {
            Person f = people.get(i);
            System.out.println((i + 1) + ". " + f.toString());
        }

        // Testing HashMap
        HashMap<String, Person> myPeople = new HashMap<>();
        myPeople.put("Robert", f1);
        myPeople.put("Julia", f2);
        System.out.println("\nFRIENDS:");
        for (Map.Entry<String, Person> friend : myPeople.entrySet()) {
            System.out.println(friend.getKey() + ": {" + friend.getValue().toString() + "}");
        }
    }
}