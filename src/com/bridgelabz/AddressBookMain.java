package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
            System.out.println("welcome to address book program");
            Scanner input = new Scanner(System.in);
            char choice;
            IAddressBook addressBook = new AddressBook();
            do {
                System.out.println("Select your Option: \n1.Add new Contact \n2.Edit Contact \n3.Delete Contact");
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        addressBook.createContact();
                        break;
                    case 2:
                        addressBook.editContact();
                        break;
                    case 3:
                        addressBook.deleteContact();
                        break;
                }
                System.out.println("Are you wish to continue:  Y?N");
                choice = input.next().toUpperCase().charAt(0);
            } while (choice != 'N');
            System.out.println(addressBook);
        }
    }