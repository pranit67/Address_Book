package com.bridgelabz.addressbook;

import java.util.*;

public class AddressBook extends Contact {
    Scanner scan = new Scanner(System.in);
    public Contact createContact(ArrayList list) {
        Contact contact = new Contact();

        System.out.print("Please Enter The First Name :: ");
        firstName = scan.next();
        contact.setFirstName(firstName);
        System.out.print("Please Enter The Last Name :: ");
        lastName = scan.next();
        contact.setLastName(lastName);
        System.out.print("Please Enter The Address :: ");
        address = scan.next();
        contact.setAddress(address);
        System.out.print("Please Enter The City :: ");
        city = scan.next();
        contact.setCity(city);
        System.out.print("Please Enter The State :: ");
        state = scan.next();
        contact.setState(state);
        System.out.print("Please Enter The Zip Code :: ");
        zipCode = scan.nextInt();
        contact.setZipCode(zipCode);
        System.out.print("Please Enter The Phone Number :: ");
        phoneNumber = scan.nextLong();
        contact.setPhoneNumber(phoneNumber);
        System.out.print("Please Enter The email ID :: ");
        emailID = scan.next();
        contact.setEmailID(emailID);
        list.add(contact);
        return contact;
    }

    public void addContact(ArrayList list) {
        AddressBook obj = new AddressBook();
        String ch;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("DO YOU WANT TO ADD MORE CONTACT");
            System.out.println("Enter choice 1.to add Contact ");
            int choice;
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    createContact(list);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("DO YOU WANT TO ADD MORE CONTACT (PRESS y to contune)");
            ch = scan.next();
        } while (ch.equals("y") || ch.equals("Y"));

        System.out.println(list);


    }
}
