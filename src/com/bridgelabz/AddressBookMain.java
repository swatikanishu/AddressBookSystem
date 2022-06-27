package com.bridgelabz;
import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("welcome to address book program");
        Map<String, IAddressBook> addressSystem = new HashMap<>();
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.println("add address book to system");
            System.out.println("enter the name of address book");
            IAddressBook addressBook1 = new AddressBook();
            String bookName = input.next();
            addressSystem.put(bookName, addressBook1);
            System.out.println("Are you wish add multiple address book:  Y?N");
            choice = input.next().toUpperCase().charAt(0);
        } while (choice != 'N');
        do {
            System.out.println("Select the AddressBook");
            for (Map.Entry<String, IAddressBook> entry : addressSystem.entrySet()) {
                System.out.println(entry.getKey());
            }
            String bookName = input.next();
            if (addressSystem.containsKey(bookName)) {
                do {
                    System.out.println("Select your Option: \n1.Add new Contact \n2.Edit Contact \n3.Delete Contact \n4. contactsList");
                    int option = input.nextInt();
                    switch (option) {
                        case 1:
                            addressSystem.get(bookName).createContact();
                            break;
                        case 2:
                            addressSystem.get(bookName).editContact();
                            break;
                        case 3:
                            addressSystem.get(bookName).deleteContact();
                            break;
                        case 4:
                            addressSystem.get(bookName).contactList();
                            break;
                    }
                    System.out.println("Are you wish to continue " + "in " + bookName + " " + ":  Y?N");
                    choice = input.next().toUpperCase().charAt(0);
                } while (choice != 'N');
            }

            System.out.println("Are you wish to continue in address book:  Y?N");
            choice = input.next().toUpperCase().charAt(0);
        } while (choice != 'N');
        for (Map.Entry<String, IAddressBook> entry : addressSystem.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());

        }

    }
}

