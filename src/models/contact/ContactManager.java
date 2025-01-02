package models.contact;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact, int userId){
        System.out.println("(i) Contact added successfully.");
    }

    public List<Contact> viewContacts(String userId){
        List<Contact> userContacts = new ArrayList<>();
        return userContacts; // --------
    }

    public boolean editContact(int contactId, int userId, Contact updatedContact){
        System.out.println("(e) Contact update failed.");
        return false;
    }

    public void deleteContact(Contact contact, int userId){
        System.out.println("(i) Contact deleted successfully.");
    }

}
