package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner scan = new Scanner(System.in);
    private Contact contact = new Contact();

    public void createContact() {
        System.out.print("Please Enter The First Name :: ");
        String firstName = scan.next();
        contact.setFirstName(firstName);
        System.out.print("Please Enter The Last Name :: ");
        String lastName = scan.next();
        contact.setLastName(lastName);
        System.out.print("Please Enter The Address :: ");
        String address = scan.next();
        contact.setAddress(address);
        System.out.print("Please Enter The City :: ");
        String city = scan.next();
        contact.setCity(city);
        System.out.print("Please Enter The State :: ");
        String state = scan.next();
        contact.setState(state);
        System.out.print("Please Enter The Zip Code :: ");
        int zipCode = scan.nextInt();
        contact.setZipCode(zipCode);
        System.out.print("Please Enter The Phone Number :: ");
        long phoneNumber = scan.nextLong();
        contact.setPhoneNumber(phoneNumber);
        System.out.print("Please Enter The email ID :: ");
        String emailId = scan.next();
        contact.setEmailID(emailId);
        System.out.println(contact);
    }
}
