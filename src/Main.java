import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Friend> myFriends = new ArrayList<>();
        Friend f1 = new Friend("Robert L.", 22, "male");
        Friend f2 = new Friend("Julia N.", 23, "female");
        myFriends.add(f1);
        myFriends.add(f2);

        // sort by name length
        myFriends.sort((a,b) -> {
            return a.getFullName().length() - b.getFullName().length();
        });
        // sort by age
//        myFriends.sort((a,b) -> {
//            return Integer.compare(a.getAge(),b.getAge());
//        });
        System.out.printf("Number of Friends: %d\n", myFriends.size());
        System.out.println("FRIENDS:");

        // print list of friends with an index
        for (int i = 0; i < myFriends.size(); i++) {
            Friend f = myFriends.get(i);
            System.out.println((i + 1) + ". " + f.toString());
        }

        // Testing HashMap
        HashMap<String, Friend> friends = new HashMap<>();
        friends.put("Robert", f1);
        friends.put("Julia", f2);
        System.out.println("\nFRIENDS:");
        for (Map.Entry<String, Friend> friend : friends.entrySet()) {
            System.out.println(friend.getKey() + ": {" + friend.getValue().toString() + "}");
        }
    }
}