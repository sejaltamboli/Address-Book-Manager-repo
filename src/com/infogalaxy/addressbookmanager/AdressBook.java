package com.infogalaxy.addressbookmanager;

import java.util.Scanner;

public class AdressBook {

    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();
    public void addContact(){
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
    }
    public void displayContact(){
        System.out.println(contact.toString());
    }

    public static void main(String[] args) {
        AdressBook adressBook = new AdressBook();
        adressBook.addContact();
        adressBook.displayContact();
    }
}
