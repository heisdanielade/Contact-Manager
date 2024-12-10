import java.util.*;

public class Main {
    public static void main(String[] args) {

//        System.out.println("=> What is your name?");
//        String userName = "Daniel"; // new Scanner(System.in).nextLine();
//        System.out.println("\n(i) Witaj " + userName);


        ArrayList<Friend> myFriends = new ArrayList<>();
        Friend f1 = new Friend("Samuel", 24, "male");
        Friend f2 = new Friend("Lena", 25, "female");
        myFriends.add(f1);
        myFriends.add(f2);

        // sort by name length
        myFriends.sort((a,b) -> {
            return a.getName().length() - b.getName().length();
        });
        // sort by age
//        myFriends.sort((a,b) -> {
//            return Integer.compare(a.getAge(),b.getAge());
//        });
        System.out.println(String.format("Number of Friends: %d", myFriends.size()));
        System.out.println("FRIENDS:");

        for (int i = 0; i < myFriends.size(); i++) {
            Friend f = myFriends.get(i);
            System.out.println((i + 1) + ". " + f.toString());
        }
    }
}