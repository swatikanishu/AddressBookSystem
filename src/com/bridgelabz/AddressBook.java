package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook implements IAddressBook {
    static Scanner input = new Scanner(System.in);
    ArrayList<PersonDetails> contact = new ArrayList<>();
    @Override
    public void createContact() {
        PersonDetails personDetails = new PersonDetails();
        System.out.println("Enter Your First Name: ");
        personDetails.setFirstName(input.next());
        System.out.println("Enter Your Last Name: ");
        personDetails.setLastName(input.next());
        System.out.println("Enter Your Address: ");
        personDetails.setAddress(input.next());
        System.out.println("Enter Your City: ");
        personDetails.setCity(input.next());
        System.out.println("Enter Your State: ");
        personDetails.setState(input.next());
        System.out.println("Enter Your Zip code: ");
        personDetails.setZip(input.nextInt());
        System.out.println("Enter Your Email Id: ");
        personDetails.setEmail(input.next());
        System.out.println("Enter Your Mobile Number: ");
        personDetails.setPhoneNumber(input.nextLong());
        contact.add(personDetails);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contact=" + contact +
                '}';
    }
}