package com.addressbooksystem;



public class AddressBook {

    Contact contact = new Contact();

    public void addContact() {

        contact.firstName = "Raju";
        contact.lastName = "Raj";
        contact.address = "Bangalore";
        contact.city = "Bangalore";
        contact.state = "Karnataka";
        contact.zip = "560001";
        contact.phoneNumber = "9876543210";
        contact.email = "raju@gmail.com";
    }

    public void editContact() {

        if (contact.firstName.equals("Raju")) {

            contact.city = "Hyderabad";

            System.out.println("Contact Updated Successfully");
            System.out.println("Updated City : " + contact.city);
        }
    }
}