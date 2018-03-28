package com.arash;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts;

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public MobilePhone(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void storeContact(String name, String number) {
        contacts.add(new Contact(name, number));
    }

    public void modifyContact() {

    }

    public void removeContact() {

    }


}
