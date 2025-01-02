package models.contact;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact, int userId){
    }

    public List<Contact> viewContacts(String userId){
        List<Contact> userContacts = new ArrayList<>();
        return userContacts; // --------
    }

    public boolean editContact(int contactId, int userId, Contact updatedContact){
        return false;
    }

    public void deleteContact(Contact contact, int userId){
    }

}
