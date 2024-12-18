import enums.Relation;
import models.Person;
import enums.Gender;
import models.Relative;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        Person p1 = new Person("Robert L.", Gender.MALE, LocalDate.of(2005,4,18));
        Person p2 = new Person("Julia N.", Gender.FEMALE, LocalDate.of(2003,8,13));
        Person p3 = new Relative(Relation.CHILD, true, "Tony Hoffmann", Gender.MALE, LocalDate.of(2019, 10, 9));
        people.add(p1);
        people.add(p2);
        people.add(p3);
        // sort people by name length
//        people.sort((a,b) -> {
//            return a.getFullName().length() - b.getFullName().length();
//        });
        // sort people by age
        people.sort((a,b) -> {
            return Integer.compare(a.getAge(), b.getAge());
        });
        System.out.printf("Number of Friends: %d\n", people.size());
        System.out.println("FRIENDS:");

        // print list of friends with an index
        for (int i = 0; i < people.size(); i++) {
            Person f = people.get(i);
            System.out.println((i + 1) + ". " + f.toString());
        }
        // Testing HashMap
        HashMap<Integer, Person> myPeople = new HashMap<>();
        myPeople.put(p1.getId(), p1);
        myPeople.put(p2.getId(), p2);
        myPeople.put(p3.getId(), p3);
        System.out.println("\nFRIENDS:");
        for (Map.Entry<Integer, Person> p : myPeople.entrySet()) {
            System.out.println("ID-" + p.getKey() + ": " + p.getValue().toString());
        }

//      Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            writer.write("Hello World!");
            writer.newLine();
            writer.write("This is a new line.");
        } catch (Exception e) {
            e.getStackTrace();
        }
        // Reading a file
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))){ // using try-with: I don't have to call close()
//            System.out.println("-> FILE CONTENT: " + reader.readLine()); // read a single line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e){
            e.getStackTrace();
        }


    }
}