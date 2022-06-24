package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("welcome to address book program");
        IAddressBook addressBook = new AddressBook();
        addressBook.createContact();
        System.out.println(addressBook);
    }
}


