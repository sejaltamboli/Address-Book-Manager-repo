package com.infogalaxy.addressbookmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class AdressBook {
    ArrayList<Contact> contactlist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();

    public void addContact() {
        System.out.println("Enter the First Name: ");
        contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name: ");
        contact.setLastName(sc.next());
        System.out.println("Enter the Address: ");
        contact.setAddress(sc.next());
        System.out.println("Enter the City: ");
        contact.setCity(sc.next());
        System.out.println("Enter the State: ");
        contact.setState(sc.next());
        System.out.println("Enter the Mobile no: ");
        contact.setMobno(sc.next());
        System.out.println("Enter the Email: ");
        contact.setEmail(sc.next());
        System.out.println("Enter the Zip Code: ");
        contact.setZip(sc.next());
        contactlist.add(contact);
    }

    public void displayContact() {
        for (int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            System.out.println(contact.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdressBook adressBook = new AdressBook();
        int choice;
        do {
            System.out.println("***** CONTACT INVENTORY MANAGEMENT *****");
            System.out.println("\n1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EXIT ");
            System.out.println("Enter your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    adressBook.addContact();
                    break;
                case 2:
                    adressBook.displayContact();
                    break;
            }
        } while (choice != 3);
    }
}

