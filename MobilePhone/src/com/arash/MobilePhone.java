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

    public MobilePhone() {
        this(new ArrayList<Contact>());
    }

    public MobilePhone(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void storeContact(Contact contact) {
        contacts.add(contact);
    }

    public void modifyContact(Contact contact) {
        contacts.set(1, new Contact("Tobi", "123"));
    }

    public void removeContact(Contact contact) {
        contacts.remove(contacts.indexOf(contact));
    }


}