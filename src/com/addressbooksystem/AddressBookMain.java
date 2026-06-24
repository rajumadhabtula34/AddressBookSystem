
package com.addressbooksystem;




public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

        AddressBook addressBook = new AddressBook();

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

        addressBook.addContact(contact1);
        addressBook.addContact(contact2);

        addressBook.displayContacts();
    }
}