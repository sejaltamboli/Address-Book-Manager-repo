package com.infogalaxy.addressbookmanager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AdressBook {
    ArrayList<Contact> contactlist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {
        Contact contact = new Contact();
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
    public void editcontact() {
        System.out.println("Enter the First Name: ");
        String fname = sc.next();
        int flag = 0;
        for (int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            if (fname.equals(contact.getFirstName())) {
                flag = 1;
                break;
           }
        }
        if (flag == 0) {
            System.out.println("Contact Not found. ");
        } else {
            System.out.println("Contact is found. ");
            Contact contact = new Contact();
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
    }
    public void findstate() {
        System.out.println("Enter the State Name You Want to Search: ");
        String stateName = sc.next();
        for (int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            if (stateName.equals(contact.getState())) {
                System.out.println(contact.getFirstName());
                System.out.println(contact.getMobno());

            }
        }
    }
    public void deletecontact() {
        System.out.println("Enter the First Name: ");
        String delete = sc.next();
        for(int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            if(delete.equals(contact.getFirstName())) {
                contactlist.remove(i);
            }
        }

    }
    public void backuptofile() {
        String contactdata = null;
        for( int i = 0; i < contactlist.size(); i++) {
        Contact contact = contactlist.get(i);
        contactdata = contact.getFirstName()+","+contact.getLastName()+","+contact.getAddress()+","+contact.getCity()+","+contact.getState()+","
                      +contact.getMobno()+","+contact.getEmail()+","+contact.getZip()+"\n"+contactdata;
            //System.out.println(contactdata);
    }
        try {
            Path file = Paths.get("MyData.txt");
            byte[] filedata = contactdata.getBytes();
            Files.write(file,filedata);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdressBook adressBook = new AdressBook();
        int choice;
        do {
            System.out.println("***** CONTACT INVENTORY MANAGEMENT *****");
            System.out.println("\n1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EDIT CONTACT \n4. FIND CONTACT " +
                    "\n5 DELETE CONTACT \n6 BACKUPTOFILE \n7 EXIT. ");
            System.out.println("Enter your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    adressBook.addContact();
                    break;
                case 2:
                    adressBook.displayContact();
                    break;
                case 3:
                    adressBook.editcontact();
                    break;
                case 4:
                    adressBook.findstate();
                    break;
                case 5:
                    adressBook.deletecontact();
                    break;
                case 6:
                    adressBook.backuptofile();
                    break;
            }
        } while (choice != 7);
    }
}

