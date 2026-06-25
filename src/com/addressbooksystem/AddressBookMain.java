package com.addressbooksystem;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

        AddressBookSystem system = new AddressBookSystem();

        AddressBook home = new AddressBook();
        AddressBook office = new AddressBook();

        Contact contact1 = new Contact();
        contact1.firstName = "Raju";
        contact1.lastName = "Raj";
        contact1.address = "Bangalore";
        contact1.city = "Bangalore";
        contact1.state = "Karnataka";
        contact1.zip = "560001";
        contact1.phoneNumber = "9876543210";
        contact1.email = "raju@gmail.com";

        Contact contact2 = new Contact();
        contact2.firstName = "Ram";
        contact2.lastName = "Kumar";
        contact2.address = "Hyderabad";
        contact2.city = "Hyderabad";
        contact2.state = "Telangana";
        contact2.zip = "500001";
        contact2.phoneNumber = "9876543211";
        contact2.email = "ram@gmail.com";

        home.addContact(contact1);
        office.addContact(contact2);

        system.addAddressBook("Home", home);
        system.addAddressBook("Office", office);

        System.out.println("\nAvailable Address Books:");
        system.displayAddressBooks();

        System.out.println("\nHome Address Book:");
        home.displayContacts();

        System.out.println("\nOffice Address Book:");
        office.displayContacts();
    }
}