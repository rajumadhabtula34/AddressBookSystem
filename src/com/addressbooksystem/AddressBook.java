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

        System.out.println("\nContact Added Successfully");
        System.out.println("First Name : " + contact.firstName);
        System.out.println("Last Name : " + contact.lastName);
        System.out.println("Address : " + contact.address);
        System.out.println("City : " + contact.city);
        System.out.println("State : " + contact.state);
        System.out.println("Zip : " + contact.zip);
        System.out.println("Phone Number : " + contact.phoneNumber);
        System.out.println("Email : " + contact.email);
    }
}
