package com.addressbooksystem;

import java.util.HashMap;

public class AddressBookSystem {

    HashMap<String, AddressBook> addressBooks = new HashMap<>();

    public void addAddressBook(String name, AddressBook addressBook) {
        addressBooks.put(name, addressBook);
    }

    public void displayAddressBooks() {

        for (String name : addressBooks.keySet()) {
            System.out.println(name);
        }
    }
}