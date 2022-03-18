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
        System.out.println("Enter the List of Contact: ");
        int list_of_contact;
        Scanner sc = new Scanner(System.in);
         list_of_contact = sc.nextInt();
        AdressBook[] adressBook = new AdressBook[list_of_contact];

        for(int i = 0; i < list_of_contact; i++) {
            adressBook[i] = new AdressBook();
            adressBook[i].addContact();
        }
        for( int i = 0; i < list_of_contact; i++) {
            adressBook[i].displayContact();
        }
    }
}
