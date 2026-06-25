package com.addressbooksystem;
 
import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {

        for (Contact contact : contacts) {

            System.out.println("\nFirst Name : " + contact.firstName);
            System.out.println("Last Name : " + contact.lastName);
            System.out.println("Address : " + contact.address);
            System.out.println("City : " + contact.city);
            System.out.println("State : " + contact.state);
            System.out.println("Zip : " + contact.zip);
            System.out.println("Phone Number : " + contact.phoneNumber);
            System.out.println("Email : " + contact.email);
        }
    }
}