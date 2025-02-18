import gui.AppFrame;
import models.contact.Contact;
import models.contact.enums.Gender;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Contact> people = new ArrayList<>();
        Contact p1 = new Contact("Robert", "Lewandowski", Gender.MALE, LocalDate.of(2005, 4, 18));
        people.add(p1);
        // sort people by name length
//        people.sort((a,b) -> {
//            return a.getFullName().length() - b.getFullName().length();
//        });
        // sort people by age
        people.sort((a, b) -> {
            return Integer.compare(a.getAge(), b.getAge());
        });
//        System.out.printf("Number of Friends: %d\n", people.size());
//        System.out.println("FRIENDS:");

        // print list of friends with an index
//        for (int i = 0; i < people.size(); i++) {
//            Person f = people.get(i);
//            System.out.println((i + 1) + ". " + f.toString());
//        }
        // Testing HashMap
//        HashMap<Integer, Person> myPeople = new HashMap<>();
//        myPeople.put(p1.getId(), p1);
//        myPeople.put(p2.getId(), p2);


//      Writing to a file
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileActions.getFileName()))){
//            for (Map.Entry<Integer, Person> p : myPeople.entrySet()) {
//                writer.write(p.getKey() + ": " + p.getValue().toString());
//                writer.newLine();
//            }
//        } catch (Exception e) {
//            e.getStackTrace();
//        }


        // read from file
//        System.out.println("\nFRIENDS:");
//        fileActions.read();

        // GUI Interface
        new AppFrame(); // entry frame to application



        // connect to database
//        Database.connect();
    }

}