import java.util.*;

public class Main {
    public static void main(String[] args) {

//        System.out.println("=> Enter your name?");
//        String userName = "Daniel"; // new Scanner(System.in).nextLine();
//        System.out.println("\n(i) Witaj " + userName);


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

        for (int i = 0; i < myFriends.size(); i++) {
            Friend f = myFriends.get(i);
            System.out.println((i + 1) + ". " + f.toString());
        }
    }
}