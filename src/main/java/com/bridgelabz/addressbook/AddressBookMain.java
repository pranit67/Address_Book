package com.bridgelabz.addressbook;
import java.util.ArrayList;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        ArrayList list = new ArrayList();
        AddressBook addressBook = new AddressBook();
        addressBook.createContact(list);
        addressBook.addContact(list);

    }
}
